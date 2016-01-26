package com.anzxy.learnandroid.fragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anzxy.learnandroid.R;
import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/26.
 */
public class LifecycleFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView");
        return inflater.inflate(R.layout.fragmentlifecycle_base,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        Log.i(TAG,"onViewCreated");

        FragmentManager fragmentManager = this.getChildFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_frame_layout,new FragmentA(),"fragment_a");
        Fragment fragmentB = new FragmentB();
        transaction.add(R.id.fragment_frame_layout, fragmentB, "fragment_b");
        transaction.hide(fragmentB);
        transaction.addToBackStack(null).commit();

    }


}
