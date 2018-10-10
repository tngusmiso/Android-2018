package cse.moblie.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvR = (TextView) findViewById(R.id.tvRed);
        final TextView tvG = (TextView) findViewById(R.id.tvGreen);
        final TextView tvB = (TextView) findViewById(R.id.tvBlue);

        RadioGroup rg = findViewById(R.id.rgColor);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbRed:
                        tvR.setVisibility(View.VISIBLE);
                        tvG.setVisibility(View.INVISIBLE);
                        tvB.setVisibility(View.INVISIBLE);
                    break;
                    case R.id.rbGreen:
                        tvR.setVisibility(View.INVISIBLE);
                        tvG.setVisibility(View.VISIBLE);
                        tvB.setVisibility(View.INVISIBLE);
                    break;
                    case R.id.rbBlue:
                        tvR.setVisibility(View.INVISIBLE);
                        tvG.setVisibility(View.INVISIBLE);
                        tvB.setVisibility(View.VISIBLE);
                    break;
                }
            }
        });
    }
}
