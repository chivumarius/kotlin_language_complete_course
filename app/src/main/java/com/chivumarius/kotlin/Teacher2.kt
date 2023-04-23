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

// ♦ "Child" Class → "Inherits" the "Parent" Class "Person" → with its "Parameters":
class Teacher2 : Person4 () {
    // ♦ We "Override" the "name" Property:
    override var name: String = "Marius"

    // ♦ We cannot Overwrite the "age" Property
    //      → because it is Declared "private".

    // ♦ We "Override" the "name" Property:
    override var hairColor: String = "Blond"
}