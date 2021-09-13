package com.janett.tp3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        detpelis= (pelicula) getIntent().getExtras().getSerializable("DetallesPeliculas");
        foto.setImageResource(detpelis.getFoto());

        inicializarValores();


    }

    private void inicializarValores() {
        titulo.setText(detpelis.getTitulo());
        director.setText("\nDirector: " + detpelis.getDirector());
        autor.setText("\nAutores: " + detpelis.getAutor());
        descripcion.setText("\n " + detpelis.getDescripcion());



    }

    private void inicializarVista() {
        titulo = findViewById(R.id.tvDetalleTitulo);
        descripcion = findViewById(R.id.tvDetalleDescripcion);
        autor = findViewById(R.id.tvDetalleAutores);
        director = findViewById(R.id.tvDetalleDirector);
        foto= findViewById(R.id.ivDetalleFoto);


    }


}
