package com.anzxy.learnandroid.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/27.
 */
public class BaseFrameLayout extends FrameLayout {
    
    protected final String tag = this.getClass().getSimpleName();

    public BaseFrameLayout(Context context) {
        super(context);
    }

    public BaseFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        int action = ev.getAction();

        switch (action){
            case MotionEvent.ACTION_DOWN:
                L.i(tag,"dispatchTouchEvent:ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                L.i(tag,"dispatchTouchEvent:ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                L.i(tag,"dispatchTouchEvent:ACTION_UP");
                break;
        }

        return super.dispatchTouchEvent(ev);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();

        switch (action){
            case MotionEvent.ACTION_DOWN:
                L.i(tag,"onInterceptTouchEvent:ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                L.i(tag,"onInterceptTouchEvent:ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                L.i(tag,"onInterceptTouchEvent:ACTION_UP");
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();

        switch (action){
            case MotionEvent.ACTION_DOWN:
                L.i(tag,"onTouchEvent:ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                L.i(tag,"onTouchEvent:ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                L.i(tag,"onTouchEvent:ACTION_UP");
                break;
        }

        return  super.onTouchEvent(event);
    }
}
