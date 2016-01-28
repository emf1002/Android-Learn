package com.anzxy.learnandroid.touchevent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anzxy.learnandroid.R;
import com.anzxy.learnandroid.util.L;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 周强 on 2016/1/26.
 */
public class TouchEventFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.touchevent_base, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        ViewPager viewPager = (ViewPager)view.findViewById(R.id.main_view_pager);
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.fragment_main_tab);

        List<Fragment> fragmentList;

        fragmentList = new ArrayList<>();
        fragmentList.add(new EventTransferFragment());
        fragmentList.add(new EventConflictFragment());

        List<String> titleList = new ArrayList<>();

        titleList.add("事件传递");
        titleList.add("事件拦截");

        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(1)));

        TouchFragmentPageAdapter adapter =
                new TouchFragmentPageAdapter(getChildFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
}
