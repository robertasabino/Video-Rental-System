CREATE TABLE customer_movie_test (
  movie_id int NOT NULL,
  customer_id int NOT NULL,
  date_rented date DEFAULT NULL,
  date_due date  DEFAULT NULL,
  PRIMARY KEY (movie_id,customer_id),
  KEY customer_id (customer_id),
  CONSTRAINT customer_movie_ibfk_1 FOREIGN KEY (movie_id) REFERENCES movie (id),
  CONSTRAINT customer_movie_ibfk_2 FOREIGN KEY (customer_id) REFERENCES customer (id)
) ENGINE=InnoDB;

