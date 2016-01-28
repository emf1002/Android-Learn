package com.anzxy.learnandroid.touchevent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anzxy.learnandroid.R;

/**
 * Created by 周强 on 2016/1/28.
 */
public class EventTransferFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.touchevent_a,container,false);
    }
}
