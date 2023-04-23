/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                 - "DATA TYPES" -
         • "FLOAT-POINT/DECIMAL NUMBERS" •
        ________________________________________


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
    
      •► "Double"
        • "Size":           8 Bytes   
        • "Sores Fractional Numbers": 15 Decimal Digits
          
      
      •► "Float"
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
   // ♦  "FLOATING-POINTS" → represent "Numbers" with "Decimals":
    // (1) "FLOAT"
    //      •► "Sores Fractional Numbers": 6 to 7 Decimal Digits
    val f: Float = 3.1415F  // ♦ Mandatory Specifying as a "Float Number" by the Character "F"
    // val f: Byte = 13.1415   // Error:   The Integer Literal Does Not Conform to the Expected Type "Float"
    println(f)


    // (2) "DOUBLE"
    //      •► "Sores Fractional Numbers": 15 Decimal Digits
    val d: Double = 5.123456789012345
    // val d: Double = 5.1234567890123456   // Error:   Floating-Point Literal Can Not Represented with the Required Precision
    println(d)
}