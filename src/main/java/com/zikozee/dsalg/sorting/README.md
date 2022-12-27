#Sorting Terminology
====================

##Increasing Order
- If successive element is greater than the previous one
- - Example: 1, 3, 5, 7, 9, 11

##Decreasing Order
- If successive element is lesser than the previous one
- - Example:  11, 9, 7, 5, 3, 1

##Non Increasing Order  (Duplicate exists)
- If successive element is less than or equal to its previous element in the sequence
- - Example:  11, 9, 7, 5, 5, 3, 1

##Non Decreasing Order (Duplicate exists)
- If successive element is greater than or equal to its previous element in the sequence
- - Example:  1, 3, 5, 7, 7, 9, 11


## Sorting Algorithms
- Bubble sort
- Selection sort
- Insertion sort
- Bucket sort
- Merge sort
- Quick sort
- Heap sort

Which one to select
- Stability
- Space efficient
- Time efficient



## Bubble Sort   (Sinking sort)
- We repeatedly compare each pair of adjacent items/elements and swap them if they are in the wrong order
- we repeat the process until all elements are sorted
- trick, the second for-loop ensures the last element it iterates over is in its sorted position >>> left to right
- Time Complexity:  0(N^2)
- Space Complexity: O(1)   ///O(2)

- WHEN TO USE
- When the input is almost sorted
- Space is a concern
- Easy to implement

- WHEN TO AVOID
- Average time complexity is a concern




## Selection Sort   (Sinking sort)
- we repeatedly find the minimum element and move it to the sorted part of array to make unsorted part sorted
- 
- Time Complexity:  0(N^2)
- Space Complexity: O(1) 
- WHEN TO USE
- When we have insufficient memory (since no additional memory is required when sorting)
- Easy to implement

- WHEN TO AVOID
- Average time complexity is a concern