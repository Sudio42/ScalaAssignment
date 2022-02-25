package fileprocessing

trait MoviesContent {

  def readData(): Seq[Data]

}

case class Data(imdb_title: String, title: String, original_title: String, year: String, date_published: String, genre: String, duration: String, Country: String, language: String, director: String,writer: String,production_company: String, actors: String,description: String,avg_vote: String,votes: String,budget: String,usa_gross_income: String,worlwide_gross_income: String,metascore: String,reviews_from_users: String,reviews_from_critics: String)
