package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.controller.Controller;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.utils.ResultListener;
import com.example.juanmanuelalvarez.desafiofluxit.view.AdapterPetsListViewHome;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listViewPetsHome;
    private AdapterPetsListViewHome adapterListView;
    private List<Pet> petsList;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_activity);

        petsList = new ArrayList<>();

        getPetListFromApi();

        listViewPetsHome = findViewById(R.id.list_view_pets_home);

        adapterListView = new AdapterPetsListViewHome(this,petsList);
        listViewPetsHome.setAdapter(adapterListView);




    }

    private void getPetListFromApi() {
        controller = new Controller(this);
        controller.getListFromDaoPets(new ResultListener<List<Pet>>() {
            @Override
            public void finish(List<Pet> resultado) {
                adapterListView.cargarNuevaLista(resultado);
            }
        });

    }
}
