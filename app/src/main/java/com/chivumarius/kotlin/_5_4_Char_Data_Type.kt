/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     
        ________________________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                 - "DATA TYPES" -
                 • "CHARACTERS" •
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
      •► "Boolean"
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
   // ♦  "CHARACTERS"
    //      → "Sores a Single Character/Letter or ASCII Values"
    //      → Are "Surrounded" → by 'Single Quotes'

    // ♦  "Char"
    val myGrade: Char = 'B'
    println(myGrade)
}