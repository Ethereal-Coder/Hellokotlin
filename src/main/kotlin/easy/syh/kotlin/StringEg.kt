package easy.syh.kotlin

/**
 * Created by syh on 2018/6/23.
 * Desc:
 */


val mString: String = "hello word"
val cString: String = String(charArrayOf('h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'd'))

fun main(args: Array<String>) {
    println(cString)
    println(mString == cString)
    println(mString === cString)

    println("hello syh " + cString)
    println("hello syh $cString")

    val arg1: Int = 1
    val arg2: Long = 2
    println("" + arg1 + "+" + arg2 + "=" + (arg1 + arg2))
    println("$arg1+$arg2=${arg1 + arg2}")

    println("hello\"world\"")

    val sallary: Int = 100
    println("\$sallary")
    println("$sallary")
    println("\$$sallary")
    println("$$sallary")

    val rawString: String = """
        hello
         world
          $sallary
           \$$sallary
        $$sallary
        $ sallary
    """
    val tRawString: String = """
        hello
         world
          $sallary
           \$$sallary
        $$sallary
        $ sallary
    """.trimIndent()

    println(rawString)
    println(rawString.length)
    println(tRawString)
    println(tRawString.length)

}