import com.nicta.scoobi.Scoobi._

object WordCount extends ScoobiApp {
  def lines: DList[String] = ???
  def filtered = lines.filter { x => x != "" }.groupBy { x => x }
}
