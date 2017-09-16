/**
  * Created by selva on 9/13/17.
  */
class Fraction(val n:Int,val d:Int) {
  override def toString = n + "/" + d

  def result = n / d.toDouble

  def -(f: Fraction) = {
    new Fraction((n * f.d) - (f.n * d), d *f.d)
  }
}
  object  Fraction{
    def main(args: Array[String]): Unit = {
      val a=new Fraction(2,3)
      println(a)
      val b=new Fraction(2,5)
      println(b)
      val c=a-b
      println(c)
    }
  }


