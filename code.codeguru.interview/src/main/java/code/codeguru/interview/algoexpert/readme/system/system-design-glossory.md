# System Design Glossary

Our glossary contains key terms for review. Each entry preserves the original wording, formatted in Markdown (no inline HTML).

## ACID Transaction

A database transaction with four properties:

- **Atomicity**: All operations succeed or all fail.
- **Consistency**: The transaction cannot violate database rules; post commit/rollback constraints hold. Also called **Strong Consistency**.
- **Isolation**: Concurrent transactions behave as if executed sequentially.
- **Durability**: Committed data is persisted to non‑volatile storage and survives crashes.

## ACL

Short for **Access-Control List**. A permission model defining which users can perform which operations (e.g., which users can delete, edit, or view entities via an API).

## AES

**Advanced Encryption Standard** with symmetric key algorithms: AES‑128, AES‑192, AES‑256. Considered industry gold standard; used by the NSA for top secret data.

## Alerting

Process by which administrators are notified of critical system issues, often via thresholds on monitoring charts that trigger messages (e.g., Slack).

## Apache Kafka

A distributed messaging system (LinkedIn). Useful for **streaming** over **polling**. Learn more: <https://kafka.apache.org/>

## Asymmetric Encryption

Public‑key encryption using two mathematically related keys: public (shareable) and private (secret).
Data encrypted with the public key can only be decrypted with the private key.
Typically slower than symmetric algorithms.

## Availability

Probability a server/service is operational at any point; measured as a percentage (e.g., 99% = two nines).

## Availability Zone (AZ)

Group of machines sharing central components (power, network, cooling).
Zones are geographically separated to avoid simultaneous failure.
Redundant data across AZs preserves availability and SLAs.

## Blob Storage

Object storage allowing large binary objects (MBs to GBs).
Retrieval by object name (key).
Used for large binaries, snapshots, images, static assets.
Common cloud services: **GCS**, **S3**.
Pricing depends on storage volume and access frequency.

## Cache

Hardware or software storing data for faster retrieval (e.g., memoized results, HTTP responses).
Risk of **stale** data if underlying source updates and cache does not.

## Cache Eviction Policy

Determines removal of entries: **LRU**, **FIFO**, **LFU**, etc.

## Cache Hit

Requested data is found in the cache.

## Cache Miss

Requested data was expected in the cache but is absent
(often due to failure or design issue).

## CAP Theorem

Stands for **Consistency**, **Availability**, **Partition tolerance**.
In the presence of partitions (almost always), systems choose between strong consistency and high availability.
Some weaker forms of consistency can coexist with availability.

## Certificate Authority (CA)

Trusted entity signing digital certificates (e.g., SSL) for HTTPS.

## Client

Machine/process requesting data or service. A system component may be both client and server (e.g., app server is client to database).

## Client–Server Model

Architecture where clients request data/service and servers respond.

## Cloud Pub/Sub

Google's scalable Pub/Sub service. Guarantees **at‑least‑once delivery** and supports rewinding for reprocessing. Learn more: <https://cloud.google.com/pubsub/>

## Configuration

Critical parameters/constants (JSON/YAML). **Static** (bundled with code) or **Dynamic** (external service / KV store).

## Consensus Algorithm

Algorithms enabling distributed entities to agree on a value (e.g., leader): **Paxos**, **Raft**.

## Consistent Hashing

Hashing minimizing key remapping when resizing. Used by load balancers to reduce request redistribution on node changes.

## Content Delivery Network (CDN)

Third‑party caching layer with global **PoPs** (Points of Presence) reducing latency versus origin servers. Examples: Cloudflare, Google Cloud CDN.

## CRUD Operations

**Create**, **Read**, **Update**, **Delete** core API operations.

## Cypher

Graph query language (Neo4j). Simpler expressions for graph relationships than SQL.

## Database Index

Auxiliary data structure speeding reads; trade‑off: slower writes since index also updated.

## Database Lock

Locking rows/tables during ACID updates; concurrent conflicting transactions block until lock release ensuring atomicity.

## Databases

Programs recording and querying data via network protocols. Memory or disk backed. Persistence requires disk (non‑volatile). Large systems rely on recoverable volumes.

## DDoS Attack

Distributed denial‑of‑service: coordinated traffic floods from many sources; harder to mitigate than single‑source DoS.

## Disk

Non‑volatile storage (**HDD**, **SSD**). SSD faster, HDD cheaper; used according to access patterns.

## Distributed File System (DFS)

Abstraction over a cluster providing unified large‑scale storage (e.g., **GFS**, **HDFS**). Splits files into replicated chunks; control plane manages placement and routing.

## DNS

Domain Name System: resolves domain names to IP addresses via queries to resolvers.

## DoS Attack

Denial‑of‑service: flooding or otherwise rendering a system unavailable (single or limited sources). Rate limiting can mitigate.

## Estimation Cheat Sheet

Units: 1kB=1000B, 1MB=1000kB, 1GB=1000MB, 1TB=1000GB, 1PB=1000TB.
Storage scale examples: metadata ~1–10KB; 1080p image ~2MB (compressible); 20min HD video ~1GB.
Single machine capacity: ~10TB disk; 256GB–1TB RAM.
Round‑trip latency: Intra‑continental ~50–150ms; Cross‑continental ~200–500ms.
Bandwidth: Mobile 4G ~1–3MB/s; Home WiFi ~50–100MB/s; Data center ~5GB/s.

## Etcd

Strongly consistent, highly available key‑value store used for leader election. Learn more: <https://etcd.io/>

## Eventual Consistency

Model where reads may be stale; system guarantees convergence to latest state within bounded time.

## File System

Abstraction defining how data is organized (usually hierarchical directories/files, e.g., Unix FS).

## Forward Proxy

Server between client and destination servers, often masking client identity (IP). Commonly called just a proxy.

## Google Cloud Storage (GCS)

Google's blob storage service. Learn more: <https://cloud.google.com/storage>

## Gossip Protocol

Uncoordinated peer communication spreading information without central authority.

## Graph Database

Stores data as graph nodes/edges enabling fast traversal of deep relationships (e.g., social networks).

## Hadoop

Open‑source ecosystem around **HDFS** supporting MapReduce and other data processing frameworks. Learn more: <https://hadoop.apache.org/>

## Hashing Function

Maps input data to numeric output; aims to minimize collisions and maximize uniformity.

## High Availability (HA)

Describes systems with very high uptime (e.g., five nines: 99.999%).

## Horizontal Scaling

Increase throughput by adding machines performing the same task (near linear scaling).

## Hot Spot

Uneven workload distribution where some shards/servers receive disproportionate traffic (poor key/hash or natural skew).

## HTTP

Request/response protocol over TCP. Request fields: host, port, method (GET/PUT/POST/DELETE/OPTIONS/PATCH), headers, body. Response fields: status code, headers, body.

## HTTPS

Secure HTTP over **TLS** using server SSL certificates and encrypted channel.

## Idempotent Operation

Repeat execution yields same end result (e.g., setting status to COMPLETE). Needed in **Pub/Sub** with potential replays.

## InfluxDB

Open‑source time series database. Learn more: <https://www.influxdata.com/>

## IP (Internet Protocol)

Layer for machine‑to‑machine communication; base for TCP, UDP, HTTP.

## IP Address

Numeric network identifier. IPv4: a.b.c.d (0–255 each). Special: 127.0.0.1 (localhost), 192.168.x.y (private LAN).

## IP Packet

Basic unit over IP: header (source/dest addresses) + payload.

## JSON

JavaScript Object Notation. Example:

```json
{
  "version": 1.0,
  "name": "AlgoExpert Configuration"
}
```

## Key‑Value Store

Flexible NoSQL store (caching, dynamic config). Examples: DynamoDB, Etcd, Redis, ZooKeeper.

## Latency

Time to complete an operation. Approximate reads: 1MB RAM ~0.25ms; SSD ~1ms; network transfer ~10ms; HDD ~20ms; inter‑continental RTT ~150ms.

## Leader Election

Cluster nodes elect a leader responsible for primary operations; all nodes track current leader and re‑elect on failure.

## Load Balancer

Reverse proxy distributing traffic across backend servers (application, database tiers, etc.).

## Logging

Collecting and storing event logs (stdout/stderr) aggregated into centralized solution.

## Man‑In‑The‑Middle Attack (MITM)

Interception and potential mutation of private communication. Defended by encryption and HTTPS.

## MapReduce

Distributed processing pattern: **Map** (transform to key‑value), **Shuffle** (group by key), **Reduce** (aggregate). Example: word count.

## Memory (RAM)

Volatile storage lost on process/machine failure.

## Microservice Architecture

Many independently deployable small services (contrast with monolith).

## MongoDB

NoSQL document database with rich querying; consistency configurable. Learn more: <https://www.mongodb.com/>

## Monitoring

Visibility into metrics via collected events and aggregated charts.

## Monolith Architecture

Single large application deployed as a unit; may later be decomposed into microservices for productivity.

## MySQL

Relational SQL database with ACID transactions. Learn more: <https://www.mysql.com/>

## Neo4j

Graph database (nodes, relationships, properties, labels). Learn more: <https://neo4j.com/>

## Nginx

High‑performance web server, commonly reverse proxy and load balancer. Learn more: <https://www.nginx.com/>

## Nines

Uptime percentages: 99% ~87.7h downtime/year; 99.9% ~8.8h; 99.99% ~52.6m; 99.999% ~5.3m.

## Node / Instance / Host

Virtual or physical machine running processes; often called server.

## Non‑Relational Database

Database without enforced tabular schema (NoSQL).

## NoSQL Database

Any non‑SQL‑compatible database.

## Pagination

Splitting large responses into manageable pages with tokens for subsequent requests (e.g., listing trending videos).

## Paxos & Raft

Consensus algorithms enabling coordinated operations and leader selection.

## Peer‑To‑Peer Network

Peers divide workload; used in file sharing for parallel distribution.

## Percentiles

Latency distribution metric: Xth percentile = X% of requests at or below given latency.

## Persistent Storage

Non‑volatile storage (typically disk) surviving process death.

## Polling

Periodic fetching of a resource to reduce staleness.

## Port

Numeric endpoint (0–65535). System ports 0–1023 reserved. Examples: 22 SSH, 53 DNS, 80 HTTP, 443 HTTPS.

## Postgres

Relational database (PostgreSQL dialect) with ACID transactions. Learn more: <https://www.postgresql.org/>

## Process

Running program instance; may terminate unexpectedly in large systems.

## Prometheus

Open‑source time series DB for monitoring. Learn more: <https://prometheus.io/>

## Publish/Subscribe Pattern (Pub/Sub)

Publishers emit messages to topics; subscribers consume. Guarantees can include **at‑least‑once**, ordering, persistence, replay.

## Quadtree

Spatial index dividing space recursively into four quadrants per node (efficient location queries in O(log₄ n)).

## Rate Limiting

Restrict request frequency (IP, account, region) to protect against abuse/DoS. May use multiple window tiers.

## Redis

In‑memory key‑value store (fast cache). Also used for rate limiting. Learn more: <https://redis.io/>

## Redundancy

Replicating components to increase reliability.

## Relational Database

Structured, tabular data store often queried with SQL.

## Rendezvous Hashing

Highest random weight hashing minimizing remapping when nodes change.

## Replication

Duplicating data to other servers for redundancy, locality, or latency improvement.

## Reverse Proxy

Server acting on behalf of backend servers (logging, load balancing, caching).

## S3

Amazon blob storage service (AWS). Learn more: <https://aws.amazon.com/s3/>

## Server

Machine/process providing data/service (listens for network calls). Can simultaneously be a client to other systems.

## Server‑Selection Strategy

Load balancer policy (round‑robin, random, performance‑based, IP hash, etc.).

## SHA

Secure Hash Algorithms (e.g., SHA‑3). Cryptographic hash functions used widely.

## Sharding

Partitioning data into shards to scale throughput (by region, data type, hashed column).

## SLA

Service‑level agreement: collection of guarantees (availability) composed of SLOs.

## SLO

Service‑level objective: individual guarantee forming part of an SLA.

## Socket

File‑like abstraction for streaming data over a network connection (typically TCP).

## Spatial Database

Optimized for spatial queries; often uses quadtrees.

## SQL

Structured Query Language; relational DB query standard (PostgreSQL dialect, etc.).

## SQL Database

Database supporting SQL (usually relational).

## SSL Certificate

Digital certificate (includes server public key) signed by CA; used in TLS handshake; defends against MITM.

## Stateful

Process requiring persisted disk state; harder to relocate or restart than stateless.

## Stateless

Process not requiring persisted disk state; easily moved or restarted (though may hold ephemeral memory state like caches).

## Streaming

Continuous feed of information over open connection (server push) vs polling.

## Strong Consistency

Immediate visibility of writes (ACID semantics) vs **Eventual Consistency**.

## Symmetric Encryption

Single shared key for encrypt/decrypt. Faster than asymmetric; examples in AES family.

## TCP

Reliable, ordered, connection‑oriented protocol over IP using sockets for streaming.

## Throughput

Operations processed per unit time (e.g., requests/sec).

## Time Series Database (TSDB)

Stores / analyzes time‑indexed data (InfluxDB, Prometheus, Graphite).

## TLS

Transport Layer Security protocol underpinning HTTPS.

## TLS Handshake

Steps establishing HTTPS secure session: client hello, server hello + cert, client verifies cert & sends premaster secret (encrypted), both derive session keys.

## Vertical Scaling

Increase resources (CPU/RAM) on a machine to raise throughput.

## Virtual Machine (VM)

Emulated OS/kernel environment isolating workloads on shared physical machine.

## Worker Pool Pattern

Pool of workers pulling tasks from shared queue; workers acknowledge success/failure ensuring at‑least‑once completion.

## YAML

Configuration format. Example:

```yaml
version: 1.0
name: AlgoExpert Configuration
```

## ZooKeeper

Strongly consistent, highly available key‑value store (config, leader election). Learn more: <https://zookeeper.apache.org/>
