def list1 = [1, 2, 3, 4]
def list2 = [3, 4, 5, 6]
def common = []

for(item1 in list1) {
  for(item2 in list2) {
    if(item1 == item2) {
      common << item1
    }
  }
}

println common