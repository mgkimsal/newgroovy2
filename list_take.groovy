// a take method is available on lists
// to grab 'up to' X elements from a list, even if the
// requested number would go beyond the end of the list
// not quite new in 2.0 - had this since 1.8.1

def names = ['mike','matt','mark','lesley','elsie','simone']

println names.take(13)

// we can chain and get something close to PHP's array_slice
// PHP = $sub = array_slice($names, 4, 9) ('elsie','simone')
println names.drop(4).take(9)


