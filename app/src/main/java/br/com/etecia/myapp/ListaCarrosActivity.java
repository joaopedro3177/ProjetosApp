package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
        lstCars.add(
                new Cars()
        );

        //RecycleView
        listaCarros = findViewById(R.id.listaCarros);

        CarAdapter adapter = new CarAdapter(lstCars, ListaCarrosActivity.this);

        //Liga o adaptador a lista
        listaCarros.setAdapter(adapter);
    }
}