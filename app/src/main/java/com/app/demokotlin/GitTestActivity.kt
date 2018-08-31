package com.app.demokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GitTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_test)

        Toast.makeText(this,"Git",Toast.LENGTH_LONG).show()
    }
}
