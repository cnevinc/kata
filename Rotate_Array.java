/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.


*/


/*
[1,2,3,4,5,6,7] is rotated to 
[5,6,7,1,2,3,4]

1234 k=2
4321
3412


*/

class Solution {
    // Easy impl. need O(n)
    public void rotate(int[] nums, int k) {
        if (k<0) return;
        
        if (nums == null) return;
        int n = nums.length;
        // for  nums=[1,2] , j=3
        if (k>n) {
         k = k%n;   
        }
        int[] temp = new int[n];
        System.arraycopy( nums, n-k, temp, 0, k );
        System.arraycopy( nums, 0, temp, k, n-k );
        System.arraycopy( temp, 0, nums, 0, n );

        
    }
}

