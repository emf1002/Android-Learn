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
public class TouchInterceptView extends View {

    private final String tag = this.getClass().getSimpleName();

    private Paint mPaint = new Paint();

    private int centerX;
    private int centerY;
    private int r;

    public TouchInterceptView(Context context) {
        super(context);
    }

    public TouchInterceptView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint.setColor(Color.RED);
        centerX = 200;
        centerY = 200;
        r = 50;
    }

    public TouchInterceptView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(centerX, centerY,r,mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        final int action = event.getAction();
        final float x = event.getX();
        final float y = event.getY();

        boolean result =false;

        switch (action){
            case MotionEvent.ACTION_DOWN:
                result = (Math.pow(x-centerX,2)+Math.pow(y-centerY,2))<=Math.pow(r,2);
                L.i(tag,"onTouchEvent:ACTION_DOWN："+result);
                break;
            case MotionEvent.ACTION_MOVE:
                L.i(tag,"ACTION_MOVE");

                final int top = this.getTop();
                final int left = this.getLeft();
                final int right = this.getRight();
                final int bottom = this.getBottom();

                //边界判定
                if(x - r< left){
                    centerX = left + r;
                } else if(x + r > right){
                    centerX = right -r;
                } else {
                    centerX = (int)x;
                }

                if(y - r < top){
                    centerY = top+r;
                } else if(y + r > bottom){
                    centerY = bottom - r;
                } else {
                    centerY = (int)y;
                }

                this.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                L.i(tag,"ACTION_UP");
                break;
        }

        return result;
    }
}
