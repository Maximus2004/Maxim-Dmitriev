package ru.startandroid.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Listener implements View.OnClickListener {

    LoginActivity main;
    public static final String pass  = "1234";
    public static final String log  = "maks";

    Listener (LoginActivity m){
        main = m;
    }

    @Override
    public void onClick(View v) {
        TextView t = main.findViewById(R.id.textViewCheck);
        EditText l = main.findViewById(R.id.editTextLogin);
        EditText p = main.findViewById(R.id.editTextPass);
        String result = p.getText().toString();
        String result2 = l.getText().toString();
        System.out.println(result+" "+result2);
        if (result != pass || result2 != log){
            t.setText("Вы ошиблись в логине или пароле");
            t.setTextColor(Color.RED);
        }
        if (result == pass && result2 == log){
            t.setText("Верно");
            t.setTextColor(Color.GREEN);
        }
    }
}
