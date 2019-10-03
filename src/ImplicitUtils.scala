trait ImplicitUtils {
  implicit val number = 5

  implicit def stringtoInt(input:String):Int = {
    Integer.parseInt(input)
  }
}
