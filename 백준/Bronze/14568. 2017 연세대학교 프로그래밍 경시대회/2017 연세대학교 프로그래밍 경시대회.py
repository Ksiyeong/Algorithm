N = int(input())

count = 0
for A in range(2, N - 1, 2):
    for B in range(1, N - A):
        C = N - A - B
        if C - B >= 2:
            count += 1

print(count)