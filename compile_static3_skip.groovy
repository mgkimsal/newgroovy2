import groovy.transform.CompileStatic

// NOTE
// this is *supposed* to work but I can't get it to work!

@CompileStatic
class demo {

	@CompileStatic(SKIP)
	def fib_dynamic(i) {
		i < 2 ? 1 : fib_dynamic(i - 2) + fib_dynamic(i - 1)
	}

	@CompileStatic(SKIP)
	int fib_integer(int i) {
		i < 2 ? 1 : fib_integer(i - 2) + fib_integer(i - 1)
	}

	int fib(int i) {
		i < 2 ? 1 : fib(i - 2) + fib(i - 1)
	}
}

def d = new demo()
bench(d, "fib_dynamic", 30, "Full dynamic ")
bench(d, "fib_integer", 30, "Groovy w/ explicit types")
bench(d, "fib", 30, "Explicit type w/@CompileStatic")

def bench(clazz, method, val, name){
	def a=  System.currentTimeMillis()
	clazz."$method"(val)
	def a2=  System.currentTimeMillis()
	println "$name took " + (a2-a) + " ms"
}





