class Student(var name: String, val age: Int, val city: String, gender: String) : Person(gender), IProfession {

    override fun professionName(): String {
        super.professionName();
        return "I am a Student"
    }

    private fun giveCurrentDetails(): String {
        var message = "Name: $name\n"
        message += "Age: $age\n"
        message += "City: $city"
        return message
    }

    // single line function
    fun ageAfterFiveYears() = age + 5

    // endless parameters function
    fun <T> gadgetList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) {
            result.add(t)
            println(t.toString())
        } // ts is an Array
        return result
    }

    /**But an Infix function must satisfy the following requirements

    1. They must be member functions or extension functions.
    2. They must have a single parameter.
    3. The parameter must not accept a variable number of arguments and must have no default value.
     */
    infix fun fullBio(favColor: String): String {
        return giveCurrentDetails() + favColor
    }

}
