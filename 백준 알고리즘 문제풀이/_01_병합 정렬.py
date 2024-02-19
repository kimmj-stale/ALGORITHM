#시간 복잡도 O(n^2)짜리 풀이면 당연히 틀림  (ex = 버블 정렬 , 선택 정렬 , 삽입 정렬)
# 시간 복잡도 O(NlogN)짜리 풀이가 가장 빠름 (ex = 병합 정렬 , 힙 정렬)

#병합정렬 예시
# left_array 와 right_array로 나눠서 두 수의 요소를 각각 비교
def merge_sort(arr):
    if len(arr) > 1:
        middle = len(arr) // 2
        left_arr = arr[:middle]
        right_arr = arr[middle:]
        #함수의 재귀적 사용
        merge_sort(left_arr)
        merge_sort(right_arr)

    i , j , k = 0
    
    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            arr[k] = left_arr[i]            
            i += 1
        else:
            arr[k] = right_arr[j]
            j += 1
        k += 1
    
    while len(right_arr) > i:
        arr[k] = left_arr[i]
        i += 1
        k += 1

    while len(right_arr) > i:
        arr[k] = right_arr[j]
        j += 1
        k += 1

    return arr
