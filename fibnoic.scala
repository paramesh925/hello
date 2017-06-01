

object fibnoic extends App{
var sum=0
var i=0
var j=1
def fact(num:Int)={
 
  for(k<- 0 to num){
     if(j<=num){
  sum=i+j
  println(sum)
  i =i+1
  j =j+1
 
  /*println("i is "+i)
  println("j is "+j)*/
  }}
}
println(fact(9))
}