package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class AdapterPetsListViewHome extends BaseAdapter {

    private Context context;
    private List<Pet> petsList;

    public AdapterPetsListViewHome(Context context, List<Pet> petsList) {
        this.context = context;
        this.petsList = petsList;
    }

    @Override
    public int getCount() {
        return petsList.size();
    }

    @Override
    public Pet getItem(int i) {
        return petsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Pet pet = getItem(i);
        String petName = pet.getName();

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.detalle_celdas_list_view_pets_home,viewGroup, false);
        TextView textViewPetName = view.findViewById(R.id.text_view_pet_name);
        textViewPetName.setText(petName);



        return view;
    }

    public void cargarNuevaLista(List<Pet> resultado) {

        petsList.addAll(resultado);
        notifyDataSetChanged();

    }
}
