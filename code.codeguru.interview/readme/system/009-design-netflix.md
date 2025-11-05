# Design Netflix

Design the core Netflix service: users browse movies and shows, receive recommendations, and stream videos.

Many systems design questions are intentionally left vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.

We've laid out some of these questions below; their answers should guide you. Before looking at them, take a few minutes to think about what
questions you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: From a high-level point of view, Netflix is a straightforward service: users go on the platform, they're served movies and shows, and they
watch them. Are we designing this high-level system entirely, or should we focus on a subsystem like the home page?

A: We're designing the core Netflix product— the overarching system you described.

### Question 2

Q: Should we worry about auxiliary services like authentication and payments?

A: Ignore those auxiliary services; focus on the primary user flow. However, we'll collect lots of user-activity data needed for the
recommendation system. You must design how to aggregate and process activity data.

### Question 3

Q: For the recommendation system, do I need to think about the algorithm that powers it?

A: No. Don't implement or specify algorithms. Just design how user-activity data (views, pauses, ratings, etc.) is gathered, stored, and
processed for downstream recommendation jobs.

### Question 4

Q: It sounds like there are two focus points: the video-serving service and the recommendation engine. For video serving, do we want global
high availability and fast latencies?

A: Yes—fast, reliable streaming globally. This is the only component where ultra-low latency is critical.

### Question 5

Q: Is the recommendation engine a system that consumes user-activity data asynchronously in the background?

A: Yes. It ingests activity events, aggregates them, and periodically produces updated recommendation data sets.

### Question 6

Q: How many users are we building this for?

A: Assume roughly 200 million users.

### Question 7

Q: Should we worry about designing this for various clients (desktop, mobile, TVs, etc.)?

A: Treat clients abstractly; focus on the distributed-system backend, not client-specific optimizations.
