/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                    - "IMMUTABLE SET" -
        ________________________________________

    ♦ "Set"
        → is a "Collection" 
        → of "Unordered and Unique Elements"
        → (no duplicate elements)
    
    ♦ Generally, the "Order" of "Set Elements"
        → does Not Have "Significant Effect".


    ♦ In an "Immutable Set"
        → Adding or Removing Elements cannot be Performed.

    ♦ "Immutable Set"
        → will Preserve the "Order" of the "Elements".


    ♦ We Use "Set"
        → when we don't want" Duplicate Elements".

    ♦ "Immutable List"
       → is Specified by the "setOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "IMMUTABLE SET":
    // val immutableSet = setOf<Int>(2, 25, 27)
    // val immutableSet = setOf("Marius", "Aurel", "Cristian", "Andrei")
    val immutableSet = setOf(5, 6, "Hello", 6, 0, 0, 1, 5)  // List Has Duplicates

    // ♦ Displaying "Set Elements"
    //      → by Using the "for()" Loop:
    for(item in immutableSet){
        println(item)
    }
}
