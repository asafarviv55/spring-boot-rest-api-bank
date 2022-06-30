

drop schema if exists bankdb;

create schema bankdb;

use bankdb;

CREATE TABLE users (
	id bigint NOT NULL AUTO_INCREMENT,
	email VARCHAR(255) NOT NULL,
	birth_date DATETIME NOT NULL,
	phone_number VARCHAR(255) NOT NULL,
	created_at DATETIME NOT NULL,
	updated_at DATETIME NOT NULL,
    created_by VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE users_auth (
	id bigint NOT NULL AUTO_INCREMENT,
	owner INT NOT NULL,
	username VARCHAR(255) NOT NULL,
	password VARCHAR(50) NOT NULL,
	created_at DATETIME NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE loans (
	id bigint NOT NULL AUTO_INCREMENT,
	owner INT NOT NULL ,
	loan_balance INT NOT NULL,
	created_at DATETIME NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE credit_expenses (
	id bigint NOT NULL AUTO_INCREMENT,
	owner INT NOT NULL,
    expense_amount INT NOT NULL,
	created_at DATETIME NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE pass_back_operations (
	id bigint NOT NULL AUTO_INCREMENT,
	owner INT NOT NULL ,
	isCharge BOOLEAN NOT NULL,
	account_balance FLOAT NOT NULL,
	created_at DATETIME NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE foreign_Trade (
	id bigint NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);

ALTER TABLE users_auth ADD CONSTRAINT users_auth_fk0 FOREIGN KEY (owner) REFERENCES users(id);

ALTER TABLE loans ADD CONSTRAINT loans_fk0 FOREIGN KEY (owner) REFERENCES users(id);

ALTER TABLE credit_expenses ADD CONSTRAINT credit_expenses_fk0 FOREIGN KEY (owner) REFERENCES users(id);

ALTER TABLE pass_back_operations ADD CONSTRAINT pass_back_operations_fk0 FOREIGN KEY (owner) REFERENCES users(id);






