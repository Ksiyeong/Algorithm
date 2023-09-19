def gcd(a: int, b: int):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
    
def check(a: int, b: int):
    for i in range(a + 1, b):
        if gcd(a, i) == 1 and gcd(i, b) == 1:
            return 1
    return 2

n = int(input())
arr = numbers = list(map(int, input().split()))
arr.sort()

answer = 0
for i in range(n - 1):
    if gcd(arr[i], arr[i + 1]) != 1:
        answer += check(arr[i], arr[i + 1])
print(answer)