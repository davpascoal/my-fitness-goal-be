DROP SCHEMA IF EXISTS `schema-workout`;

CREATE SCHEMA `schema-workout`;

use `schema-workout`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `workout`;

CREATE TABLE `workout` (
    `workout_id` int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(45) DEFAULT NULL,
    `description` varchar(45) DEFAULT NULL,
    `bg_img` varchar(45) DEFAULT NULL,
    PRIMARY KEY (id)
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
    PRIMARY KEY(`workout_id`, `exercise_id`)
)

SET FOREIGN_KEY_CHECKS = 1;