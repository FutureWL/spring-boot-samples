SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for `CRA_PERSON`
-- ----------------------------
DROP TABLE IF EXISTS `CRA_PERSON`;
CREATE TABLE `CRA_PERSON`
(
    `ID`      int(10) NOT NULL AUTO_INCREMENT,
    `NAME`    varchar(255) DEFAULT NULL,
    `AGE`     int(10)      DEFAULT NULL,
    `COMPANY` varchar(10)  DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of CRA_PERSON
-- ----------------------------
INSERT INTO `CRA_PERSON`
VALUES ('1', '员工A', '20', '疯狂软件');
INSERT INTO `CRA_PERSON`
VALUES ('2', '员工B', '30', '疯狂软件');