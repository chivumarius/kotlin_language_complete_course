/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ________________________________________

                 ○  KOTLIN  OOP  ○
                ____________________

           - "ABSTRACTION BY INTERFACES" -
        ________________________________________


    ♦ Kotlin "Interfaces" classes
        → are "Similar" to "Abstract Classes"

    ♦ "Interfaces"
        → cannot "Store States"
        → while "Abstract Classes" Can "Store States"


    ♦ "Interfaces"
        → can have "Properties"
        → but they Must Be "Abstract"
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

// ♦ Folder:
package com.chivumarius.kotlin

interface Vehicle {
    // ♦ ATTRIBUTE:
    val speedValue: Int

    // ♦ FUNCTIONS
    fun startEngine (): String

    fun accelerate (){
        println("Accelerating...")
    }
}