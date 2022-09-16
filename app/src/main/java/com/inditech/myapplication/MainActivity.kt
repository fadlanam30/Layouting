package com.inditech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
    }


    fun main() {
        val user = setUser("Alfian", 19)
        println(user)

        printUser("Alfian")


        val openHours = 7
        val now = 20
        val office: String
        office = if (now > openHours) {
            "Office already open"
        } else {
            "Office is closed"
        }

        print(office)


//        val value = 7
//        val stringOfValue = when (value) {
//            6 -> "value is 6"
//            7 -> "value is 7"
//            8 -> "value is 8"
//            else -> "value cannot be reached"
//        }

//        println(stringOfValue)


        val anyType: Any = 100L
        when (anyType) {
            is Long -> println("the value has a Long type")
            is String -> println("the value has a String type")
            else -> println("undefined")
        }


        val rangeInt = 1..10
        rangeInt.forEach {
            print("$it ")
        }
        print(rangeInt.step)


        val value = 27
        val ranges = 10..50

        when (value) {
            in ranges -> println("value is in the range")
            !in ranges -> println("value is outside the range")
            else -> println("value undefined")
        }

    }

    fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

    fun printUser(name: String) {
        println("Your name is $name")
    }

}


class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean,
) {

    fun eat() {
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

fun main() {
    val cat = Animal("Ciko", 4.2, 2,true)
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, mamalia: ${cat.isMammal}" )
    cat.eat()
    cat.sleep()
}