/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                    - "IMMUTABLE MAP" -
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


    ♦ ♦ "Immutable Map"
        → has a "Fixed Size"
        → its "Methods" support "Read-Only" Access.

    ♦ "Immutable Map"
       → is Specified by the "mapOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "IMMUTABLE MAP":
    val immutableMap = mapOf(1 to "Marius", 2 to "Jeanine", 9 to "Daniela")  // Using "to" Operator

    // ♦ Displaying "All Map Values Elements"
    //      → by Using the "for()" Loop:
//    for(key in immutableMap.keys){
//        // ♦  Returning the "Values" of the "Keys":
//        println(immutableMap[key])
//    }


    // ♦ Displaying "One Map Value Element":
    println(immutableMap[1])
    // println(immutableMap[0])    // ♦ Return:    NULL
    // println(immutableMap[3])    // ♦ Return:    NULL

}
