# Design The Uber API

Design the core rides (taxi) API for Uber: passengers request rides, get matched with drivers, can track progress, and complete or cancel rides.

Many systems design questions are intentionally left vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.

We've laid out some of these questions below; their answers should guide you. Before looking at them, take a few minutes to think about what
questions you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: Uber has a lot of different services: core ride‑hailing, UberEats, UberPool. Are we designing the API for all of these services, or just
one?

A: Just the core rides API— not UberEats or UberPool.

### Question 2

Q: It seems we'll need both a passenger‑facing API and a driver‑facing API. Does that make sense, and should we design both?

A: Yes. Design both, starting with the passenger‑facing API.

### Question 3

Q: Envisioned flow: a passenger opens the app, hails a ride, gets matched with a driver, tracks the driver's approach, rides to destination,
then the ride completes. Additional features: track driver before pickup, cancel rides. Does this capture what you had in mind?

A: Yes, exactly. You can refine details as you design endpoints.

### Question 4

Q: Do we need to handle account creation, payment setup, contacting support, rating or tipping drivers?

A: Skip those for now; focus strictly on the core taxiing service.

### Question 5

Q: Should I write out function (endpoint) signatures with parameters, types, and return values?

A: Yes— include clear endpoint definitions.

## Core Entities (High Level)

- Passenger
- Driver
- Ride (requested -> matched -> en_route_to_pickup -> in_progress -> completed / canceled)
- Location (lat, lon, timestamp)

## Example Passenger-Facing Endpoints

1. POST /rides/request
   Request body: {
     passengerId: string,
     pickup: { lat: number, lon: number },
     destination: { lat: number, lon: number }
   }
   Response: {
     rideId: string,
     status: "requested"
   }

2. GET /rides/{rideId}
   Response: {
     rideId: string,
     passengerId: string,
     driverId: string | null,
     status: string,
     pickupEtaSeconds: number | null,
     driverLocation: { lat: number, lon: number } | null
   }

3. POST /rides/{rideId}/cancel
   Response: { rideId: string, status: "canceled" }

## Example Driver-Facing Endpoints

1. POST /drivers/{driverId}/availability
   Body: { available: boolean, location: { lat: number, lon: number } }
   Response: { driverId: string, available: boolean }

2. POST /drivers/{driverId}/rides/{rideId}/accept
   Response: { rideId: string, driverId: string, status: "matched" }

3. POST /drivers/{driverId}/location
   Body: { lat: number, lon: number }
   Response: { driverId: string, updatedAt: string }

## Status Flow

requested -> matched -> en_route_to_pickup -> in_progress -> completed
(cancel possible from requested, matched, en_route_to_pickup)

## Notes

- Real-time tracking typically via push (WebSocket / SSE); polling endpoints above are simplified.
- Matching logic and surge pricing are out of scope here.
