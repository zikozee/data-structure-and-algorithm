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
- select the smallest element in the array and move it to the beginning of the array by swapping with the front element
- we do this repeatedly for each element

- Time Complexity:  0(N^2)
- Space Complexity: O(1) 
- WHEN TO USE
- When we have insufficient memory (since no additional memory is required when sorting)
- Easy to implement

- WHEN TO AVOID
- Average time complexity is a concern


## Insertion Sort
- Divide the given array into two part
- Take the first element from the unsorted array and find its correct position in sorted array
- repeat until unsorted array is empty
- start from 2nd index in the loop (assume first is sorted)
- if next element is lesser than previous swap
- while on that element keep swapping until the element find its place

- Time Complexity:  0(N^2)
- Space Complexity: O(1)
### WHEN TO USE
- When we have insufficient memory (since no additional memory is required when sorting)
- Easy to implement
- when we have continuous inflow of numbers and we want to keep them sorted

- WHEN TO AVOID
- Average time complexity is a concern


## Bucket Sort
- create buckets and distributes elements of array into buckets
- sort buckets individually
- Merge buckets after sorting

- number of buckets = round(Sqrt(number of elements))
- appropriate bucket = ceil(value * number of buckets/maxValue)

- Time Complexity:  0(N Nog N)
- Space Complexity: O(N)
### WHEN TO USE
- When input uniformly distributed over range
- i.e when difference between numbers or elements are minimal
- e.g 5, 9, 3, 1, 2, 8, 4, 7, 6
- NOT ALLOWED: 1,2,4,94,93,95

- WHEN TO AVOID
- When space is a concern