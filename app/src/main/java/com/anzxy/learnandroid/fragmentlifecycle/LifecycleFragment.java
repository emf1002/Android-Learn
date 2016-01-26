package com.anzxy.learnandroid.fragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anzxy.learnandroid.R;

/**
 * Created by 周强 on 2016/1/26.
 */
public class LifecycleFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentlifecycle_base,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_frame_layout,new FragmentA(),"fragment_a");
        Fragment fragmentB = new FragmentB();
        transaction.add(R.id.fragment_frame_layout, fragmentB, "fragment_b");
        transaction.hide(fragmentB);
        transaction.addToBackStack(null).commit();
    }

}
