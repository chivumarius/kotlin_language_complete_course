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
// ♦ Folder (Package):
package com.chivumarius.kotlin

// ♦ The "Parent Class":
 open class Person4 {
    // (1) "PUBLIC PROPERTY" ("Default")
   //       ♦ We make the Property "Open"
    //         → so it can be "Override"
    //         → in the "Teacher 2()" Sub-Class
    open var name: String = "Simon"
        // ♦♦ SIMILAR TO:
        // public var name: String = "Simon"

    // (2) "PRIVATE PROPERTY"
    private var age: Int = 5

    // (3) "PROTECTED PROPERTY"
    protected open var hairColor: String = "Black"

    // (4) "INTERNAL PROPERTY"
    internal var internData = 10
}