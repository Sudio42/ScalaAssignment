package fileprocessing

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._

class MoviesTest extends AnyFunSuite {
  test("Load movies_dataset.csv file") {
    val Data = new MoviesData("src/resources/movies_dataset.csv").readData()
    Data.size shouldBe 20019
  }

  val mData = new MoviesData("src/resources/movies_dataset.csv")
  val stat = new Modules(mData)


  test("get reports directed by D.W. Griffith in year range 2010 to 2020") {
    stat.reportByDirectorAndYear("Louis Feuillade",1913,1920)
  }

  test("get reports by language and given user review") {
    stat.reportByLangAndReview(6)
  }

  test("get reports of high budget by the given year and country") {
    stat.reportByHighBudgetAndGivenData(1901,"Australia")
  }


}
