/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                 ○  KOTLIN  OOP  ○ 
                ____________________

              - "CLASSES & OBJECTS" -
        ________________________________________

    
    
    ♦ "Classes" and "Objects"
        → are te "Two Main Aspects" 
        → of "OOP" ("Object Oriented Programming")
   

    ♦ "Class"
        → is a "Template" 
        → for "Objects".


    ♦ "Object" 
        → is an "Instance" 
        → of a "Class".


    ♦ When the "Individual Objects"
        → are Created
        → they "Inherit" 
        → all the "Variables" and "Methods"
        → from the "Class".


    ♦ The "Constructor"
        → is like a "Special Function"
        → defined by Using "2 Parenthesis" → "()"
        → after the "Class Name"


    ♦ The "Constructor"
        → "Initializes" the "Properties"
        → when we Create an "Object" of the "Class".

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
    // ♦ Creating "c1" & "c2" Objects/Instances → of the "Car()" Class
    //      → with "Properties" or "Primary Constructor" Values:
    var c1 = Car("BMW", 2023, "Gray")
    var c2 = Car("Ferrari", 2020, "Red")

    // ♦ Changing the "Property Value" → by "Reassigning Its Value":
    c1.brand = "BMW"    // ♦ This is not a "Clean Coding Architecture" (only for Demonstration)

    // ♦ Accessing the "Properties" of the "Car()" Class for the "c1" Object:
    println(c1.brand)

    // ♦ Accessing the "Methods" of the "Car()" Class → for the "c1" Object:
    c1.brake()     // ♦ Activating the "Suggestive Menu":     CTRL + Space
}
