package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.controller.Controller;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.utils.ResultListener;

public class PetDetailActivity extends AppCompatActivity {

    private Pet petRecieved;
    private String idPetRecieved;


    private Controller controller;

    private FragmentPetDetail fragmentPetDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_pet_detail);

        fragmentPetDetail = new FragmentPetDetail();

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();


        idPetRecieved = bundle.getString("id");

        controller = new Controller(this);

        controller.getPetDetailFromDaoWithId(idPetRecieved ,new ResultListener<Pet>() {
            @Override
            public void finish(Pet resultado) {
                petRecieved = resultado;

                Bundle bundle = new Bundle();
                bundle.putSerializable("pet",petRecieved);
                fragmentPetDetail.setArguments(bundle);
                cargarFragment(fragmentPetDetail);

            }
        });


    }

    private void cargarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contenedor_fragments_detail_activity,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
