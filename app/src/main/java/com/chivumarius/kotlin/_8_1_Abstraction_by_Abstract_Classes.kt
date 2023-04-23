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

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

// ♦ Folder:
package com.chivumarius.kotlin


fun main(){
   // ♦ We Can Not "Create" an "Object"
    //      → from an "Abstract Class"

    // ♦ Creating "p1" Object/Instance → of the "Teacher3()" Class
    var p1 = Teacher3("Ionescu")

    // ♦ "Accessing" the "Overriding Abstract Function":
    p1.displayGreetings()
}