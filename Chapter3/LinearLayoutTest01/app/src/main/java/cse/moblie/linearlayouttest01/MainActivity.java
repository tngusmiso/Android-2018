package cse.moblie.linearlayouttest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =findViewById(R.id.button1);

        button.setOnClickListener(new ButtonClickListener());


    }

    private class ButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(getApplicationContext(),"Button Clicked 1",Toast.LENGTH_LONG).show();
        }
    }
}
