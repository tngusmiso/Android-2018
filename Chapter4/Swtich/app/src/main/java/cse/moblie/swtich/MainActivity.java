package cse.moblie.swtich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch sw = (Switch) findViewById(R.id.swWifi);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton v, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(),"Wifi On", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Wifi Off", Toast.LENGTH_LONG).show();
                }
            }
        });
    }




}
