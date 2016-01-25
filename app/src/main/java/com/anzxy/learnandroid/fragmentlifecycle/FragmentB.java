package com.anzxy.learnandroid.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.anzxy.learnandroid.R;
import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/22.
 */
public class FragmentB extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        L.i(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragmentlifecycle_b,container,false);

        Button button = (Button)view.findViewById(R.id.button_b);
        button.setOnClickListener(this);

        return view;
    }


}
