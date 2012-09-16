// calendar object implements a next and previous, allowing
// range iterations (day incremements only)

def cal1 = new GregorianCalendar( 2012, Calendar.SEPTEMBER, 15 )
def cal2 = new GregorianCalendar( 2012, Calendar.SEPTEMBER, 19 )

(cal1..cal2).each {
	println it.time
}


