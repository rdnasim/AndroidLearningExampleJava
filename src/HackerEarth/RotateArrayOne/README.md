# Program for array rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

<p align="center">
<img src="https://github.com/rdnasim/AndroidLearningExampleJava/blob/master/src/Assets/array1.PNG">
</p>

Rotation of the above array by 2 will make array

<p align="center">
<img src="https://github.com/rdnasim/AndroidLearningExampleJava/blob/master/src/Assets/array2.PNG">
</p>

## METHOD 1 (Use temp array)

```
  Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
  1) Store d elements in a temp array
    temp[] = [1, 2]
  2) Shift rest of the arr[]
    arr[] = [3, 4, 5, 6, 7, 6, 7]
  3) Store back the d elements
    arr[] = [3, 4, 5, 6, 7, 1, 2]
```
**Time complexity** : O(n).

**Auxiliary Space** : O(d).
