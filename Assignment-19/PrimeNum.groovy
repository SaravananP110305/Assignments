def num = 17
def count = 0

for(i in 1..num) {
  if(num % i == 0) {
    count++
  }
}

println (count == 2 ? "true" : "false")