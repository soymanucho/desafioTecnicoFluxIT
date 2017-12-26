package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 26/12/2017.
 */

public class AdapterRecyclerViewHome extends RecyclerView.Adapter{

    private Context context;
    private List<Pet> petsList;

    public AdapterRecyclerViewHome(Context context,List<Pet> petsList){
        this.context = context;
        this.petsList = petsList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View vistaAInflar = inflater.inflate(R.layout.detalle_celdas_list_view_pets_home,parent,false);
        PetViewHolder petViewHolder = new PetViewHolder(vistaAInflar);

        return petViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Pet pet = petsList.get(position);
        PetViewHolder petViewHolder = (PetViewHolder) holder;

        petViewHolder.cargarPet(pet);

    }

    @Override
    public int getItemCount() {
        return petsList.size();
    }

    public void cargarNuevaLista(List<Pet> resultado) {

        petsList.addAll(resultado);
        notifyDataSetChanged();

    }

    private class PetViewHolder extends RecyclerView.ViewHolder {

        private TextView txtViewPetName;


        public PetViewHolder(View itemView) {
            super(itemView);
            txtViewPetName = itemView.findViewById(R.id.text_view_pet_name);

        }

        public void cargarPet (Pet pet){

            txtViewPetName.setText(pet.getName());

        }

    }
}
