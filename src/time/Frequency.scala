package time

/**
 * Created with IntelliJ IDEA.
 * User: smangano
 * Date: 4/28/13
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
object Frequency extends Enumeration {

  type Frequency = Value ;
  /** null frequency */		      val NoFrequency = Value(-1)
  /** only once */			        val Once = Value(0)
  /** once a year */			      val Annual = Value(1)
  /** twice a year */			      val Semiannual = Value(2)
  /** every fourth month */	    val EveryFourthMonth = Value(3)
  /** every third month */	    val Quarterly = Value(4)
  /** every second month */	    val Bimonthly	= Value(6)
  /** once a month */			      val Monthly = Value(12)
  /** every fourth week */      val EveryFourthWeek = Value(13)
  /** every second week */	    val Biweekly = Value(26)
  /** once a week */			      val Weekly = Value(52)
  /** once a day */			        val Daily = Value(365)
  /** some other unknown frequency */ val OtherFrequency = Value(999)


}
