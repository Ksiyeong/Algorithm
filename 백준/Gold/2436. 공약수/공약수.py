def euclidean(a: int, b: int):
    while b:
        a, b = b, a % b
    return a

def solution(gcd: int, lcm: int):
    ab = gcd * lcm
    A = gcd
    B = lcm
    for a in range(gcd, int(ab ** 0.5) + 1, gcd):
        if ab % a == 0:
            b = ab // a
            if euclidean(a, b) == gcd:
                if A + B > a + b:
                    A, B = a, b
    print(A, B)

gcd, lcm = map(int, input().split())
solution(gcd, lcm)