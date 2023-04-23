/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
         ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
             - "SECONDARY CONSTRUCTOR" -
         ________________________________________

    ♦ The "open" Keyword
        → "Allows" a "Class"
        → to be "Inherited" by "Child Classes"


    ♦ By "Default" in "Kotlin"
        → "Classes" are "Final".

    ♦ The "Secondary Constructor"
        → Allows us to Add "Additional Initializations" for a Class,
        → having a "Constrained Syntax",
        → without "Code".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin


//open class Person (var name: String, var age: Int = 0) {

// ♦ The "Parent Class":
open class Person2 {
    // ♦ "SECONDARY CONSTRUCTOR":
    constructor(name: String, age: Int){

    }

    // ♦ "CLASS INITIALIZATION BLOC":
    init {
        // ♦ Using "Template String"
        println("We use the Initializer")
    }

}