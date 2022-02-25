package fileprocessing

import scala.io.Source
import java.io.FileNotFoundException

class MoviesData (val fileName: String) extends MoviesContent {

  override def readData(): Seq[Data] = {
    try {
      for {
        line <- Source.fromFile(fileName).getLines().drop(1).toVector
        values = line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1).map(_.trim)
      } yield Data(values(0), values(1), values(2), values(3), values(4), values(5), values(6), values(7), values(8), values(9), values(10), values(11), values(12), values(13), values(14), values(15), values(16), values(17), values(18), values(19), values(20), values(21))

    }
    catch {
      case ex: FileNotFoundException => {ex.printStackTrace();null }
    }
  }
}
