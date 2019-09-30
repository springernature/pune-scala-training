package util

trait Calculator {
  def add(a:Int,b:Int):Int
}

class SimpleCalculator extends Calculator{
  override def add(a: Int, b: Int): Int = a + b
}

class PrecisionCalculator extends Calculator{
  override def add(a: Int, b: Int): Int = Math.addExact(a, b)
}
