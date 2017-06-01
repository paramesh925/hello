

object Combination extends App {
  val arr:Array[Int]=Array(1, 2, 3, 4, 5)
  val r=2
  val n=arr.length
  
  def printCombination(arr:Array[Int],n:Int,r:Int){
    var data:Array[Int]=new Array(r)
    combinationUtil(arr, data, 0, n-1, 0, r)
  }
  
  def combinationUtil(arr:Array[Int],data:Array[Int],start:Int,end:Int,index:Int,r:Int){
    if(index==r){
      for (j <- 0 to r){
        println(data(j)+" ")
        println("")
      }
    }
  
    for (i <- start to end if i<=end && end-i+1 >= r-index){
      
      data(index)=arr(i)
      combinationUtil(arr, data, i+1, end, index+1, r)
    }  
  }
  printCombination(arr, n, r)
}
  
