Prerequisite:
Add `PRIVATE_DOCKER_REGISTRY` system env variable (points to private docker registry)

Create docker repository named `webapp`

# Docker
- Create jar + install to the local .m2 repository
1) mvn clean install
- Build image
2) mvn docker:build -e
- Publish image
3) mvn docker:push -e
- Docker start ( a) b) - latest image)
4) docker-compose up -d
  a) Terminal
   docker-compose down && docker-compose build --pull && docker-compose up -d
  b) PowerShell
   docker-compose down ; docker-compose build --pull ; docker-compose up -d
- Docker stop
5) docker-compose down

Test the app:
http://localhost:8080/hello  (HTTP GET)