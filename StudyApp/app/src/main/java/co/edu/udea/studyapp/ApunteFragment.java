package co.edu.udea.studyapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApunteFragment extends Fragment {

    RecyclerView recyclerView;
    ApunteAdapter apunteAdapter;
    List<Apunte> apuntesList;

    public ApunteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_apuntes, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        apuntesList = new ArrayList<>();
        recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view_apuntes);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if(position == 0){
                            Log.d("Se clickeó", "Matrices Dispersas");
                        } else if(position == 1){
                            Log.d("Se clickeó", "Árboles Binarios");
                        } else if(position == 2){
                            Log.d("Se clickeó", "Backtracking");
                        }
                    }
                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        apuntesList.add(
                new Apunte(
                        1,
                        "Matrices Dispersas",
                        "Con matrices de gran tamaño los métodos tradicionales para almacenar la matriz en la memoria de una computadora o para la resolución de sistemas de ecuaciones lineales necesitan...",
                        "19 de Marzo"));

        apuntesList.add(
                new Apunte(
                        1,
                        "Árboles Binarios",
                        "Un árbol binario es una estructura de datos en la cual cada nodo puede tener un hijo izquierdo y un hijo derecho. No pueden tener más de dos hijos (de ahí el nombre \"binario\")...",
                        "22 de Marzo"));

        apuntesList.add(
                new Apunte(
                        1,
                        "Backtracking",
                        "es una estrategia para encontrar soluciones a problemas que satisfacen restricciones. El término \"backtrack\" fue acuñado por primera vez por el matemático estadounidense D. H. L...",
                        "25 de Marzo"));

        apunteAdapter = new ApunteAdapter(getActivity(), apuntesList);
        recyclerView.setAdapter(apunteAdapter);
    }


}
