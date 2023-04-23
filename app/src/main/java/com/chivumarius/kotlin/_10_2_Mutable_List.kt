/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                ________________________________________
                 ○  KOTLIN  DATA STRUCTURES  ○
                ________________________________
                      - "MUTABLE LIST" -
        ________________________________________

    ♦ There are "3 Types" of "Mutable Collection":
        [1] "List"
        [2] "Set"
        [3] "Map"


    ♦ "Lists"
        → are "Ordered Collection" 
        → in which we can "Access Elements"
        → by Using "Indices"
        → that Define a "Position" 
        → for E"ach Element".

    ♦ "Mutable List"
        → supports both "Reading" and "Writing" Functionalities
        → in which "Elements" can be "Removed" or "Added".

    ♦ "Mutable List"
       → is Specified by the "mutableListOf" Keyword.
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlin

fun main(){
    // ♦ "MUTABLE LIST"
    // val mutableList1 = mutableListOf<String>("Raul", "Simon", "Marius")
    val mutList = mutableListOf("Raul", "Simon", "Marius", "Stefan")

    // ♦ "MODIFYING LIST ELEMENTS":
    mutList[1] = "Nicholas"

    // ♦ "ADDING ELEMENTS" TO THE "LIST":
    mutList.add("Jeanine")

    // ♦ "READING ALL LIST ELEMENTS":
    //      → by Using the "for()" Loop:
    for(item in mutList){
        println(item)
    }

    // ♦ Displaying "List Elements":
    // println(mutList)
    // println(mutList[1])
    // println(mutList[4])
}
