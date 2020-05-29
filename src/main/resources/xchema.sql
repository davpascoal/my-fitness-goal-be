-- DROP TABLE IF EXISTS billionaires;
 
-- CREATE TABLE billionaires (
--   id INT AUTO_INCREMENT  PRIMARY KEY,
--   first_name VARCHAR(250) NOT NULL,
--   last_name VARCHAR(250) NOT NULL,
--   career VARCHAR(250) DEFAULT NULL
-- );


-- create table student
-- (
--    id integer not null,
--    name varchar(255) not null,
--    passport_number varchar(255) not null,
--    primary key(id)
-- );

-- DROP SCHEMA IF EXISTS `schema_workout`;

-- CREATE SCHEMA `schema_workout`;

-- use `schema_workout`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `workout`;

CREATE TABLE `workout` (
    `workout_id` int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(45) DEFAULT NULL,
    `description` varchar(45) DEFAULT NULL,
    `bg_img` varchar DEFAULT NULL,
    PRIMARY KEY (`workout_id`)
);

DROP TABLE IF EXISTS `exercise`;

CREATE TABLE `exercise` (
    `exercise_id` int(11) NOT NULL AUTO_INCREMENT,
    `exercise_name` varchar(45) DEFAULT NULL,
    `duration` time DEFAULT NULL,

);

DROP TABLE IF EXISTS `workout_exercises`;

CREATE TABLE `workout_exercises` (
    `workout_id` int(11) NOT NULL,
    `exercise_id` int(11) NOT NULL,
    PRIMARY KEY(`workout_id`, `exercise_id`)
)

-- SET FOREIGN_KEY_CHECKS = 1;