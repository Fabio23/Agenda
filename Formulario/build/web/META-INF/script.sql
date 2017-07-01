SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

  -- -----------------------------------------------------
  -- Schema BancoEvento
  -- -----------------------------------------------------
  CREATE DATABASE `BancoEvento` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
  USE `BancoEvento` ;

  -- -----------------------------------------------------
  -- Table `dados`
  -- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `dados` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(150) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `dataNasc` DATE NULL,
    `telefone` VARCHAR(15) NOT NULL,
    `celular` VARCHAR(15) NOT NULL,
    `rua` VARCHAR(100) NOT NULL,
    `numero` VARCHAR(10) NOT NULL,
    `complento` VARCHAR(100),
    `cep` VARCHAR(10) NOT NULL,
    UNIQUE INDEX `id` (`id` ASC),
    PRIMARY KEY (`id`))    
  ENGINE = InnoDB;


