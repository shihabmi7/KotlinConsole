import java.util.*

// @JvmOverloads to instruct kotlin compiler to generate overloads for the constructor
data class Animal @JvmOverloads constructor(val name: String, val dateOfBirth: Date = Date())

// this is because if we call this class in java without dateOfBirth parameter, code will not compile
// because java does support default value parameters.