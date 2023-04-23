/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
         ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
                 - "INHERITANCE" -
         ________________________________________

    ♦ We "Specify" the "Inheritance"
        → of the "Parent Class"
        → by Adding ": ClassName(param1, param2)"
        → with its "Parameters"
        → After the "Child Class Parameters"
        → from which we Delete the "var" Keyword.
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

// ♦ "Child" Class → "Inherits" the "Parent" Class "Person" → with its "Parameters":
class Businessman (name: String, age: Int): Person(name, age) {

}