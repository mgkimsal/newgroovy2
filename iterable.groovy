// collectEntries will work on any iteratable

class Stuff implements Iterable<String> {
	Iterator iterator() {
		["a", "b", "c"].iterator()
	}
}

def t = new Stuff()
def all = t.collectEntries { [it.toUpperCase(), it.toUpperCase()] }
println all
