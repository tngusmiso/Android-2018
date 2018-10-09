package cse.moblie.togglebuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleClicked(View v){
        boolean on =((ToggleButton) v).isChecked();

        if(on){
            Toast.makeText(getApplicationContext(),"Checked", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Unchecked", Toast.LENGTH_LONG).show();
        }

    }
}

