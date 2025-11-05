# Design Facebook News Feed

Design the core functionality of Facebook's News Feed: loading a user's feed, updating it in near real time with new posts, and handling status
updates once posted.

Many systems design questions are intentionally left very vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.

We've laid out some of these questions below; their answers should give you guidance on the problem. Before looking at them, take a few minutes
to think about what questions you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: Facebook News Feed consists of multiple major features: loading a user's news feed, interacting with it (posting status updates, liking
posts, etc.), and updating it in real time (adding new status updates to the top of the feed). What part are we designing exactly?

A: We're designing the core functionality of the feed itself: loading a user's news feed, updating it in real time, and processing status
updates once posted. For posting status updates, we don't focus on the external API shape or media content specifics; we focus on what happens
internally after a post is created. The emphasis is on feed generation and refreshing (how/when it's constructed and updated with new posts).

### Question 2

Q: Posts can contain pictures, videos, special update types, etc. Are we concerned with storing these media details?

A: No. For this question, treat posts as opaque entities that we store and reference, without diving into storage details or large-file
serving concerns.

### Question 3

Q: Are we designing the relevant-post curation or ranking system that decides what posts show up?

A: No. Assume access to a ranking algorithm. You supply it a list of candidate posts and it returns an ordered feed.

### Question 4

Q: Are we concerned with showing ads in the feed? Ads might rely on separate ranking logic.

A: Ads are optional. If you can cleanly incorporate them, fine, but they are not required. Assume a separate ad-serving algorithm exists.

### Question 5

Q: Are we serving a global audience, and how large is it?

A: Yes—global. Assume ~100 million daily feed loads by 100 million users, and ~1 million new status updates per day.

### Question 6

Q: How many friends does a user have on average (impacting fan-out of new posts)?

A: Roughly 500 friends on average (bell distribution: some far fewer, some far more).

### Question 7

Q: How quickly must a status update appear on friends' feeds? Can latency vary by region?

A: Local friends within the same region should see a new post within a few seconds. Remote (cross-region) friends can see it within up to a
minute.

### Question 8

Q: What availability level do we target? What about durability of posts?

A: Not strict high availability, but resilient to single-machine failures. Durability is critical: once the client receives confirmation a post
is created, it must not be lost.
