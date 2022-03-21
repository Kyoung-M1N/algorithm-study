# 설탕 배달

total = int(input())
result = 0

while total >= 0:
    if total % 5 == 0:
        result += total // 5
        print(result)
        break
    total -= 3
    result += 1
else:
    print(-1)
    
# while문에 사용되는 조건식에도 else문이 유효하게 적용됨 