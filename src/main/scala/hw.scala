object hw {

  def factorial(factor:Int):Int={
    if(factor==1) 1 else factor*factorial(factor-1)
  }

  def fibonacci(value:Int):List[Int]={
    var previous=0
    var current=1
    var temp=0
    var series=""
    var seriesValues=List(1)
    seriesValues=previous +: seriesValues
    seriesValues=current +: seriesValues

    series=previous+"\t"+current
    println(series)
    for(no <- 3 to value by 1){
      temp=current+previous
      seriesValues=temp +: seriesValues
      series+="\t"+temp
      println(series)
      previous=current
      current=temp
    }
    seriesValues
  }

  //Check whether the number is in  fibonacci series or not
  def isFibonacci(number:Int)={
    var series=List(1)
    var result=true
    series=fibonacci(number+1)
    result=series.contains(number)
    println(result)
  }

  //Combinations nCr=n!/(n-r)!*r!
  def combinations(n:Int,r:Int)={
    var numerator=0
    var denominator=0
      numerator=factorial(n)
      denominator=factorial(n-r)*factorial(r)
    println(n+"C"+r+" = "+(numerator/denominator))


  }


  def main(args: Array[String]) {
    var result=0
    result=factorial(5)
    println(result)
    fibonacci(10)
    combinations(6,3)
    isFibonacci(9)
  }
}