
max_weight=3

def efficientJanitor(weight):
    
    weight_len=len(weight)
    weight_sorted=sorted(weight)
    weight_marker=[False for i in range(weight_len)]
    
    count_trip=0
    for i in range(weight_len-1, -1, -1):
        
        if weight_marker[i]:
            continue
            
        w=weight_sorted[i]
        weight_marker[i]=True
        
        for j in range(i-1,-1,-1):
            if w+weight_sorted[j]<=max_weight and not weight_marker[j]:
                w=w+weight_sorted[j]
                weight_marker[j]=True
                
        count_trip=count_trip+1
    
    return count_trip
    
# cook your dish here


n=int(input())
weight = []

for _ in range(n):
    weight.append(float(input()))

print(efficientJanitor(weight))

