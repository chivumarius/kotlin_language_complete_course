/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     ♦ SYNTAX:
            var variableName = value
            val variableName = value

       ♦ Kotlin
            → identifies the Data Type of the Variable
            → without having to Declare It Specifically (via ": DataType")

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
    // ♦ VARIABLES ♦

    // (1) The "var" (Variable)
    //      → Can Be Changed or Modified:
    var name = "Andrei"     // ♦ "String" Data Type (for "Text")
    // var name: String = "Andrei"


    // (2) The "val" (Value or Constant Variable)
    //      → Can Not Be Changed or Modified:
    val age = 27    // ♦ "Int" Data Type (for "Numbers")
    // val age: Int = 27

    val PI = 3.14159
    // ♦ Declaring the "Variable" without "Assigning" a "Value"
    //      → by Specifying the "Data Type" of the "Value" ("Constant Variable"):
    var city: String
    // ♦ "Assigning" the "Value" of the "Variable":
    city = "Barcelona"

    // ♦ Display in the Terminal:
    println("Hello " + name)
    println("Hello " + age)
    println("Hello " + PI)
}