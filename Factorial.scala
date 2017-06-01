

object Factorial extends App{
  def fact(num:Int):Int = {
    if(num==0) 1 
    else 
     num*fact(num-1)
  }
  println(fact(5))
}