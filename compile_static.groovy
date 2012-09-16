import groovy.transform.CompileStatic

@CompileStatic
def returnName()
{
	def name = "Mike"
	return "name="+name
}

println returnName()
println returnName().class




