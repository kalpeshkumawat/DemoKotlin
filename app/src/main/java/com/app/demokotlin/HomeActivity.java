package com.app.demokotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Integer arra[] = {2,5,6,4,23,53,233,53};

        int maxNumber = 0;
        int secondMaxNumber = 0;

        for (int i = 0; i < arra.length; i++) {


            if (arra[i]>maxNumber){


                secondMaxNumber = maxNumber;
                maxNumber = arra[i];

            }

            else if(arra[i]>secondMaxNumber){

                secondMaxNumber = arra[i];
            }


        }

    }
}
