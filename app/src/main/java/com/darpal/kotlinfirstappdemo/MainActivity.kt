package com.darpal.kotlinfirstappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_findAge.setOnClickListener(View.OnClickListener {
            ageCalculator()
        })
    }

    fun ageCalculator(){
        val number = Integer.parseInt(et_BirthYear.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - number
        if (yourAge == 2019){
            tv_displayAge.text = "You are just born!"
        }
        else if (yourAge > 2019){
            tv_displayAge.text = "You cannot enter year more than current year"
        }
        else {
            tv_displayAge.text = "You are $yourAge years old!"
        }
    }
}
