DROP SCHEMA IF EXISTS `schema-user`;

CREATE SCHEMA `schema-user`;

use `schema-user`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `statistics`;

CREATE TABLE `statistics` (
    `statistics_id` int(11) NOT NULL AUTO_INCREMENT,
    `total_time` time DEFAULT NULL,
    `total_calories` int(11) DEFAULT NULL,
    `total_workouts` int(11) DEFAULT NULL,
    `total_exercises` int(11) DEFAULT NULL,
    PRIMARY KEY (`statistics_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
    `user_id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    `statistics_id` int(11) DEFAULT NULL,
    PRIMARY KEY (`user_id`),
    KEY `FK_STATISTICS_idx` (`statistics_id`),
    CONSTRAINT `FK_STATISTICS` FOREIGN KEY (`statistics_id`) 
    REFERENCES `statistics` (`statistics_id`) 
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;