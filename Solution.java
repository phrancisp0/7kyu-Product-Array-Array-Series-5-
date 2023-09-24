public class Solution {

    public static long[] productArray(int[] n) {  
      int en = n.length;
      long prod = 1, ary[] = new long[en];
      for (int a : n) prod *= a;      
      for (int i = 0; i < en; i++) ary[i] = prod / n[i];
      return ary;
    }
}
/*
Introduction and Warm-up (Highly recommended)
Playing With Lists/Arrays Series
Task
Given an array/list [] of integers , Construct a product array Of same size Such That prod[i] is equal to The Product of all the elements of Arr[] except Arr[i].

Notes
Array/list size is at least 2 .

Array/list's numbers Will be only Positives

Repetition of numbers in the array/list could occur.

Input >> Output Examples
productArray ({12,20}) ==>  return {20,12}
Explanation:
The first element in prod [] array 20 is the product of all array's elements except the first element

The second element 12 is the product of all array's elements except the second element .
*/