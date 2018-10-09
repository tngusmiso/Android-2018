package cse.moblie.radiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgColor = findViewById(R.id.rgColor);
        rgColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedID){

                switch (checkedID){
                    case R.id.rbRed:
                        Toast.makeText(getApplicationContext(),"red checked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbGreen:
                        Toast.makeText(getApplicationContext(),"green checked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbBlue:
                        Toast.makeText(getApplicationContext(),"blue checked", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }
}
