/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
         ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
             - "SECONDARY CONSTRUCTOR" -
         ________________________________________

    ♦ We "Specify" the "Inheritance"
        → of the "Parent Class"
        → by Adding ": ClassName(param1, param2)"
        → with its "Parameters"
        → After the "Child Class Parameters"
        → from which we Delete the "var" Keyword.

    ♦ By "Default" in "Kotlin"
        → "Classes" are "Final".
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

// class Player  (name: String,  age: Int):  Person(name, age) {

// ♦ "Child" Class → "Inherits" the "Parent" Class "Person2" → with its "Parameters":
class Player2 :  Person2 {
    // ♦ "SECONDARY CONSTRUCTOR":
    constructor(name: String, age: Int): super(name, age) {
        // Code..
        println("Secondary Constructor is being used")
    }
}