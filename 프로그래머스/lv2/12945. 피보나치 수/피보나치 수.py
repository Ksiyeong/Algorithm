def solution(n):
    pibo = [0, 1] + [0] * (n - 1)

    for i in range(2, n + 1):
        pibo[i] = pibo[i - 2] + pibo[i - 1]

    return pibo[i] % 1234567