package com.application.sudoku

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginRight
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class oldFile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val boxOne: TextView = findViewById(R.id.textBox1)
        val boxArray = mutableListOf<TextView>(boxOne)
        resetButton.setOnClickListener {
            solutionArray = startGame(boxArray, range, givenNumbers)
        }*/

        val newView = TextView(this)

        val viewOne: TextView = findViewById(R.id.textView1)
        val viewTwo: TextView = findViewById(R.id.textView2)
        val viewThree: TextView = findViewById(R.id.textView3)
        val viewFour: TextView = findViewById(R.id.textView4)
        val viewFive: TextView = findViewById(R.id.textView5)
        val viewSix: TextView = findViewById(R.id.textView6)
        val viewSeven: TextView = findViewById(R.id.textView7)
        val viewEight: TextView = findViewById(R.id.textView8)
        val viewNine: TextView = findViewById(R.id.textView9)

        val viewTen: TextView = findViewById(R.id.textView10)
        val viewEleven: TextView = findViewById(R.id.textView11)
        val viewTwelve: TextView = findViewById(R.id.textView12)
        val viewThirteen: TextView = findViewById(R.id.textView13)
        val viewFourteen: TextView = findViewById(R.id.textView14)
        val viewFifteen: TextView = findViewById(R.id.textView15)
        val viewSixteen: TextView = findViewById(R.id.textView16)
        val viewSeventeen: TextView = findViewById(R.id.textView17)
        val viewEighteen: TextView = findViewById(R.id.textView18)

        val viewNineteen: TextView = findViewById(R.id.textView19)
        val viewTwenty: TextView = findViewById(R.id.textView20)
        val viewTwentyOne: TextView = findViewById(R.id.textView21)
        val viewTwentyTwo: TextView = findViewById(R.id.textView22)
        val viewTwentyThree: TextView = findViewById(R.id.textView23)
        val viewTwentyFour: TextView = findViewById(R.id.textView24)
        val viewTwentyFive: TextView = findViewById(R.id.textView25)
        val viewTwentySix: TextView = findViewById(R.id.textView26)
        val viewTwentySeven: TextView = findViewById(R.id.textView27)

        val viewTwentyEight: TextView = findViewById(R.id.textView28)
        val viewTwentyNine: TextView = findViewById(R.id.textView29)
        val viewThirty: TextView = findViewById(R.id.textView30)
        val viewThirtyOne: TextView = findViewById(R.id.textView31)
        val viewThirtyTwo: TextView = findViewById(R.id.textView32)
        val viewThirtyThree: TextView = findViewById(R.id.textView33)
        val viewThirtyFour: TextView = findViewById(R.id.textView34)
        val viewThirtyFive: TextView = findViewById(R.id.textView35)
        val viewThirtySix: TextView = findViewById(R.id.textView36)

        val viewThirtySeven: TextView = findViewById(R.id.textView37)
        val viewThirtyEight: TextView = findViewById(R.id.textView38)
        val viewThirtyNine: TextView = findViewById(R.id.textView39)
        val viewForty: TextView = findViewById(R.id.textView40)
        val viewFortyOne: TextView = findViewById(R.id.textView41)
        val viewFortyTwo: TextView = findViewById(R.id.textView42)
        val viewFortyThree: TextView = findViewById(R.id.textView43)
        val viewFortyFour: TextView = findViewById(R.id.textView44)
        val viewFortyFive: TextView = findViewById(R.id.textView45)

        val viewFortySix: TextView = findViewById(R.id.textView46)
        val viewFortySeven: TextView = findViewById(R.id.textView47)
        val viewFortyEight: TextView = findViewById(R.id.textView48)
        val viewFortyNine: TextView = findViewById(R.id.textView49)
        val viewFifty: TextView = findViewById(R.id.textView50)
        val viewFiftyOne: TextView = findViewById(R.id.textView51)
        val viewFiftyTwo: TextView = findViewById(R.id.textView52)
        val viewFiftyThree: TextView = findViewById(R.id.textView53)
        val viewFiftyFour: TextView = findViewById(R.id.textView54)

        val viewFiftyFive: TextView = findViewById(R.id.textView55)
        val viewFiftySix: TextView = findViewById(R.id.textView56)
        val viewFiftySeven: TextView = findViewById(R.id.textView57)
        val viewFiftyEight: TextView = findViewById(R.id.textView58)
        val viewFiftyNine: TextView = findViewById(R.id.textView59)
        val viewSixty: TextView = findViewById(R.id.textView60)
        val viewSixtyOne: TextView = findViewById(R.id.textView61)
        val viewSixtyTwo: TextView = findViewById(R.id.textView62)
        val viewSixtyThree: TextView = findViewById(R.id.textView63)

        val viewSixtyFour: TextView = findViewById(R.id.textView64)
        val viewSixtyFive: TextView = findViewById(R.id.textView65)
        val viewSixtySix: TextView = findViewById(R.id.textView66)
        val viewSixtySeven: TextView = findViewById(R.id.textView67)
        val viewSixtyEight: TextView = findViewById(R.id.textView68)
        val viewSixtyNine: TextView = findViewById(R.id.textView69)
        val viewSeventy: TextView = findViewById(R.id.textView70)
        val viewSeventyOne: TextView = findViewById(R.id.textView71)
        val viewSeventyTwo: TextView = findViewById(R.id.textView72)

        val viewSeventyThree: TextView = findViewById(R.id.textView73)
        val viewSeventyFour: TextView = findViewById(R.id.textView74)
        val viewSeventyFive: TextView = findViewById(R.id.textView75)
        val viewSeventySix: TextView = findViewById(R.id.textView76)
        val viewSeventySeven: TextView = findViewById(R.id.textView77)
        val viewSeventyEight: TextView = findViewById(R.id.textView78)
        val viewSeventyNine: TextView = findViewById(R.id.textView79)
        val viewEighty: TextView = findViewById(R.id.textView80)
        val viewEightyOne: TextView = findViewById(R.id.textView81)


        val viewArray: Array<Array<TextView>> = arrayOf(
            arrayOf(viewOne, viewTwo, viewThree, viewFour, viewFive, viewSix, viewSeven, viewEight, viewNine),
            arrayOf(viewTen, viewEleven, viewTwelve, viewThirteen, viewFourteen, viewFifteen, viewSixteen, viewSeventeen, viewEighteen),
            arrayOf(viewNineteen, viewTwenty, viewTwentyOne, viewTwentyTwo, viewTwentyThree, viewTwentyFour, viewTwentyFive, viewTwentySix, viewTwentySeven),
            arrayOf(viewTwentyEight, viewTwentyNine, viewThirty, viewThirtyOne, viewThirtyTwo, viewThirtyThree, viewThirtyFour, viewThirtyFive, viewThirtySix),
            arrayOf(viewThirtySeven, viewThirtyEight, viewThirtyNine, viewForty, viewFortyOne, viewFortyTwo, viewFortyThree, viewFortyFour, viewFortyFive),
            arrayOf(viewFortySix, viewFortySeven, viewFortyEight, viewFortyNine, viewFifty, viewFiftyOne, viewFiftyTwo, viewFiftyThree, viewFiftyFour),
            arrayOf(viewFiftyFive, viewFiftySix, viewFiftySeven, viewFiftyEight, viewFiftyNine, viewSixty, viewSixtyOne, viewSixtyTwo, viewSixtyThree),
            arrayOf(viewSixtyFour, viewSixtyFive, viewSixtySix, viewSixtySeven, viewSixtyEight, viewSixtyNine, viewSeventy, viewSeventyOne, viewSeventyTwo),
            arrayOf(viewSeventyThree, viewSeventyFour, viewSeventyFive, viewSeventySix, viewSeventySeven, viewSeventyEight, viewSeventyNine, viewEighty, viewEightyOne)
        )


        val db = Firebase.firestore

        val docRef = db.collection("Puzzles").document("easy")
        docRef.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val JSON_information = document.data.toString()
                    println(JSON_information)
                    Log.d("Found document", "DocumentSnapshot data: ${document.data}")
                    val hashMap = (document.data) //{0="1111111", 1="2222222"}
                    var myString = hashMap!!["0"] //"1111111"

                    //if {0="12.3"} is the puzzle in the database, then the output should be: 1,2,BLANK,3 on the TextViews
                    if(myString is String) {
                        var counter = 0

                        for(group in viewArray) { //Group = [v1,v2,v3]
                            for(button in group){ //button = v1
                                if(myString[counter].toString() != ".") { //if {0="12.3"}, then the output should be: {1,2,BLANK,3}
                                    button.text = myString[counter].toString()
                                }
                                else {
                                    button.text = ""
                                }
                                counter++
                            }
                        }
                    }



                } else {
                    Log.d("Found document", "No such document")
                }
            }
            .addOnFailureListener{exception ->
                Log.d("Found document", "get failed with $exception")
            }

    }
}