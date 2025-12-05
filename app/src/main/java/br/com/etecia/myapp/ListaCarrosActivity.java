package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaCarrosActivity extends AppCompatActivity {
    List<Cars> lstCars;
    RecyclerView listaCarros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_carros_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //criando um array de dados
        lstCars = new ArrayList<>();
        lstCars.add(new Cars("Esportivo", R.drawable.esporte));
        lstCars.add(new Cars("Popular", R.drawable.popular));
        lstCars.add(new Cars("USV", R.drawable.carros));
        lstCars.add(new Cars("Econômico", R.drawable.carros));
        lstCars.add(new Cars("Antigos", R.drawable.carros));
        lstCars.add(new Cars("Anual", R.drawable.carros));
        lstCars.add(new Cars("Seminovos", R.drawable.carros));
        lstCars.add(new Cars("Em Destaque", R.drawable.carros));
        lstCars.add(new Cars("Hiper Carros", R.drawable.carros));
        lstCars.add(new Cars("Off Road", R.drawable.carros));

        //RecycleView
        listaCarros = findViewById(R.id.listaCarros);

        CarAdapter adapter = new CarAdapter(lstCars, ListaCarrosActivity.this);

        listaCarros.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //Liga o adaptador a lista
        listaCarros.setAdapter(adapter);
    }
}