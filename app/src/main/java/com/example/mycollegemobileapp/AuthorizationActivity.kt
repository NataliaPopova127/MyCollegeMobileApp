package com.example.mycollegemobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AuthorizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyCollegeMobileApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        title = "Авторизация"
    }

    fun btnApplicantInfClick(view: View) {
        var intent : Intent = Intent(this@AuthorizationActivity, ApplicantInfActivity::class.java)
        startActivity(intent)
    }
    fun btnSignInClick(view: View) {}
}