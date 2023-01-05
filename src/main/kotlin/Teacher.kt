class Teacher(firstName: String, lastName: String) {

    init {
        // init block called immediately after primary constructor
        //// but before the secondary constructor
        println("First Init")
        println("Raw First Name: $firstName $lastName")
    }

    private val fullName = "$firstName $lastName".also {
        println("Full Name Property");
    }

    init {
        println("Second Init")
        println("Full Name: $fullName")
    }

    constructor(firstName: String, lastName: String, hobby: String) : this(firstName, lastName) {
        // this is secondary constructor
        // here we can code something
        println("Secondary constructor $hobby")
    }
}