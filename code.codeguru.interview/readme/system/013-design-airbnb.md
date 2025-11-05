# Design Airbnb

Design core Airbnb functionality for hosts (create/delete listings) and renters (browse listings by location and date range, initiate booking with temporary holds).

Many systems design questions are intentionally vague and are literally given as `Design Foobar`. Ask clarifying questions to narrow scope.

We've laid out questions and answers below; read them after thinking about what you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: Airbnb has two sides: host-facing and renter-facing. Are we designing both?

A: Yes, design both sides.

### Question 2

Q: For hosts: create/delete listings. For renters: browse properties, book, manage bookings. Correct?

A: Hosts: yes. Renters: focus only on browsing and booking; ignore post‑booking management.

### Question 3

Q: While browsing a property for a date range, do we temporarily reserve (hold) the property when user starts booking?

A: Multiple users can view the same property concurrently. Once a user starts booking for specific dates, that date range should no longer be
available to others starting a booking.

### Question 4

Q: If two users inspect overlapping dates and one clicks "Book Now" (entering payment info), should we lock the property for those dates for
some window (e.g., 15 minutes) until booking completes, then make it permanent if successful?

A: Yes; use a temporary hold transitioning to a confirmed booking upon completion.

### Question 5

Q: Include auxiliary features (contact hosts, auth, payments, messaging) or just browsing and reserving?

A: Focus purely on browsing and booking. Ignore other features.

### Question 6

Q: Full renter functionality: search by location, date range, pricing, property details; hosts create/delete listings. Is that all?

A: Filter only by location and available date range for this design. Ignore pricing and detailed property attributes beyond basics.

### Question 7

Q: Scale assumptions (users, listings)?

A: U.S. operations: ~50 million users, ~1 million listings.

### Question 8

Q: Availability/latency: serve listings fast and reliably even in dense areas (e.g., NYC). Correct?

A: Yes. Aim for low latency browsing and minimal downtime.

## Notes

- Booking flow requires concurrency control (soft lock / hold) on date ranges.
- Ignore payment processing internals; assume downstream payment service.
- Listing search index keyed by location (e.g., geo tiles) + availability calendar.
