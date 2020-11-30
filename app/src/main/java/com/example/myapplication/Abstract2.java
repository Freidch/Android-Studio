package com.example.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class Abstract2 extends Abstract{

    @Override
    public int myView()
    {
        return (R.layout.abstract2);
    }


    @Override
    public void goToAbstract(View view){

        Log.e("DEVE0304", "Page précédente");

        Intent intent = new Intent(view.getContext(), Abstract1.class);
        view.getContext().startActivity(intent);
    };


}
