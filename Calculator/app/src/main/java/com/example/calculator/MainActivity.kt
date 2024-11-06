package com.example.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_main.button_0
import kotlinx.android.synthetic.main.activity_main.button_1
import kotlinx.android.synthetic.main.activity_main.button_2
import kotlinx.android.synthetic.main.activity_main.button_3
import kotlinx.android.synthetic.main.activity_main.button_4
import kotlinx.android.synthetic.main.activity_main.button_5
import kotlinx.android.synthetic.main.activity_main.button_6
import kotlinx.android.synthetic.main.activity_main.button_7
import kotlinx.android.synthetic.main.activity_main.button_8
import kotlinx.android.synthetic.main.activity_main.button_9
import kotlinx.android.synthetic.main.activity_main.button_addition
import kotlinx.android.synthetic.main.activity_main.button_bracket_left
import kotlinx.android.synthetic.main.activity_main.button_bracket_right
import kotlinx.android.synthetic.main.activity_main.button_clear
import kotlinx.android.synthetic.main.activity_main.button_division
import kotlinx.android.synthetic.main.activity_main.button_dot
import kotlinx.android.synthetic.main.activity_main.button_equals
import kotlinx.android.synthetic.main.activity_main.button_multiply
import kotlinx.android.synthetic.main.activity_main.button_subtraction
import kotlinx.android.synthetic.main.activity_main.input
import kotlinx.android.synthetic.main.activity_main.output



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

        button_clear.setOnClickListener {
            input.text = ""
            output.text = ""

        }
        button_bracket_left.setOnClickListener {

            input.text = addToInputText(buttonValue = "(")
        }
        button_bracket_right.setOnClickListener {
            input.text = addToInputText(buttonValue = ")")
        }
        button_0.setOnClickListener {
            input.text = addToInputText(buttonValue = "0")
        }
        button_1.setOnClickListener {
            input.text = addToInputText(buttonValue = "1")
        }
        button_2.setOnClickListener {
            input.text = addToInputText(buttonValue = "2")
        }
        button_3.setOnClickListener {
            input.text = addToInputText(buttonValue = "3")
        }
        button_4.setOnClickListener {
            input.text = addToInputText(buttonValue = "4")
        }
        button_5.setOnClickListener {
            input.text = addToInputText(buttonValue = "5")
        }
        button_6.setOnClickListener {
            input.text = addToInputText(buttonValue = "6")
        }
        button_7.setOnClickListener {
            input.text = addToInputText(buttonValue = "7")
        }
        button_8.setOnClickListener {
            input.text = addToInputText(buttonValue = "8")
        }
        button_9.setOnClickListener {
            input.text = addToInputText(buttonValue = "9")
        }
        button_dot.setOnClickListener {
            input.text = addToInputText(buttonValue = ".")
        }
        button_division.setOnClickListener {
            input.text = addToInputText(buttonValue = "/")

        }
        button_multiply.setOnClickListener {
            input.text = addToInputText(buttonValue = "*")
        }
        button_subtraction.setOnClickListener {
            input.text = addToInputText(buttonValue = "-")
        }
        button_addition.setOnClickListener {
            input.text = addToInputText(buttonValue = "+")
        }
        button_equals.setOnClickListener {
            showResult()
        }


    }
        private fun addToInputText(buttonValue: String): String {
            return "${input.text}$buttonValue"

        }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("/"), "/")
        expression = expression.replace(Regex("*"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Exppression
        } catch (e: Exception) {

            println("Error: ${e.message}")
        }
    }
    }
