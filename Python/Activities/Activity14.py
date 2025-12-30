

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


count = int(input("Enter how many Fibonacci numbers to generate: "))

print("Fibonacci sequence:")
for i in range(count):
    print(fibonacci(i), end=" ")
