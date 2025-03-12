CREATE TABLE author
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE book
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    author_id   INT          NOT NULL,
    public_year SMALLINT NULL,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES author (id)
);