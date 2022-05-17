
#num_tuple = (10, 20, 33, 46, 55)
num_tuple=list(input("Enter a sequence of comma separated values: ").split(", "))
print("Given list is ", num_tuple)
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)