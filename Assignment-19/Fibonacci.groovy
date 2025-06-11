def n = 10
def t1 = 0
def t2 = 1

print t1 + " " + t2

def next = 0
for(i in 2..n - 1) {
  next = t1 + t2
  print " " + next
  t1 = t2
  t2 = next
}