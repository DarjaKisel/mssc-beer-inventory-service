DROP DATABASE IF EXISTS beerinventory;
DROP USER IF EXISTS `beerinventory_service`@`%`;
CREATE DATABASE IF NOT EXISTS beerinventory CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `beerinventory_service`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `beerinventory`.* TO `beerinventory_service`@`%`;