// since 1.8.7 and 2.0
// we can define a list to have default values
def names = [].withLazyDefault { 'anonymous' }

names[4]="mike"
assert names[4]=="mike"
println names[4]
assert names == [null,null,null,null,'mike']
println names

// now watch when we try to access
// an index that we've not defined
println names[2]
assert names == [null,null,'anonymous',null,'mike']
println names

