def solution(cols: int, rows: int):
    answer = 0
    arr_left = [[0] * (cols + 2) for _ in range(rows + 2)]
    arr_right = [[0] * (cols + 2) for _ in range(rows + 2)]

    for pillar in pillars:
        arr_left[pillar[1]][pillar[0]] += 1
        arr_right[pillar[1]][pillar[0]] += 1

    for y in range(rows, 0, -1):
        for x in range(1, cols + 1):
            if arr_left[y][x - 1] == 1 or arr_left[y + 1][x] == 1:
                arr_left[y][x] = 1

    for y in range(rows, 0, -1):
        for x in range(cols, 0, -1):
            if arr_right[y][x + 1] == 1 or arr_right[y + 1][x] == 1:
                arr_right[y][x] = 1

            if arr_left[y][x] == 1 and arr_right[y][x] == 1:
                answer += 1

    print(answer)

n = int(input())
pillars = [[0, 0]] + [list(map(int, input().split())) for _ in range(n)]

rows = max(pillar[1] for pillar in pillars)
cols = max(pillar[0] for pillar in pillars)

solution(cols, rows)