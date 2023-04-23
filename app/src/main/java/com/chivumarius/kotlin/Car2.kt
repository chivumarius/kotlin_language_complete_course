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

// ♦ The "Car2" Class → implements the "Vehicle" Interface:
class Car2() : Vehicle {
    override val speedValue: Int = 25
    override fun startEngine(): String {
            return "Starting the engine"
    }
}