package com.example.googleapi

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
  lateinit var  user:EditText
  lateinit var password:EditText
  lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        user = findViewById(R.id.txtUser)
        password=findViewById(R.id.txtPassoword)
        btnLogin = findViewById(R.id.bt_login)

        btnLogin.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        })
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                super.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
   /* fun validar(){
        if(user.text.isEmpty() && password.text.isEmpty()){
            Toast.makeText(this,"Ingrese los datos correctos",Toast.LENGTH_LONG)
        }else{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }*/
}
