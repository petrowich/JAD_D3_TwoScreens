package su.petrowich.jad_d3_twoscreens

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editText = findViewById<EditText>(R.id.editText)

        val buttonToSecondScreen = findViewById<Button>(R.id.buttonToMainScreen)
        buttonToSecondScreen.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java).apply { putExtra("SecondScreenText",editText.text.toString()) }

            //intent.putExtra("SecondScreenText",editText.text.toString())

            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}