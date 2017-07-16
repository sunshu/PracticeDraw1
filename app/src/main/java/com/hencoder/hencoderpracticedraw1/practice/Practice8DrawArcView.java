package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private  Paint mPaint ;
    private int height;
    private int width;
    private int mw1;
    private int mw2;
    private int mh1;
    private int mh2;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setSize();
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        mPaint.setStyle(Paint.Style.FILL);
        // 上左
        canvas.drawArc(mw1,mh1,mw2,mh2,-20,-100,true,mPaint);
        // 下部
        canvas.drawArc(mw1,mh1,mw2,mh2,30,120,false,mPaint);
        // 上有

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(mw1,mh1,mw2,mh2,-135,-150,false,mPaint);

    }

    private void setSize() {
        mw1 = width/2-200;
        mw2 = width/2+200;
        mh1 = height/2-120;
        mh2 = height/2+120;
    }
}
