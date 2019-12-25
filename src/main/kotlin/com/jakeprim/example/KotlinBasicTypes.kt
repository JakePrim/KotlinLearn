package com.jakeprim.example

fun main() {
    //val 只读变量 类似Java中的final变量
//var 可读写变量
    var a: Int = 2
    val b: String = "Hello Kotlin"

//类型推导 自动推导类型
    var a1 = 2
    val b1 = "Hello Kotlin"

//易混淆的Long类型标记 在kotlin只能使用大写L
    var bLong = 100L
//var b1Long = 10l

    val float1 = 1f

//val doble1:Double = float1
    val doble1: Double = float1.toDouble()

    val float2: Float = 1.2f

    val double2: Double = 1.2

//kotlin的数值类型转换
    val e = 10
//val f:Long = e//在Kotlin中int类型不能直接赋值给Long类型
//如何转换呢,使用toLong
    val f: Long = e.toLong()

    val byte: Byte = 1
//在类型前面加上U 就是无符号的类型

    val g: UInt = 10u
    val i: UByte = 1u

    //字符串的打印和使用
    val j = "I Love Chain"

    println("Value of String 'j' is: $j")
    println("Length of String 'j' is: ${j.length}")
    System.out.printf("Length of String 'j' is:%d\n", j.length)

    val k = "Today is a sunny day"
    val m = String("Today is a sunny day".toCharArray())
    println(k === m)//=== 表示引用是否相等
    println(k == m)//==两个等号表示内容是否相等 等价于Java中的equal

    //字符串换行
    val n = """
        <html>
        <head>
          
        </head>
        </html>
    """.trimIndent()
    println(n)
}


