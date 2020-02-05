#pull image
docker pull postgres
#persist data locally
mkdir -p $HOME/docker/volumes/react-postgres
#run postgres on docker
docker run --rm   --name pg-docker -e POSTGRES_PASSWORD=docker -d -p 5432:5432 -v $HOME/docker/volumes/react-postgres:/var/lib/postgresql/data  postgres
#connect postgres
psql -h localhost -U postgres -d postgres

