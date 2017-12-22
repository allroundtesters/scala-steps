/**
  * 1. author: patrick
  */



object Main {
  def whileLoop: Unit ={
    var i=1
    while(i<=10){
      println(i)
      i+=1
    }
  }

  var range=0 until 10

  def main(args: Array[String]): Unit = {
    println(args.indices)
    println(range)
    println(range.start)
    println(range.end)
    println(range.step)
    var r =  Range(10,12)
    var r2 = (10 to 1000) by 5
    println(r)
    args.foreach( element =>
      println(element)
    )
    for(i<-args.indices){
      println(args(i))
    }

    for(i<- r){
      for(j<-r2){
        println(j)
      }
      println(i)
    }
    whileLoop
  }
}