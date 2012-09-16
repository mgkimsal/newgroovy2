// since 1.8.7

def a = 1..10

assert a.takeWhile { it < 4 } == [ 1, 2, 3  ]
assert a.dropWhile { it < 6 } == [ 6, 7, 8, 9, 10 ]