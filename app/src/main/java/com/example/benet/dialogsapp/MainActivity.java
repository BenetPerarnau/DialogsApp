package com.example.benet.dialogsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Context context;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        activity=this;

        Button openD=(Button)findViewById(R.id.btn_open_dialog);

        openD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //messageDialog("TITLE","MSG",context);
                  dialog2();
                //Util.getDialogA(activity);
                Log.e("MAIN => ", "Hola");
            }
        });

    }

    public void setText(){
        Log.e("MAIN","Set Text");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void messageDialog(String title, String message, final Context activity) {

        final Dialog myDialog = new Dialog(activity);
        myDialog.setContentView(R.layout.dialog_layout);
       // myDialog.setTitle(title);
        //myDialog.setCancelable(false);

        TextView text = (TextView) myDialog.findViewById(R.id.dialog_text);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText(message);

        Button ok = (Button) myDialog.findViewById(R.id.btn_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                myDialog.dismiss();


            }
        });

        Button cancel= (Button) myDialog.findViewById(R.id.bnt_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                myDialog.dismiss();


            }
        });


        myDialog.show();

    }

    public void dialog2(){

        LayoutInflater layoutInflater = LayoutInflater.from(this);

        View promptView = layoutInflater.inflate(R.layout.dialog_layout, null);

        final AlertDialog alertD = new AlertDialog.Builder(this).create();

        alertD.setCancelable(false);

        TextView userInput = (TextView) promptView.findViewById(R.id.dialog_text);

        Button btnAdd1 = (Button) promptView.findViewById(R.id.btn_ok);

        Button btnAdd2 = (Button) promptView.findViewById(R.id.bnt_cancel);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // btnAdd1 has been clicked
                alertD.dismiss();
                setText();
            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                alertD.dismiss();

            }
        });

        alertD.setView(promptView,0,0,0,0);

        alertD.show();
    }

    public void dialog3(){

    }
}
