def solution(a: int, b: int, c: int, d: int, e: int, f: int):
    for x in range(-999, 1000):
        for y in range(-999, 1000):
            if a * x + b * y == c:
                if d * x + e * y == f:
                    print(x, y)
                    return

a, b, c, d, e, f = map(int, input().split())
solution(a, b, c, d, e, f)