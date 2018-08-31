package com.app.demokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var arr = arrayOf(22, 3, 12, 45, 1, 432, 4535, 221, 65)

        var maximumNumber: Int = 0
        var secondMaximumNumber: Int = 0




        for (i in arr ) {


            if(i>maximumNumber){

                secondMaximumNumber = maximumNumber
                maximumNumber = i
            }

            else if(i>secondMaximumNumber){

                secondMaximumNumber = i
            }

        }


        Toast.makeText(this, "Data $secondMaximumNumber",Toast.LENGTH_LONG).show()
    }


}
