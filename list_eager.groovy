// since 1.8.7 and 2.0
// we can define a list to have default values
// withEagerDefault will populate
// things for us automatically

// we can define our own closure to use as well
def lookupname = { idx->
	'id '+idx
}

def names = ['elsie','simone'].withEagerDefault(lookupname)
// triggers the rest of the array to have default values
// based on the closure provided
println names[4]
assert names==['elsie','simone','id 2','id 3','id 4']

println names

