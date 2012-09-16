// since 1.8.7 and 2.0
// we can define a list to have default values

// we can define our own closure to use as well
def findname = { idx->
	'anonymous #'+idx
}

def names = [].withLazyDefault(findname)
names[4]="mike"
println names

// now watch when we try to access
// an index that we've not defined
println names[2]
println names

