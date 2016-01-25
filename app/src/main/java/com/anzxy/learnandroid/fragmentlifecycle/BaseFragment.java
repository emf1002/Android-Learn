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

import com.anzxy.learnandroid.R;
import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/25.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {

    protected final String TAG = this.getClass().getSimpleName();


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragmentA =fragmentManager.findFragmentByTag("fragment_a");
        Fragment fragmentB =fragmentManager.findFragmentByTag("fragment_b");

        int id = v.getId();

        if(id == R.id.button_a){//切换到B
            L.i("切换到B");
            fragmentTransaction.hide(fragmentA);
            if(fragmentB != null){
                fragmentTransaction.show(fragmentB);
            } else {
                fragmentTransaction.add(R.id.main_content_layout,new FragmentB(),"fragment_b");
            }
        } else {
            L.i("切换到A");
            fragmentTransaction.hide(fragmentB);
            if(fragmentA != null){
                fragmentTransaction.show(fragmentA);
            } else {
                fragmentTransaction.add(R.id.main_content_layout,new FragmentA(),"fragment_a");
            }
        }
        fragmentTransaction.commit();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        L.i(TAG,"onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.i(TAG,"onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        L.i(TAG,"onCreateView");
        return inflater.inflate(R.layout.fragmentlifecycle_a,null);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        L.i(TAG,"onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        L.i(TAG,"onViewStateRestored");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        L.i(TAG,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        L.i(TAG,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        L.i(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        L.i(TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        L.i(TAG,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        L.i(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        L.i(TAG,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        L.i(TAG,"onDetach");
    }
}
