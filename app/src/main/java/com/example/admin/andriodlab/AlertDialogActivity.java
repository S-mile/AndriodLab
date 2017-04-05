package com.example.admin.andriodlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * Created by ADMIN on 2017/4/1.
 */

public class AlertDialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setin_btn);
        Button setin = (Button) findViewById(R.id.setin_btn);
        setin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createDiolog();
            }
        });
    }
    public void createDiolog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //动态加载生成View对象
        LayoutInflater layoutInflater =getLayoutInflater();
        builder.setView(layoutInflater.inflate(R.layout.setin, null))
                // Add action buttons
                .setPositiveButton(R.string.login, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.cancle, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        builder.create();
        builder.show();
    }
}
