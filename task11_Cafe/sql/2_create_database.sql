CREATE DATABASE IF NOT EXISTS pizzeria DEFAULT CHARACTER SET utf8;

CREATE USER IF NOT EXISTS 'pizza_worker'@'localhost' IDENTIFIED BY 'abcde';

GRANT SELECT, INSERT, UPDATE, DELETE ON pizzeria.* TO 'pizza_worker'@'localhost';
