def solution(w: int, blocks: list):
    answer = 0
    highest = max(blocks)

    # 정방향
    now_highest = 0
    stop_index1 = 0
    for i in range(w):
        if blocks[i] >= highest:
            stop_index1 = i
            break
        elif blocks[i] < now_highest:
            answer += now_highest - blocks[i]
        else: # blocks[i] > now_highest:
            now_highest = blocks[i]

    # 역방향
    now_highest = 0
    stop_index2 = 0
    for i in range(w - 1, -1, -1):
        if blocks[i] >= highest:
            stop_index2 = i
            break
        elif blocks[i] < now_highest:
            answer += now_highest - blocks[i]
        else:
            now_highest = blocks[i]

    # 중간 부분 계산
    for i in range(stop_index1 + 1, stop_index2):
        answer += highest - blocks[i]

    print(answer)

h, w = map(int, input().split())
blocks = list(map(int, input().split()))
solution(w, blocks)