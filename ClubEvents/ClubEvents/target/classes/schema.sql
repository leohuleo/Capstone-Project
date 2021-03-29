CREATE TABLE IF NOT EXISTS user(
    id INT(6) AUTO_INCREMENT NOT NULL,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL,
    role VARCHAR(50) NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(username),
    UNIQUE(email)
);
