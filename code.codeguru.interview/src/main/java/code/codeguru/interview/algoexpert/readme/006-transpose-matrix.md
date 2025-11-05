<div class="QAr8X9J3sN0AF6BH81TR  "><div class="_EsoNPF1Umw4viumtvJo"><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Difficulty: </span><span class="
  lpgeq2Wy2xK4O6sndPaQ
  Nd5G7rtLO1KG0maPxnCr"></span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Category: </span><span class="">Arrays</span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Successful Submissions: </span><span class="">18,402+</span></div></div><h2 class="qgxFKjWJIr8pQAgoLptA">Transpose Matrix<div class="Oyt6mvv2PxDumKNX6bWo"><div class="P5gDRvWGpamqLzCTJVcb b9f9LP_96AEE67VfVKUy Gyfvtdoqmsja5KLgBekA CmcZ3tJdUEckyF9uvS_4 LHg7Wsl16tm5qnuyGrbw"></div></div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 16 16" class="dUgPIfYX8fdaAgzNuMBD"><path d="M12.821 16a.5.5 0 0 1-.203-.043L8 13.901l-4.618 2.056a.501.501 0 0 1-.694-.556L3.707 10.3.147 6.732a.502.502 0 0 1 .255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 0 1 .255.845l-3.56 3.567L13.31 15.4a.5.5 0 0 1-.49.6M8 12.853q.105 0 .203.043l3.938 1.754-.882-4.417a.5.5 0 0 1 .137-.452l3.09-3.094-4.441-.89a.5.5 0 0 1-.36-.288L8 1.708l-1.686 3.8a.5.5 0 0 1-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.5.5 0 0 1 8 12.852"></path></svg></h2><div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
  <p>
    You're given a 2D array of integers <span>matrix</span>. Write a function
    that returns the transpose of the matrix.
  </p>

  <p>
    The transpose of a matrix is a flipped version of the original matrix across
    its main diagonal (which runs from top-left to bottom-right); it switches
    the row and column indices of the original matrix.
  </p>

  <p>
    You can assume the input matrix always has at least 1 value; however its
    width and height are not necessarily the same.
  </p>

<h3>Sample Input #1</h3>
  <pre><span class="CodeEditor-promptParameter">matrix</span> = [
  [1, 2],
]</pre>
<h3>Sample Output # 1</h3>
  <pre>[
  [1],
  [2]
]</pre>

<h3>Sample Input #2</h3>
  <pre><span class="CodeEditor-promptParameter">matrix</span> = [
  [1, 2],
  [3, 4],
  [5, 6]
]</pre>
<h3>Sample Output #2</h3>
  <pre>[
  [1, 3, 5],
  [2, 4, 6]
]</pre>

<h3>Sample Input #3</h3>
  <pre><span class="CodeEditor-promptParameter">matrix</span> = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]</pre>
<h3>Sample Output #3</h3>
  <pre>[
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9]
]</pre>
</div></div><div class="vSTYnx_QuNJCCU34s_a1"><h3 class="Uw_kK52Jk4vEa6_INFfQ">Hints</h3><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Hint 1</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK"><p>
The row and column indices of each entry in the matrix should be flipped.
For example, the value at <span>matrix[1][2]</span> will be at
<span>matrix[2][1]</span> in the transpose of the matrix.
</p>
</div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Hint 2</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">
<p>
  Each column in the matrix should be become a row in the transpose of the
  matrix. Each row in the matrix should become a column in the transpose
  of the matrix.
</p>
</div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Hint 3</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">
<p>
  Try iterating one column at a time, and with each column, create a row of the
  values to add to the transpose of the matrix.
</p></div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">O(w * h) time | O(w * h) space - where w is the width of the matrix and h is the height</div></div></div></div></div></div></div>

## Sample Input 1

```text
matrix = [
  [1, 2],
]
```

## Sample Output 1

```text
[
  [1],
  [2]
]
```

## Sample Input 2

```text
matrix = [
  [1, 2],
  [3, 4],
  [5, 6]
]
```

## Sample Output 2

```text
[
  [1, 3, 5],
  [2, 4, 6]
]
```

## Sample Input 3

```text
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

## Sample Output 3

```text
[
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9]
]
```

```text
Test Case 1
{
  "matrix": [
    [1]
  ]
}
Test Case 2
{
  "matrix": [
    [1],
    [-1]
  ]
}
Test Case 3
{
  "matrix": [
    [1, 2, 3]
  ]
}
Test Case 4
{
  "matrix": [
    [1],
    [2],
    [3]
  ]
}
Test Case 5
{
  "matrix": [
    [1, 2, 3],
    [4, 5, 6]
  ]
}
Test Case 6
{
  "matrix": [
    [0, 0, 0],
    [1, 1, 1]
  ]
}
Test Case 7
{
  "matrix": [
    [0, 1],
    [0, 1],
    [0, 1]
  ]
}
Test Case 8
{
  "matrix": [
    [0, 0, 0],
    [0, 0, 0]
  ]
}
Test Case 9
{
  "matrix": [
    [1, 4],
    [2, 5],
    [3, 6]
  ]
}
Test Case 10
{
  "matrix": [
    [-7, -7],
    [100, 12],
    [-33, 17]
  ]
}
Test Case 11
{
  "matrix": [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ]
}
Test Case 12
{
  "matrix": [
    [1, 4, 7],
    [2, 5, 8],
    [3, 6, 9]
  ]
}
Test Case 13
{
  "matrix": [
    [5, 6, 3, -3, 12],
    [-3, 6, 5, 2, -1],
    [0, 0, 3, 12, 3]
  ]
}
Test Case 14
{
  "matrix": [
    [0, -1, -2, -3],
    [4, 5, 6, 7],
    [2, 3, -2, -3],
    [42, 100, 30, -42]
  ]
}
Test Case 15
{
  "matrix": [
    [1234, 6935, 4205],
    [-23459, 314159, 0],
    [100, 3, 987654]
  ]
}
```
