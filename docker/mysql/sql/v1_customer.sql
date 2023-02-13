CREATE TABLE customer (
  id int NOT NULL AUTO_INCREMENT,
  first_name varchar(30) NOT NULL,
  last_name varchar(30) DEFAULT NULL,
  address varchar(50) DEFAULT NULL,
  birthdate date DEFAULT NULL,
  phonenumber int DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;