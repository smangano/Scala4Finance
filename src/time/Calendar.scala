package time

/**
 * Created with IntelliJ IDEA.
 * User: smangano
 * Date: 4/26/13
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
import Weekday._ ;

trait CalendarConfig {

  def name(): String

  def isLeap(year: Int): Boolean

  def easterMonday(year: Int): Int

  def weekend(weekday: Weekday): Boolean

}

abstract class Calendar(val originYear: Int, val originMonth: Int, val originDay: Int, config: CalendarConfig) {

  def name() : String ;

  def dayOfWeek(offset: Long): Weekday

  def isBusinessDay(offset: Long): Boolean

  def holidayName(offset: Long): java.lang.String

  //def isEndOfMonth(date : Date[T])   : Boolean


}
