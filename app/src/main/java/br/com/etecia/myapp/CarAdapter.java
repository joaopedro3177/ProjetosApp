package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    //Variáveis globais
    private List<Cars> lstCars;
    private Context context;

    //Criando o construtor com paramêtros

    public CarAdapter(List<Cars> lstCars, Context context) {
        this.lstCars = lstCars;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_card_carros,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.TxtCardCars.setText(lstCars.get(position).getTitulo());
        holder.ImgCardCars.setImageResource(lstCars.get(position).getImgCars());

    }

    @Override
    public int getItemCount() {
        return lstCars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ImgCardCars;
        TextView TxtCardCars;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImgCardCars = itemView.findViewById(R.id.ImgCardCars);
            TxtCardCars = itemView.findViewById(R.id.TxtCardCars);
        }
    }

}
