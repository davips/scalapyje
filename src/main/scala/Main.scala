import me.shadaj.scalapy.py
/*
@py.native trait M extends py.Object {
  def main(): py.Dynamic = py.native
//  def main(a: List[String]): py.Dynamic = py.native
}*/

object Main extends App {
    val os = py.module("os")
    val sys = py.module("sys")
    println("version " + sys.version + "<<<<<<")
    
    val toy = py.module("examples.a.b")
    println(b.A.main())   //List("mozilla4.arff"))

    println("path " + os.path.dirname(sys.executable))
}
