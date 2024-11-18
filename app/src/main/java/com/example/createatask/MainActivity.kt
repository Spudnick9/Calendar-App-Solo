package com.example.createatask


import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.createatask.ui.theme.CreateATaskTheme
import com.example.diceroller.R
import android.widget.EditText
import android.widget.ListView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var list: ListView
    private lateinit var button: Button
    private lateinit var activity: EditText
    private lateinit var date: EditText
    private lateinit var time: EditText

    private val activityList = ArrayList<String>()
    private val dateList = ArrayList<String>()
    private val timeList = ArrayList<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list = findViewById(R.id.list)
        button = findViewById(R.id.button)
        activity = findViewById(R.id.activity)
        date = findViewById(R.id.date)
        time = findViewById(R.id.time)

        button.setOnClickListener {
            val newActivity = activity.text.toString()
            val newDate = date.text.toString()
            val newTime = time.text.toString()


            activityList.add(newActivity)
            dateList.add(newDate)
            timeList.add(newTime)


            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, activityList)
            list.adapter = adapter


            activity.text.clear()
            date.text.clear()
            time.text.clear()
        }








    }
}