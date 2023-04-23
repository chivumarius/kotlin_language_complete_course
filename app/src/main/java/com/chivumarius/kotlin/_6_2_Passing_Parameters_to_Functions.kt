/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                 ○  KOTLIN  OOP  ○ 
                ____________________

                  - "FUNCTIONS" -  
          • PASSING PARAMETERS TO FUNCTIONS •              
        ________________________________________


    
    
    ♦ A "Function"
      → is a Block of Code
      → which Only Runs when it is Called.
    
   

    ♦ Into a "Function" 
      → We can "Pass Data" (Known as "Parameters")



    ♦ "Functions" (or "Methods")
      → are Used to P"erform Certain Actions"

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
  // ♦ Calling the Function with "Arguments":
  functionWithParameters("Narius", 30)
}

// ♦♦ CUSTOM  FUNCTION WITH "PARAMETERS":
fun functionWithParameters(firstname: String, age: Int){
  // ♦ "Display" the "Text" on the "Screen":
  println("Hello " + firstname + ", your age is " + age + " years.")
}