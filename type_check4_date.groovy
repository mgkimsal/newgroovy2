import groovy.transform.TypeChecked

// groovy will still coerce certain values
// methods marked as String, boolean or Class
// will be automatically converted, even when typechecked

@TypeChecked
Date getBannerMessage()
{
	Integer i = 42
	return i
}
println getBannerMessage()


