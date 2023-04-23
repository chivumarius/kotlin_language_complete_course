/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                       - "MUTABLE MAP" -
        ________________________________________

    ♦ "Map"
        → is an "Object" 
        → that Maps "Keys" to "Values".
       
    
    ♦ Map "Keys"
        → are "Unique" and
        → hold Only "One Value Pairs".


    ♦ Each "Key"
        → refer to Exactly "One Value".


    ♦ The "Value"
        → can be "Duplicate"
        → but the "Key"
        → should be "Unique".


    ♦ "Map"
        → ar Used to "Store Logical Connections"
        → between "2 Objects",
        → example:  Student "ID" → and their "Name".


     ♦ "Mutable Map"
        → support Adding or Removing Elements,
        → Read and Write Functionality.

    ♦ "Mutable Map"
       → is Specified by the "mutableMapOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "MUTABLE MAP"
    //    • Type "Int" for "Key" & Type "String" for "Value"
    val mutableMap = mutableMapOf<Int, String>(1 to "Andrei", 2 to "Alexandra", 6 to "Daniela")  // Using "to" Operator

    // ♦ "ADDING ELEMENTS" TO "MAP"
    //      → by Using ".put()" Method:
    mutableMap.put(4, "Mihai")

    // ♦ "REMOVING ELEMENTS" FROM "MAP":
    mutableMap.remove(6)

    // ♦ "READING ALL VALUES OF MAP ELEMENTS":
    //      → by Using the "for()" Loop:
    for(item in mutableMap.values){   // Or Display Keys:    mutableMap.keys
        println(item)
    }
}
