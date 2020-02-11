import scala.math._
import scala.io.StdIn._

object RaizCuadrada {
  def main(args: Array[String]): Unit = {
    println("Ingrese numero")
    var num = readInt()
    var est = num/2
    var est2 = 0.0
    est2 = est
    var raiz=0.0
    var prom=0.0
    var prom2=0.0
    var i=0;
    var it=0;
    while (i!=1) {
      it=it+1;
      prom2=prom
      raiz=num/est2
      prom=(raiz+est2)/2
      est2=prom
      if(prom2==prom){
        i=1
      }
    }
    println(raiz, it)
  }
}