package demo

fun main(args: Array<String>) {
   println(checkIsTrue())
   println(getPersonDetail())
}

fun checkIsTrue() :Boolean {
    return true
}

fun getPersonDetail() :String{
    var person = Person()

    person.name = "qmm"
    person.age = 18

    return "${person.name} is ${person.age} years old"
}