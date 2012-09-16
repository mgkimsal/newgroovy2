void foo(String msg) { println 'foo called as string' }
void foo(Object msg) { println 'foo called as object' }

def doIt = {x ->
	def o = x
	foo(o)
}

def getXXX() { "a String" }

def o2=getXXX()
doIt o2   // "String method" or "Object method"????