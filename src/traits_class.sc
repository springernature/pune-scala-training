trait Reader{
  def read={
    println("default read org")
  }
}

trait FileReader extends Reader {
   override def read={
    println("file read org")
     super.read

   }
}

trait DBReader extends Reader {
  override def read={
    println("db read org")
    super.read

  }
}
//mixed traits so precedence will go to right so will read from file reader
//if we add super will call super method and then custom
 class Custom extends DBReader with FileReader {
   override def read={
     println("cutome reader")
     super.read
   }
 }

val custom = new Custom
custom.read