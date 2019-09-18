trait Reader{
  def read():Unit={
    println("in Reader")
  }
}

trait FileReader extends Reader{

  override def read(): Unit = {
    println("red from file")
    super.read()

  }
}

trait DBReader extends Reader{
  override def read(): Unit ={
    println("read from db")
    super.read()

  }
}

class CustomerReader extends DBReader with FileReader
{
  override def read(): Unit = {
    println("read from custom")
    super.read()
  }
}

val reader=new CustomerReader

reader.read()