package com.next.volvomvp;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class MyImageView extends androidx.appcompat.widget.AppCompatImageView {
    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //instead of showing one image
        //i'll show multiple images animation
    }
}
