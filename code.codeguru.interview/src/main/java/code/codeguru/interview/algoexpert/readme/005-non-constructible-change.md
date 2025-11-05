<div class="QAr8X9J3sN0AF6BH81TR  "><div class="_EsoNPF1Umw4viumtvJo"><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Difficulty: </span><span class="
  lpgeq2Wy2xK4O6sndPaQ
  Nd5G7rtLO1KG0maPxnCr"></span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Category: </span><span class="">Arrays</span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Successful Submissions: </span><span class="">70,296+</span></div></div><h2 class="qgxFKjWJIr8pQAgoLptA">Non-Constructible Change<div class="Oyt6mvv2PxDumKNX6bWo"><div class="P5gDRvWGpamqLzCTJVcb b9f9LP_96AEE67VfVKUy Gyfvtdoqmsja5KLgBekA CmcZ3tJdUEckyF9uvS_4 LHg7Wsl16tm5qnuyGrbw"></div></div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 16 16" class="dUgPIfYX8fdaAgzNuMBD"><path d="M12.821 16a.5.5 0 0 1-.203-.043L8 13.901l-4.618 2.056a.501.501 0 0 1-.694-.556L3.707 10.3.147 6.732a.502.502 0 0 1 .255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 0 1 .255.845l-3.56 3.567L13.31 15.4a.5.5 0 0 1-.49.6M8 12.853q.105 0 .203.043l3.938 1.754-.882-4.417a.5.5 0 0 1 .137-.452l3.09-3.094-4.441-.89a.5.5 0 0 1-.36-.288L8 1.708l-1.686 3.8a.5.5 0 0 1-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.5.5 0 0 1 8 12.852"></path></svg></h2><div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
<p>
  Given an array of positive integers representing the values of coins in your
  possession, write a function that returns the minimum amount of change (the
  minimum sum of money) that you <b>cannot</b> create. The given coins can have
  any positive integer value and aren't necessarily unique (i.e., you can have
  multiple coins of the same value).
</p>
<p>
  For example, if you're given <span>coins = [1, 2, 5]</span>, the minimum
  amount of change that you can't create is <span>4</span>. If you're given no
  coins, the minimum amount of change that you can't create is <span>1</span>.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">coins</span> = [5, 7, 1, 1, 2, 3, 22]
</pre>
<h3>Sample Output</h3>
<pre>20
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
One approach to solve this problem is to attempt to create every single amount
of change, starting at 1 and going up until you eventually can't create an
amount. While this approach works, there <i>is</i> a better one.
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
  Start by sorting the input array. Since you're trying to find the
  <b>minimum</b> amount of change that you can't create, it makes sense to
  consider the smallest coins first.
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
  To understand the trick to this problem, consider the following example:
  <span>coins = [1, 2, 4]</span>. With this set of coins, we can create
  <span>1, 2, 3, 4, 5, 6, 7</span> cents worth of change. Now, if we were to add
  a coin of value <span>9</span> to this set, we <b>would not</b> be able to
  create <span>8</span> cents. However, if we were to add a coin of value
  <span>7</span>, we <b>would</b> be able to create <span>8</span> cents, and we
  would also be able to create all values of change from <span>1</span> to
  <span>15</span>. Why is this the case?
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
  Create a variable to store the amount of change that you can currently create
  up to. Sort all of your coins, and loop through them in ascending order. At
  every iteration, compare the current coin to the amount of change that you can
  currently create up to. Here are the two scenarios that you'll encounter:
</p>
<ul>
  <li>
    The coin value is <b>greater</b> than the amount of change that you can
    currently create plus 1.
  </li>
  <li>
    The coin value is <b>smaller than or equal to</b> the amount of change that
    you can currently create plus 1.
  </li>
</ul>
<p>
  In the first scenario, you simply return the current amount of change that you
  can create plus 1, because you can't create that amount of change. In the
  second scenario, you add the value of the coin to the amount of change that
  you can currently create up to, and you continue iterating through the coins.
</p>
<p>
  The reason for this is that, if you're in the second scenario, you can create
  all of the values of change that you can currently create plus the value of
  the coin that you just considered. If you're given coins <span>[1, 2]</span>,
  then you can make <span>1, 2, 3</span> cents. So if you add a coin of value
  <span>4</span>, then you can make <span>4 + 1</span> cents,
  <span>4 + 2</span> cents, and <span>4 + 3</span> cents. Thus, you can make up
  to <span>7</span> cents.
</p></div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">O(nlogn) time | O(1) space - where n is the number of coins</div></div></div></div></div></div></div>

## Sample Input

```text
coins = [5, 7, 1, 1, 2, 3, 22]
```

## Sample Output

```text
20
```

```text
Test Case 1
{
  "coins": [5, 7, 1, 1, 2, 3, 22]
}
Test Case 2
{
  "coins": [1, 1, 1, 1, 1]
}
Test Case 3
{
  "coins": [1, 5, 1, 1, 1, 10, 15, 20, 100]
}
Test Case 4
{
  "coins": [6, 4, 5, 1, 1, 8, 9]
}
Test Case 5
{
  "coins": []
}
Test Case 6
{
  "coins": [87]
}
Test Case 7
{
  "coins": [5, 6, 1, 1, 2, 3, 4, 9]
}
Test Case 8
{
  "coins": [5, 6, 1, 1, 2, 3, 43]
}
Test Case 9
{
  "coins": [1, 1]
}
Test Case 10
{
  "coins": [2]
}
Test Case 11
{
  "coins": [1]
}
Test Case 12
{
  "coins": [109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4]
}
Test Case 13
{
  "coins": [1, 2, 3, 4, 5, 6, 7]
}
```
