/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                 ○  KOTLIN  OOP  ○ 
                ____________________

            - "CLASSES & OBJECTS" -
            - "PRIMARY CONSTRUCTOR" -
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


// ♦ "CLASS" with "PARAMETERS" or "PRIMARY CONSTRUCTOR"
class Car ( var brand: String,
            var year: Int,
            var color: String) {
    // ♦ "ATTRIBUTES" or "PROPERTIES"
    //      → are "Variables" that Belong to "Class"

    // ♦ "FUNCTIONS" or "METHODS" ("BEHAVIOUR")
    fun drive(){
        println("Driving..")
    }

    fun brake(){
        println("Braking..")
    }
}