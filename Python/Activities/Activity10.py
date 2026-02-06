n = int(input("Enter number of elements in the tuple: "))

elements = []


for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    elements.append(value)


numbers = tuple(elements)

print("Tuple:", numbers)
print("Numbers divisible by 5:")

for num in numbers:
    if num % 5 == 0:
        print(num)
