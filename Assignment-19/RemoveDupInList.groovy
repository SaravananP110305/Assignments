def list_1 = [1, 2, 2, 3, 4, 4, 5]
def list_2 = []

for(item in list_1) {
  if(!list_2.contains(item)) {
    list_2 << item
  }
}

println list_2