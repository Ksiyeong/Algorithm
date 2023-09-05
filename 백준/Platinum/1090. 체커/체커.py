n = int(input())
coordinates = [list(map(int, input().split())) for _ in range(n)]
answer = [int(1e9)] * n # 모일 인원별로 값을 저장할 배열

for x in coordinates: # x 좌표 후보
    for y in coordinates: # y 좌표 후보
        costs = []
        for ix, iy in coordinates: # 입력받은 좌표
            # 현재 x,y 좌표와 입력받은 좌표의 거리를 비교한 값을 costs 배열에 입력
            costs.append(abs(x[0] - ix) + abs(y[1] - iy))

        # costs를 정렬하여
        costs.sort()
        cost = 0
        for i in range(n):
            # cost 에 순차적으로 더 하면서
            cost += costs[i]
            # 해당 인덱스의 값(answer[i])와 현재 좌표의 거리(cost)와 비교하여 작은 값을 저장
            answer[i] = min(answer[i], cost)

print(*answer)