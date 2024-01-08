package com.example.forget

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import com.example.forget.databinding.ActivityForgetBinding

class forget : AppCompatActivity() {
    private lateinit var binding: ActivityForgetBinding
    private lateinit var dialog:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityForgetBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    binding.buttonResetPassword.setOnClickListener {
        dialog= Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom)
        dialog.setCancelable(false)
        dialog.show()
        Toast.makeText(this,"btn is clicked",Toast.LENGTH_SHORT).show()
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }






    }
    }
