n = int(input())

a = 1
answer = 0
while a <= n:
    n -= a
    a += 2
    answer += 1

print(answer)