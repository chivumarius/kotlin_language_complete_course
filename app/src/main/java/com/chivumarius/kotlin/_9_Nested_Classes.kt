/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                 ○  KOTLIN  OOP  ○ 
                ____________________

                - "NESTED CLASSES" -
        ________________________________________

    
    ♦ "Kotline" (like |) 
        → allows us to Define a Class 
        → within another class,
        → known as a "Nested Class".

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
    // ♦ Creating "o1" Object/Instance → of the "Outer()" Class:
    var o1 = Outer()

    // ♦ Accessing "Outer()" Class:
    o1.age

    // ♦ Creating "nested" Object/Instance
    //      → of the "Nested()" Class
    //      → from the "Outer()" Class:
    var nested = Outer.Nested()

    // ♦ Accessing "length" Property
    //      → from the "Nested()" Class
    //      → from the "Outer()" Class:
    nested.length
}
