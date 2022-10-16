package com.example.uni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.uni.klases

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val knobke : Button = findViewById(R.id.print_btn)
        val tekstas : TextView = findViewById(R.id.info_txt)
        val spinneris : Spinner = findViewById(R.id.choose_spnr)
        val ivedimas : EditText = findViewById(R.id.imput_txt)

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.choises,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinneris.adapter = adapter
        }

        knobke.setOnClickListener()
        {
            val notCounted: String = ivedimas.text.toString();

            val choise: String = spinneris.selectedItem.toString();
            val selection = klases.Choises(choise,notCounted);

            val result : String = klases.Choises(choise,notCounted).toString();

            if (result != "0") {tekstas.text = result}
            else
            {
                tekstas.text = ""
                Toast.makeText(this@MainActivity, "Prasau irasyti teksta", Toast.LENGTH_SHORT).show()
            }

        }

    }
}