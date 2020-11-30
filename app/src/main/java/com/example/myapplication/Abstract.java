package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public abstract class Abstract extends MainActivity {

    public static int NOMBRE = 42;
    public int NOMBRE2 = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView());
    }

    public abstract int myView();
    public abstract void goToAbstract(View view);
}


