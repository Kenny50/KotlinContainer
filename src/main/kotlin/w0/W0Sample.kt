package w0

import w0.util.Sample

fun main(){
    val sample = Sample()
    println(sample.hello)
    println(sample.world.invoke())
    println(sample.helloWorld)
}