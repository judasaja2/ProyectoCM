package co.edu.udea.studyapp;


import android.app.Activity;
import android.content.Context;
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
public class MateriasFragment extends Fragment {

    RecyclerView recyclerView;
    MateriaAdapter materiaAdapter;
    List<Materia> materiasList;
    ClickInterface clickInterface;

    public MateriasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            clickInterface = (ClickInterface) activity;
        } catch(ClassCastException e){
            Log.d("Error", "ClickInterface");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materias, container, false);
    }

    public void setInterface(ClickInterface clickInterface) {
        this.clickInterface = clickInterface;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        materiasList = new ArrayList<>();
        recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view_materias);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if(position == 0){
                            Log.d("Se clickeó", "Computación Móvil");
                            clickInterface.cardClicked("materia", 0);
                        } else if(position == 1){
                            Log.d("Se clickeó", "Teoría de Lenguajes y Compiladores");
                        } else if(position == 2){
                            Log.d("Se clickeó", "Comunicaciones II");
                        }
                    }
                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        materiasList.add(
                new Materia(
                        1,
                        "Computación Móvil",
                        "19 de Marzo",
                        R.drawable.compu_movil));

        materiasList.add(
                new Materia(
                        1,
                        "Teoría de Lenguajes y Compiladores",
                        "22 de Marzo",
                        R.drawable.teoria));

        materiasList.add(
                new Materia(
                        1,
                        "Comunicaciones II",
                        "10 de Marzo",
                        R.drawable.comunicaciones_2));

        materiaAdapter = new MateriaAdapter(getActivity(), materiasList);
        recyclerView.setAdapter(materiaAdapter);
    }

}
