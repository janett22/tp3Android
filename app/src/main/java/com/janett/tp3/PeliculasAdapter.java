package com.janett.tp3;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.janett.tp3.modelo.pelicula;

import java.util.ArrayList;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.ViewHolder>{
    private ArrayList<pelicula> peliculas;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculasAdapter(ArrayList<pelicula> peliculas, Context context, LayoutInflater layoutInflater) {
        this.peliculas = peliculas;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public PeliculasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.item_peliculas, parent, false);
        return new ViewHolder(view);
    }

       @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
           holder.tvTitulo.setText(peliculas.get(position).getTitulo());
           holder.tvDescripcion.setText(peliculas.get(position).getDescripcion());
           holder.ivFoto.setImageResource(peliculas.get(position).getFoto());

          final pelicula itemsPelicula = peliculas.get(position);
          holder.btCambiar.setOnClickListener(new View.OnClickListener()
          {

              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(holder.btCambiar.getContext(), DetallesPeliculas.class);
                  intent.putExtra("Detalles pelicula", (Parcelable) itemsPelicula);
                  holder.btCambiar.getContext().startActivity(intent);
              }
          });


    }


    @Override
    public int getItemCount() {
        return peliculas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo, tvDescripcion;
        private ImageView ivFoto;
        private Button btCambiar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo= itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            btCambiar = itemView.findViewById(R.id.btCambiar);
        }
    }
}

