import scala.collection.JavaConversions.asJavaCollection
import scala.collection.mutable.ListBuffer

object test extends App{

  val testString = "aabcccccaaaa"

  def compressionMethod(str: String): Unit = {

    val charArray = str.split("")
    //charArray.foreach(x => print(x))
    //val compressed = ListBuffer[(String, String)]()
    var comp = scala.collection.mutable.Map[String, Int]()


    var counter = 0

    for(c <- charArray) {

      if(!comp.contains(c) )  {
        //println("line21")
        for(n <- charArray) {
          if(c == n) {
            //println("line24")
            //println(c,n)
            counter +=1
          }
        }
        //(counter)
        comp += (c -> counter)
        counter = 0
      }

    }
    //if(comp.isEmpty) println("empty map")
    //comp.foreach(x => println(x._1, x._2))
    //println(comp.keysIterator)
    for((k,v) <- comp) {
      println(k,v)
    }
  }


  compressionMethod(testString)
}
