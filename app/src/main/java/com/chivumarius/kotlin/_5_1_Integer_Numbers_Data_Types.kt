/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
              ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                 - "DATA TYPES" -
              • "INTEGER NUMBERS" •
            ____________________________


In "Kotlin" or "Java"
    ► "Data Types" are divided into "Two Groups":
    
    
    
    
  ♦1♦ "Primitive"
    
    [1] "Integer"
    
      •► "Short"
        • "Size":         2 Bytes   
        • "Sores Whole Numbers":  -32.768 to 32767
        
        
      •► "Byte"
        • "Size":         1 Byte    
        • "Sores Whole Numbers":  -128 to 
                       127 
        
        
      •► "Int"
        • "Size":         4 Bytes   
        • "Sores Whole Numbers":  -2,147,483,648 to 2,147,483,647
        
        
      •► "Long"
        • "Size":         8 Bytes   
        • "Sores Whole Numbers":  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
      
    
    
    [2] "Float-Point Number"
    
      •► "double" 
        • "Size":           8 Bytes   
        • "Sores Fractional Numbers": 15 Decimal Digits
          
      
      •► "float"  
        • "Size":           4 Bytes   
        • "Sores Fractional Numbers": 6 to 7 Decimal Digits
                        
      
    
    
    [3] "Characters"
      
      •► "char"   
        • "Size":   2 Bytes   
        • "Sores a Single Character/Letter or ASCII Values"
                        
      
    
    
    [4] "Boolean"
      
      •► "boolean"  
        • "Size":       1 Bit   
        • "Storing Values":   true or false 
          
        








    
  ♦2♦ "Non-Primitive"
      → are Created by Programmers
      → and it is not Defined by Java/Kotlin
      → (except for "String")
    
    [1] "String"      
    
    [2] "Array"
          
    
    [3] "Classes"
      
    
    [4] "etc"
      
      

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
   // ♦  "INTEGERS" → Stores "Whole Numbers":
    // (1) "BYTE"
    //      •► "Range" of "Stored Values":   "-128" to "127"
    val b: Byte = 127
    // val b: Byte = 128   // Error:   The Integer Literal Does Not Conform to the Expected Type "Byte"
    println(b)


    // (2) "SHORT"
    //      •► "Range" of "Stored Values":   "-32786" to "32767"
    val s: Short = 32767
    // val s: Byte = 32768   // Error:   The Integer Literal Does Not Conform to the Expected Type "Short"
    println(s)

    // (3) "INT"
    //      •► "Range" of "Stored Values":  "-2147483648" to "2147483647"
    val i: Int = 2147483647
    // val i: Int = 2147483648   // Error:   The Integer Literal DoesNnot Conform to the Expected Type "Int"
    println(i)


    // (4) "LONG"
    //      •► "Range" of "Stored Values":  "-9223372036854775808" to "9223372036854775807"
    val l: Long = 9223372036854775807
    // val l: Long = 731234567891L  // ♦ Specifying as a "Long Number" by the Character "L"
    // val l: Long = 9223372036854775808   // Error:   The Integer Literal DoesNnot Conform to the Expected Type "Long"
    println(l)

}