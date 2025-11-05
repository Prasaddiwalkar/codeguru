# Design Tinder

Design core Tinder functionality: user profiles, swiping (left, right), Super Like, Undo (last left swipe only), and real-time match notification when a mutual right swipe occurs.

Many systems design questions are intentionally left vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.

We've laid out some of these questions below; their answers should guide you. Before looking at them, take a few minutes to think about what
questions you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: Users sign up and create a profile (name, age, job, bio, sexual preference, etc.), then start swiping on nearby users shown in a stacked
deck of potential matches. If two users swipe right on each other, they match and can communicate. Are we designing all of this?

A: Yes, but you don't need to design messaging or any post‑match features. Include Super Like and Undo. Super Like places a user at the top of
another user's deck and signals extra interest. Undo lets a user unswipe the last user they swiped left on (only the immediately previous left
swipe—no multi‑level undo).

### Question 2

Q: Can a user undo a match?

A: For this design, allow undo only for a left swipe. If a user swipes left then right, they can no longer undo the earlier left swipe.

### Question 3

Q: Are there daily limits on right swipes, Super Likes, Undos, or on the number of potential matches (e.g., 100 or 200 per day)?

A: No caps for this design. Users have an effectively infinite deck within their distance parameters and can swipe right, Super Like, and undo
left swipes indefinitely. If they exhaust all current potential matches, new ones will appear as users join.

### Question 4

Q: Assumptions about the deck: endless ordered potential matches within distance, possibly by a matchability score. Deck should show users who
haven't swiped left on the main user or who have liked them; super‑likers should appear at the top. Reasonable?

A: Reasonable, but you don't need to design deck generation. Assume a matching algorithm produces ordered decks factoring matchability,
preferences, distance, etc. You rely on it; it filters out left‑swipers as needed.

### Question 5

Q: Are we designing match notifications?

A: Handle notifying a user immediately if a match occurs while they are actively swiping. Ignore notifications when the user is idle or offline.

### Question 6

Q: Scale: how many users and where are they located?

A: Assume roughly 50 million users globally with concentrations in major urban areas.

### Question 7

Q: Latency and reliability: should swipes feel instant? Is some loading time acceptable when opening the app or after many swipes?

A: Yes—instant swipe feedback is desirable; small loading delays (e.g., after opening or after hundreds of swipes) are acceptable. For
reliability, you can assume a highly available SQL setup; detailed availability mechanics are out of scope here.
