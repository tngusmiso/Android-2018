package cse.moblie.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button btOk = findViewById(R.id.btOk);
//        btOk.setText("Yes");

        TextView tvHello = new TextView(this);
        tvHello.setText("Hello, Android");

        Button btOk = new Button(this);
        btOk.setText("Yes");

        LinearLayout llManager = new LinearLayout(this);
        llManager.setOrientation(LinearLayout.VERTICAL);


        LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        llManager.addView(tvHello, llParams);
        llManager.addView(btOk, llParams);

        setContentView(llManager);
    }
}
