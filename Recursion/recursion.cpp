/*
main -> fact(4) -> fact(3) -> fact(2) -> fact(1) -> fact(0)
if(n == 0) return 1; 

Segmentation Fault: Agr base case nhi lagaoge, to segmentation fault aaega because stack full ho jaaegi! Memory full ho jaaegi na

Principal of Recursion: PMI
F(n) is true.
1) Base: Prove F(0) or F(1) is true
2) Induction Hypothese: Assume** that F(k) is true
3) Induction Step: using 2) prove that F(k+1) is true

Let's prof sum n = n(n+1)/2

Base Case:
F(0) = 0 // LHS
n(n+1)/2 = 0 // RHS

LHS == RHS
sum K = K(K+1)/2
sum K+1 = (K+1)(K+2)/2
K+1 + sum K = (K+1)2/2 + K(K+1)/2;
= (K+1/2)(K+2) Hence Prooved


*/
