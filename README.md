# Overview

This app is designed to be a sudoku puzzle that gets it's tables from a cloud database server. I made this app for 2 primary reasons. 1) To Learn good work
habits when working with Android Studio (ie. not relying fully on my constraint view for every element of a program, but learning how to create Views programmatically)
2) To learn how to manipulate and store data on Google Firestore, both programmatically and using all of android studios built in Firestore tools. In a google
   Firestore database, There are 3 pieces of information needed to manipulate. One, A collection named "Puzzles". Inside of Puzzles, a Document Name "Easy". And Third, A list of
   fields (Starting at Zero) that have the entire sudoku puzzle stored as one string. Each number should be written out as normal, but empty spaces should be put as a ".".
   For example: Field 0 = (Type String)  "96..4.1.....38....7.8.6...912.8..9.3....5....3.5..2.648...9.4.7....38.....9.2..85"




{Provide a link to your YouTube demonstration.  It should be a 4-5 minute demo of the software running, a walkthrough of the code, and a view of the cloud database.}

[Software Demo Video](https://youtu.be/HWfEZ4FZfwU)

# Cloud Database

In my google Firestore database, There are 3 pieces of information needed to manipulate. One, A collection named "Puzzles". Inside of Puzzles, a Document Name "Easy". And Third, A list of
fields (Starting at Zero) that have the entire sudoku puzzle stored as one string. Each number should be written out as normal, but empty spaces should be put as a ".".
For example: Field 0 = (Type String)  "96..4.1.....38....7.8.6...912.8..9.3....5....3.5..2.648...9.4.7....38.....9.2..85"

# Development Environment

* Android Studio
* Kotlin
* Google Firestore

# Useful Websites

* [Stack Overflow](https://stackoverflow.com/)
* [Google Firebase's introduction](https://firebase.google.com/docs/guides?authuser=0)

# Future Work

* I'm undecided between getting puzzles in Via database, or having them stored remotely on the phone
* Make proper boarders around the boxes