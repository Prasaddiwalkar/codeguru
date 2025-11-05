# Perforce1 Utilities

Run Redis container and fix permissions for data volume.

```bash
docker run -d \
  -v /Users/prasaddeshpande/workdir/prasad/ds-algo/codeguru/code.codeguru.interview/data:/data \
  --name redis_ratelimit \
  redis

# Fix ownership on the data directory
docker run --rm \
  -v /Users/prasaddeshpande/workdir/prasad/ds-algo/codeguru/code.codeguru.interview/data:/data \
  redis chown -R redis:redis /data
```
