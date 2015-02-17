package com.webmyne.tisco;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Android on 13-02-2015.
 */
public class CustomView  extends FrameLayout{

    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
        wakeupPainter();
    }

    private void wakeupPainter() {

        mPaint = new Paint();
        mPaint.setStrokeWidth(1);
        mPaint.setColor(Color.BLACK);

    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
       
        
        
        
    }
}
