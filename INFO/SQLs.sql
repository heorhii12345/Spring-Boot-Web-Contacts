
-- data base
CREATE DATABASE demo_db;


-- tables


CREATE TABLE IF NOT EXISTS employees
( id INTEGER NOT NULL AUTO_INCREMENT,
  firstname VARCHAR(255) NOT NULL,
  surname VARCHAR(255) NOT NULL,
  telephone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	employees (firstname, surname, telephone)
VALUES
	('profile1.jpg', 'Steven Spilberg', 'The quick brown'),
	('profile2.jpg', 'John Smith', 'fox jumps over'),
	('profile3.jpg', 'John Doe', 'the lazy dog');


