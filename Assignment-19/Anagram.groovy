def str1 = "listen"
def str2 = "silent"

def isAnagram = str1.toList().sort() == str2.toList().sort()
println isAnagram ? "true" : "false"
