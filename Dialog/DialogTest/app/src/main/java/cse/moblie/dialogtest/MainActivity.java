package cse.moblie.dialogtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btDialog = findViewById(R.id.btDialog);
        btDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //alert dialog builder
                AlertDialog.Builder adBuilder = new AlertDialog.Builder(MainActivity.this);
//                AlertDialog.Builder adBuilder = new AlertDialog.Builder(getApplicationContext());  // 런타임 에러 - 체크해 볼 필요 있음

                //발더로 속성 설정
                adBuilder.setMessage("Time Out!!!");
                adBuilder.setTitle("Notice");
                adBuilder.setIcon(R.mipmap.ic_launcher);    //아이콘은 타이틀 영역에 속함

                adBuilder.show();
            }
        });
    }
}
