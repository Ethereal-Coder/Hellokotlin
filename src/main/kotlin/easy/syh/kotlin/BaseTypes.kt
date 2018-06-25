package easy.syh.kotlin

/**
 * Created by syh on 2018/6/23.
 * Desc:
 */

val aBoolean:Boolean = true

val aInt:Int = 1
val anotherInt:Int = 0xdf
val moreInt:Int = 0b000111
val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

val aLong: Long = 12368172397127391
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3F
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = -Float.MAX_VALUE

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double= Double.MAX_VALUE
val minDouble: Double= -Double.MAX_VALUE

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

val aChar:Char = '0'
val bChar:Char = '水'
val cChar:Char = '\u00ff'




fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(Math.pow(2.0,31.0)-1)
    println(minInt)
    println(-Math.pow(2.0,31.0))
}