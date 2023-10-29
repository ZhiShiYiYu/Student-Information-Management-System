-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: swing_student
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `Aid` int(11) NOT NULL,
  `Aname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Apwd` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Aid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (666,'管理员','666'),(999,'管理员','999');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `Cnum` int(11) NOT NULL AUTO_INCREMENT,
  `Cno` int(11) NOT NULL,
  `Cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Ctime` int(11) NOT NULL,
  `Ccredit` int(11) NOT NULL,
  PRIMARY KEY (`Cnum`,`Cno`) USING BTREE,
  KEY `Cname` (`Cname`) USING BTREE,
  KEY `Cno` (`Cno`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,1001,'数据库原理',50,3),(2,1002,'操作系统',64,4),(3,1003,'计算机网络',64,4),(4,1004,'java',64,4),(5,1005,'python',48,3),(6,1006,'软件工程',48,3);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `score` (
  `Sno` int(11) NOT NULL,
  `Sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Cno` int(11) NOT NULL,
  `Cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Sscore` decimal(10,0) DEFAULT '0',
  `Rescore` decimal(10,0) DEFAULT '0',
  PRIMARY KEY (`Sno`,`Cno`) USING BTREE,
  KEY `Cname` (`Cname`) USING BTREE,
  KEY `Cno` (`Cno`) USING BTREE,
  KEY `Sname` (`Sname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
INSERT INTO `score` VALUES (21050060,'张三',1001,'数据库原理',100,0),(21050060,'张三',1002,'操作系统',97,0),(21050060,'张三',1003,'计算机网络',95,0),(21050060,'张三',1004,'java',92,0),(21050061,'王四',1001,'数据库原理',92,0),(21050061,'王四',1004,'java',91,0),(21050062,'李五',1001,'数据库原理',93,0),(21050062,'李五',1004,'java',92,0);
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `Sno` int(11) NOT NULL,
  `Sname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sgender` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sage` int(11) NOT NULL,
  `Sclass` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Smajor` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sdept` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Spwd` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123',
  PRIMARY KEY (`Sno`) USING BTREE,
  KEY `Sname` (`Sname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (21050060,'张三','男',20,'21101','计算机科学与技术','计算机学院','123'),(21050061,'王四','男',21,'21101','计算机科学与技术','计算机学院','123'),(21050062,'李五','男',20,'21101','计算机科学与技术','计算机学院','123');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-29 22:10:02
