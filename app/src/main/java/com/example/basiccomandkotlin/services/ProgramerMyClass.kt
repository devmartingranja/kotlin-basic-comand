package com.example.basiccomandkotlin.services

class ProgramerMyClass(val name: String,
                       val age: Int, val
                       languages: Array<Language>,
                       val friends: Array<ProgramerMyClass>? = null) { // puede ser nulos no puede tener amigos

    // creando enum
    enum class Language { // creamos este enum para poder definir el tipo en la inicializacion del la clase
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (langueje in this.languages) {
            println(" estory programando en $langueje")
        }
    }
}