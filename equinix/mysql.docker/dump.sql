CREATE DATABASE  IF NOT EXISTS `oms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `oms`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: oms
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `generic_orders_products`
--

DROP TABLE IF EXISTS `generic_orders_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products` (
  `OrderReferenceId` varchar(45) DEFAULT NULL,
  `OrderNumber` varchar(45) DEFAULT NULL,
  `SRNumber` varchar(45) DEFAULT NULL,
  `generic_Orders_id` varchar(45) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `productType` varchar(45) DEFAULT NULL,
  `productSubType` varchar(45) DEFAULT NULL,
  `accountName` varchar(45) DEFAULT NULL,
  `accountUCID` varchar(45) DEFAULT NULL,
  `accountNumber` varchar(45) DEFAULT NULL,
  `quantityRequested` int DEFAULT NULL,
  `customerFollowUpRequired` tinyint(1) DEFAULT NULL,
  `ibxTime` varchar(45) DEFAULT NULL,
  `contactUCID` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `userKey` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products`
--

LOCK TABLES `generic_orders_products` WRITE;
/*!40000 ALTER TABLE `generic_orders_products` DISABLE KEYS */;
INSERT INTO `generic_orders_products` VALUES (NULL,NULL,NULL,NULL,7,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,8,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,9,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,10,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,11,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,12,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,13,'string','string','string',NULL,'string',0,0,'string','string','string','string'),(NULL,NULL,NULL,NULL,14,'string','string','string',NULL,'string',0,0,'string','string','string','string');
/*!40000 ALTER TABLE `generic_orders_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_attachments`
--

DROP TABLE IF EXISTS `generic_orders_products_attachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_attachments` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_id` (`generic_Orders_Products_id`),
  CONSTRAINT `generic_orders_products_attachments_ibfk_1` FOREIGN KEY (`generic_Orders_Products_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_attachments`
--

LOCK TABLES `generic_orders_products_attachments` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_attachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_attachments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_id` (`generic_Orders_Products_id`),
  CONSTRAINT `generic_orders_products_contacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts`
--

LOCK TABLES `generic_orders_products_contacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts_modifiedcontacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts_modifiedcontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts_modifiedcontacts` (
  `generic_Orders_Products_contacts_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_contacts_id` (`generic_Orders_Products_contacts_id`),
  CONSTRAINT `generic_orders_products_contacts_modifiedcontacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_contacts_id`) REFERENCES `generic_orders_products_contacts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts_modifiedcontacts`
--

LOCK TABLES `generic_orders_products_contacts_modifiedcontacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts_modifiedcontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts_modifiedcontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts_notificationcontacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts_notificationcontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts_notificationcontacts` (
  `generic_Orders_Products_contacts_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `workPhone` varchar(45) DEFAULT NULL,
  `mobilePhone` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `contactUCID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_contacts_id` (`generic_Orders_Products_contacts_id`),
  CONSTRAINT `generic_orders_products_contacts_notificationcontacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_contacts_id`) REFERENCES `generic_orders_products_contacts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts_notificationcontacts`
--

LOCK TABLES `generic_orders_products_contacts_notificationcontacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts_notificationcontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts_notificationcontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts_orderingcontacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts_orderingcontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts_orderingcontacts` (
  `generic_Orders_Products_contacts_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `workPhone` varchar(45) DEFAULT NULL,
  `mobilePhone` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `contactUCID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_contacts_id` (`generic_Orders_Products_contacts_id`),
  CONSTRAINT `generic_orders_products_contacts_orderingcontacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_contacts_id`) REFERENCES `generic_orders_products_contacts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts_orderingcontacts`
--

LOCK TABLES `generic_orders_products_contacts_orderingcontacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts_orderingcontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts_orderingcontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts_resellerorderingcontacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts_resellerorderingcontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts_resellerorderingcontacts` (
  `generic_Orders_Products_contacts_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_contacts_id` (`generic_Orders_Products_contacts_id`),
  CONSTRAINT `generic_orders_products_contacts_resellerorderingcontacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_contacts_id`) REFERENCES `generic_orders_products_contacts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts_resellerorderingcontacts`
--

LOCK TABLES `generic_orders_products_contacts_resellerorderingcontacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts_resellerorderingcontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts_resellerorderingcontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_contacts_technicalcontacts`
--

DROP TABLE IF EXISTS `generic_orders_products_contacts_technicalcontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_contacts_technicalcontacts` (
  `generic_Orders_Products_contacts_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `workPhone` varchar(45) DEFAULT NULL,
  `workPhonePrefToCall` varchar(45) DEFAULT NULL,
  `mobilePhone` varchar(45) DEFAULT NULL,
  `mobilePhonePrefToCall` varchar(45) DEFAULT NULL,
  `mobilePhoneTimeZone` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `contactUCID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_contacts_id` (`generic_Orders_Products_contacts_id`),
  CONSTRAINT `generic_orders_products_contacts_technicalcontacts_ibfk_1` FOREIGN KEY (`generic_Orders_Products_contacts_id`) REFERENCES `generic_orders_products_contacts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_contacts_technicalcontacts`
--

LOCK TABLES `generic_orders_products_contacts_technicalcontacts` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_contacts_technicalcontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_contacts_technicalcontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_headerattachments`
--

DROP TABLE IF EXISTS `generic_orders_products_headerattachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_headerattachments` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_id` (`generic_Orders_Products_id`),
  CONSTRAINT `generic_orders_products_headerattachments_ibfk_1` FOREIGN KEY (`generic_Orders_Products_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_headerattachments`
--

LOCK TABLES `generic_orders_products_headerattachments` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_headerattachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_headerattachments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_ibxlocation`
--

DROP TABLE IF EXISTS `generic_orders_products_ibxlocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_ibxlocation` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `ibxTime` varchar(45) DEFAULT NULL,
  `timezone` varchar(45) DEFAULT NULL,
  `ibx` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `address1` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `accessRestricted` tinyint(1) DEFAULT NULL,
  `specialPrivilege` tinyint(1) DEFAULT NULL,
  `metro` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_id` (`generic_Orders_Products_id`),
  CONSTRAINT `generic_orders_products_ibxlocation_ibfk_1` FOREIGN KEY (`generic_Orders_Products_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_ibxlocation`
--

LOCK TABLES `generic_orders_products_ibxlocation` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_ibxlocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_ibxlocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_ibxlocation_cagedetails`
--

DROP TABLE IF EXISTS `generic_orders_products_ibxlocation_cagedetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_ibxlocation_cagedetails` (
  `generic_Orders_Products_ibxLocation_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_ibxLocation_id` (`generic_Orders_Products_ibxLocation_id`),
  CONSTRAINT `generic_orders_products_ibxlocation_cagedetails_ibfk_1` FOREIGN KEY (`generic_Orders_Products_ibxLocation_id`) REFERENCES `generic_orders_products_ibxlocation` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_ibxlocation_cagedetails`
--

LOCK TABLES `generic_orders_products_ibxlocation_cagedetails` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_ibxlocation_cagedetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_ibxlocation_cagedetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_notes`
--

DROP TABLE IF EXISTS `generic_orders_products_notes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_notes` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `noteDescription` varchar(45) DEFAULT NULL,
  `noteType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_Orders_Products_id` (`generic_Orders_Products_id`),
  CONSTRAINT `generic_orders_products_notes_ibfk_1` FOREIGN KEY (`generic_Orders_Products_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_notes`
--

LOCK TABLES `generic_orders_products_notes` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_notes` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_notes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generic_orders_products_productdetails`
--

DROP TABLE IF EXISTS `generic_orders_products_productdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generic_orders_products_productdetails` (
  `generic_Orders_Products_id` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `severity` varchar(45) DEFAULT NULL,
  `incidentDateTime` varchar(45) DEFAULT NULL,
  `callMeFromCage` tinyint(1) DEFAULT NULL,
  `networkTrouble` tinyint(1) DEFAULT NULL,
  `customerTroubleType` varchar(45) DEFAULT NULL,
  `needSupportFromASubmarineCableStationEngineer` tinyint(1) DEFAULT NULL,
  `assetNumber` varchar(45) DEFAULT NULL,
  `productCategory` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generic_orders_products_productdetails`
--

LOCK TABLES `generic_orders_products_productdetails` WRITE;
/*!40000 ALTER TABLE `generic_orders_products_productdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `generic_orders_products_productdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderqueue`
--

DROP TABLE IF EXISTS `orderqueue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderqueue` (
  `id` int NOT NULL AUTO_INCREMENT,
  `state` enum('Open','InProgress','Completed','Accepted','PartiallyAccepted','PartiallyCompleted','Rejected','PartiallyRejected','Pending') DEFAULT NULL,
  `generic_orders_products_queue_id` int DEFAULT NULL,
  `orderReferenceId` varchar(45) DEFAULT NULL,
  `orderNumber` varchar(45) DEFAULT NULL,
  `srNumber` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `generic_orders_products_queue_id_idx` (`generic_orders_products_queue_id`),
  CONSTRAINT `generic_orders_products_queue_id` FOREIGN KEY (`generic_orders_products_queue_id`) REFERENCES `generic_orders_products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderqueue`
--

LOCK TABLES `orderqueue` WRITE;
/*!40000 ALTER TABLE `orderqueue` DISABLE KEYS */;
INSERT INTO `orderqueue` VALUES (1,NULL,12,NULL,NULL,NULL),(2,'Pending',13,NULL,NULL,NULL),(3,'Pending',14,NULL,NULL,NULL);
/*!40000 ALTER TABLE `orderqueue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'oms'
--

--
-- Dumping routines for database 'oms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-23 23:07:08
