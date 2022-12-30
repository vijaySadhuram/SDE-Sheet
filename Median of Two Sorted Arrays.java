class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        // determining length of second array
        int b1 = nums2.length;
        int c[]=new int[a1+b1];
        int i=0,j=0,k=0;
        while(i<a1&&j<b1){
            if(nums1[i]<nums2[j]){
                c[k]=nums1[i];
                k++;
                i++;
            }
            if(nums1[i]>nums2[j]){
                c[k]=nums2[j];
                k++;j++;
            }
        }
        
         while(i<a1){
             c[k++]=nums1[i];
             i++;
         }
        while(j<b1){
             c[k]=nums2[j];
            k++;
            j++;
         }
        int low=0,mid=0;
        int end=c.length-1;
        if(c.length%2==1)
        {
          mid=low+(end-low/2);
            return c[mid]-1;
        }
  
  return (c[mid]+c[mid-1]/2);
        
    }
 
}