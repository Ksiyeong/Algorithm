from sys import stdin
input = stdin.readline

def solution(n:int, arr:str):
    alphbet = [0] * 26

    answer, count, i, j = 0, 0, 0, 0
    while j < len(arr):
        if alphbet[ord(arr[j])-97] == 0:
            count += 1
        alphbet[ord(arr[j])-97] += 1

        while count > n and i < j:
            alphbet[ord(arr[i])-97] -= 1
            if alphbet[ord(arr[i])-97] == 0:
                count -= 1
            i += 1

        j += 1
        answer = max(answer, j-i)

    return answer

n = int(input())
arr = input().rstrip()

print(solution(n, arr))