CREATE TABLE member(
	id int not null,
	email varchar(50) not null PRIMARY KEY,
	name varchar(20) not null,
	password varchar(10) not null,W
	registerDate date not null
);

drop table member;

CREATE SEQUENCE seq_id;