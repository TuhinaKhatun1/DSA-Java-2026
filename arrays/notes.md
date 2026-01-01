### **Approach (optimal)**



* Start by taking two pointers, i and j \& initialize j to 0. The pointer j will be used to track the position of the first zero in the array that we encounter.
* Use a loop to move through the array and place the pointer j at the index of the first zero. If the array does not contain any zeros, exit early as no further steps are needed.
* Set the pointer i to j + 1. This positions i right after the first zero found by j. From here, i will start moving through the rest of the array to find non-zero elements.
* Now move non zero elements:
* Continue looping through the array with i.
* Whenever i encounters a non-zero element, swap the elements at positions i and j. This effectively moves the non-zero element to the position of the first zero.
* After the swap, update j to point to the next zero in the array. This is done by incrementing j by 1.
* Repeat the process until i has traversed the entire array. By the end of the loop, all non-zero elements will have been moved to the front of the array in their original order, and all zeros will be moved to the end.



###### **Complexity Analysis** 



**Time Complexity:** O(N), where N is size of the array, as we are traversing the array once.



**Space Complexity:** O(1) , as no use of any extra space is done to solve this problem.



