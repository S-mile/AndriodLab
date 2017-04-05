package com.example.admin.andriodlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.oh);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleActivity.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.setin);
        btn2.setOnClickListener(new View.OnClickListener() {

          public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });
        Button btn3 = (Button) findViewById(R.id.XML);
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,XmlDefineMenuTutorial.class);
                startActivity(intent);
            }
        });
        Button btn4 = (Button) findViewById(R.id.actionMode);
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContextualActionBarTutorial.class);
                startActivity(intent);
            }
        });
        Button btn5 = (Button) findViewById(R.id.progress_bar_btn);
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProgressBarTutorial.class);
                startActivity(intent);
            }
        });
    }
}
