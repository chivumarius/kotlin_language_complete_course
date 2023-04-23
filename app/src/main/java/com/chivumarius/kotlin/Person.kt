/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
         ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
                 - "INHERITANCE" -
         ________________________________________

    ♦ The "open" Keyword
        → "Allows" a "Class"
        → to be "Inherited" by "Child Classes"


    ♦ By "Default" in "Kotlin"
        → "Classes" are "Final".
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

// ♦ The "Parent Class":
open class Person (var name: String, var age: Int) {
    init {
        // ♦ Using "Template String"
        println("The Person name: $name")
        println("The Person age: $age")
    }

    fun talk(){
        // ♦ Using "Template String"
        println("$name is talking")
    }

    fun walk(){
        // ♦ Using "Template String"
        println("$name is walking")
    }

    fun eat(){
        // ♦ Using "Template String"
        println("$name is eating")
    }
}