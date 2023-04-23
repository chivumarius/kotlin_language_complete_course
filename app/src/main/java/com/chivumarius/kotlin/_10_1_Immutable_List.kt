/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                    - "IMMUTABLE LIST" -
        ________________________________________

    ♦ "Lists"
        → are "Ordered Collection" 
        → in which we can "Access Elements"
        → by Using "Indices"
        → that Define a "Position" 
        → for E"ach Element".

    ♦ In an "Immutable List"
        → Adding or Removing Elements cannot be Performed.

    ♦ "Immutable List"
       → is Specified by the "listOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "IMMUTABLE LIST"
    // val list1 = listOf<Int>(2, 25, 27)
    // val list1 = listOf(2, 25, 27)
    val list1 = listOf("Marius", "Aurel", "Cristian", "Andrei")

    // ♦ Displaying "List Elements"
    //      → by Using the "for()" Loop:
    for(item in list1){
        println(item)
    }
}
