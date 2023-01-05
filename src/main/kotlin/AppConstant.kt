object AppConstant {
    const val userCount = 30;
    val appName = "Kotlin Console";
    // use const keyword to get better performance as it has no overhead to access in runtime.

    // compiler will call instance method when
    // this code will be called in Java
    @JvmStatic
    fun getIpAddress() {

    }
}