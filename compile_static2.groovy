import groovy.transform.CompileStatic

@CompileStatic
def runloop()
{
	for(int i=0; i<100; i++)
	{
		def t = i * Math.random() * Math.random()
		def answer = "The answer is ${t}"
		println answer
	}

}
def a=  System.currentTimeMillis()
runloop()
println System.currentTimeMillis() - a



