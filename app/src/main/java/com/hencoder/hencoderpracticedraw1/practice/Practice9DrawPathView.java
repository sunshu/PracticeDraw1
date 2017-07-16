package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {


    private Paint mPaint ;
    private Path mPath;
    private int height;
    private int width;
    private int mw1;
    private int mw2;
    private int mh1;
    private int mh2;

    public Practice9DrawPathView(Context context) {
        super(context);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPath = new Path();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        setSize();
//        练习内容：使用 canvas.drawPath() 方法画心形
//        mPaint.setStyle(Paint.Style.FILL);

//        mPath.addArc(200,200,400,400,-225, 225);
//        mPath.arcTo(400,200,600,400,-180, 225, false);
//        mPath.lineTo(400,200);

//        mPath.lineTo(400, 542);
//        mPath.addCircle(0,0,300, Path.Direction.CW);
//        mPath.moveTo(width/2,height/2);

//        mPath.addArc(mw1);
//        mPath.moveTo(width/2,height/2);
//        mPath.addArc(100,100,200,200,0,-180);
//        mPath.addArc(200,100,300,200,0,-180);
        mPaint.setStrokeWidth(30);

        mPath.moveTo(200,200);
        mPath.lineTo(400,500);
        mPath.lineTo(600,200);
//        mPath.addArc(400,100,);

//        mPath.lineTo(300,200);
//        mPath.lineTo(300,700);


//        mPath.lineTo(200,200);
        canvas.drawPath(mPath,mPaint);




    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }


    private void setSize() {
        mw1 = width/2-200;
        mw2 = width/2+200;
        mh1 = height/2-120;
        mh2 = height/2+120;
    }
}
