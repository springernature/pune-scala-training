val nummber5=(1 to 5).toList

nummber5.foldRight(1) ((i:Int, fact:Int)=>i*fact)
nummber5.foldLeft(1) ((i:Int, fact:Int)=>i*fact)

nummber5.foldRight(1) ((i:Int, fact:Int)=>i*fact)


nummber5.foldRight("+") ((i, fact)=>i+fact)
nummber5.foldLeft("+") ((i, fact)=>i+fact)

nummber5.foldRight("") ((i, fact)=>i+fact)
nummber5.foldLeft("") ((i, fact)=>fact+i)
