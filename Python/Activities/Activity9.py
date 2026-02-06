n1 = int(input("Enter number of elements in first list: "))
list1 = []

for i in range(n1):
    value = int(input(f"Enter element {i + 1} for first list: "))
    list1.append(value)


n2 = int(input("Enter number of elements in second list: "))
list2 = []

for i in range(n2):
    value = int(input(f"Enter element {i + 1} for second list: "))
    list2.append(value)


new_list = []

for num in list1:
    if num % 2 != 0:
        new_list.append(num)

for num in list2:
    if num % 2 == 0:
        new_list.append(num)


print("First list:", list1)
print("Second list:", list2)
print("New combined list:", new_list)
