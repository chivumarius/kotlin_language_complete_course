/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ________________________________________

                 ○  KOTLIN  OOP  ○
                ____________________

        - "ABSTRACTION BY ABSTRACT CLASSES" -
        ________________________________________



    ♦ "Data Abstraction"
        → is the "Process"
        → of "Hiding Certain Details"
        → and "Showing" Only "Essential Information"
        → to the "User".



    ♦ "Abstraction"
        → can be "Achived" either with
            •► "Abstract Classes" or
            •► "Interfaces".

    ♦ The "abstract" Keyword
        → is used to Declarea "Abstract Classes"
        → in "Kotlin" and "Java"


    ♦ "Abstract Classes"
        → cannot be "Instantiated",
        → "Objects" cannot be "Created"
        → from "Abstract Classes"

    ♦ The Members
        → "Properties" and "Methods"
        → of "Abstract Classes"
        → are "Not Abstract"
        → Unless the "abstract" Keyword
        → is Explicitly "Used"
        → to make them "Abstract".

    ♦ "Abstract Function"
        → has no Body.

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
// ♦ Folder (Package):
package com.chivumarius.kotlin

// ♦ "Child" Class → "Inherits" the "Parent" Class "Person" → with its "Parameters":
class Teacher3(name: String) : Person5 () {
    // ♦ OVERRIDING the "displayGreetings()" ABSTRACT FUNCTION:
    override fun displayGreetings() {
        println("Hello Teacher")
    }
}