

object xyz extends App {
  var a=List(1 to 5)
  var x=List(1,2,4,5)
  for( i <-a if(i.contains(3)) ) yield print(i) 
    
}