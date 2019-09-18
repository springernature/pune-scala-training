trait Reader {
  def read() = {
    println("default impl")
  }
}

trait FileReader extends Reader {
  override def read(): Unit = {
    println("read from file")
    super.read()
  }
}

trait DBReader extends Reader {
  override def read(): Unit = {
    println("read from DB")
    super.read()
  }
}

class CustomerReader extends Reader with DBReader with FileReader {
  override def read(): Unit = {
    println("read from custom")
    super.read()
  }
}

val reader = new CustomerReader

reader.read()