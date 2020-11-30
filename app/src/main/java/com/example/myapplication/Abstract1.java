package com.example.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class Abstract1 extends Abstract
{


    @Override
    public int myView()
    {
        return (R.layout.abstract1);
    }

    @Override
    public void goToAbstract(View view){

        Log.e("DEVE0304", "Page suivante");

        Intent intent = new Intent(view.getContext(), Abstract2.class);
        view.getContext().startActivity(intent);
    };


}
