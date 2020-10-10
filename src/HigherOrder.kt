fun higherOrder(value: String, op: (String) -> String): String {
    println("Executing the operation $op")
    return op(value)
}

// fun lowerCase(value: String) = value.toLowerCase()

// need to give explicit return type because return's type
// cannot be inferred?
fun lowerCase(value: String): String {
    return (value.toLowerCase())
}

fun main(args: Array<String>) {
    println(higherOrder("HellO", ::lowerCase)) // passing a ptr-to-function
    println(higherOrder("HellO", { x -> x + ""})) // passing a lambda
}