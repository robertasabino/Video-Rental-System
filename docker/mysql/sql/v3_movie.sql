CREATE TABLE movie (
  id int NOT NULL AUTO_INCREMENT,
  producer_id int NOT NULL,
  title varchar(100) NOT NULL,
  duration int DEFAULT NULL,
  rating char(2) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY MOVIE_FK (producer_id),
  CONSTRAINT MOVIE_FK FOREIGN KEY (producer_id) REFERENCES producer (id)
) ENGINE=InnoDB;