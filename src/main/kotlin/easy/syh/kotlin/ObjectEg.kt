package easy.syh.kotlin

/**
 * Created by syh on 2018/6/23.
 * Desc:
 */


class 甜牛奶 (颜色:String,味道:String){
    init {
        println("来一杯${this.javaClass.simpleName},味道:$味道,颜色:$颜色")
    }
}

open class 酸牛奶 (val 颜色:String,val 味道:String){
    init {
        println("来一杯$this,味道:$味道,颜色:$颜色")
        println("来一杯${this.javaClass.simpleName},味道:$味道,颜色:$颜色")
    }

    override fun toString(): String {
        return "酸牛奶(颜色='$颜色', 味道='$味道')"
    }
}

class 蒙牛酸牛奶:酸牛奶("蒙白色","蒙酸酸")
class 三元酸牛奶(颜色: String,味道: String):酸牛奶(颜色,味道)



fun main(args: Array<String>) {
    val 好喝的甜牛奶:甜牛奶 = 甜牛奶("乳白色","甜甜的")
    val 好喝的酸牛奶:酸牛奶 = 酸牛奶("还是乳白色","酸酸的")


    println(好喝的甜牛奶)
    println(好喝的酸牛奶.toString())

    val 好喝的蒙牛酸牛奶:蒙牛酸牛奶 = 蒙牛酸牛奶()
    val 好喝的三元酸牛奶:三元酸牛奶 = 三元酸牛奶("三元乳白色","三元酸")


}