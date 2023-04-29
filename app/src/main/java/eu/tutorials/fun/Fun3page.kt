package eu.tutorials.`fun`

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FunPage3: AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnprevious:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_page2)
        btnNext=findViewById(R.id.btnbaby)
        btnprevious=findViewById(R.id.btnprevious)
        btnNext.setOnClickListener {
            val intent=Intent(this,FunPage5::class.java)
            startActivity(intent)
        }
        btnprevious.setOnClickListener {
            val intent=Intent(this,FunPage2::class.java)
            startActivity(intent)
        }
    }

}
