from sys import stdin
input = stdin.readline

def solution(target, trees):
    s = 0
    e = max(trees)
    cal = 0
    while s <= e:
        cal += 1
        mid = (s+e) // 2

        wood = 0
        for tree in trees:
            if tree > mid:
                wood += tree - mid
        
        if wood > target:
            s = mid + 1
        elif wood < target:
            e = mid - 1
        else: # wood == target
            return mid

    return e
    

n, m = map(int, input().split())
trees = list(map(int, input().split()))

print(solution(m, trees))