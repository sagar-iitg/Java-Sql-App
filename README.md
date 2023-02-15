


```

docker pull mysql

```

```
docker run --name db -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql
```

```
docker run -it db bash

```

```
mysql -u root -p
```

```
 create database Employee;
 use Employee;
 ```

```
 create table Employee_detail(EmpID int, FirstName varchar(100), LastName varchar(100));

```

```
insert into Employee_detail (EmpID,FirstName,LastName) values(1, "Hello","Duniya");
insert into Employee_detail (EmpID,FirstName,LastName) values(2, "Nitin","K");
```

```
docker build -t app .    
```
```
docker run --name linkcontainer --link db app

```
