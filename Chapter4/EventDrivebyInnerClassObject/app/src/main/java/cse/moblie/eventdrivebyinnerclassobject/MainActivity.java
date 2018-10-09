package cse.moblie.eventdrivebyinnerclassobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class MyListenerClass implements View.OnClickListener{
        public void onClick(View v){
            Toast.makeText(getApplicationContext(), "clicked Button", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btn);

        MyListenerClass buttonListener = new MyListenerClass();
        button.setOnClickListener(buttonListener);
    }

}

