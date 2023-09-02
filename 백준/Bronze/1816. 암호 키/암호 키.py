N = int(input())

for _ in range(N):
    num = int(input())
    isTrue = True
    if num % 2 == 0:
        isTrue = False
        print("NO")
    else:
        for i in range(3, 1_000_001, 2):
            if num % i == 0:
                isTrue = False
                print("NO")
                break
    if isTrue:
        print("YES")
