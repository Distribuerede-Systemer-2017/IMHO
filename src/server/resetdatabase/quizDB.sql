-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: distribueredesystemer.cqsg17giwvxa.eu-central-1.rds.amazonaws.com    Database: imho
-- ------------------------------------------------------
-- server version	5.6.35-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE IF NOT EXISTS quizDB;

USE quizDB;
--
-- Table structure for table `Answer`
--

DROP TABLE IF EXISTS `Answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Answer` (
  `idAnswer` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `option_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAnswer`),
  UNIQUE KEY `idAnswer_UNIQUE` (`idAnswer`),
  KEY `userRef` (`user_id`),
  KEY `optionRef` (`option_id`),
  CONSTRAINT `optionRef` FOREIGN KEY (`option_id`) REFERENCES `Option` (`idOption`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userRef` FOREIGN KEY (`user_id`) REFERENCES `User` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Answer`
--

LOCK TABLES `Answer` WRITE;
/*!40000 ALTER TABLE `Answer` DISABLE KEYS */;
INSERT INTO `Answer` (`idAnswer`, `user_id`, `option_id`) VALUES (1,2,3),(2,3,3);
/*!40000 ALTER TABLE `Answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Course`
--

DROP TABLE IF EXISTS `Course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Course` (
  `idCourse` int(11) NOT NULL AUTO_INCREMENT,
  `course_title` varchar(45) NOT NULL,
  PRIMARY KEY (`idCourse`),
  UNIQUE KEY `topic_name_UNIQUE` (`course_title`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Course`
--

LOCK TABLES `Course` WRITE;
/*!40000 ALTER TABLE `Course` DISABLE KEYS */;
INSERT INTO `Course` (`idCourse`, `course_title`) VALUES (2,'DIS'),(3,'Forandringsledelse'),(4,'Makroøkonomi'),(1,'VØS 3');
/*!40000 ALTER TABLE `Course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Option`
--

DROP TABLE IF EXISTS `Option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Option` (
  `idOption` int(11) NOT NULL AUTO_INCREMENT,
  `option` varchar(400) NOT NULL,
  `question_id` int(11) DEFAULT NULL,
  `is_correct` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idOption`),
  UNIQUE KEY `idOption_UNIQUE` (`idOption`),
  UNIQUE KEY `option_UNIQUE` (`option`),
  KEY `questionRef` (`question_id`),
  CONSTRAINT `questionRef` FOREIGN KEY (`question_id`) REFERENCES `Question` (`idQuestion`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Option`
--

LOCK TABLES `Option` WRITE;
/*!40000 ALTER TABLE `Option` DISABLE KEYS */;
INSERT INTO `Option` (`idOption`, `option`, `question_id`, `is_correct`) VALUES (1,'En database',1,0),(2,'Begrebet findes ikke',1,0),(3,'Fordeler trafik på serverne',1,1),(4,'Et operativsystem',1,0);
/*!40000 ALTER TABLE `Option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Question`
--

DROP TABLE IF EXISTS `Question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Question` (
  `idQuestion` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(500) NOT NULL,
  `quiz_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idQuestion`),
  UNIQUE KEY `idQuestion_UNIQUE` (`idQuestion`),
  UNIQUE KEY `question_UNIQUE` (`question`),
  KEY `quizRef` (`quiz_id`),
  CONSTRAINT `quizRef` FOREIGN KEY (`quiz_id`) REFERENCES `Quiz` (`idQuiz`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Question`
--

LOCK TABLES `Question` WRITE;
/*!40000 ALTER TABLE `Question` DISABLE KEYS */;
INSERT INTO `Question` (`idQuestion`, `question`, `quiz_id`) VALUES (1,'Hvad er en \"load balancer\"?',1);
/*!40000 ALTER TABLE `Question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Quiz`
--

DROP TABLE IF EXISTS `Quiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Quiz` (
  `idQuiz` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(100) NOT NULL DEFAULT 'Unknown',
  `question_count` int(11) DEFAULT NULL,
  `quiz_title` varchar(200) DEFAULT 'Unidentified quiz',
  `quiz_description` varchar(1000) DEFAULT 'No description found',
  `topic_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idQuiz`),
  UNIQUE KEY `idQuiz_UNIQUE` (`idQuiz`),
  KEY `topicRef` (`topic_id`),
  CONSTRAINT `topicRef` FOREIGN KEY (`topic_id`) REFERENCES `Course` (`idCourse`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Quiz`
--

LOCK TABLES `Quiz` WRITE;
/*!40000 ALTER TABLE `Quiz` DISABLE KEYS */;
INSERT INTO `Quiz` (`idQuiz`, `created_by`, `question_count`, `quiz_title`, `quiz_description`, `topic_id`) VALUES (1,'Henrik Thorn',1,'Skalerbarhed','Tag denne quiz for at øve dig i skalerbarhed',2);
/*!40000 ALTER TABLE `Quiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `idUser_UNIQUE` (`idUser`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` (`idUser`, `username`, `password`, `type`) VALUES (1,'Admin','Admin',1),(2,'User','User',2),(3,'Jens','Hej',2);
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-12  9:04:22
