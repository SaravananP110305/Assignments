def str = "KnowKode"
def rev_str = ""

for(i = str.size() - 1; i >= 0; i--) {
  rev_str += str.charAt(i)
}

println rev_str