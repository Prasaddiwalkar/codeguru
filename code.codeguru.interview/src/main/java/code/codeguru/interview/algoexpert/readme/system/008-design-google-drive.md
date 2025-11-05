# Design Google Drive

Many systems design questions are intentionally left very vague and are literally given in the form of `Design Foobar`. It's your job to ask
clarifying questions to better understand the system that you have to build.

We've laid out some of these questions below; their answers should give you some guidance on the problem. Before looking at them, take a few
minutes to think about what questions you'd ask in a real interview.

## Clarifying Questions To Ask

### Question 1

Q: Are we just designing the storage aspect of Google Drive, or are we also designing some of the related products like Google Docs, Sheets,
Slides, Drawings, etc.?

A: We're just designing the core Google Drive product, which is the storage product. Users can create folders and upload files, storing them
in the cloud. For simplicity, we can refer to folders and files as "entities".

### Question 2

Q: There are a lot of features on Google Drive, like shared company drives vs. personal drives, permissions (ACLs), starred files,
recently‑accessed files, etc.. Are we designing all of these features or just some?

A: Keep things narrow: design a personal Google Drive (ignore shared company drives). Users store entities; that's all you should cover. Ignore
non-core storage features like starred or recent files. You can also ignore sharing entities.

### Question 3

Q: Since we're primarily concerned with storing entities, are we supporting all basic CRUD operations like creating, deleting, renaming, and
moving entities?

A: Yes. Clarification: creating a file means uploading a file; folders are created (not uploaded). We also need to support downloading files.

### Question 4

Q: Are we just designing the Google Drive web application, or are we also designing a desktop client for Google Drive?

A: Only the functionality of the Google Drive web application.

### Question 5

Q: Since we're not dealing with sharing entities, should we handle multiple users in a single folder at the same time, or can we assume this
will never happen?

A: Even without sharing, handle multiple clients in the same folder (e.g., two tabs). Changes in that folder should propagate to all clients
within 10 seconds. Assume no conflicting simultaneous edits to the same file or folder.

### Question 6

Q: How many people are we building this system for?

A: About one billion users, handling roughly 15 GB per user on average.

### Question 7

Q: What kind of reliability or guarantees does this Google Drive service give to its users?

A: Data loss is not tolerated: once a file is uploaded or a folder created, it must persist until explicitly deleted by the user. The system
must be highly available.
