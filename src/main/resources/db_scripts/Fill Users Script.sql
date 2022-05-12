
use bankdb;


delete from users where id > 0;

insert into users(email ,birth_date ,phone_number,created_at ,updated_at  ,created_by ) values('asaf.arviv@gmail.com',now(),'054-6522485',now(),now(),'asaf');


select * from users;


/*
insert into users values();

insert into users values();

insert into users values();

insert into users values();
*/