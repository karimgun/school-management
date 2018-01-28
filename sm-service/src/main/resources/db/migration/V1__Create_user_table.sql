-- -----------------------------------------------------
-- Table `SM`.`USER_TYPE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SM`.`USER_TYPE` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `TYPE_NAME` VARCHAR(10) NULL,
  `DESC` VARCHAR(50) NULL,
  PRIMARY KEY (`ID`));

-- -----------------------------------------------------
-- Table `SM`.`USER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SM`.`USER` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `USER_NAME` VARCHAR(45) NULL,
  `USER_TYPE` INT NOT NULL,
  `PASSWORD` VARCHAR(20) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC),
  INDEX `fk_USER_USER_TYPE_idx` (`USER_TYPE` ASC),
  CONSTRAINT `fk_USER_USER_TYPE`
    FOREIGN KEY (`USER_TYPE`)
    REFERENCES `SM`.`USER_TYPE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


