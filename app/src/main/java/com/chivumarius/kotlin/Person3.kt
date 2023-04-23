/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
         ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
             - "GETTERS & SETTERS" -
         ________________________________________

 ♦ In "Kotlin" - "Getters" & "Setters"
        → are "Optional" and
        → are "Auto-Generated"
        → if "They Are Not Created"
        → in the "Program".


    ♦ "Getters"
        → are Used to "Get"
        → the "Property Value".


    ♦ "Setters"
        → are Used to "Set"
        → the property value

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

// ♦ The "Parent Class":
open class Person3 {
    var name: String = "Simon"

    // EQUIVALENT TO:
    // ♦ GETTER ♦
    get() = field
    // ♦ SETTER ♦
    set(value){ field = value}
}