package kr.co.tjoeun.androidbasic01_intent_20200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)

        }

//        두번째 액티비티(SecondActivity)로 버튼을 누르면 이동, 돌아가기 버튼 누르면
//        다시 메인으로 돌아오도록

        goToSecondBtn.setOnClickListener {
            val secondIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondIntent)
        }

        goToThirdBtn.setOnClickListener {

            val inputContent = contentEdt.text.toString()

            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("content", inputContent)
            startActivity(myIntent)
        }

    }
}
