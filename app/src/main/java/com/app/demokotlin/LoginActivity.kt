package com.app.demokotlin

import android.content.Intent
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private val fix_email: String = "abc@yopmail.com"
    private val fix_password: String = "123456"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btn_submit.setOnClickListener(this)
        tv_sign_up.setOnClickListener(this)


        var i = 1
        do {
            println(i)
            i++
        } while (i <= 10)


    }


    override fun onClick(view: View?) {


        when (view!!.id) {


            R.id.btn_submit -> {


                val num1 = 100

                val s = num1 + 20

                Toast.makeText(this, "" + s, Toast.LENGTH_LONG).show()


                /* if (isValidDone()) {


                     val enterEmail = ed_email.text.toString().trim()
                     val enterPassword = ed_password.text.toString().trim()




                     if (enterEmail.equals(fix_email, ignoreCase = true) && enterPassword == fix_password) {


                         val intent = Intent(this, RegisterActivity::class.java)
                         startActivity(intent)

                     } else {

                         Toast.makeText(this, "Invalid Data", Toast.LENGTH_LONG).show()
                     }

                 }*/


                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)

            }

            R.id.tv_sign_up -> {

                Toast.makeText(this, "Sign Up", Toast.LENGTH_LONG).show()

            }
        }

    }

    private fun isValidDone(): Boolean {


        return when {

            TextUtils.isEmpty(ed_email.text.toString().trim()) -> {

                Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show()
                ed_email.requestFocus()
                false
            }


            TextUtils.isEmpty(ed_password.text.toString().trim()) -> {

                Toast.makeText(this, "Please enter password", Toast.LENGTH_LONG).show()
                ed_password.requestFocus()
                false

            }

            else -> {
                true
            }
        }


    }

}
