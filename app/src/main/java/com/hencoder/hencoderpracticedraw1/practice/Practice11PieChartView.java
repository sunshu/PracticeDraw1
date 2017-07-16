package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice11PieChartView extends View {

    private Paint paint;

    private int width;
    private int height;
    private RectF rect;

    public Practice11PieChartView(Context context) {
        this(context,null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();

    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rect = new RectF(-200,-200,+200,200);



    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        canvas.translate(width/2,height/2);

        paint.setColor(Color.CYAN);
        canvas.drawArc(rect,-5,-50,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rect,0,40,true,paint);


        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rect,42,80,true,paint);


        paint.setColor(Color.GREEN);
        canvas.drawArc(rect,85,80,true,paint);

        canvas.save();

        canvas.translate(-20,-20);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rect,-52,-140,true,paint);


    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        width = w;
        height = h;
    }
}
