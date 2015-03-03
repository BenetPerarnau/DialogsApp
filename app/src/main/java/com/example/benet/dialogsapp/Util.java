package com.example.benet.dialogsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Benet on 03/03/15.
 */
public class Util {


    public static void getDialogA(final Activity context){
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View promptView = layoutInflater.inflate(R.layout.dialog_layout, null);

        final AlertDialog alertD = new AlertDialog.Builder(context).create();

        alertD.setCancelable(false);

        TextView userInput = (TextView) promptView.findViewById(R.id.dialog_text);

        Button btnAdd1 = (Button) promptView.findViewById(R.id.btn_ok);

        Button btnAdd2 = (Button) promptView.findViewById(R.id.bnt_cancel);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // btnAdd1 has been clicked
                alertD.dismiss();

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
}
