import scala.Array.canBuildFrom

object MulTable extends App{
  override def main(args: Array[String]) = {
    val table = for {
      dims <- maybeGetInput(args) filter (inputValid(_))
    } yield mkTable(dims)

    println(table.getOrElse("failure"))
  }

  def inputValid(input: Tuple2[Int, Int]) = {
    input._1 >= 1 && input._2 >= 1
  }

  def maybeGetInput(args: Array[String]): Option[Tuple2[Int, Int]] = {
    try { 
	 
if (args.length == 2) {
        val params = for (s <- args) yield Integer.parseInt(s)

        Some(params.head, params.last)
      } else {
        println(":: multiplication table printer")

        print("\\ rows: "); val rows = readInt
        print("\\ cols: "); val cols = readInt

        Some(rows, cols)
      }
    } catch {
      case eof: java.io.EOFException =>
        println("fatal: end-of-file encountered")
        None
      case nfe: java.lang.NumberFormatException =>
        println("fatal: couldn't parse an integer out of that")
        None
    }
  } 
def mkRow(row: Int, cols: Int, maxPad: Int) = {
    val rowStr =
      for (col <- 1 to cols) yield {
        val prod = (col * row).toString
        val pad = " " * (maxPad - prod.length)
        pad + prod
      }

    rowStr.mkString
  }

  def mkTable(dims: Tuple2[Int, Int]) = {
    val rows = dims._1
    val cols = dims._2
    val maxPad = (Math.ceil(Math.log10(rows * cols)) + 2).toInt
    val rowStrs = for { r <- 1 to rows } yield mkRow(r, cols, maxPad)

    rowStrs.mkString("\n")
  }

} 
 
