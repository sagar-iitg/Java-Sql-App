```

docker build -t app .    
docker run --name linkcontainer --link db app
docker run --name db -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root mysql

```