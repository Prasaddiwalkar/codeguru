-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cabmanagement
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `pick_up_location_id` int DEFAULT NULL,
  `dest_location_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `driver_id` int DEFAULT NULL,
  `cab_id` int DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  KEY `pick_up_location_id_idx` (`pick_up_location_id`),
  KEY `dest_location_id_idx` (`dest_location_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `driver_id_idx` (`driver_id`),
  KEY `user_id_idx1` (`cab_id`),
  CONSTRAINT `cab_id` FOREIGN KEY (`cab_id`) REFERENCES `cab_inventory` (`cab_id`),
  CONSTRAINT `dest_location_id` FOREIGN KEY (`dest_location_id`) REFERENCES `location` (`location_id`),
  CONSTRAINT `driver_id` FOREIGN KEY (`driver_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `pick_up_location_id` FOREIGN KEY (`pick_up_location_id`) REFERENCES `location` (`location_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cab_inventory`
--

DROP TABLE IF EXISTS `cab_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cab_inventory` (
  `cab_id` int NOT NULL AUTO_INCREMENT,
  `vehicle_type` varchar(45) DEFAULT NULL,
  `date_added` date DEFAULT NULL,
  `base_location` int DEFAULT NULL,
  `state` enum('IDLE','ONTRIP') DEFAULT NULL,
  `rto_registration_number` varchar(45) DEFAULT NULL,
  `current_location` int DEFAULT NULL,
  `idlefrom` datetime DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL,
  PRIMARY KEY (`cab_id`),
  UNIQUE KEY `logical_name_UNIQUE` (`rto_registration_number`),
  KEY `base_location_idx` (`base_location`),
  KEY `city_id_idx` (`current_location`),
  CONSTRAINT `base_location` FOREIGN KEY (`base_location`) REFERENCES `location` (`location_id`),
  CONSTRAINT `current_location` FOREIGN KEY (`current_location`) REFERENCES `location` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cab_inventory`
--

LOCK TABLES `cab_inventory` WRITE;
/*!40000 ALTER TABLE `cab_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `cab_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `location_id` int NOT NULL AUTO_INCREMENT,
  `city` text,
  `lat` double DEFAULT NULL,
  `longi` double DEFAULT NULL,
  `country` text,
  `state` text,
  `active` enum('Y','N') DEFAULT NULL,
  PRIMARY KEY (`location_id`),
  UNIQUE KEY `locationid_id_UNIQUE` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=216 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'Abohar',30.144533,74.19552,'India','Punjab',NULL),(2,'Adilabad',19.4,78.31,'India','Telangana',NULL),(3,'Agartala',23.836049,91.279386,'India','Tripura',NULL),(4,'Agra',27.187935,78.003944,'India','Uttar Pradesh',NULL),(5,'Ahmadnagar',19.094571,74.738432,'India','Maharashtra',NULL),(6,'Ahmedabad',23.025793,72.587265,'India','Gujarat',NULL),(7,'Aizawl  ',23.736701,92.714596,'India','Mizoram',NULL),(8,'Ajmer',26.452103,74.638667,'India','Rajasthan',NULL),(9,'Akola',20.709569,76.998103,'India','Maharashtra',NULL),(10,'Alappuzha',9.494647,76.331108,'India','Kerala',NULL),(11,'Aligarh',27.881453,78.07464,'India','Uttar Pradesh',NULL),(12,'Alipurduar',26.4835,89.522855,'India','West Bengal',NULL),(13,'Allahabad',25.44478,81.843217,'India','Uttar Pradesh',NULL),(14,'Alwar',27.566291,76.610202,'India','Rajasthan',NULL),(15,'Ambala',30.360993,76.797819,'India','Haryana',NULL),(16,'Amaravati',20.933272,77.75152,'India','Maharashtra',NULL),(17,'Amritsar',31.622337,74.875335,'India','Punjab',NULL),(18,'Asansol',23.683333,86.983333,'India','West Bengal',NULL),(19,'Aurangabad',19.880943,75.346739,'India','Maharashtra',NULL),(20,'Aurangabad',24.752037,84.374202,'India','Bihar',NULL),(21,'Bakshpur',25.894283,80.792104,'India','Uttar Pradesh',NULL),(22,'Bamanpuri',28.804495,79.040305,'India','Uttar Pradesh',NULL),(23,'Baramula',34.209004,74.342853,'India','Jammu and Kashmir',NULL),(24,'Barddhaman',23.255716,87.856906,'India','West Bengal',NULL),(25,'Bareilly',28.347023,79.421934,'India','Uttar Pradesh',NULL),(26,'Belgaum',15.862643,74.508534,'India','Karnataka',NULL),(27,'Bellary',15.142049,76.92398,'India','Karnataka',NULL),(28,'Bengaluru',12.977063,77.587106,'India','Karnataka',NULL),(29,'Bhagalpur',25.244462,86.971832,'India','Bihar',NULL),(30,'Bharatpur',27.215251,77.492786,'India','Rajasthan',NULL),(31,'Bharauri',27.598203,81.694709,'India','Uttar Pradesh',NULL),(32,'Bhatpara',22.866431,88.401129,'India','West Bengal',NULL),(33,'Bhavnagar',21.774455,72.152496,'India','Gujarat',NULL),(34,'Bhilai',21.209188,81.428497,'India','Chhattisgarh',NULL),(35,'Bhilwara',25.347071,74.640812,'India','Rajasthan',NULL),(36,'Bhiwandi',19.300229,73.058813,'India','Maharashtra',NULL),(37,'Bhiwani',28.793044,76.13968,'India','Haryana',NULL),(38,'Bhopal ',23.254688,77.402892,'India','Madhya Pradesh',NULL),(39,'Bhubaneshwar',20.272411,85.833853,'India','Odisha',NULL),(40,'Bhuj',23.253972,69.669281,'India','Gujarat',NULL),(41,'Bhusaval',21.043649,75.785058,'India','Maharashtra',NULL),(42,'Bidar',17.913309,77.530105,'India','Karnataka',NULL),(43,'Bijapur',16.827715,75.718988,'India','Karnataka',NULL),(44,'Bikaner',28.017623,73.314955,'India','Rajasthan',NULL),(45,'Bilaspur',22.080046,82.155431,'India','Chhattisgarh',NULL),(46,'Brahmapur',19.311514,84.792903,'India','Odisha',NULL),(47,'Budaun',28.038114,79.126677,'India','Uttar Pradesh',NULL),(48,'Bulandshahr',28.403922,77.857731,'India','Uttar Pradesh',NULL),(49,'Calicut',11.248016,75.780402,'India','Kerala',NULL),(50,'Chanda',19.950758,79.295229,'India','Maharashtra',NULL),(51,'Chandigarh ',30.736292,76.788398,'India','Chandigarh',NULL),(52,'Chennai',13.084622,80.248357,'India','Tamil Nadu ',NULL),(53,'Chikka Mandya',12.545602,76.895078,'India','Karnataka',NULL),(54,'Chirala',15.823849,80.352187,'India','Andhra Pradesh',NULL),(55,'Coimbatore',11.005547,76.966122,'India','Tamil Nadu ',NULL),(56,'Cuddalore',11.746289,79.764362,'India','Tamil Nadu ',NULL),(57,'Cuttack',20.522922,85.78813,'India','Odisha',NULL),(58,'Daman',20.414315,72.83236,'India','Daman and Diu',NULL),(59,'Davangere',14.469237,75.92375,'India','Karnataka',NULL),(60,'DehraDun',30.324427,78.033922,'India','Uttarakhand',NULL),(61,'Delhi',28.651952,77.231495,'India','Delhi',NULL),(62,'Dhanbad',23.801988,86.443244,'India','Jharkhand',NULL),(63,'Dibrugarh',27.479888,94.90837,'India','Assam',NULL),(64,'Dindigul',10.362853,77.975827,'India','Tamil Nadu ',NULL),(65,'Dispur',26.135638,91.800688,'India','Assam',NULL),(66,'Diu',20.715115,70.987952,'India','Daman and Diu',NULL),(67,'Faridabad',28.411236,77.313162,'India','Haryana',NULL),(68,'Firozabad',27.150917,78.397808,'India','Uttar Pradesh',NULL),(69,'Fyzabad',26.775486,82.150182,'India','Uttar Pradesh',NULL),(70,'Gangtok',27.325739,88.612155,'India','Sikkim',NULL),(71,'Gaya',24.796858,85.003852,'India','Bihar',NULL),(72,'Ghandinagar',23.216667,72.683333,'India','Gujarat',NULL),(73,'Ghaziabad',28.665353,77.439148,'India','Uttar Pradesh',NULL),(74,'Gopalpur',26.735389,83.38064,'India','Uttar Pradesh',NULL),(75,'Gulbarga',17.335827,76.83757,'India','Karnataka',NULL),(76,'Guntur',16.299737,80.457293,'India','Andhra Pradesh',NULL),(77,'Gurugram',28.460105,77.026352,'India','Haryana',NULL),(78,'Guwahati',26.176076,91.762932,'India','Assam',NULL),(79,'Gwalior',26.229825,78.173369,'India','Madhya Pradesh',NULL),(80,'Haldia',22.025278,88.058333,'India','West Bengal',NULL),(81,'Haora',22.576882,88.318566,'India','West Bengal',NULL),(82,'Hapur',28.729845,77.780681,'India','Uttar Pradesh',NULL),(83,'Haripur',31.463218,75.986418,'India','Punjab',NULL),(84,'Hata',27.592698,78.013843,'India','Uttar Pradesh',NULL),(85,'Hindupur',13.828065,77.491425,'India','Andhra Pradesh',NULL),(86,'Hisar',29.153938,75.722944,'India','Haryana',NULL),(87,'Hospet',15.269537,76.387103,'India','Karnataka',NULL),(88,'Hubli',15.349955,75.138619,'India','Karnataka',NULL),(89,'Hyderabad',17.384052,78.456355,'India','Telangana',NULL),(90,'Imphal',24.808053,93.944203,'India','Manipur',NULL),(91,'Indore',22.717736,75.85859,'India','Madhya Pradesh',NULL),(92,'Itanagar',27.102349,93.692047,'India','Arunachal Pradesh',NULL),(93,'Jabalpur',23.174495,79.935903,'India','Madhya Pradesh',NULL),(94,'Jaipur',26.913312,75.787872,'India','Rajasthan',NULL),(95,'Jammu',32.735686,74.869112,'India','Jammu and Kashmir',NULL),(96,'Jamshedpur',22.802776,86.185448,'India','Jharkhand',NULL),(97,'Jhansi',25.458872,78.579943,'India','Uttar Pradesh',NULL),(98,'Jodhpur',26.26841,73.005943,'India','Rajasthan',NULL),(99,'Jorhat',26.757509,94.203055,'India','Assam',NULL),(100,'Kagaznagar',19.331589,79.466051,'India','Andhra Pradesh',NULL),(101,'Kakinada',16.960361,82.238086,'India','Andhra Pradesh',NULL),(102,'Kalyan',19.243703,73.135537,'India','Maharashtra',NULL),(103,'Karimnagar',18.436738,79.13222,'India','Telangana',NULL),(104,'Karnal',29.691971,76.984483,'India','Haryana',NULL),(105,'Karur',10.960277,78.076753,'India','Tamil Nadu ',NULL),(106,'Kavaratti',10.566667,72.616667,'India','Lakshadweep',NULL),(107,'Khammam',17.247672,80.143682,'India','Telangana',NULL),(108,'Khanapur',21.273716,76.117376,'India','Maharashtra',NULL),(109,'Kochi',9.947743,76.253802,'India','Kerala',NULL),(110,'Kohima',25.674673,94.110988,'India','Nagaland',NULL),(111,'Kolar',13.137679,78.129989,'India','Karnataka',NULL),(112,'Kolhapur',16.695633,74.231669,'India','Maharashtra',NULL),(113,'Kolkata ',22.562627,88.363044,'India','West Bengal',NULL),(114,'Kollam',8.881131,76.584694,'India','Kerala',NULL),(115,'Kota',25.182544,75.839065,'India','Rajasthan',NULL),(116,'Krishnanagar',23.405761,88.490733,'India','West Bengal',NULL),(117,'Krishnapuram',12.869617,79.719469,'India','Tamil Nadu ',NULL),(118,'Kumbakonam',10.959789,79.377472,'India','Tamil Nadu ',NULL),(119,'Kurnool',15.828865,78.036021,'India','Andhra Pradesh',NULL),(120,'Latur',18.399487,76.584252,'India','Maharashtra',NULL),(121,'Lucknow',26.839281,80.923133,'India','Uttar Pradesh',NULL),(122,'Ludhiana',30.912042,75.853789,'India','Punjab',NULL),(123,'Machilipatnam',16.187466,81.13888,'India','Andhra Pradesh',NULL),(124,'Madurai',9.917347,78.119622,'India','Tamil Nadu ',NULL),(125,'Mahabubnagar',16.75,78,'India','Telangana',NULL),(126,'Malegaon Camp',20.569974,74.515415,'India','Maharashtra',NULL),(127,'Mangalore',12.865371,74.842432,'India','Karnataka',NULL),(128,'Mathura',27.503501,77.672145,'India','Uttar Pradesh',NULL),(129,'Meerut',28.980018,77.706356,'India','Uttar Pradesh',NULL),(130,'Mirzapur',25.144902,82.565335,'India','Uttar Pradesh',NULL),(131,'Moradabad',28.838931,78.776838,'India','Uttar Pradesh',NULL),(132,'Mumbai',18.987807,72.836447,'India','Maharashtra',NULL),(133,'Muzaffarnagar',29.470914,77.703324,'India','Uttar Pradesh',NULL),(134,'Muzaffarpur',26.122593,85.390553,'India','Bihar',NULL),(135,'Mysore',12.292664,76.638543,'India','Karnataka',NULL),(136,'Nagercoil',8.177313,77.43437,'India','Tamil Nadu ',NULL),(137,'Nalgonda',17.05,79.27,'India','Telangana',NULL),(138,'Nanded',19.160227,77.314971,'India','Maharashtra',NULL),(139,'Nandyal',15.477994,78.483605,'India','Andhra Pradesh',NULL),(140,'Nasik',19.999963,73.776887,'India','Maharashtra',NULL),(141,'Navsari',20.85,72.916667,'India','Gujarat',NULL),(142,'Nellore',14.449918,79.986967,'India','Andhra Pradesh',NULL),(143,'New Delhi',28.6,77.2,'India','Delhi',NULL),(144,'Nizamabad',18.673151,78.10008,'India','Telangana',NULL),(145,'Ongole',15.503565,80.044541,'India','Andhra Pradesh',NULL),(146,'Pali',25.775125,73.320611,'India','Rajasthan',NULL),(147,'Panaji',15.498289,73.824541,'India','Goa',NULL),(148,'Panchkula',30.691512,76.853736,'India','Haryana',NULL),(149,'Panipat',29.387471,76.968246,'India','Haryana',NULL),(150,'Parbhani',19.268553,76.770807,'India','Maharashtra',NULL),(151,'Pathankot',32.274842,75.652865,'India','Punjab',NULL),(152,'Patiala',30.336245,76.392199,'India','Punjab',NULL),(153,'Patna',25.615379,85.101027,'India','Bihar',NULL),(154,'Pilibhit',28.631245,79.804362,'India','Uttar Pradesh',NULL),(155,'Porbandar',21.641346,69.600868,'India','Gujarat',NULL),(156,'Port Blair',11.666667,92.75,'India','Andaman and Nicobar Islands',NULL),(157,'Proddatur',14.7502,78.548129,'India','Andhra Pradesh',NULL),(158,'Puducherry',11.933812,79.829792,'India','Puducherry',NULL),(159,'Pune',18.513271,73.849852,'India','Maharashtra',NULL),(160,'Puri',19.798254,85.824938,'India','Odisha',NULL),(161,'Purnea',25.776703,87.473655,'India','Bihar',NULL),(162,'Raichur',16.205459,77.35567,'India','Karnataka',NULL),(163,'Raipur',21.233333,81.633333,'India','Chhattisgarh',NULL),(164,'Rajahmundry',17.005171,81.777839,'India','Andhra Pradesh',NULL),(165,'Rajapalaiyam',9.451111,77.556121,'India','Tamil Nadu ',NULL),(166,'Rajkot',22.291606,70.793217,'India','Gujarat',NULL),(167,'Ramagundam',18.45,79.28,'India','Telangana',NULL),(168,'Rampura',26.884682,75.789336,'India','Rajasthan',NULL),(169,'Ranchi',23.347768,85.338564,'India','Jharkhand',NULL),(170,'Ratlam',23.330331,75.040315,'India','Madhya Pradesh',NULL),(171,'Raurkela',22.224964,84.864143,'India','Odisha',NULL),(172,'Rohtak',28.894473,76.589166,'India','Haryana',NULL),(173,'Saharanpur',29.967896,77.545221,'India','Uttar Pradesh',NULL),(174,'Saidapur',27.598784,80.75089,'India','Uttar Pradesh',NULL),(175,'Saidpur',34.318174,74.457093,'India','Jammu and Kashmir',NULL),(176,'Salem',11.651165,78.158672,'India','Tamil Nadu ',NULL),(177,'Samlaipadar',21.478072,83.990505,'India','Odisha',NULL),(178,'Sangli',16.856777,74.569196,'India','Maharashtra',NULL),(179,'Saugor',23.838766,78.738738,'India','Madhya Pradesh',NULL),(180,'Shahbazpur',27.874116,79.879327,'India','Uttar Pradesh',NULL),(181,'Shiliguri',26.710035,88.428512,'India','West Bengal',NULL),(182,'Shillong ',25.573987,91.896807,'India','Meghalaya',NULL),(183,'Shimla',31.104423,77.166623,'India','Himachal Pradesh',NULL),(184,'Shimoga',13.932424,75.572555,'India','Karnataka',NULL),(185,'Sikar',27.614778,75.138671,'India','Rajasthan',NULL),(186,'Silchar',24.827327,92.797868,'India','Assam',NULL),(187,'Silvassa',20.273855,72.996728,'India','Dadra and Nagar Haveli',NULL),(188,'Sirsa',29.534893,75.028981,'India','Haryana',NULL),(189,'Sonipat',28.994778,77.019375,'India','Haryana',NULL),(190,'Srinagar',34.085652,74.805553,'India','Jammu and Kashmir',NULL),(191,'Surat',21.195944,72.830232,'India','Gujarat',NULL),(192,'Tezpur',26.633333,92.8,'India','Assam',NULL),(193,'Thanjavur',10.785233,79.139093,'India','Tamil Nadu ',NULL),(194,'Tharati Etawah',26.758236,79.014875,'India','Uttar Pradesh',NULL),(195,'Thiruvananthapuram',8.485498,76.949238,'India','Kerala',NULL),(196,'Tiruchchirappalli',10.815499,78.696513,'India','Tamil Nadu ',NULL),(197,'Tirunelveli',8.725181,77.684519,'India','Tamil Nadu ',NULL),(198,'Tirupati',13.635505,79.419888,'India','Andhra Pradesh',NULL),(199,'Tiruvannamalai',12.230204,79.072954,'India','Tamil Nadu ',NULL),(200,'Tonk',26.168672,75.786111,'India','Rajasthan',NULL),(201,'Tuticorin',8.805038,78.151884,'India','Tamil Nadu ',NULL),(202,'Udaipur',24.57951,73.690508,'India','Rajasthan',NULL),(203,'Ujjain',23.182387,75.776433,'India','Madhya Pradesh',NULL),(204,'Vadodara',22.299405,73.208119,'India','Gujarat',NULL),(205,'Valparai',10.325163,76.955299,'India','Tamil Nadu ',NULL),(206,'Varanasi',25.31774,83.005811,'India','Uttar Pradesh',NULL),(207,'Vellore',12.905769,79.137104,'India','Tamil Nadu ',NULL),(208,'Vishakhapatnam',17.704052,83.297663,'India','Andhra Pradesh',NULL),(209,'Vizianagaram',18.11329,83.397743,'India','Andhra Pradesh',NULL),(210,'Warangal',17.978423,79.600209,'India','Telangana',NULL),(211,'Jorapokhar',23.7,86.41267,'India','Jharkhand',NULL),(212,'Brajrajnagar',21.82,83.92,'India','Odisha',NULL),(213,'Talcher',20.95,85.23,'India','Odisha',NULL),(215,'NandedFata',7.1546,65.45865,'India','Maharashtra','Y');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `state` (
  `state_id` int NOT NULL AUTO_INCREMENT,
  `cab_id` int NOT NULL,
  `state` enum('IDLE','ONTRIP') NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`state_id`),
  KEY `cab_id_idx` (`cab_id`),
  CONSTRAINT `booked_cab_id` FOREIGN KEY (`cab_id`) REFERENCES `cab_inventory` (`cab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip`
--

DROP TABLE IF EXISTS `trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip` (
  `trip_id` int NOT NULL AUTO_INCREMENT,
  `booking_id` int DEFAULT NULL,
  `trip_status` enum('COMPLETED','INPROGRESS') DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`trip_id`),
  KEY `booking_id_idx` (`booking_id`),
  CONSTRAINT `booking_id` FOREIGN KEY (`booking_id`) REFERENCES `booking` (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip`
--

LOCK TABLES `trip` WRITE;
/*!40000 ALTER TABLE `trip` DISABLE KEYS */;
/*!40000 ALTER TABLE `trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_type` enum('DRIVER','USER','TEST','ADMIN') DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `mobile_number` bigint DEFAULT NULL,
  `email_id` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` enum('MALE','FEMALE','OTHERS') DEFAULT NULL,
  `active` enum('Y','N') DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `base_location` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `mobile_number_UNIQUE` (`mobile_number`),
  UNIQUE KEY `email_id_UNIQUE` (`email_id`),
  KEY `base_location_idx` (`base_location`),
  CONSTRAINT `location_id` FOREIGN KEY (`base_location`) REFERENCES `location` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COMMENT='user_id';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-18 12:41:41
