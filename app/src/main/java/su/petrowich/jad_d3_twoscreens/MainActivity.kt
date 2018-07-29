package su.petrowich.jad_d3_twoscreens

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView = null as TextView?
    var REQUEST_CODE_SECOND_SCREEN = 10001 as Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.textView)

        val buttonToSecondScreen = findViewById<Button>(R.id.buttonToSecondScreen)
        buttonToSecondScreen.setOnClickListener{
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivityForResult(intent,REQUEST_CODE_SECOND_SCREEN)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == REQUEST_CODE_SECOND_SCREEN && resultCode == Activity.RESULT_OK){
            textView?.text = data?.getStringExtra("SecondScreenText")
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

}
