# 명령 프롬프트

n = int(input())
str = []

for _ in range(n):
    str.append(list(input()))
result = str[0]
for i in range(n-1):
    for j in range(len(result)):
        if result[j] != str[i+1][j]:
            result[j] = '?'
            
print(''.join(result))