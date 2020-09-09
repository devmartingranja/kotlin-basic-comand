package com.example.basiccomandkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basiccomandkotlin.services.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        this.variablesYConstantes()
//        this.variablesTiposDeDatos()
//        this.condicionalIf()
//        this.sentenciaWhen() //parecido al switch
//        this.arrayVectores() // coleccion
//        this.mapsDiccionarios() // coleccion
//        this.buclesCiclos()
//        this.nullSafety()
//        this.functionsMetodos()
        this.classes()

    }

    fun variablesYConstantes() {

        // -> Variables -> var
        var myFirstVariable1 = "hola mundo 1";
        var myFirstVariable2 = "hola mundo 2";
        var myFirstVariable3 = "hola mundo 3";

        println(myFirstVariable1)
        println(myFirstVariable2)
        println(myFirstVariable3)
        println("Forma de concatenar 1 -> " + myFirstVariable1 + " - " + myFirstVariable2 + " - " + myFirstVariable3)
        println("Forma de concatenar 2 -> $myFirstVariable1 - $myFirstVariable2 - $myFirstVariable3")

        var myString = "hola mundo"
        var myInt = 5
        var myDoble = 5.3
        var myFloat = 2.6f
        var myBoolean = true

        // -> Constantes -> val

        val myFirsConst1 = "contante 1"
        val myFirsConst2 = "contante 2"
        val myFirsConst3 = "contante 3"
        println("Concanenación de constantes $myFirsConst1 - $myFirsConst2 - $myFirsConst3")

        val myConstString = "hola mundo"
        val myConstInt = 5
        val myConstDoble = 5.3
        val myConstFloat = 2.6f
        val myConstBoolean = true

    }

    fun variablesTiposDeDatos() {

        // -> Tipos De Datos

        // string
        var myString: String = "hola mundo"

        // integer (Byte, short, int, long)
        var myInteger: Int = 5

        // decimal (Float, Double)
        var myFloat: Float = 5.2f
        var myDouble: Double = 5.3

        // boolena (bool)
        val myBool: Boolean = false
    }

    fun condicionalIf() {

        val myNumber = 10
        if (myNumber >= 5) {
            println("$myNumber es mayor que 5")
        } else {
            println("$myNumber es menor que 10")
        }

        val myString =
            if (myNumber >= 10) "ternario if kotlin verdadero" else "ternario if kotlin false"
        println(myString)

    }

    fun sentenciaWhen() {

        val country = "Colombia"
        val age = 10

        when (country) {
            "España" -> {
                println("El pais es Español")
            }
            "Colombia" -> {
                println("El pais es Colombiano")
            }
            "Peru" -> {
                println("El pais es Peruano")
            }
            "Chile" -> {
                println("El pais es Chile")
            }
            else -> {
                println("Ningun pais coincide")
            }
        }

        when (country) {
            "España", "Colombia", "Peru", "Chile" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                println("El idioma es Ingles")
            }
            else -> {
                println("Ningun idioma coincide")
            }
        }

        when (age) {
            0, 1, 2 -> {
                println("Bebe")
            }
            in 3..10 -> { // -> manejo de rangos, 3,4,5,6,7,8,9,10 -> in 3..10
                println("Niño")
            }
            in 11..17 -> {
                println("Adolecente")
            }
            in 18..69 -> {
                println("Eres adulto")
            }
            in 70..99 -> {
                println("Ansiano")
            }
            else -> {
                println("👨🏽")
            }
        }
    }

    fun arrayVectores() {

        val name = "martin"
        val apellido = "granja"
        val company = "ing-developer"
        val age = "32"

        // creando una estructura array que es de tipo String
        val myArray = arrayListOf<String>()

        // añadiendo datos
        myArray.add(name)
        myArray.add(apellido)
        myArray.add(company)
        myArray.add(age)
        println(myArray)

        // añadir un conjunto de datos, con listOf es otra forma de crear un array de forma rapida
        myArray.addAll(listOf("hola", "es una", "nueva", "lista"))
        println(myArray)

        // modificando el valor de un array
        myArray[0] = "se cambio del valor"
        println(myArray)

        // extrallendo el valor de una posicion de array
        val myCompany = myArray[2]
        println(myCompany)

        // borrar un elemento del array
        myArray.removeAt(4)
        println(myArray)

        // recorre datos de array

        myArray.forEach {
            println(it) // cada valor por defecto que tenga myArray
        }

        // otra operaciones

        myArray.count() // traer el nmero de elementos del array


        myArray.first() // traer el primer elemento
        myArray.last() // traer el ultimo elemento

        myArray.sort() // ordenar el array

        myArray.clear() // eliminar todos los elementos del array

        val myNumericArray = (0..20) // crear un array con rangos numericos
        println(myNumericArray)
    }

    fun mapsDiccionarios() {

        // se a creado un mapa vacio
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // añadiendo elementos al mapa, el mapOf borra todos los elementos anterior del mapa y los reinicia con unos nuevos
        // mapOf crea un mapa no mutable, no se puede agregar mas valores
        myMap = mapOf("martin" to 1, "pedro" to 2, "sara" to 5)
        println(myMap)

        // mutableMapOf cre aun mapa mutable es decir que se pueda seguir agregando componentes
        myMap = mutableMapOf("martin" to 1, "pedro" to 2, "sara" to 5)

        // añadir un solo elemento
        myMap["ana"] = 7   // -> 1 forma de agregar valores
        myMap.put("Maria", 8) // -> 2 forma de agregar valores
        println(myMap)

        // modificar valores de un map
        myMap.put("martin", 5) // -> 1 forma de actualizar valores
        myMap["martin"] = 10 // -> 2 froma de actualizar valores

        // acceder a los valores
        println(myMap["martin"])

        // borrado de elementos
        myMap.remove("martin")
    }

    fun buclesCiclos() {

        val myArray = listOf("hola", "es una", "nueva", "lista")
        val myMap = mutableMapOf("martin" to 1, "pedro" to 2, "sara" to 5)

        // For
        for (myString in myArray) {
            println(myString)
        }

        for (myElemento in myMap) {
            println("${myElemento.key} - ${myElemento.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 0 until 10) { // se realizara el recorrido sin tener en cuenta el ultimo numero
            println(x)
        }

        for (x in 0..10 step 2) { // recorrido de 2 en 2
            println(x)
        }

        for (x in 10 downTo 0) { // recorrido hacia atras 10,9,8,7...
            println(x)
        }

        val myNumericArray = (0..20) // crear un array con rangos numericos
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // while
        var x = 0
        while (x >= 10) {
            println(x)
            x++ // x = x + 1
            //x +=1, x +=2
        }
    }

    fun nullSafety() {
        // seguridad contra nulos (Null Safety)

        var myString = "Martin";
        // myString = null // esto daria error de compilacion, porque esta variable no acepta valores nulos
        println(myString)

        var mySafetyString: String? =
            "martin null safety" // el signo de interrogacion indicara que esta variable acepta nulos (null safety)
        mySafetyString = null
        println(mySafetyString)

        //mySafetyString = "martin 2"
        //println(mySafetyString)

//        if (mySafetyString != null) { // validar si es nula
//            println(mySafetyString)
//        }

//        println(mySafetyString!!) // estamos obligando que la variable no sea nula, sale error

        // safe call

        println(mySafetyString?.length) // si la variable es nula imprime un null pero sigue funcionando el programa (ayuda el '?')

        // safe call - let

        mySafetyString?.let { // se ejecuta este codigo cuando la variable no sea nula
            println(it) // it es el valor de mySafetyString
        } ?: run {
            println("si el valor resutla ser nulo") // se ejecuta este codigo si la variable es nula
        }
    }

    // < funciones

    fun functionsMetodos() {
//        this.sayHello()
//        this.sayHello()
//        this.sayHello()

//        this.sayMyName("jose")
//        this.sayMyName("martin")
//        this.sayMyName("victor")

//        this.sayMyNameAge("jose",10)
//        this.sayMyNameAge("martin",5)
//        this.sayMyNameAge("victor",6)

//        val res1 =this.sumTwoNumber(1,5)
//        println(this.sumTwoNumber(10,85))
//        val res3 =this.sumTwoNumber(91,35)

//        val userNameAndStatePair: Pair<String?, String?> = getUserNameAndState()
//        println(userNameAndStatePair.first) // jose
//        println(userNameAndStatePair.second) // enriques

        val userNameAndStateTriple: Triple<String?, String?, Int> = getUserNameStateAndAge()
        println(userNameAndStateTriple.first) // jose
        println(userNameAndStateTriple.second) // enriques
        println(userNameAndStateTriple.third) // 45
    }

    // funcion simple
    fun sayHello() {
        println("Hola!")
    }

    // funcion con un parametro de entrada
    fun sayMyName(nombre: String) {
        println("Hola, mi nombre es $nombre")
    }

    // funcion con mas que un parametro de entrada
    fun sayMyNameAge(nombre: String, edad: Int) {
        println("Hola, mi nombre es $nombre y mi edad es $edad") // convierte el entero automaticamente en una cadena de texto
    }

    // funciones con un valor de retorno
    fun sumTwoNumber(firstNumber: Int, secoundNUmber: Int): Int {
        val sum = firstNumber + secoundNUmber
        return sum
    }

    // funciones que retornan dos valores
    fun getUserNameAndState(): Pair<String?, String?> {
        return Pair("jose", "enriques")
    }

    // funciones que retornan tres parametros
    fun getUserNameStateAndAge(): Triple<String?, String?, Int> {
        return Triple("jose", "enriques", 45)
    }

    // funciones >

    fun classes() {

        val programadorMartin =
            ProgramerMyClass(
                "Martin",
                10,
                arrayOf(ProgramerMyClass.Language.KOTLIN, ProgramerMyClass.Language.JAVA)
            );

        println(programadorMartin.name)
        programadorMartin.code();

        val programadoraSara =
            ProgramerMyClass(
                "Martin",
                10,
                arrayOf(ProgramerMyClass.Language.KOTLIN, ProgramerMyClass.Language.JAVA),
                arrayOf(programadorMartin)
            );

        println("${programadoraSara.friends?.first()?.name} es amigo de la programadora ${programadoraSara.name}")
    }
}