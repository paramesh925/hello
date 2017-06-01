

object TIme extends App {
 var x=Array(7,8,0,9) 
 var a=if(x.contains(2)) 2 
 else if(x.contains(1))  1 else  0
 var b = if (a==1 || a==0) {
  if (x.contains(9)&& 9!=a) 9
 else if (x.contains(8)&& 8!=a) 8
 else if (x.contains(7)&& 7!=a) 7
 else if (x.contains(6)&& 6!=a) 6
  else if (x.contains(5)&& 5!=a) 5
  else if (x.contains(4)&& 4!=a) 4
  else if (x.contains(3)&& 3!=a) 3
   else if (x.contains(2)&& 2!=a) 2
 else if (x.contains(1)&& 1!=a) 1
 else if (x.contains(0)&& 0!=a) 0 
 else 0
 }
 else {
   if (x.contains(3)&& 3!=a) 3
   else if (x.contains(2)&& 2!=a) 2
 else if (x.contains(1)&& 1!=a) 1
 else if (x.contains(0)&& 0!=a) 0 
 else 0
 }
 val c= 
  if (x.contains(5)&& 5!=a&& 5!=b) 5
  else if (x.contains(4)&& 4!=a&& 4!=b) 4
  else if (x.contains(3)&& 3!=a&& 3!=b) 3
  else if (x.contains(2)&& 2!=a && 2!=b) 2
 else if (x.contains(1)&& 1!=a && 1!=b) 1  
 else  if (x.contains(0)&& 0!=a && 0!=b) 0 
 else 0
     
 val d= if (x.contains(9)&& 9!=a && 9!=b && 9!=c) 9
   else if (x.contains(8)&& 8!=a && 8!=b && 8!=c) 8
    else if (x.contains(7)&& 7!=a && 7!=b && 7!=c) 7
    else if (x.contains(6)&& 6!=a && 6!=b && 6!=c) 6
    else if (x.contains(5)&& 5!=a && 5!=b && 5!=c) 5
    else if (x.contains(4)&& 4!=a && 4!=b && 4!=c) 4
     else if (x.contains(3)&& 3!=a && 3!=b && 3!=c) 3
      else if (x.contains(2)&& 2!=a && 2!=b && 2!=c) 2
  else if (x.contains(1)&& 1!=a && 1!=b && 1!=c) 1
  else if (x.contains(0)&& 0!=a && 0!=b && 0!=c) 0
  else 0
 println("max time for given values "+ a+""+b+":"+c+""+d)   
}
