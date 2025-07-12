list1 = ["govind", "shri krishna", "shri ram", "shri hanuman"]
list2 = ["mahadev", "shri ganesh", "shri durga", "shri laxmi"]

def swap1 (a, b):
    # a, b = b, a
    a[:], b[:] = b[:], a[:]

swap1(list1, list2)
print("list1:", list1)
print("list2:", list2)