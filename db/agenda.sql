-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: agenda
-- ------------------------------------------------------
-- Server version	5.5.5-10.2.13-MariaDB

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

--
-- Table structure for table `continut`
--

DROP TABLE IF EXISTS `continut`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `continut` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `data_creat` datetime NOT NULL,
  `continut` longtext NOT NULL,
  `data_target` datetime NOT NULL,
  `status` int(2) unsigned NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `continut`
--

LOCK TABLES `continut` WRITE;
/*!40000 ALTER TABLE `continut` DISABLE KEYS */;
/*!40000 ALTER TABLE `continut` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `continut_proprietati`
--

DROP TABLE IF EXISTS `continut_proprietati`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `continut_proprietati` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_continut` int(10) unsigned NOT NULL,
  `tip` int(1) unsigned NOT NULL,
  `nume` varchar(45) NOT NULL,
  `prop_int` int(10) unsigned DEFAULT NULL,
  `prop_str` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_CP_1_idx` (`id_continut`),
  CONSTRAINT `FK_CP_1` FOREIGN KEY (`id_continut`) REFERENCES `continut` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `continut_proprietati`
--

LOCK TABLES `continut_proprietati` WRITE;
/*!40000 ALTER TABLE `continut_proprietati` DISABLE KEYS */;
/*!40000 ALTER TABLE `continut_proprietati` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persoane`
--

DROP TABLE IF EXISTS `persoane`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persoane` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nume` varchar(45) DEFAULT NULL,
  `prenume` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `alte_detalii` text DEFAULT NULL,
  `telefon` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persoane`
--

LOCK TABLES `persoane` WRITE;
/*!40000 ALTER TABLE `persoane` DISABLE KEYS */;
INSERT INTO `persoane` VALUES (1,'Sand','George-Ionut','iqgeo@yahoo.com','test detaliie','0757107180'),(2,'Gigi','Duru','george.sand@micronigkrupm.ro','test detalii 2','0761577860'),(3,'Gicu','Buricu','bucircu@gmail.com','asdasd ','0212068900');
/*!40000 ALTER TABLE `persoane` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proprietati`
--

DROP TABLE IF EXISTS `proprietati`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proprietati` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tip` int(1) unsigned NOT NULL,
  `nume` varchar(45) NOT NULL,
  `prop_int` int(10) unsigned DEFAULT NULL,
  `prop_str` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proprietati`
--

LOCK TABLES `proprietati` WRITE;
/*!40000 ALTER TABLE `proprietati` DISABLE KEYS */;
/*!40000 ALTER TABLE `proprietati` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilizatori`
--

DROP TABLE IF EXISTS `utilizatori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilizatori` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `parola` varchar(45) NOT NULL,
  `rol` int(1) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilizatori`
--

LOCK TABLES `utilizatori` WRITE;
/*!40000 ALTER TABLE `utilizatori` DISABLE KEYS */;
INSERT INTO `utilizatori` VALUES (1,'admin.test','parola123',1),(2,'utilizator.test','parola123',2);
/*!40000 ALTER TABLE `utilizatori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agenda'
--

--
-- Dumping routines for database 'agenda'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-14 14:00:56
