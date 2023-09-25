from sys import stdin
input = stdin.readline

def solution(arr: list, n: int):
    # 보정
    temp = min(arr)
    if temp != 0:
        for i in range(n):
            arr[i] -= temp
    
    # 계산
    result = [0] * (max(arr)+1)
    for i in range(n-1, -1, -1):
        result[min(arr[i], arr[i-1])] += 1
        result[max(arr[i], arr[i-1])] -= 1
    
    # 누적합 계산
    for i in range(1, len(result)-1):
        result[i] += result[i-1]

    return max(result[:-1])

n = int(input()) // 2
arrA, arrB = [0] * n, [0] * n
for i in range(n):
    arrA[i], arrB[i] = map(int, input().split())
    input()

print(max(solution(arrA, n), solution(arrB, n)))