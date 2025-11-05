<div class="QAr8X9J3sN0AF6BH81TR  "><div class="_EsoNPF1Umw4viumtvJo"><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Difficulty: </span><span class="
  lpgeq2Wy2xK4O6sndPaQ
  Nd5G7rtLO1KG0maPxnCr"></span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Category: </span><span class="">Arrays</span></div><div class="UCP5Ly00mu8fl8BeuICc"><span class="y2JfNakaM6bz5MZVLT19">Successful Submissions: </span><span class="">85,820+</span></div></div><h2 class="qgxFKjWJIr8pQAgoLptA">Tournament Winner<div class="Oyt6mvv2PxDumKNX6bWo"><div class="P5gDRvWGpamqLzCTJVcb b9f9LP_96AEE67VfVKUy Gyfvtdoqmsja5KLgBekA CmcZ3tJdUEckyF9uvS_4 LHg7Wsl16tm5qnuyGrbw"></div></div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 16 16" class="dUgPIfYX8fdaAgzNuMBD"><path d="M12.821 16a.5.5 0 0 1-.203-.043L8 13.901l-4.618 2.056a.501.501 0 0 1-.694-.556L3.707 10.3.147 6.732a.502.502 0 0 1 .255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 0 1 .255.845l-3.56 3.567L13.31 15.4a.5.5 0 0 1-.49.6M8 12.853q.105 0 .203.043l3.938 1.754-.882-4.417a.5.5 0 0 1 .137-.452l3.09-3.094-4.441-.89a.5.5 0 0 1-.36-.288L8 1.708l-1.686 3.8a.5.5 0 0 1-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.5.5 0 0 1 8 12.852"></path></svg></h2><div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
<p>
  There's an algorithms tournament taking place in which teams of programmers
  compete against each other to solve algorithmic problems as fast as possible.
  Teams compete in a round robin, where each team faces off against all other
  teams. Only two teams compete against each other at a time, and for each
  competition, one team is designated the home team, while the other team is the
  away team. In each competition there's always one winner and one loser; there
  are no ties. A team receives 3 points if it wins and 0 points if it loses. The
  winner of the tournament is the team that receives the most amount of points.
</p>
<p>
  Given an array of pairs representing the teams that have competed against each
  other and an array containing the results of each competition, write a
  function that returns the winner of the tournament. The input arrays are named
  <span>competitions</span> and <span>results</span>, respectively. The
  <span>competitions</span> array has elements in the form of
  <span>[homeTeam, awayTeam]</span>, where each team is a string of at most 30
  characters representing the name of the team. The <span>results</span> array
  contains information about the winner of each corresponding competition in the
  <span>competitions</span> array. Specifically, <span>results[i]</span> denotes
  the winner of <span>competitions[i]</span>, where a <span>1</span> in the
  <span>results</span> array means that the home team in the corresponding
  competition won and a <span>0</span> means that the away team won.
</p>
<p>
  It's guaranteed that exactly one team will win the tournament and that each
  team will compete against all other teams exactly once. It's also guaranteed
  that the tournament will always have at least two teams.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">competitions</span> = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"],
]
<span class="CodeEditor-promptParameter">results</span> = [0, 0, 1]
</pre>
<h3>Sample Output</h3>
<pre>"Python"
<span class="CodeEditor-promptComment">// C# beats HTML, Python Beats C#, and Python Beats HTML.</span>
<span class="CodeEditor-promptComment">// HTML - 0 points </span>
<span class="CodeEditor-promptComment">// C# -  3 points</span>
<span class="CodeEditor-promptComment">// Python -  6 points</span>
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
Don't overcomplicate this problem. How would you solve it by hand? Consider
that approach, and try to translate it into code.
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
  Use a hash table to store the total points collected by each team, with the
  team names as keys in the hash table. Once you know how many points each team
  has, how can you determine which one is the winner?
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
  Loop through all of the competitions, and update the hash table at every
  iteration. For each competition, consider the name of the winning team; if the
  name already exists in the hash table, update that entry by adding 3 points to
  it. If the team name doesn't exist in the hash table, add a new entry in the
  hash table with the key as the team name and the value as 3 (since the team
  won its first competition). While looping through all of the competitions,
  keep track of the team with the highest score, and at the end of the
  algorithm, return the team with the highest score.
</p></div></div></div></div></div><div class="myLD3dbsUEHVeT501yQu"><div class="
      UwEgPoVocSOtguoEl8V5
      uKiFevsWmlv6aqooP6lv
      OqGxaX3K8ax3rIqe5BG1
      " tabindex="0"><div class="
      AaBP4kQ3PoHQAHpXLnCw
      undefined
      EXdCvTD_bubcEGmmHOFu

      K3dWDFQGP_a0IFhQNh27"><div class="SWRHDNoHCyzwc5_0QpIs">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" fill="currentColor" viewBox="0 0 292.362 292.362" class="Yh3GkGzlqofcZDy3cfLd "><path d="M286.935 69.377q-5.422-5.425-12.848-5.424H18.274q-7.426 0-12.85 5.424Q-.001 74.807 0 82.228t5.424 12.847l127.907 127.907q5.43 5.427 12.85 5.428c7.42.001 9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847s-1.814-9.229-5.427-12.85"></path></svg></div><div class="AsADlFrYsn0x1vV8YTzR " style="transition: height 400ms linear; height: 0px;"><div class="BsoGH0ZdT0rMHLbs_rPt"><div class="KZfyWRzvLRN6vbStazJK">O(n) time | O(k) space - where n is the number of competitions and k is the number of teams</div></div></div></div></div></div></div>

## Sample Input

```text
competitions = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"],
]
results = [0, 0, 1]
```

## Test Cases

```json
{
  "competitions": [
    ["HTML", "C#"],
    ["C#", "Python"],
    ["Python", "HTML"]
  ],
  "results": [0, 0, 1]
}
{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"]
  ],
  "results": [0, 1, 1]
}
{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"]
  ],
  "results": [0, 1, 1, 1, 0, 1]
}
{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"],
    ["SQL", "C#"],
    ["HTML", "SQL"],
    ["SQL", "Python"],
    ["SQL", "Java"]
  ],
  "results": [0, 1, 1, 1, 0, 1, 0, 1, 1, 0]
}
{
  "competitions": [
    ["Bulls", "Eagles"]
  ],
  "results": [1]
}
{
  "competitions": [
    ["Bulls", "Eagles"],
    ["Bulls", "Bears"],
    ["Bears", "Eagles"]
  ],
  "results": [0, 0, 0]
}
{
  "competitions": [
    ["Bulls", "Eagles"],
    ["Bulls", "Bears"],
    ["Bulls", "Monkeys"],
    ["Eagles", "Bears"],
    ["Eagles", "Monkeys"],
    ["Bears", "Monkeys"]
  ],
  "results": [1, 1, 1, 1, 1, 1]
}
{
  "competitions": [
    ["AlgoMasters", "FrontPage Freebirds"],
    ["Runtime Terror", "Static Startup"],
    ["WeC#", "Hypertext Assassins"],
    ["AlgoMasters", "WeC#"],
    ["Static Startup", "Hypertext Assassins"],
    ["Runtime Terror", "FrontPage Freebirds"],
    ["AlgoMasters", "Runtime Terror"],
    ["Hypertext Assassins", "FrontPage Freebirds"],
    ["Static Startup", "WeC#"],
    ["AlgoMasters", "Static Startup"],
    ["FrontPage Freebirds", "WeC#"],
    ["Hypertext Assassins", "Runtime Terror"],
    ["AlgoMasters", "Hypertext Assassins"],
    ["WeC#", "Runtime Terror"],
    ["FrontPage Freebirds", "Static Startup"]
  ],
  "results": [1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0]
}
{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"],
    ["SQL", "C#"],
    ["HTML", "SQL"],
    ["SQL", "Python"],
    ["SQL", "Java"]
  ],
  "results": [0, 0, 0, 0, 0, 0, 1, 0, 1, 1]
}
{
  "competitions": [
    ["A", "B"]
  ],
  "results": [0]
}
```
