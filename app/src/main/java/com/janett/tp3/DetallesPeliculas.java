package com.janett.tp3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;
import androidx.recyclerview.widget.GridLayoutManager;

import com.janett.tp3.modelo.pelicula;

public class DetallesPeliculas extends AppCompatActivity {
   private TextView titulo;
   private ImageView foto;
    private TextView autor;
    private TextView descripcion;
    private TextView director;
    private pelicula detpelis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalles_peliculas);
        inicializarVista();

        detpelis= (pelicula) getIntent().getExtras().getSerializable("Detalles pelicula");
        foto.setImageResource(detpelis.getFoto());



    }

    private void inicializarVista() {
        titulo = findViewById(R.id.tvDetalleTitulo);
        descripcion = findViewById(R.id.tvDetalleDescripcion);
        autor = findViewById(R.id.tvDetalleAutores);
        director = findViewById(R.id.tvDetalleDirector);
        foto= findViewById(R.id.ivDetalleFoto);
    }
}
