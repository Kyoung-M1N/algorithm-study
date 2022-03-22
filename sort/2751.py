# 수 정렬하기 2

n = int(input())
num = []

for _ in range(n):
    num.append(int(input()))
num.sort()

for i in range(n):
    print(num[i])

# 아직 풀이 중(시간초과)