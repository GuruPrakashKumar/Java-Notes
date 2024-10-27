def ccc(row):

    ccc = 0
    last = -1

    for i in range(len(row) - 1):

         if row[i] != row[i + 1]:
             ccc += (i-last) *(len(row) -i - 1)
             last = i

    return ccc

row1 = input().strip()
row2= input().strip()

if not all(tree in 'ML' for tree in row1 + row2):
      print("Invalid input", end="")
else:
      ash = ccc(row1)
      ana= ccc(row2)
     
      if ash > ana:
         print("Ashok", end="")

      elif ana > ash:
         print("Anand", end="")

      else:
         print("Draw", end="")