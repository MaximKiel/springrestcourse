CREATE TABLE Person (
                        id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
                        name varchar(100) NOT NULL,
                        age int NOT NULL,
                        email varchar (100) NOT NULL
);

