package com.anzxy.learnandroid.touchevent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anzxy.learnandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 周强 on 2016/1/26.
 */
public class TouchEventFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<Fragment> fragmentList;

        fragmentList = new ArrayList<>();
       // fragmentList.add(new MainContentFragment());
       // fragmentList.add(new MainHotFragment());

        List<String> titleList = new ArrayList<>();

        titleList.add("事件传递");
        titleList.add("事件冲突");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.touchevent_base, container, false);
    }

}
