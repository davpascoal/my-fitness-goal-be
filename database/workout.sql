DROP SCHEMA IF EXISTS `schema_workout`;

CREATE SCHEMA `schema_workout`;

use `schema_workout`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `workout`;

CREATE TABLE `workout` (
    `workout_id` int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(45) DEFAULT NULL,
    `description` varchar(45) DEFAULT NULL,
    `bg_img` varchar(45) DEFAULT NULL,
    PRIMARY KEY (workout_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `exercise`;

CREATE TABLE `exercise` (
    `exercise_id` int(11) NOT NULL AUTO_INCREMENT,
    `exercise_name` varchar(45) DEFAULT NULL,
    `duration` time DEFAULT NULL,

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `workout_exercises`;

CREATE TABLE `workout_exercises` (
    `workout_id` int(11) NOT NULL,
    `exercise_id` int(11) NOT NULL,
    PRIMARY KEY(`workout_id`, `exercise_id`),
    
    KEY `FK_WORKOUT_idx`, (`workout_id`),

    CONSTRAINT `FK_WORKOUT` FOREIGN KEY (`workout_id`),
    REFERENCES `workout` (`workout_id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,

    CONSTRAINT `FK_EXERCISE` FOREIGN KEY (`exercise_id`),
    REFERENCES `exercise` (`exercise_id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
) ENGINE=InnoDB DEFAULT CHARSET=l

SET FOREIGN_KEY_CHECKS = 1;