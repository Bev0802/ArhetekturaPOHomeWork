CREATE TABLE `User` (
	`idUser` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL AUTO_INCREMENT,
	`hash` TEXT NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`idUser`,`name`)
);

CREATE TABLE `Server` (
	`idServer` INT NOT NULL AUTO_INCREMENT,
	`CPU` INT NOT NULL,
	`RAM` INT NOT NULL,
	`SSD` INT NOT NULL,
	`idOS` TEXT NOT NULL,
	PRIMARY KEY (`idServer`)
);

CREATE TABLE `OS` (
	`idOS` INT NOT NULL AUTO_INCREMENT,
	`osName` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`idOS`)
);

CREATE TABLE `Tariff` (
	`idTariff` INT NOT NULL AUTO_INCREMENT,
	`idServer` INT NOT NULL,
	`price` FLOAT NOT NULL,
	`term` INT NOT NULL,
	`nameTariff` INT NOT NULL,
	PRIMARY KEY (`idTariff`)
);

CREATE TABLE `Order` (
	`idOrder` INT NOT NULL AUTO_INCREMENT,
	`idUser` INT NOT NULL,
	`idTariff` INT NOT NULL,
	`term` INT NOT NULL,
	`sum` FLOAT NOT NULL,
	`ipAdress` INT NOT NULL,
	PRIMARY KEY (`idOrder`)
);

ALTER TABLE `Server` ADD CONSTRAINT `Server_fk0` FOREIGN KEY (`idOS`) REFERENCES `OS`(`idOS`);

ALTER TABLE `Tariff` ADD CONSTRAINT `Tariff_fk0` FOREIGN KEY (`idServer`) REFERENCES `Server`(`idServer`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk0` FOREIGN KEY (`idUser`) REFERENCES `User`(`idUser`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk1` FOREIGN KEY (`idTariff`) REFERENCES `Tariff`(`idTariff`);






