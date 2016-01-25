package com.anzxy.learnandroid.fragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.anzxy.learnandroid.R;
import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/22.
 */
public class FragmentA extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        L.i(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragmentlifecycle_a,container,false);

        Button button = (Button)view.findViewById(R.id.button_a);
        button.setOnClickListener(this);

        return view;
    }

}
