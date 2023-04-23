/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                    - "MUTABLE SET" -
        ________________________________________

    ♦ "Set"
        → is a "Collection" 
        → of "Unordered and Unique Elements"
        → (no duplicate elements)
    
    ♦ Generally, the "Order" of "Set Elements"
        → does Not Have "Significant Effect".


    ♦ "Mutable Set"
        → support Adding or Removing Elements, 
        → Read and Write Functionality.

    ♦ "Mutable Set"
        → will Preserve the "Order" of the "Elements".

    ♦ We Use "Set"
        → when we don't want" Duplicate Elements".

    ♦ "Mutable List"
       → is Specified by the "mutableSetOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "MUTABLE SET"
    // val mutableSet = mutableSetOf<String>("Raul", "Simon", "Marius", "Simon")
    val mutableSet = mutableSetOf<Int>(8, 6, 34, 6, 32, 1) // ♦ We have Duplicate Elements

    // ♦ "ADDING ELEMENTS" TO THE "SET ":
    mutableSet.add(77)
    mutableSet.add(8)   // ♦ Adding an "Existing Element"

    // ♦ "REMOVING ELEMENTS" FROM "SET ":
    mutableSet.remove(77)

    // ♦ "READING ALL SET ELEMENTS":
    //      → by Using the "for()" Loop:
    for(item in mutableSet){
        println(item)
    }
}
