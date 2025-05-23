docker network create activemq-network

docker volume create activemq-data

docker run -d \
  --name active-mq \
  --network activemq-network \
  -e ACTIVEMQ_WEB_USER=admin \
  -e ACTIVEMQ_WEB_PASSWORD=admin \
  -p 61616:61616 \
  -p 8161:8161 \
  -v activemq-data:/opt/activemq/data \
  --restart unless-stopped \
  apache/activemq-classic:5.17.7
