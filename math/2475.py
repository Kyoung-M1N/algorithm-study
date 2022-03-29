# 검증수

num = list(map(int, input().split()))

result = 0
for i in range(len(num)):
    result += (num[i] ** 2)
    
result %= 10
print(result)