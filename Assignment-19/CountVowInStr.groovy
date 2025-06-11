def str = "Groovy Programming"

def count = 0
for(ch in str.toCharArray()) {
  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    count++
  }
}

println count