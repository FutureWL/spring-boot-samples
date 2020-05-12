/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : BMS

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2018-04-18 11:54:40
*/

SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for `BOOK`
-- ----------------------------
DROP TABLE IF EXISTS `BOOK`;
CREATE TABLE `BOOK`
(
    `ID`        int(10)      NOT NULL AUTO_INCREMENT,
    `NAME`      varchar(255) NOT NULL,
    `COVER`     varchar(255)   DEFAULT NULL,
    `AUTHOR`    varchar(255)   DEFAULT NULL,
    `PRICE`     decimal(10, 2) DEFAULT NULL,
    `IS_DELETE` tinyint(4)     DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of BOOK
-- ----------------------------

-- ----------------------------
-- Table structure for `BOOK_STOCK`
-- ----------------------------
DROP TABLE IF EXISTS `BOOK_STOCK`;
CREATE TABLE `BOOK_STOCK`
(
    `ID`        int(10) NOT NULL AUTO_INCREMENT,
    `BOOK_ID`   int(10) NOT NULL,
    `STOCK_NUM` decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of BOOK_STOCK
-- ----------------------------

-- ----------------------------
-- Table structure for `SALE`
-- ----------------------------
DROP TABLE IF EXISTS `SALE`;
CREATE TABLE `SALE`
(
    `ID`          int(10)   NOT NULL AUTO_INCREMENT,
    `CREATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of SALE
-- ----------------------------

-- ----------------------------
-- Table structure for `SALE_ITEM`
-- ----------------------------
DROP TABLE IF EXISTS `SALE_ITEM`;
CREATE TABLE `SALE_ITEM`
(
    `ID`      int(10) NOT NULL AUTO_INCREMENT,
    `BOOK_ID` int(10) NOT NULL,
    `SALE_ID` int(10)        DEFAULT NULL,
    `AMOUNT`  int(10)        DEFAULT NULL,
    `PRICE`   decimal(10, 2) DEFAULT NULL COMMENT '交易时的单价',
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of SALE_ITEM
-- ----------------------------

-- ----------------------------
-- Table structure for `STORE`
-- ----------------------------
DROP TABLE IF EXISTS `STORE`;
CREATE TABLE `STORE`
(
    `ID`          int(10)   NOT NULL AUTO_INCREMENT,
    `CREATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of STORE
-- ----------------------------

-- ----------------------------
-- Table structure for `STORE_ITEM`
-- ----------------------------
DROP TABLE IF EXISTS `STORE_ITEM`;
CREATE TABLE `STORE_ITEM`
(
    `ID`       int(10) NOT NULL AUTO_INCREMENT,
    `BOOK_ID`  int(10) NOT NULL,
    `STORE_ID` int(10) NOT NULL,
    `AMOUNT`   int(10) DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 12
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of STORE_ITEM
-- ----------------------------

-- ----------------------------
-- Table structure for `USER`
-- ----------------------------
DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER`
(
    `ID`     int(10) NOT NULL AUTO_INCREMENT,
    `NAME`   varchar(255) DEFAULT NULL,
    `PASSWD` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO `USER`
VALUES ('1', 'admin', '123456');

-- ----------------------------
-- Records of USER
-- ----------------------------
