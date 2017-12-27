package com.example.juanmanuelalvarez.desafiofluxit.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.juanmanuelalvarez.desafiofluxit.R;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPetDetail extends Fragment {

    private TextView txtViewPetNameDetail;
    private TextView txtViewPetIdDetail;
    private TextView txtViewPetCategoryDetail;
    private TextView txtViewPetStatusDetail;

    private Pet petRecieved;

    public FragmentPetDetail() {
    }

    public static FragmentPetDetail createFragment(Pet pet){
        FragmentPetDetail fragmentPetDetail = new FragmentPetDetail();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pet",pet);
        fragmentPetDetail.setArguments(bundle);
        return fragmentPetDetail;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_pet_detail, container, false);

        Bundle bundle = getArguments();
        petRecieved = (Pet) bundle.getSerializable("pet");

        txtViewPetNameDetail = view.findViewById(R.id.txt_view_pet_name_detail);
        txtViewPetIdDetail = view.findViewById(R.id.txt_view_pet_id_detail);
        txtViewPetCategoryDetail = view.findViewById(R.id.txt_view_pet_category_detail);
        txtViewPetStatusDetail = view.findViewById(R.id.txt_view_pet_status_detail);

        txtViewPetNameDetail.setText(petRecieved.getName());
        txtViewPetIdDetail.setText(petRecieved.getId());
        if (petRecieved.getCategory()!=null){
            txtViewPetCategoryDetail.setText(petRecieved.getCategory().toString());
        }else{
            txtViewPetCategoryDetail.setText("");
        }

        txtViewPetStatusDetail.setText(petRecieved.getStatus());

        return view;
    }

    public String getPetName(){
       return petRecieved.getName();
    }

}
