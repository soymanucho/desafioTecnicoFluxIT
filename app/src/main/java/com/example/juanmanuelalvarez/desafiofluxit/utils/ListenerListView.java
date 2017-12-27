package com.example.juanmanuelalvarez.desafiofluxit.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.view.PetDetailActivity;

/**
 * Created by Juan Manuel Alvarez on 26/12/2017.
 */

public class ListenerListView implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Context context = adapterView.getContext();

        Pet pet = (Pet) adapterView.getItemAtPosition(i);

        Intent intent = new Intent(context,PetDetailActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("pet",pet);

        intent.putExtras(bundle);

        context.startActivity(intent);


    }
}
