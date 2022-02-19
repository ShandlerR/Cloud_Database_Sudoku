package com.application.sudoku

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

//Cloud database Sudoku Puzzle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore //connects to the database

        val dbTextList = mutableListOf<String>() //A list for storing information for the database
        val textList = mutableListOf<TextView>()

        val docRef = db.collection("Puzzles").document("easy") //opens the documents where the puzzles are stored
        docRef.get()
            .addOnSuccessListener { document -> //if we can successfully access the specified location
                if (document != null) {

                    //Enters the Hashmap, stores every character of the string as it's own element inside of dbtextlist
                    val hashMap = (document.data) //{0="1111111", 1="2222222"}
                    val myString = hashMap!!["0"] //"1111111"
                    if(myString is String) {
                        for(char in myString) {
                            var text = char.toString() //"1"
                            dbTextList.add(text)
                        }
                    }

                    //changes the textboxs to match the database, internet connection affects when this happens
                    for((index, textBox) in textList.withIndex()) {
                        if(dbTextList[index] != ".") {
                            textBox.text = dbTextList[index]
                        }else {
                            textBox.text = ""
                        }
                    }
                }
            } //on failure, prints the reason why (Ususally permission problems)
            .addOnFailureListener{exception ->
                Log.d("Found document", "get failed with $exception")
            }

        //Begins creating the physical view

        val tb1 = findViewById<TableLayout>(R.id.tableLayout) //accesses the table

        for(row in (0..8 step 1)) { //each row
            var newRow = TableRow(this)
            tb1.addView(newRow)

            for(column in (0..8 step 1)) { //creates the textboxes and gives them their default information
                val view = TextView(this) //creates the textView
                view.text = "7"
                view.height = resources.getDimensionPixelSize(R.dimen.text_height)
                view.width = resources.getDimensionPixelSize(R.dimen.text_height)
                view.background = resources.getDrawable(R.drawable.textview_boarder)
                view.textSize = resources.getDimension(R.dimen.text_size)
                view.textAlignment = View.TEXT_ALIGNMENT_CENTER

                newRow.addView(view) //adds the boxes to the physical row
                textList.add(view) //Adds the boxes to the textList array
            }
        }
    }
}