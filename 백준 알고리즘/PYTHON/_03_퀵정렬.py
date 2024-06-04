s = list(input())
def quick_sort(arr , start , end):
    #index값을 저장
    left = start + 1        #pivot에서 왼쪽에 있는 요소
    right = end             #pivot에서 오른쪽에 있는 요소
    pivot = start           #중심이 되는 요소 지정(첫 번째 요소)
    if start >= end:        #원소 갯수가 1개 이하면 종료
        return
    while left <= end and arr[left] <= arr[pivot]:     #pivot값을 기준으로 자신이 원하는 위치에 두기
        left += 1
    while right > start and arr[right] >= arr[pivot]:       #pivot값을 기준으로 자신이 원하는 위치에 두기
        right -= 1
    #보충설명
        #pivot값을 기준으로 left값이 더 크다면 다음 left값으로 넘어감
        #동일한 기준으로 right값은 다음 right 값으로 넘어감
        #만일 , 두 값이 교차하여 left값이 더 커진 경우 올바르게 정렬 된 경우 이므로 right값과 교체하여 원래 pivot값이 위치해야 할 자리로 정렬
        #만일 두 값이 교차하지 않았다면 
            #left값 중 pivot값보다 큰 값이 존재하는 경우
            #right값 중 pivot값보다 작은 값이 존재하는 경우
        #이므로 정상화를 위해 left값과 right값을 바꿔주면서 pivot 기준 왼쪽을 작은 수(left) , 오른쪽을 큰 수(right)로 둔다
        #함수의 재귀적 사용을 이용해 이를 반복
    
    if left > right:
        arr[pivot] , arr[right] = arr[right] , arr[pivot]
    else:
        arr[left] , arr[right] = arr[right] , arr[left]
        
    #재귀함수로 반복
    quick_sort(arr , start , right - 1)
    quick_sort(arr , right + 1 , end)

quick_sort(s , 0 , len(s) - 1)
r_s = s.reverse()
print(*s , sep = "")
