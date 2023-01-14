# Devflection docker networking

This repository shows how to make use of docker-compose network section
to connect containers located in two different docker-compose files.

The *nba* folder creates a network with the name *nba*, 
which the *celtics* and *lakers* folders' docker-compose files import as external network and connect some containers to that network.

For more information refer to the accompanying [blog post](https://devflection.com/posts/2022-03-26-docker-connect-two-containers/).
