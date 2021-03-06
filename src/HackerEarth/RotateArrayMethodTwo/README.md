# Program for array rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

<p align="center">
<img src="https://github.com/rdnasim/AndroidLearningExampleJava/blob/master/src/Assets/array1.PNG">
</p>

Rotation of the above array by 2 will make array

<p align="center">
<img src="https://github.com/rdnasim/AndroidLearningExampleJava/blob/master/src/Assets/array2.PNG">
</p>

## METHOD 2 (Rotate one by one)

```
  leftRotate(arr[], d, n)
  start
    For i = 0 to i < d
      Left rotate all elements of arr[] by one
  end
```
To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]

Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
Rotate arr[] by one 2 times
We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.

Implementation:

# Java

[****CODE HERE****](https://github.com/rdnasim/AndroidLearningExampleJava/blob/master/src/HackerEarth/RotateArrayMethodTwo/RotateArray.java)

## Output:
```
3 4 5 6 7 1 2 
```
**Time complexity**: O(n*d)

**Auxiliary Space**: O(1)
