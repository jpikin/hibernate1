create table pets
(
    id serial primary key,
    type varchar(20),
    name varchar(20),
    color varchar(20),
    age int,
    person_id int references persons(id)
);

create table persons
(
    id serial primary key ,
    name varchar(20),
    email varchar(20),
    age int
);

