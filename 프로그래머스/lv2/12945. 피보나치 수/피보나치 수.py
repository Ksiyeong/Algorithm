def solution(n):
    a, b = 0, 1
    for _ in range(n // 2):
        a = a + b
        b = a + b
    if n % 2 == 0:
        return a % 1234567
    return b % 1234567