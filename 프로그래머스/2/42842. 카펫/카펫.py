def solution(brown:int, yellow:int):
    # 사각형의 넓이를 이용하여 가로, 세로 길이를 구하라.
    area = brown + yellow

    # 최소 3
    for width in range(3, 100000000):
        if area % width == 0:
            length = int(area / width)
            if (width + length) * 2 - 4 == brown:
                return [max(width, length), min(width, length)]