fun main(args: Array<String>) {
    println("Hello World!")

    // kotlinCollection()

    val person = Student(name = "Shihab", city = "Dhaka", age = 32, gender = "Male")
    // println(person.giveCurrentDetails())
    //println(person.ageAfterFiveYears())
    person.gadgetList("Macbook", "mi band")
    println(person.fullBio(favColor = "Gray"))
}

private fun kotlinCollection() {
    val list = arrayListOf("Shihan", "Shumon", "hel")
    val result = list.map {
        it
    }.filter {
        it.contains("S")
    }
    println(result)

    val numberList = arrayListOf("12", "13", "14")
    val data = numberList.map {
        it.toInt() + 1
    }
    println(data)
}