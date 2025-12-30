def pattern_generator():
    for i in range(1, 10):
        for j in range(i):
            print(i, end="")
        print()


pattern_generator()