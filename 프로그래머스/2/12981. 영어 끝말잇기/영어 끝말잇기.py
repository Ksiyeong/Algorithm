def solution(n, words):
    answer = [1, 1]
    used = [words.pop(0)]

    for word in words:
        answer[0] += 1
        if answer[0] > n:
            answer[0] = 1
            answer[1] += 1
        # 끝말잇기 확인 or 사용 여부 확인
        if used[-1][-1] != word[0] or word in used:
            return answer
        used.append(word)

    return [0, 0]