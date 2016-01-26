package com.anzxy.learnandroid.touchevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.anzxy.learnandroid.util.L;

/**
 * Created by 周强 on 2016/1/26.
 */
public class TouchView extends View {

    private Paint mPaint = new Paint();

    private int centerX;
    private int centerY;
    private int r;

    public TouchView(Context context) {
        super(context);
    }

    public TouchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint.setColor(Color.RED);
        centerX = 200;
        centerY = 200;
        r = 50;
    }

    public TouchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(centerX, centerY,r,mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();

        boolean result = super.onTouchEvent(event);

        L.i(result);

        switch (action){
            case MotionEvent.ACTION_DOWN:
                if(Math.pow((x-centerX),2)+Math.pow(y-centerY,2)>Math.pow(r,2)){
                    return true;
                } else {
                    return true;
                }
            case MotionEvent.ACTION_MOVE:
                L.i("ACTION_MOVE");
                centerX = (int)x;
                centerY = (int)y;
                this.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                L.i("ACTION_UP");
                break;
        }

        return result;
    }
}
