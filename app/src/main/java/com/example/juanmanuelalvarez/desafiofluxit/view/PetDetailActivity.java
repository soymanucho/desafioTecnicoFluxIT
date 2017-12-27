package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;

public class PetDetailActivity extends AppCompatActivity {

    private Pet petRecieved;

    private TextView txtViewPetNameDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_pet_detail);

        txtViewPetNameDetail = findViewById(R.id.txt_view_pet_name_detail);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        petRecieved = (Pet) bundle.getSerializable("pet");

        txtViewPetNameDetail.setText(petRecieved.getName());

    }
}
