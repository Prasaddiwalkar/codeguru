<div class="QAr8X9J3sN0AF6BH81TR  "><div class="_EsoNPF1Umw4viumtvJo"><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Difficulty: </span><span class="
  lpgeq2Wy2xK4O6sndPaQ
  Nd5G7rtLO1KG0maPxnCr"></span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Category: </span><span class="">Arrays</span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Successful Submissions: </span><span class="">187,423+</span></div></div><h2 class="qgxFKjWJIr8pQAgoLptA">Two Number Sum<div class="Oyt6mvv2PxDumKNX6bWo"><div class="P5gDRvWGpamqLzCTJVcb b9f9LP_96AEE67VfVKUy Gyfvtdoqmsja5KLgBekA CmcZ3tJdUEckyF9uvS_4 LHg7Wsl16tm5qnuyGrbw"></div></div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 16 16" class="dUgPIfYX8fdaAgzNuMBD"><path d="M12.821 16a.5.5 0 0 1-.203-.043L8 13.901l-4.618 2.056a.501.501 0 0 1-.694-.556L3.707 10.3.147 6.732a.502.502 0 0 1 .255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 0 1 .255.845l-3.56 3.567L13.31 15.4a.5.5 0 0 1-.49.6M8 12.853q.105 0 .203.043l3.938 1.754-.882-4.417a.5.5 0 0 1 .137-.452l3.09-3.094-4.441-.89a.5.5 0 0 1-.36-.288L8 1.708l-1.686 3.8a.5.5 0 0 1-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.5.5 0 0 1 8 12.852"></path></svg></h2><div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
<p>
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.
</p>
<p>
  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.
</p>
<p>
  You can assume that there will be at most one pair of numbers summing up to
  the target sum.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">array</span> = [3, 5, -4, 8, 11, 1, -1, 6]
<span class="CodeEditor-promptParameter">targetSum</span> = 10
</pre>
<h3>Sample Output</h3>
<pre>[-1, 11] <span class="CodeEditor-promptComment">// the numbers could be in reverse order</span>
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
Try using two for loops to sum all possible pairs of numbers in the input array. What are the time and space implications of this approach?
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
Realize that for every number X in the input array, you are essentially trying to find a corresponding number Y such that X + Y = targetSum. With two variables in this equation known to you, it shouldn't be hard to solve for Y.
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
Try storing every number in a hash table, solving the equation mentioned in Hint #2 for every number, and checking if the Y that you find is stored in the hash table. What are the time and space implications of this approach?
</p></div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">O(n) time | O(n) space - where n is the length of the input array</div></div></div></div></div></div></div>

---

## Sample Input

```json
{
  "array": [3, 5, -4, 8, 11, 1, -1, 6],
  "targetSum": 10
},
{
  "array": [4, 6],
  "targetSum": 10
},
{
  "array": [4, 6, 1],
  "targetSum": 5
},
{
  "array": [4, 6, 1, -3],
  "targetSum": 3
},
{
  "array": [1, 2, 3, 4, 5, 6, 7, 8, 9],
  "targetSum": 17
},
{
  "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 15],
  "targetSum": 18
},
{
  "array": [-7, -5, -3, -1, 0, 1, 3, 5, 7],
  "targetSum": -5
},
{
  "array": [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47],
  "targetSum": 163
},
{
  "array": [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47],
  "targetSum": 164
},
{
  "array": [3, 5, -4, 8, 11, 1, -1, 6],
  "targetSum": 15
},
{
  "array": [14],
  "targetSum": 15
},
{
  "array": [15],
  "targetSum": 15
}
```
