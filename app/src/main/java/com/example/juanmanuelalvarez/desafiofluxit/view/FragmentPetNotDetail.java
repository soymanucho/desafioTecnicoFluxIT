package com.example.juanmanuelalvarez.desafiofluxit.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.juanmanuelalvarez.desafiofluxit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPetNotDetail extends Fragment {


    public FragmentPetNotDetail() {

    }

    public static FragmentPetNotDetail createFragment(){
        FragmentPetNotDetail fragmentPetNotDetail = new FragmentPetNotDetail();
        return fragmentPetNotDetail;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_pet_not_detail, container, false);
    }

}
