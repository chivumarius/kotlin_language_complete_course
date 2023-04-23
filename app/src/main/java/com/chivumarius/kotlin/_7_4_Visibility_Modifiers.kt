/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        ________________________________________
                 ○  KOTLIN  OOP  ○
                ____________________
              - "VISIBILITY MODIFIERS" -
        ________________________________________

    
    ♦ "Visibility Modifiers"
        → are "Keywords" 
        → that "Set" the "Visibility" or "Accessibility" of:
            •► Classes, 
            •► Objects, 
            •► interfaces, 
            •► Constructors, 
            •► Functions, 
            •► Properties and their 
            •► Setters.

     ♦ "Types" of "Visibility Modifiers":
        [1] "public"
                → it Means that the "Declaration" 
                → is "Visible Everywhere"

        [2] "private"
                → it Means that the "Declaration" 
                → is "Visible Only Inside" the "File"

        [3] "protected"
                 → it Means that the "Declaration" 
                 → not "Available" for "Packages"/"Folders"
                  → Used for "Sub-Classes".

        [4] "internal"
                → it Means that the "Declaration" 
                → is "Visible Only Inside" the "Same Module"
                → (which is a "Set" of "Kotlin Files", Compiled Together)


    ♦ A "Package" 
        → is like a "Folder"
        → on the "Computer".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.kotlin

fun main(){
    // ♦ Creating "PERS1" Object/Instance → of the "Person3()" Class
    var pers1 = Person4()

    // ♦ Accessing the "name" FIELD
    //      → we Cannot Access PRIVATE "age" PROPERTY
    // pers1.

    // ♦ Accessing "INTERNAL PROPERTY"
    pers1.internData = 25
}
