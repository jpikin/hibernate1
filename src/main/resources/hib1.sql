insert into persons (name, email, age)
VALUES
    ('John', 'j@ex.ru', 32),
    ('Mary', 'M@ex.ru', 28);


insert into pets (type, name, color, age, person_id)
VALUES
    ('dog', 'Jack', 'black', 3, 1),
    ('cat', 'Charlie', 'white', 1, 2);



delete from persons;

delete from pets;

drop table persons;

drop table pets;
