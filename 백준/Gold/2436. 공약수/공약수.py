def euclidean(a: int, b: int):
    # 큰수 a
    # 작은 수 b
    while a % b != 0:
        temp = b
        b = a % b
        a = temp
    
    return b

gcd, lcm = map(int, input().split())
ab = gcd * lcm
A = gcd
B = lcm

for a in range(gcd, int(ab ** 0.5) + 1, gcd):
    if ab % a == 0:
        b = ab // a
        if euclidean(a, b) == gcd:
            if A + B > a + b:
                A = a
                B = b

print(A, B)