
n = int(input("Enter number of elements in the list: "))

numbers = []


for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    numbers.append(value)


total = 0
for num in numbers:
    total += num


print("List:", numbers)
print("Sum of all elements:", total)
