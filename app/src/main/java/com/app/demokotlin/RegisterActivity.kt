package com.app.demokotlin

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import java.util.*


class RegisterActivity : AppCompatActivity(), View.OnClickListener {


    private val CAMERA_REQUEST = 1888
    var imageBitmap: Bitmap? = null

    private val mList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


jkhkkkkjhkkkhkhk

        iv_image.setOnClickListener(this)
        btn_register.setOnClickListener(this)
        setUpGender()

    }


    override fun onClick(view: View?) {

        when (view!!.id) {

            R.id.iv_image -> {

                val cameraIntent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, CAMERA_REQUEST)

            }

            R.id.btn_register -> {

                if (isValidData()) {

                    Toast.makeText(this, "Valid Data", Toast.LENGTH_LONG).show()
                }
            }

        }

    }


    private fun isValidData(): Boolean {


        return when {

            imageBitmap == null -> {

                Toast.makeText(this, "Please select image", Toast.LENGTH_LONG).show()
                false
            }

            TextUtils.isEmpty(ed_email.text.toString().trim()) -> {

                Toast.makeText(this, "Please enter email", Toast.LENGTH_LONG).show()

                false
            }


            TextUtils.isEmpty(ed_name.text.toString().trim()) -> {

                Toast.makeText(this, "Please enter name", Toast.LENGTH_LONG).show()

                false
            }


            sp_gender.selectedItemPosition == 0 -> {

                Toast.makeText(this, "Please select gender", Toast.LENGTH_LONG).show()

                false
            }

            else -> true
        }


    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode == CAMERA_REQUEST) {
            var photo = data.extras!!.get("data") as Bitmap

            imageBitmap = photo

            iv_image.setImageBitmap(photo)
        }
    }

    private fun setUpGender() {

        mList.add("Select gender")
        mList.add("Male")
        mList.add("Female")


        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, mList)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sp_gender.adapter = aa

    }
}
