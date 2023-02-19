a=input()
b=input()
n=len(a)
m=len(b)
dp=[]
# https://www.youtube.com/watch?v=Ti9CByuukE8 solution video

for i in range(n+1):
    dp.append([0]*(m+1))
for i in range(n+1):
    for j in range(m+1):
        dp[0][j]=j     # if we want to convert a empty string into other string we need len(other string) operation
    dp[i][0]=i       ## if we want to convert a empty string into other string we need len(other string) operation

for i in range(1,n+1):
    for j in range(1,m+1):
        if a[i-1]==b[j-1]:        #if both last character are equal then we need 0 operation so simply
            dp[i][j]=dp[i-1][j-1]  # ns1=abc s2=adc so number of operation will be dp[i-1][j-1](ab->ad)

        else:
            dp[i][j]=min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1])+1     # else we will find minimum of delete insert or add
                        #insert      delete      replace

# print(dp)
print(dp[n][m])
a="adcne"
b="abcmno"
#` means empty string 
  #   `   a  d  c  n  e
  #`  0, 1, 2, 3, 4, 5
  #a  1, 0, 1, 2, 3, 4
  #b  2, 1, 0, 1, 2, 3
  #c  3, 2, 1, 0, 1, 2
  #m  4, 3, 2, 1, 1, 2 
  #n  5, 4, 3, 2, 1, 2
  #o  6, 5, 4, 3, 2, 2
