


```

docker pull mysql

```

```
docker run --name db -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql
```

```
docker build -t app .    
```
```
docker run --name linkcontainer --link db app

```
