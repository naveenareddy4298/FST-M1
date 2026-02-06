
fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150,
    "grapes": 90
}


print("Available fruits and prices:")
for fruit, price in fruits.items():
    print(fruit, ":", price)


check_fruit = input("Enter a fruit name to check availability: ").lower()


if check_fruit in fruits:
    print(f"{check_fruit} is available. Price: {fruits[check_fruit]}")
else:
    print(f"{check_fruit} is not available.")
