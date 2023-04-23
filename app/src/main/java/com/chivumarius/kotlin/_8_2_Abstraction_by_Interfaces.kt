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


fun main(){
    // ♦ Creating "c1" Object/Instance → of the "Car2()" Class
    var c1 = Car2()

    // ♦ Accessing the "Methods" of the "Car2()" Class → for the "c1" Object:
    c1.accelerate()
    println(c1.startEngine())
}