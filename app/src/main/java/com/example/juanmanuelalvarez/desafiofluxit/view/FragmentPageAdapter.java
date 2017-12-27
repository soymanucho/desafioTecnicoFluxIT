package com.example.juanmanuelalvarez.desafiofluxit.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 27/12/2017.
 */

public class FragmentPageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public FragmentPageAdapter(FragmentManager fm, Pet pet) {
        super(fm);
        fragmentList=new ArrayList<>();

        fragmentList.add(FragmentPetDetail.createFragment(pet));
        fragmentList.add(FragmentPetNotDetail.createFragment());

    }



    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return this.fragmentList.size();
    }


}
