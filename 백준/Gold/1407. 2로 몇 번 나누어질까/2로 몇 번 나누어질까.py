def solution(num: int):
    i = 1
    answer = num
    while num // (2 ** i)>0:
        answer += num // (2 ** i) * (2 ** i - 2 ** (i - 1))
        i += 1
    return answer

a, b = map(int, input().split())

print(solution(b) - solution(a - 1))