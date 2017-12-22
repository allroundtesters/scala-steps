package io.hedwig.scala.notes

import scala.collection.mutable.ArrayBuffer

/**
  * 1. author: patrick
  */
trait TraitDemo {
  def demo1()
  def next(): Any
}


class DefaultTraitDemo(to:Int) extends TraitDemo{
  override def next(): Any = {
    return null
  }

  override def demo1(): Unit = {
    println("demo1")
  }
}

trait Pet{
  val name:String
}

class Cat(val name:String) extends Pet
class Dog(val name:String) extends Pet

object TraitDemo{
    def main (args: Array[String] ): Unit = {
      val dog = new Dog("Harry")
      val cat = new Cat("Sally")

      val animals = ArrayBuffer.empty[Pet]
      animals.append(dog)
      animals.append(cat)
      animals.foreach(pet => println(pet.name))
    }
}

