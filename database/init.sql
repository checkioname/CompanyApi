DROP TABLE IF EXISTS catalog1.Client;
DROP TABLE IF EXISTS catalog1.Account;

CREATE IF NOT EXISTS TABLE catalog1.Client(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username,
    password,
    email,
    age
);


CREATE IF NOT EXISTS TABLE catalog1.Account(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username,
    password,
    email,
    age
);
