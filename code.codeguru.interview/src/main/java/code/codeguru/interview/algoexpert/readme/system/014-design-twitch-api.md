# Design The Twitch API

Design API endpoints involved when a user is on a streamer’s channel page watching a live stream (video playback, chat, follow, subscription,
viewer counts, follower counts).

Many systems design questions are intentionally vague and phrased as `Design Foobar`. Clarifying questions narrow scope and requirements.

We list the relevant clarifying questions below (original content preserved, reformatted to Markdown).

## Clarifying Questions To Ask

### Question 1

Q: Feature list on the channel page: watch livestream (pause/unpause), see real‑time chat, send chat messages, view channel info (description,
follower count, etc.), follow/unfollow streamer, subscribe/unsubscribe (paid), see current concurrent viewer count, and see recommended
channels in a left navbar. Anything missing?

A: Ignore recommended channels for this design. Focus only on livestream‑related functionality (video, chat, follow, subscribe, counts).

### Question 2

Q: Subscriptions are monthly flat fees. Correct?

A: There can be tiers, but represent them abstractly (e.g., SubscriptionInfo) without defining structure.

### Question 3

Q: Dynamic info (follower count, concurrent viewers, chat messages, livestream) changes frequently. Should endpoints support frequent
updates?

A: Video and chat must update in real time. Concurrent viewer count can refresh periodically (≈ every 30 seconds) to avoid constant flicker.
Follower count can update on page refresh instead of real time.

### Question 4

Q: For following and subscribing, should the current user’s status (following/subscribed) be shown immediately and update instantly after
clicking buttons?

A: Yes. Show current follow/subscription state; reflect changes instantly on action. Do not attempt real‑time total follower count updates.

### Question 5

Q: Chat supports Twitch emotes, Cheermotes (Bits), custom subscriber emotes, moderation (bans). Which do we include? Handle bans?

A: Support global/basic Twitch emotes only. Ignore subscriber‑only emotes, Cheermotes, and Bits. Include banning: banned users cannot send
messages and must be clearly informed (UI prevents message submission).

### Question 6

Q: Live video details: can we assume a backend provides a VideoInfo entity with necessary playback data?

A: Yes. Treat VideoInfo as an opaque blob sufficient for the player; ignore low‑level live streaming internals.

## Notes

- Real‑time channels: video (streaming pipeline outside scope), chat (WebSocket/SSE). REST endpoints provide state snapshots & actions.
- Rate and cadence: viewer count polling ~30s; follower count on page load; follow/subscription state immediate after mutation.
- Banning logic enforced server‑side; banned users receive a flag in chat capabilities response.
