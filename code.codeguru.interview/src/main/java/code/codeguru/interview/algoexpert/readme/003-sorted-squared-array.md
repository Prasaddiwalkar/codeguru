<div class="QAr8X9J3sN0AF6BH81TR  "><div class="_EsoNPF1Umw4viumtvJo"><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Difficulty: </span><span class="
  lpgeq2Wy2xK4O6sndPaQ
  Nd5G7rtLO1KG0maPxnCr"></span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Category: </span><span class="">Arrays</span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Successful Submissions: </span><span class="">103,584+</span></div></div><h2 class="qgxFKjWJIr8pQAgoLptA">Sorted Squared Array<div class="Oyt6mvv2PxDumKNX6bWo"><div class="P5gDRvWGpamqLzCTJVcb b9f9LP_96AEE67VfVKUy Gyfvtdoqmsja5KLgBekA CmcZ3tJdUEckyF9uvS_4 LHg7Wsl16tm5qnuyGrbw"></div></div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 16 16" class="dUgPIfYX8fdaAgzNuMBD"><path d="M12.821 16a.5.5 0 0 1-.203-.043L8 13.901l-4.618 2.056a.501.501 0 0 1-.694-.556L3.707 10.3.147 6.732a.502.502 0 0 1 .255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 0 1 .255.845l-3.56 3.567L13.31 15.4a.5.5 0 0 1-.49.6M8 12.853q.105 0 .203.043l3.938 1.754-.882-4.417a.5.5 0 0 1 .137-.452l3.09-3.094-4.441-.89a.5.5 0 0 1-.36-.288L8 1.708l-1.686 3.8a.5.5 0 0 1-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.5.5 0 0 1 8 12.852"></path></svg></h2><div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
<p>
  Write a function that takes in a non-empty array of integers that are sorted
  in ascending order and returns a new array of the same length with the squares
  of the original integers also sorted in ascending order.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">array</span> = [1, 2, 3, 5, 6, 8, 9]
</pre>
<h3>Sample Output</h3>
<pre>[1, 4, 9, 25, 36, 64, 81]
</pre>
</div></div><div class="vSTYnx_QuNJCCU34s_a1"><h3 class="Uw_kK52Jk4vEa6_INFfQ">Hints</h3><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Hint 1</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK"><p>
While the integers in the input array are sorted in increasing order, their
squares won't necessarily be as well, because of the possible presence of
negative numbers.
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
  Traverse the array value by value, square each value, and insert the squares
  into an output array. Then, sort the output array before returning it. Is this
  the optimal solution?
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
  To reduce the time complexity of the algorithm mentioned in Hint #2, you need
  to avoid sorting the ouput array. To do this, as you square the values of the
  input array, try to directly insert them into their correct position in the
  output array.
</p>
</div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Hint 4</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">
<p>
  Use two pointers to keep track of the smallest and largest values in the input
  array. Compare the absolute values of these smallest and largest values,
  square the larger absolute value, and place the square at the end of the
  output array, filling it up from right to left. Move the pointers accordingly,
  and repeat this process until the output array is filled.
</p></div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">O(n) time | O(n) space - where n is the length of the input array</div></div></div></div></div></div></div>

## Sample Input

```text
array = [-4, -1, 0, 3, 10]
```

## Sample Output

```text
[0, 1, 9, 16, 100]
```

## Test Cases

```json
[
  { "array": [1, 2, 3, 5, 6, 8, 9] },
  { "array": [1] },
  { "array": [1, 2] },
  { "array": [1, 2, 3, 4, 5] },
  { "array": [0] },
  { "array": [10] },
  { "array": [-1] },
  { "array": [-2, -1] },
  { "array": [-5, -4, -3, -2, -1] },
  { "array": [-10] },
  { "array": [-10, -5, 0, 5, 10] },
  { "array": [-7, -3, 1, 9, 22, 30] },
  { "array": [-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20] },
  { "array": [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] },
  { "array": [-1, -1, 2, 3, 3, 3, 4] },
  { "array": [-3, -2, -1] },
  { "array": [-3, -2, -1] }
]
```
