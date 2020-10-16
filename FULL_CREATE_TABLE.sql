create database asm2
use asm2

CREATE TABLE `app_role` (
  `ROLE_ID` int NOT NULL,
  `ROLE_NAME` varchar(30) NOT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `app_role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_TRAINEE'),(3,'ROLE_TRAINER');


CREATE TABLE `app_user` (
  `USER_ID` bigint NOT NULL,
  `USER_NAME` varchar(36) NOT NULL,
  `ENCRYTED_PASSWORD` varchar(128) NOT NULL,
  `ENABLED` bit(1) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `app_user` VALUES (1,'admin','$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu',_binary ''),
(2,'trainee1','$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu',_binary '');

CREATE TABLE `category` (
  `CATEGORY_ID` int NOT NULL,
  `CATEGORY_NAME` varchar(30) NOT NULL,
  `DESCRIPTION` varchar(100) NOT NULL,
  PRIMARY KEY (`CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `category` VALUES (1,'Code','learn java'),(2,'research','digitall');

CREATE TABLE `trainee_course` (
  `ID` int NOT NULL,
  `TRAINEE_ID` int NOT NULL,
  `COURSE_ID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `trainee_course` VALUES (1,1,1),(2,1,2);

CREATE TABLE `course` (
  `COURSE_ID` int NOT NULL,
  `COURSE_NAME` varchar(30) NOT NULL,
  `CATEGORY_ID` int NOT NULL,
  `DISCRIPTION` varchar(45) NOT NULL,
  PRIMARY KEY (`COURSE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `course` VALUES (1,'Java',1,'java simple'),(2,'Survey',2,'survey about digitall');

CREATE TABLE `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(45) NOT NULL,
  `last_uesed` datetime NOT NULL,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `trainee` (
  `TRAINEE_ID` int NOT NULL,
  `TRAINEE_NAME` varchar(50) NOT NULL,
  `USER_ID` int NOT NULL,
  `TRAINEE_DOB` varchar(8) NOT NULL,
  `EDUCATION` varchar(45) NOT NULL,
  `PRO_LANGUAGE` varchar(45) NOT NULL,
  `TOEIC_SCORE` int NOT NULL,
  `EXP` varchar(45) NOT NULL,
  `DEPARTMENT` varchar(45) NOT NULL,
  `LOCATION` varchar(45) NOT NULL,
  PRIMARY KEY (`TRAINEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `trainee` VALUES (1,'tran quoc anh',2,'14102000','uni','java',200,'0','code','hanoi');


CREATE TABLE `trainer` (
  `TRAINER_ID` int NOT NULL,
  `TRAINER_NAME` varchar(50) NOT NULL,
  `USER_ID` int NOT NULL,
  `EXTER_OR_INTER` varchar(45) NOT NULL,
  `EDUCATION` varchar(45) NOT NULL,
  `WORKING_PLACE` varchar(45) NOT NULL,
  `TELEPHONE` varchar(11) NOT NULL,
  `TRAINERcol` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  PRIMARY KEY (`TRAINER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `trainer_topic` (
  `ID` int NOT NULL,
  `TRAINER_ID` int NOT NULL,
  `TOPIC_ID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user_role` (
  `ID` int NOT NULL,
  `USER_ID` int NOT NULL,
  `ROLE_ID` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `user_role` VALUES (1,1,1),(2,2,2);


