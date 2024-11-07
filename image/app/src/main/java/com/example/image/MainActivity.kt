package com.example.image
import android.widget.ImageView
import android.widget.ImageButton
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var imageView2: ImageView
    private lateinit var buttonImage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2 = findViewById(R.id.imageView2)
        buttonImage = findViewById(R.id.imageButton)


        buttonImage.setOnClickListener {
            onClickImage(it)
        }
    }


    private fun onClickImage(view: View) {

        if (buttonImage.drawable.constantState == resources.getDrawable(R.drawable.lol).constantState) {
            buttonImage.setImageResource(R.drawable.kek)

        } else {
            buttonImage.setImageResource(R.drawable.lol)

        }
    }


    fun onClick(view: View) {
        imageView2.setImageResource(R.drawable.apple2)
    }
}