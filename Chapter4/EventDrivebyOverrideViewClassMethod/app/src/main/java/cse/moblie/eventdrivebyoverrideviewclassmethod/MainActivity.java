package cse.moblie.eventdrivebyoverrideviewclassmethod;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CancellationSignal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


class MyView extends View {
    int key;
    String str;
    int x, y;

    public MyView(Context context){
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e){
        x = (int) e.getX(0);
        y = (int) e.getY(0);
        invalidate();
        return super.onTouchEvent(e);
    }

    @Override
    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setTextSize(30);
        canvas.drawCircle(x,y,30,paint);
        canvas.drawText("("+x+"+"+y+") 에서 터치 이벤트가 발생하였음", x, y+100, paint);

    }

}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView w = new MyView(this);
        setContentView(w);
    }
}


