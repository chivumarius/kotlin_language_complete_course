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

// ♦ "ABSTRACT CLASS"
 abstract class Person5 {
   // ♦ Attribute:
    var age: Int = 30

    // ♦ Using "open" Keyword → to "Override" the "Function":
    open fun displayAge () {
        println("My age is: $age")  // ♦ "Template String"
    }
    // ♦ "ABSTRACT FUNCTION" → has no "BODY":
    abstract fun displayGreetings ()
}