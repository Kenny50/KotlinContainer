package w0.util

class Sample {
    val hello = "hello"
    var world: () -> String = {
        "world"
    }
    val helloWorld = hello + world.invoke()
}