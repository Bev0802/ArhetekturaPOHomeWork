CREATE TABLE `Product` (
	`idProduct` INT NOT NULL AUTO_INCREMENT,
	`nameProduct` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`idProduct`)
);

CREATE TABLE `Сustomer` (
	`idСustomer` INT NOT NULL AUTO_INCREMENT,
	`nameСustomer` VARCHAR(255) NOT NULL,
	`adressCustomer` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`idСustomer`)
);

CREATE TABLE `Seller` (
	`idSeller` INT NOT NULL AUTO_INCREMENT,
	`nameSeller` VARCHAR(255) NOT NULL,
	`adressSeller` INT NOT NULL,
	PRIMARY KEY (`idSeller`)
);

CREATE TABLE `SalesDocument` (
	`idSalesDocument` INT NOT NULL AUTO_INCREMENT,
	`Date` DATE NOT NULL,
	`idProducts` INT NOT NULL,
	`idСustomers` INT NOT NULL,
	`idSellers` INT NOT NULL,
	`priceProduct` INT NOT NULL,
	PRIMARY KEY (`idSalesDocument`)
);

ALTER TABLE `SalesDocument` ADD CONSTRAINT `SalesDocument_fk0` FOREIGN KEY (`idProducts`) REFERENCES `Product`(`idProduct`);

ALTER TABLE `SalesDocument` ADD CONSTRAINT `SalesDocument_fk1` FOREIGN KEY (`idСustomers`) REFERENCES `Сustomer`(`idСustomer`);

ALTER TABLE `SalesDocument` ADD CONSTRAINT `SalesDocument_fk2` FOREIGN KEY (`idSellers`) REFERENCES `Seller`(`idSeller`);





