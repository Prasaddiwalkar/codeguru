# Design Slack

Design the core Slack messaging functionality: one‑on‑one and group channel communication inside an organization, unread/mention indicators, and cross‑device read state sync.

Many systems design questions are intentionally left vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.
Clarifying questions let you narrow scope and focus on core requirements.

## Clarifying Questions To Ask

### Question 1

Q: Slack lets you communicate via one‑on‑one, private, and public channels; plus create/delete channels, change settings, invite people, etc. What exactly are we designing?

A: The core messaging functionality: communicating in one‑on‑one and group channels within an organization. Ignore channel settings and other auxiliary features.

### Question 2

Q: Should I handle private channels?

A: Treat access control simply as the list of users in a channel; ignore the separate concept of private channels for this design.

### Question 3

Q: Users see messages for channels they're in, plus indicators for unread messages and counts of unread mentions. Should we support this? Also, should read state synchronize instantly across devices?

A: Yes. Implement unread channel indication and mention counts, and ensure cross‑device synchronization: if one device marks a channel read, other active devices should update immediately.

### Question 4

Q: Are we designing the various client apps (web, desktop, mobile) or only backend systems?

A: Focus solely on backend systems; treat clients abstractly.

### Question 5

Q: Slack messages can have emojis, pins, saves, code snippets, rich formatting, etc. Do we support all of these?

A: No. Treat messages as plain text. Your design should be extensible, but do not implement advanced message features here.

### Question 6

Q: Scale: total users, largest organization size, largest channel size?

A: Assume ~20 million total users. Largest organization: ~50,000 users. Largest channel may also reach ~50,000 (e.g., #general).

### Question 7

Q: Latency and availability priorities?

A: Prioritize low latency for chat interactions. High availability is important, but for this exercise focus on latency and core functionality rather than deep availability optimizations.

### Question 8

Q: Global audience or single region?

A: Assume a single region deployment for now; do not focus on multi‑region complexity.
