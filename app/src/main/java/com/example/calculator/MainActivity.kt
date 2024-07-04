package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private var first_number = ""
    private var second_number = ""
    private var next_number = false
    private var operation_to_be_done = ""
    private var resulting_number = 0

    fun add_one(view: View) {
        var view_route = 0
        if (!next_number) {
            first_number += "1"
            view_route = R.id.first_number_view
        } else {
            second_number += "1"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_two(view: View) {
        var view_route = 0
        if(!next_number){
            first_number += "2"
            view_route = R.id.first_number_view
        } else {
            second_number += "2"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_three(view: View) {
        var view_route = 0
        if(!next_number){
            first_number += "3"
            view_route = R.id.first_number_view
        } else {
            second_number += "3"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_four(view: View) {
        var view_route = 0
        if(!next_number){
            first_number += "4"
            view_route = R.id.first_number_view
        } else {
            second_number += "4"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_five(view: View) {
        var view_route = 0
        if(next_number == false){
            first_number += "5"
            view_route = R.id.first_number_view
        } else {
            second_number += "5"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_six(view: View) {
        var view_route = 0
        if(next_number == false){
            first_number += "6"
            view_route = R.id.first_number_view
        } else {
            second_number += "6"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_seven(view: View) {
        var view_route = 0
        if(next_number == false){
            first_number += "7"
            view_route = R.id.first_number_view
        } else {
            second_number += "7"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_eight(view: View) {
        var view_route = 0
        if(next_number == false){
            first_number += "8"
            view_route = R.id.first_number_view
        } else {
            second_number += "8"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_nine(view: View) {
        var view_route = 0
        if(next_number == false){
            first_number += "9"
            view_route = R.id.first_number_view
        } else {
            second_number += "9"
            view_route = R.id.second_number_view
        }
        val textView: TextView = findViewById(view_route)
        textView.text = if (!next_number) first_number else second_number
    }
    fun add_zero(view: View) {
        if(next_number == false){
            first_number += "0"
        } else {
            second_number += "0"
        }
        val textView: TextView = findViewById(R.id.first_number_view)
        textView.text = if (!next_number) first_number else second_number
    }
    fun switchToNextNumber(view: View) {
        next_number = true
    }
    fun op_multiply(view: View) {
        if(!next_number) {
            operation_to_be_done = "*"
            switchToNextNumber(view)
            val textView: TextView = findViewById(R.id.operation_view)
            textView.text = operation_to_be_done
        }
    }
    fun op_division(view: View) {
        if(!next_number) {
            operation_to_be_done = "/"
            switchToNextNumber(view)
            val textView: TextView = findViewById(R.id.operation_view)
            textView.text = operation_to_be_done
        }
    }
    fun op_substraction(view: View) {
        if(!next_number) {
            operation_to_be_done = "-"
            switchToNextNumber(view)
            val textView: TextView = findViewById(R.id.operation_view)
            textView.text = operation_to_be_done
        }
    }
    fun op_addition(view: View) {
        if(!next_number) {
            operation_to_be_done = "+"
            switchToNextNumber(view)
            val textView: TextView = findViewById(R.id.operation_view)
            textView.text = operation_to_be_done
        }
    }

    fun get_result(view: View) {
        val firstNumberInt = first_number.toInt()
        val secondNumberInt = second_number.toInt()
        //var resultingNumber: Int = 0

        // Perform the operation based on the selected operator
        resulting_number = when (operation_to_be_done) {
            "+" -> firstNumberInt + secondNumberInt
            "-" -> firstNumberInt - secondNumberInt
            "*" -> firstNumberInt * secondNumberInt
            "/" -> firstNumberInt / secondNumberInt
            else -> 0
        }

        val textView: TextView = findViewById(R.id.result_view)
        textView.text = resulting_number.toString()
    }
}