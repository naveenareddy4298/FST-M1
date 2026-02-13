
n = int(input("Enter number of elements in the list: "))

numbers = []


for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    numbers.append(value)


if numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)


print("List:", numbers)
