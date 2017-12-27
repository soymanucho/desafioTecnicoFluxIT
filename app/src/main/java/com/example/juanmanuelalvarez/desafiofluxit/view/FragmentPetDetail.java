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
    private Pet petRecieved;

    public FragmentPetDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_pet_detail, container, false);

        Bundle bundle = getArguments();
        petRecieved = (Pet) bundle.getSerializable("pet");

        txtViewPetNameDetail = view.findViewById(R.id.txt_view_pet_name_detail);
        txtViewPetIdDetail = view.findViewById(R.id.txt_view_pet_id_detail);


        txtViewPetNameDetail.setText(petRecieved.getName());
        txtViewPetIdDetail.setText(petRecieved.getId());

        return view;
    }

}
