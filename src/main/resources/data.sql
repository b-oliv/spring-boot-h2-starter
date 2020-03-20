DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);
 
INSERT INTO user (first_name, last_name) VALUES
  ('fName 1', 'lName 1'),
  ('fName 2', 'lName 2'),
  ('fName 3', 'lName 3');