package com.example.clickergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
//This is the tanner-britt branch
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Variable declarations
    var walletBal: Int = 0
    var dirtVal: Int = 1

    //Click listener for Sell Dirt button
    fun sellDirt(view: View) {
        walletBal += dirtVal
        walletView.text = walletBal.toString()
    }
}
