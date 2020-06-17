insert into roles (code, default_role) values ('ROLE_USER', true);
insert into roles (code, default_role) values ('ROLE_ADMIN', false);

--insert into users (password, username, role_id) values ('password', 'akbar', 1);
--insert into users (password, username, role_id) values ('password', 'user', 2);

insert into addresses (street, zip_code, city, country) values ('155 rue du vieux pont de sevres', '92100', 'Boulogne-Billancourt', 'France');
insert into addresses (street, zip_code, city, country) values ('10 rue paul Bert', '75019', 'Paris', 'France');

insert into persons (first_name, last_name, birth_date, address_id) values ('akbar', 'KHAN', '1996-06-30', 1);
insert into persons (first_name, last_name, birth_date, address_id) values ('jhon', 'Doe', '1998-02-20', 2);
