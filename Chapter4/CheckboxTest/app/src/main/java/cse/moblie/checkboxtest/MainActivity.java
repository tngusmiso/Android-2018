package cse.moblie.checkboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View v){
        // Is the view now checked?
        boolean checked = ((CheckBox) v).isChecked();

        if (checked) {
            Toast.makeText(getApplicationContext(), ((CheckBox)v).getText()+" checked", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), ((CheckBox)v).getText()+" unchecked", Toast.LENGTH_LONG).show();
        }
    }
}

