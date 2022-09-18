import java.io.File
import javax.sql.DataSource

/**
Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
All direct subclasses of a sealed class are known at compile time.
No other subclasses may appear outside a module within which the sealed class is defined.
For example, third-party clients can't extend your sealed class in their code.
Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.

The same works for sealed interfaces and their implementations: once a module with a sealed interface is compiled,
no new implementations can appear.
*/
sealed interface Error

sealed class IOError() : Error {
   // constructor() { /*...*/ } // protected by default
    private constructor(description: String): this() { /*...*/ } // private is OK
    // public constructor(code: Int): this() {} // Error: public and internal are not allowed

}
class FileReadError(val file: File) : IOError()
class DatabaseError(val source: DataSource) : IOError()

object RuntimeError : Error

// Each enum constant exists only as a single instance,
// whereas a subclass of a sealed class can have multiple instances,
// each with its own state.
// The state of an object is stored in fields (Variables).

