# 사수아탕

n, m = map(int, input().split())
total = n * m
pos = 0
daum = 0
x = []
temp = []
for i in range(n):
    x.append(int(input()))

for i in range(n):
    # temp = []
    temp.append(abs(x[i]-pos))
temp.sort()

# 아직 푸는 중