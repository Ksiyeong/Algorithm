n = int(input())
hint = [list(map(int, input().split())) for _ in range(n)]

def isTrue(a: int, b: int, c: int):
    for inning in hint:
        strike = 0
        ball = 0
        A = inning[0] // 100
        B = inning[0] % 100 // 10
        C = inning[0] % 10

        if a == A:
            strike += 1
        elif a == B or a == C:
            ball += 1

        if b == B:
            strike += 1
        elif b == A or b == C:
            ball += 1

        if c == C:
            strike += 1
        elif c == A or c == B:
            ball += 1

        if strike != inning[1] or ball != inning[2]:
            return False

    return True

count = 0
for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):
            if a != b and b != c and a != c and isTrue(a, b, c):
                count += 1
print(count)