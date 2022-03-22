# 숫자의 합

n = int(input())
num = list(input())
result = 0

for i in range(n):
    result += int(num[i])
print(result)
