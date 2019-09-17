def add (a:Int, b:Int): Int = {
    a + b
}

def subtract (a:Int, b:Int): Int = {
    a - b
}

def multiply (a:Int, b:Int): Int = {
    a * b
}

def divide (a:Int, b:Int): Int = {
    a / b
}

def performOperation(a:Int, b:Int, fun:((Int,Int) => Int)) = {
    fun(a, b)
}

def findOperationAndPerform(input:String) = {
    val chars = input.toArray
    val (operator1, operation, operator2) = (chars(0).toString.toInt, chars(1).toString, chars(2).toString.toInt)
    operation match {
        case "+" => performOperation(operator1, operator2, add)
        case "-" => performOperation(operator1, operator2, subtract)
        case "*" => performOperation(operator1, operator2, multiply)
        case "/" => performOperation(operator1, operator2, divide)
    }
}

findOperationAndPerform("6+2")
findOperationAndPerform("6-2")
findOperationAndPerform("6*2")
findOperationAndPerform("6/2")
