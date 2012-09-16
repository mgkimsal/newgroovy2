// since 2.0, works on character strings as a list too
def str = 'TriJUG is the best'

def first = str.takeWhile{it != ' '}

println "first part is "+first

assert str.takeWhile { it != ' ' } == 'TriJUG'
assert str.dropWhile { it != ' ' } == ' is the best'