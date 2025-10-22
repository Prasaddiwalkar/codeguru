
docker run -d \
-v /Users/prasaddeshpande/workdir/prasad/ds-algo/codeguru/code.codeguru.interview/data:/data \
--name redis_ratelimit \
redis


docker run --rm -v /Users/prasaddeshpande/workdir/prasad/ds-algo/codeguru/code.codeguru.interview/data:/data redis chown -R redis:redis /data
