package fileprocessing

import scala.io.Source
import java.lang.Exception
import java.lang.NumberFormatException

class Modules(val moviesContent: MoviesContent)  {
  val adata = moviesContent.readData()

   def reportByDirectorAndYear(vdir: String,syear: Int,eyear: Int): Unit = {
    try {
      val aValues = adata.filter(d => d.director.contains(vdir) && d.year.toInt >= syear && d.year.toInt <= eyear)
      //aValues.foreach(println)
    }
    catch{
       case e:  Exception => {e.printStackTrace()}
       case ex: NumberFormatException => {ex.printStackTrace()}
     }
   }

   def reportByLangAndReview(given_user_review: Int): Unit = {
    try {
      val bValues = adata.filter(d => d.language.contains("English") && d.reviews_from_users != "" && d.reviews_from_users.toInt > given_user_review).sortBy(_.reviews_from_users).reverse
      //bValues.foreach(println)
    }
    catch{
      case e:  Exception => {e.printStackTrace()}
      case ex: NumberFormatException => {ex.printStackTrace()}
    }
   }

   def reportByHighBudgetAndGivenData(vyear: Int,vcon: String): Unit = {
     try {
       val cValues = adata.filter(d => d.year.toInt == vyear && d.Country == vcon).groupBy(_.year).values.map(_.maxBy(_.budget))
       //cValues.foreach(println)
     }
     catch{
       case e:  Exception => {e.printStackTrace()}
       case ex: NumberFormatException => {ex.printStackTrace()}
     }
   }
}
