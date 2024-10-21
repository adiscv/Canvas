package com.example.houseview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class HouseView extends View {
    private Paint paint;

    public HouseView(Context context) {
        super(context);
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.YELLOW);  // Цвет дома
        canvas.drawRect(200, 800, 900, 1300, paint);

        paint.setColor(Color.RED);  // Крыша
        Path roof = new Path();
        roof.moveTo(200, 800);  // Левая точка
        roof.lineTo(900, 800);  // Правая точка
        roof.lineTo(550, 400);  // Верхняя точка
        roof.close();
        canvas.drawPath(roof, paint);

        paint.setColor(Color.GREEN);  // Дверь
        canvas.drawRect(470, 970, 630, 1300, paint);

        paint.setColor(Color.CYAN);  // Левое окно
        canvas.drawRect(250, 1050, 420, 1200, paint);

        paint.setColor(Color.CYAN);  // Правое окно
        canvas.drawRect(690, 1050, 840, 1200, paint);
    }
}