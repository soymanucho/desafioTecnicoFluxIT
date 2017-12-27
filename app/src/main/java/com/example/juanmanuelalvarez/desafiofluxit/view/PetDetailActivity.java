package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.controller.Controller;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.utils.ResultListener;

import java.util.List;

public class PetDetailActivity extends AppCompatActivity {

    private Pet petRecieved;
    private String idPetRecieved;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private List<Fragment> fragmentList;

    private Controller controller;

    private FragmentPetDetail fragmentPetDetail;
    private FragmentPetNotDetail fragmentPetNotDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_pet_detail);

        fragmentPetDetail = new FragmentPetDetail();
        fragmentPetNotDetail = new FragmentPetNotDetail();


        viewPager = findViewById(R.id.view_pager_fragments);
        tabLayout = findViewById(R.id.tab_layout);




        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();


        idPetRecieved = bundle.getString("id");

        controller = new Controller(this);

        controller.getPetDetailFromDaoWithId(idPetRecieved ,new ResultListener<Pet>() {
            @Override
            public void finish(Pet resultado) {
                petRecieved = resultado;

                FragmentPageAdapter adapter = new FragmentPageAdapter(getSupportFragmentManager(),petRecieved);
                viewPager.setAdapter(adapter);
                tabLayout.setupWithViewPager(viewPager);
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_details_white_24dp);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_more_horiz_white_24dp);
            }
        });




    }

    private void cargarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contenedor_fragments_detail_activity,fragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        petRecieved=null;
    }
}
