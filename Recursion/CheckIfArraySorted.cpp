// Check if the array is sorted or not using recursion
bool is_sorted(int a[], int size){
  // Base case
  if(size == 0 || size == 1) return true;
  // Small Calculation
  if(a[0] > a[1]) return false;
  // Recursion
  return is_sorted(a+1, size-1);
}
