package com.janett.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.janett.tp3.modelo.pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeliculas;
    private PeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeliculas = findViewById(R.id.rvPeliculas);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rvPeliculas.setLayoutManager(gridLayoutManager);
        adapter = new PeliculasAdapter(obtenerPeliculas(),this, getLayoutInflater());
        rvPeliculas.setAdapter(adapter);
    }

    private ArrayList<pelicula> obtenerPeliculas() {

        ArrayList<pelicula> lista = new ArrayList<>();
        lista.add(new pelicula("Mujeres al ataque", R.drawable.dos, "Tres mujeres unen fuerzas para vengarse de un hombre canalla, mentiroso e infiel que las traicionó a todas.", "Cameron Diaz", "Nick Cassavetes" ));
        lista.add(new pelicula("Titanic", R.drawable.titanic, "Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.", "Leonardo dicaprio y Kate Winstet", "James Cameron"));
        lista.add(new pelicula("Sin dos no hay tres", R.drawable.dos, "Tres mujeres unen fuerzas para vengarse de un hombre canalla, mentiroso e infiel que las traicionó a todas.", "Cameron Diaz", "Nick Cassavetes" ));
        lista.add(new pelicula("Titanic", R.drawable.titanic, "Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.", "Leonardo dicaprio y Kate Winstet", "James Cameron"));
        return lista;
    }


}