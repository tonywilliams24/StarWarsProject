-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: starwarsapi
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `films`
--

DROP TABLE IF EXISTS `films`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `films` (
  `filmsid` int unsigned NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `episode_id` int unsigned DEFAULT NULL,
  `opening_crawl` varchar(1000) DEFAULT NULL,
  `director` varchar(100) DEFAULT NULL,
  `producer` varchar(100) DEFAULT NULL,
  `release_date` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`filmsid`),
  KEY `films_filmsid_IDX` (`filmsid`) USING BTREE,
  KEY `films_title_IDX` (`title`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films`
--

LOCK TABLES `films` WRITE;
/*!40000 ALTER TABLE `films` DISABLE KEYS */;
INSERT INTO `films` VALUES (1,'A New Hope',4,'It is a period of civil war.\r\nRebel spaceships, striking\r\nfrom a hidden base, have won\r\ntheir first victory against\r\nthe evil Galactic Empire.\r\n\r\nDuring the battle, Rebel\r\nspies managed to steal secret\r\nplans to the Empire\'s\r\nultimate weapon, the DEATH\r\nSTAR, an armored space\r\nstation with enough power\r\nto destroy an entire planet.\r\n\r\nPursued by the Empire\'s\r\nsinister agents, Princess\r\nLeia races home aboard her\r\nstarship, custodian of the\r\nstolen plans that can save her\r\npeople and restore\r\nfreedom to the galaxy....','George Lucas','Gary Kurtz, Rick McCallum','1977-05-25','2014-12-10T14:23:31.880000Z','2014-12-20T19:49:45.256000Z','http://swapi.dev/api/films/1/'),(2,'The Empire Strikes Back',5,'It is a dark time for the\r\nRebellion. Although the Death\r\nStar has been destroyed,\r\nImperial troops have driven the\r\nRebel forces from their hidden\r\nbase and pursued them across\r\nthe galaxy.\r\n\r\nEvading the dreaded Imperial\r\nStarfleet, a group of freedom\r\nfighters led by Luke Skywalker\r\nhas established a new secret\r\nbase on the remote ice world\r\nof Hoth.\r\n\r\nThe evil lord Darth Vader,\r\nobsessed with finding young\r\nSkywalker, has dispatched\r\nthousands of remote probes into\r\nthe far reaches of space....','Irvin Kershner','Gary Kurtz, Rick McCallum','1980-05-17','2014-12-12T11:26:24.656000Z','2014-12-15T13:07:53.386000Z','http://swapi.dev/api/films/2/'),(3,'Return of the Jedi',6,'Luke Skywalker has returned to\r\nhis home planet of Tatooine in\r\nan attempt to rescue his\r\nfriend Han Solo from the\r\nclutches of the vile gangster\r\nJabba the Hutt.\r\n\r\nLittle does Luke know that the\r\nGALACTIC EMPIRE has secretly\r\nbegun construction on a new\r\narmored space station even\r\nmore powerful than the first\r\ndreaded Death Star.\r\n\r\nWhen completed, this ultimate\r\nweapon will spell certain doom\r\nfor the small band of rebels\r\nstruggling to restore freedom\r\nto the galaxy...','Richard Marquand','Howard G. Kazanjian, George Lucas, Rick McCallum','1983-05-25','2014-12-18T10:39:33.255000Z','2014-12-20T09:48:37.462000Z','http://swapi.dev/api/films/3/'),(4,'The Phantom Menace',1,'Turmoil has engulfed the\r\nGalactic Republic. The taxation\r\nof trade routes to outlying star\r\nsystems is in dispute.\r\n\r\nHoping to resolve the matter\r\nwith a blockade of deadly\r\nbattleships, the greedy Trade\r\nFederation has stopped all\r\nshipping to the small planet\r\nof Naboo.\r\n\r\nWhile the Congress of the\r\nRepublic endlessly debates\r\nthis alarming chain of events,\r\nthe Supreme Chancellor has\r\nsecretly dispatched two Jedi\r\nKnights, the guardians of\r\npeace and justice in the\r\ngalaxy, to settle the conflict....','George Lucas','Rick McCallum','1999-05-19','2014-12-19T16:52:55.740000Z','2014-12-20T10:54:07.216000Z','http://swapi.dev/api/films/4/'),(5,'Attack of the Clones',2,'There is unrest in the Galactic\r\nSenate. Several thousand solar\r\nsystems have declared their\r\nintentions to leave the Republic.\r\n\r\nThis separatist movement,\r\nunder the leadership of the\r\nmysterious Count Dooku, has\r\nmade it difficult for the limited\r\nnumber of Jedi Knights to maintain \r\npeace and order in the galaxy.\r\n\r\nSenator Amidala, the former\r\nQueen of Naboo, is returning\r\nto the Galactic Senate to vote\r\non the critical issue of creating\r\nan ARMY OF THE REPUBLIC\r\nto assist the overwhelmed\r\nJedi....','George Lucas','Rick McCallum','2002-05-16','2014-12-20T10:57:57.886000Z','2014-12-20T20:18:48.516000Z','http://swapi.dev/api/films/5/'),(6,'Revenge of the Sith',3,'War! The Republic is crumbling\r\nunder attacks by the ruthless\r\nSith Lord, Count Dooku.\r\nThere are heroes on both sides.\r\nEvil is everywhere.\r\n\r\nIn a stunning move, the\r\nfiendish droid leader, General\r\nGrievous, has swept into the\r\nRepublic capital and kidnapped\r\nChancellor Palpatine, leader of\r\nthe Galactic Senate.\r\n\r\nAs the Separatist Droid Army\r\nattempts to flee the besieged\r\ncapital with their valuable\r\nhostage, two Jedi Knights lead a\r\ndesperate mission to rescue the\r\ncaptive Chancellor....','George Lucas','Rick McCallum','2005-05-19','2014-12-20T18:49:38.403000Z','2014-12-20T20:47:52.073000Z','http://swapi.dev/api/films/6/');
/*!40000 ALTER TABLE `films` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `films_planets`
--

DROP TABLE IF EXISTS `films_planets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `films_planets` (
  `filmsid` int unsigned NOT NULL,
  `planetsid` int unsigned NOT NULL,
  PRIMARY KEY (`filmsid`,`planetsid`),
  KEY `films_planets_FK_1` (`planetsid`),
  CONSTRAINT `films_planets_FK` FOREIGN KEY (`filmsid`) REFERENCES `films` (`filmsid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `films_planets_FK_1` FOREIGN KEY (`planetsid`) REFERENCES `planets` (`planetsid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films_planets`
--

LOCK TABLES `films_planets` WRITE;
/*!40000 ALTER TABLE `films_planets` DISABLE KEYS */;
/*!40000 ALTER TABLE `films_planets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `films_species`
--

DROP TABLE IF EXISTS `films_species`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `films_species` (
  `filmsid` int unsigned NOT NULL,
  `speciesid` int unsigned NOT NULL,
  PRIMARY KEY (`filmsid`,`speciesid`),
  KEY `films_species_FK_1` (`speciesid`),
  CONSTRAINT `films_species_FK` FOREIGN KEY (`filmsid`) REFERENCES `films` (`filmsid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `films_species_FK_1` FOREIGN KEY (`speciesid`) REFERENCES `species` (`speciesid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films_species`
--

LOCK TABLES `films_species` WRITE;
/*!40000 ALTER TABLE `films_species` DISABLE KEYS */;
/*!40000 ALTER TABLE `films_species` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `films_starships`
--

DROP TABLE IF EXISTS `films_starships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `films_starships` (
  `filmsid` int unsigned NOT NULL,
  `starshipsid` int unsigned NOT NULL,
  PRIMARY KEY (`filmsid`,`starshipsid`),
  KEY `films_starships_FK_1` (`starshipsid`),
  CONSTRAINT `films_starships_FK` FOREIGN KEY (`filmsid`) REFERENCES `films` (`filmsid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `films_starships_FK_1` FOREIGN KEY (`starshipsid`) REFERENCES `starships` (`starshipsid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films_starships`
--

LOCK TABLES `films_starships` WRITE;
/*!40000 ALTER TABLE `films_starships` DISABLE KEYS */;
/*!40000 ALTER TABLE `films_starships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `films_vehicles`
--

DROP TABLE IF EXISTS `films_vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `films_vehicles` (
  `filmsid` int unsigned NOT NULL,
  `vehiclesid` int unsigned NOT NULL,
  PRIMARY KEY (`filmsid`,`vehiclesid`),
  KEY `films_vehicles_FK_1` (`vehiclesid`),
  CONSTRAINT `films_vehicles_FK` FOREIGN KEY (`filmsid`) REFERENCES `films` (`filmsid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `films_vehicles_FK_1` FOREIGN KEY (`vehiclesid`) REFERENCES `vehicles` (`vehiclesid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films_vehicles`
--

LOCK TABLES `films_vehicles` WRITE;
/*!40000 ALTER TABLE `films_vehicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `films_vehicles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people`
--

DROP TABLE IF EXISTS `people`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people` (
  `peopleid` int unsigned NOT NULL,
  `name` varchar(100) NOT NULL,
  `height` varchar(100) DEFAULT NULL,
  `mass` varchar(100) DEFAULT NULL,
  `hair_color` varchar(100) DEFAULT NULL,
  `skin_color` varchar(100) DEFAULT NULL,
  `eye_color` varchar(100) DEFAULT NULL,
  `birth_year` varchar(100) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `homeworld` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`peopleid`),
  UNIQUE KEY `people_id_IDX` (`peopleid`) USING BTREE,
  KEY `people_name_IDX` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people`
--

LOCK TABLES `people` WRITE;
/*!40000 ALTER TABLE `people` DISABLE KEYS */;
INSERT INTO `people` VALUES (1,'Luke Skywalker','172','77','blond','fair','blue','19BBY','male','http://swapi.dev/api/planets/1/','2014-12-09T13:50:51.644000Z','2014-12-20T21:17:56.891000Z','http://swapi.dev/api/people/1/'),(2,'C-3PO','167','75','n/a','gold','yellow','112BBY','n/a','http://swapi.dev/api/planets/1/','2014-12-10T15:10:51.357000Z','2014-12-20T21:17:50.309000Z','http://swapi.dev/api/people/2/'),(3,'R2-D2','96','32','n/a','white, blue','red','33BBY','n/a','http://swapi.dev/api/planets/8/','2014-12-10T15:11:50.376000Z','2014-12-20T21:17:50.311000Z','http://swapi.dev/api/people/3/'),(4,'Darth Vader','202','136','none','white','yellow','41.9BBY','male','http://swapi.dev/api/planets/1/','2014-12-10T15:18:20.704000Z','2014-12-20T21:17:50.313000Z','http://swapi.dev/api/people/4/'),(5,'Leia Organa','150','49','brown','light','brown','19BBY','female','http://swapi.dev/api/planets/2/','2014-12-10T15:20:09.791000Z','2014-12-20T21:17:50.315000Z','http://swapi.dev/api/people/5/'),(6,'Owen Lars','178','120','brown, grey','light','blue','52BBY','male','http://swapi.dev/api/planets/1/','2014-12-10T15:52:14.024000Z','2014-12-20T21:17:50.317000Z','http://swapi.dev/api/people/6/'),(7,'Beru Whitesun lars','165','75','brown','light','blue','47BBY','female','http://swapi.dev/api/planets/1/','2014-12-10T15:53:41.121000Z','2014-12-20T21:17:50.319000Z','http://swapi.dev/api/people/7/'),(8,'R5-D4','97','32','n/a','white, red','red','unknown','n/a','http://swapi.dev/api/planets/1/','2014-12-10T15:57:50.959000Z','2014-12-20T21:17:50.321000Z','http://swapi.dev/api/people/8/'),(9,'Biggs Darklighter','183','84','black','light','brown','24BBY','male','http://swapi.dev/api/planets/1/','2014-12-10T15:59:50.509000Z','2014-12-20T21:17:50.323000Z','http://swapi.dev/api/people/9/'),(10,'Obi-Wan Kenobi','182','77','auburn, white','fair','blue-gray','57BBY','male','http://swapi.dev/api/planets/20/','2014-12-10T16:16:29.192000Z','2014-12-20T21:17:50.325000Z','http://swapi.dev/api/people/10/'),(11,'Anakin Skywalker','188','84','blond','fair','blue','41.9BBY','male','http://swapi.dev/api/planets/1/','2014-12-10T16:20:44.310000Z','2014-12-20T21:17:50.327000Z','http://swapi.dev/api/people/11/'),(12,'Wilhuff Tarkin','180','unknown','auburn, grey','fair','blue','64BBY','male','http://swapi.dev/api/planets/21/','2014-12-10T16:26:56.138000Z','2014-12-20T21:17:50.330000Z','http://swapi.dev/api/people/12/'),(13,'Chewbacca','228','112','brown','unknown','blue','200BBY','male','http://swapi.dev/api/planets/14/','2014-12-10T16:42:45.066000Z','2014-12-20T21:17:50.332000Z','http://swapi.dev/api/people/13/'),(14,'Han Solo','180','80','brown','fair','brown','29BBY','male','http://swapi.dev/api/planets/22/','2014-12-10T16:49:14.582000Z','2014-12-20T21:17:50.334000Z','http://swapi.dev/api/people/14/'),(15,'Greedo','173','74','n/a','green','black','44BBY','male','http://swapi.dev/api/planets/23/','2014-12-10T17:03:30.334000Z','2014-12-20T21:17:50.336000Z','http://swapi.dev/api/people/15/'),(16,'Jabba Desilijic Tiure','175','1,358','n/a','green-tan, brown','orange','600BBY','hermaphrodite','http://swapi.dev/api/planets/24/','2014-12-10T17:11:31.638000Z','2014-12-20T21:17:50.338000Z','http://swapi.dev/api/people/16/'),(18,'Wedge Antilles','170','77','brown','fair','hazel','21BBY','male','http://swapi.dev/api/planets/22/','2014-12-12T11:08:06.469000Z','2014-12-20T21:17:50.341000Z','http://swapi.dev/api/people/18/'),(19,'Jek Tono Porkins','180','110','brown','fair','blue','unknown','male','http://swapi.dev/api/planets/26/','2014-12-12T11:16:56.569000Z','2014-12-20T21:17:50.343000Z','http://swapi.dev/api/people/19/'),(20,'Yoda','66','17','white','green','brown','896BBY','male','http://swapi.dev/api/planets/28/','2014-12-15T12:26:01.042000Z','2014-12-20T21:17:50.345000Z','http://swapi.dev/api/people/20/'),(21,'Palpatine','170','75','grey','pale','yellow','82BBY','male','http://swapi.dev/api/planets/8/','2014-12-15T12:48:05.971000Z','2014-12-20T21:17:50.347000Z','http://swapi.dev/api/people/21/'),(22,'Boba Fett','183','78.2','black','fair','brown','31.5BBY','male','http://swapi.dev/api/planets/10/','2014-12-15T12:49:32.457000Z','2014-12-20T21:17:50.349000Z','http://swapi.dev/api/people/22/'),(23,'IG-88','200','140','none','metal','red','15BBY','none','http://swapi.dev/api/planets/28/','2014-12-15T12:51:10.076000Z','2014-12-20T21:17:50.351000Z','http://swapi.dev/api/people/23/'),(24,'Bossk','190','113','none','green','red','53BBY','male','http://swapi.dev/api/planets/29/','2014-12-15T12:53:49.297000Z','2014-12-20T21:17:50.355000Z','http://swapi.dev/api/people/24/'),(25,'Lando Calrissian','177','79','black','dark','brown','31BBY','male','http://swapi.dev/api/planets/30/','2014-12-15T12:56:32.683000Z','2014-12-20T21:17:50.357000Z','http://swapi.dev/api/people/25/'),(26,'Lobot','175','79','none','light','blue','37BBY','male','http://swapi.dev/api/planets/6/','2014-12-15T13:01:57.178000Z','2014-12-20T21:17:50.359000Z','http://swapi.dev/api/people/26/'),(27,'Ackbar','180','83','none','brown mottle','orange','41BBY','male','http://swapi.dev/api/planets/31/','2014-12-18T11:07:50.584000Z','2014-12-20T21:17:50.362000Z','http://swapi.dev/api/people/27/'),(28,'Mon Mothma','150','unknown','auburn','fair','blue','48BBY','female','http://swapi.dev/api/planets/32/','2014-12-18T11:12:38.895000Z','2014-12-20T21:17:50.364000Z','http://swapi.dev/api/people/28/'),(29,'Arvel Crynyd','unknown','unknown','brown','fair','brown','unknown','male','http://swapi.dev/api/planets/28/','2014-12-18T11:16:33.020000Z','2014-12-20T21:17:50.367000Z','http://swapi.dev/api/people/29/'),(30,'Wicket Systri Warrick','88','20','brown','brown','brown','8BBY','male','http://swapi.dev/api/planets/7/','2014-12-18T11:21:58.954000Z','2014-12-20T21:17:50.369000Z','http://swapi.dev/api/people/30/'),(31,'Nien Nunb','160','68','none','grey','black','unknown','male','http://swapi.dev/api/planets/33/','2014-12-18T11:26:18.541000Z','2014-12-20T21:17:50.371000Z','http://swapi.dev/api/people/31/'),(32,'Qui-Gon Jinn','193','89','brown','fair','blue','92BBY','male','http://swapi.dev/api/planets/28/','2014-12-19T16:54:53.618000Z','2014-12-20T21:17:50.375000Z','http://swapi.dev/api/people/32/'),(33,'Nute Gunray','191','90','none','mottled green','red','unknown','male','http://swapi.dev/api/planets/18/','2014-12-19T17:05:57.357000Z','2014-12-20T21:17:50.377000Z','http://swapi.dev/api/people/33/'),(34,'Finis Valorum','170','unknown','blond','fair','blue','91BBY','male','http://swapi.dev/api/planets/9/','2014-12-19T17:21:45.915000Z','2014-12-20T21:17:50.379000Z','http://swapi.dev/api/people/34/'),(35,'Padmé Amidala','185','45','brown','light','brown','46BBY','female','http://swapi.dev/api/planets/8/','2014-12-19T17:28:26.926000Z','2014-12-20T21:17:50.381000Z','http://swapi.dev/api/people/35/'),(36,'Jar Jar Binks','196','66','none','orange','orange','52BBY','male','http://swapi.dev/api/planets/8/','2014-12-19T17:29:32.489000Z','2014-12-20T21:17:50.383000Z','http://swapi.dev/api/people/36/'),(37,'Roos Tarpals','224','82','none','grey','orange','unknown','male','http://swapi.dev/api/planets/8/','2014-12-19T17:32:56.741000Z','2014-12-20T21:17:50.385000Z','http://swapi.dev/api/people/37/'),(38,'Rugor Nass','206','unknown','none','green','orange','unknown','male','http://swapi.dev/api/planets/8/','2014-12-19T17:33:38.909000Z','2014-12-20T21:17:50.388000Z','http://swapi.dev/api/people/38/'),(39,'Ric Olié','183','unknown','brown','fair','blue','unknown','male','http://swapi.dev/api/planets/8/','2014-12-19T17:45:01.522000Z','2014-12-20T21:17:50.392000Z','http://swapi.dev/api/people/39/'),(40,'Watto','137','unknown','black','blue, grey','yellow','unknown','male','http://swapi.dev/api/planets/34/','2014-12-19T17:48:54.647000Z','2014-12-20T21:17:50.395000Z','http://swapi.dev/api/people/40/'),(41,'Sebulba','112','40','none','grey, red','orange','unknown','male','http://swapi.dev/api/planets/35/','2014-12-19T17:53:02.586000Z','2014-12-20T21:17:50.397000Z','http://swapi.dev/api/people/41/'),(42,'Quarsh Panaka','183','unknown','black','dark','brown','62BBY','male','http://swapi.dev/api/planets/8/','2014-12-19T17:55:43.348000Z','2014-12-20T21:17:50.399000Z','http://swapi.dev/api/people/42/'),(43,'Shmi Skywalker','163','unknown','black','fair','brown','72BBY','female','http://swapi.dev/api/planets/1/','2014-12-19T17:57:41.191000Z','2014-12-20T21:17:50.401000Z','http://swapi.dev/api/people/43/'),(44,'Darth Maul','175','80','none','red','yellow','54BBY','male','http://swapi.dev/api/planets/36/','2014-12-19T18:00:41.929000Z','2014-12-20T21:17:50.403000Z','http://swapi.dev/api/people/44/'),(45,'Bib Fortuna','180','unknown','none','pale','pink','unknown','male','http://swapi.dev/api/planets/37/','2014-12-20T09:47:02.512000Z','2014-12-20T21:17:50.407000Z','http://swapi.dev/api/people/45/'),(46,'Ayla Secura','178','55','none','blue','hazel','48BBY','female','http://swapi.dev/api/planets/37/','2014-12-20T09:48:01.172000Z','2014-12-20T21:17:50.409000Z','http://swapi.dev/api/people/46/'),(47,'Ratts Tyerel','79','15','none','grey, blue','unknown','unknown','male','http://swapi.dev/api/planets/38/','2014-12-20T09:53:15.086000Z','2014-12-20T21:17:50.410000Z','http://swapi.dev/api/people/47/'),(48,'Dud Bolt','94','45','none','blue, grey','yellow','unknown','male','http://swapi.dev/api/planets/39/','2014-12-20T09:57:31.858000Z','2014-12-20T21:17:50.414000Z','http://swapi.dev/api/people/48/'),(49,'Gasgano','122','unknown','none','white, blue','black','unknown','male','http://swapi.dev/api/planets/40/','2014-12-20T10:02:12.223000Z','2014-12-20T21:17:50.416000Z','http://swapi.dev/api/people/49/'),(50,'Ben Quadinaros','163','65','none','grey, green, yellow','orange','unknown','male','http://swapi.dev/api/planets/41/','2014-12-20T10:08:33.777000Z','2014-12-20T21:17:50.417000Z','http://swapi.dev/api/people/50/'),(51,'Mace Windu','188','84','none','dark','brown','72BBY','male','http://swapi.dev/api/planets/42/','2014-12-20T10:12:30.846000Z','2014-12-20T21:17:50.420000Z','http://swapi.dev/api/people/51/'),(52,'Ki-Adi-Mundi','198','82','white','pale','yellow','92BBY','male','http://swapi.dev/api/planets/43/','2014-12-20T10:15:32.293000Z','2014-12-20T21:17:50.422000Z','http://swapi.dev/api/people/52/'),(53,'Kit Fisto','196','87','none','green','black','unknown','male','http://swapi.dev/api/planets/44/','2014-12-20T10:18:57.202000Z','2014-12-20T21:17:50.424000Z','http://swapi.dev/api/people/53/'),(54,'Eeth Koth','171','unknown','black','brown','brown','unknown','male','http://swapi.dev/api/planets/45/','2014-12-20T10:26:47.902000Z','2014-12-20T21:17:50.427000Z','http://swapi.dev/api/people/54/'),(55,'Adi Gallia','184','50','none','dark','blue','unknown','female','http://swapi.dev/api/planets/9/','2014-12-20T10:29:11.661000Z','2014-12-20T21:17:50.432000Z','http://swapi.dev/api/people/55/'),(56,'Saesee Tiin','188','unknown','none','pale','orange','unknown','male','http://swapi.dev/api/planets/47/','2014-12-20T10:32:11.669000Z','2014-12-20T21:17:50.434000Z','http://swapi.dev/api/people/56/'),(57,'Yarael Poof','264','unknown','none','white','yellow','unknown','male','http://swapi.dev/api/planets/48/','2014-12-20T10:34:48.725000Z','2014-12-20T21:17:50.437000Z','http://swapi.dev/api/people/57/'),(58,'Plo Koon','188','80','none','orange','black','22BBY','male','http://swapi.dev/api/planets/49/','2014-12-20T10:49:19.859000Z','2014-12-20T21:17:50.439000Z','http://swapi.dev/api/people/58/'),(59,'Mas Amedda','196','unknown','none','blue','blue','unknown','male','http://swapi.dev/api/planets/50/','2014-12-20T10:53:26.457000Z','2014-12-20T21:17:50.442000Z','http://swapi.dev/api/people/59/'),(60,'Gregar Typho','185','85','black','dark','brown','unknown','male','http://swapi.dev/api/planets/8/','2014-12-20T11:10:10.381000Z','2014-12-20T21:17:50.445000Z','http://swapi.dev/api/people/60/'),(61,'Cordé','157','unknown','brown','light','brown','unknown','female','http://swapi.dev/api/planets/8/','2014-12-20T11:11:39.630000Z','2014-12-20T21:17:50.449000Z','http://swapi.dev/api/people/61/'),(62,'Cliegg Lars','183','unknown','brown','fair','blue','82BBY','male','http://swapi.dev/api/planets/1/','2014-12-20T15:59:03.958000Z','2014-12-20T21:17:50.451000Z','http://swapi.dev/api/people/62/'),(63,'Poggle the Lesser','183','80','none','green','yellow','unknown','male','http://swapi.dev/api/planets/11/','2014-12-20T16:40:43.977000Z','2014-12-20T21:17:50.453000Z','http://swapi.dev/api/people/63/'),(64,'Luminara Unduli','170','56.2','black','yellow','blue','58BBY','female','http://swapi.dev/api/planets/51/','2014-12-20T16:45:53.668000Z','2014-12-20T21:17:50.455000Z','http://swapi.dev/api/people/64/'),(65,'Barriss Offee','166','50','black','yellow','blue','40BBY','female','http://swapi.dev/api/planets/51/','2014-12-20T16:46:40.440000Z','2014-12-20T21:17:50.457000Z','http://swapi.dev/api/people/65/'),(66,'Dormé','165','unknown','brown','light','brown','unknown','female','http://swapi.dev/api/planets/8/','2014-12-20T16:49:14.640000Z','2014-12-20T21:17:50.460000Z','http://swapi.dev/api/people/66/'),(67,'Dooku','193','80','white','fair','brown','102BBY','male','http://swapi.dev/api/planets/52/','2014-12-20T16:52:14.726000Z','2014-12-20T21:17:50.462000Z','http://swapi.dev/api/people/67/'),(68,'Bail Prestor Organa','191','unknown','black','tan','brown','67BBY','male','http://swapi.dev/api/planets/2/','2014-12-20T16:53:08.575000Z','2014-12-20T21:17:50.463000Z','http://swapi.dev/api/people/68/'),(69,'Jango Fett','183','79','black','tan','brown','66BBY','male','http://swapi.dev/api/planets/53/','2014-12-20T16:54:41.620000Z','2014-12-20T21:17:50.465000Z','http://swapi.dev/api/people/69/'),(70,'Zam Wesell','168','55','blonde','fair, green, yellow','yellow','unknown','female','http://swapi.dev/api/planets/54/','2014-12-20T16:57:44.471000Z','2014-12-20T21:17:50.468000Z','http://swapi.dev/api/people/70/'),(71,'Dexter Jettster','198','102','none','brown','yellow','unknown','male','http://swapi.dev/api/planets/55/','2014-12-20T17:28:27.248000Z','2014-12-20T21:17:50.470000Z','http://swapi.dev/api/people/71/'),(72,'Lama Su','229','88','none','grey','black','unknown','male','http://swapi.dev/api/planets/10/','2014-12-20T17:30:50.416000Z','2014-12-20T21:17:50.473000Z','http://swapi.dev/api/people/72/'),(73,'Taun We','213','unknown','none','grey','black','unknown','female','http://swapi.dev/api/planets/10/','2014-12-20T17:31:21.195000Z','2014-12-20T21:17:50.474000Z','http://swapi.dev/api/people/73/'),(74,'Jocasta Nu','167','unknown','white','fair','blue','unknown','female','http://swapi.dev/api/planets/9/','2014-12-20T17:32:51.996000Z','2014-12-20T21:17:50.476000Z','http://swapi.dev/api/people/74/'),(75,'R4-P17','96','unknown','none','silver, red','red, blue','unknown','female','http://swapi.dev/api/planets/28/','2014-12-20T17:43:36.409000Z','2014-12-20T21:17:50.478000Z','http://swapi.dev/api/people/75/'),(76,'Wat Tambor','193','48','none','green, grey','unknown','unknown','male','http://swapi.dev/api/planets/56/','2014-12-20T17:53:52.607000Z','2014-12-20T21:17:50.481000Z','http://swapi.dev/api/people/76/'),(77,'San Hill','191','unknown','none','grey','gold','unknown','male','http://swapi.dev/api/planets/57/','2014-12-20T17:58:17.049000Z','2014-12-20T21:17:50.484000Z','http://swapi.dev/api/people/77/'),(78,'Shaak Ti','178','57','none','red, blue, white','black','unknown','female','http://swapi.dev/api/planets/58/','2014-12-20T18:44:01.103000Z','2014-12-20T21:17:50.486000Z','http://swapi.dev/api/people/78/'),(79,'Grievous','216','159','none','brown, white','green, yellow','unknown','male','http://swapi.dev/api/planets/59/','2014-12-20T19:43:53.348000Z','2014-12-20T21:17:50.488000Z','http://swapi.dev/api/people/79/'),(80,'Tarfful','234','136','brown','brown','blue','unknown','male','http://swapi.dev/api/planets/14/','2014-12-20T19:46:34.209000Z','2014-12-20T21:17:50.491000Z','http://swapi.dev/api/people/80/'),(81,'Raymus Antilles','188','79','brown','light','brown','unknown','male','http://swapi.dev/api/planets/2/','2014-12-20T19:49:35.583000Z','2014-12-20T21:17:50.493000Z','http://swapi.dev/api/people/81/'),(82,'Sly Moore','178','48','none','pale','white','unknown','female','http://swapi.dev/api/planets/60/','2014-12-20T20:18:37.619000Z','2014-12-20T21:17:50.496000Z','http://swapi.dev/api/people/82/'),(83,'Tion Medon','206','80','none','grey','black','unknown','male','http://swapi.dev/api/planets/12/','2014-12-20T20:35:04.260000Z','2014-12-20T21:17:50.498000Z','http://swapi.dev/api/people/83/');
/*!40000 ALTER TABLE `people` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people_films`
--

DROP TABLE IF EXISTS `people_films`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_films` (
  `peopleid` int unsigned NOT NULL,
  `filmsid` int unsigned NOT NULL,
  PRIMARY KEY (`peopleid`,`filmsid`),
  KEY `people_films_FK_1` (`filmsid`),
  CONSTRAINT `people_films_FK` FOREIGN KEY (`peopleid`) REFERENCES `people` (`peopleid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `people_films_FK_1` FOREIGN KEY (`filmsid`) REFERENCES `films` (`filmsid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_films`
--

LOCK TABLES `people_films` WRITE;
/*!40000 ALTER TABLE `people_films` DISABLE KEYS */;
/*!40000 ALTER TABLE `people_films` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people_planets`
--

DROP TABLE IF EXISTS `people_planets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_planets` (
  `peopleid` int unsigned NOT NULL,
  `planetsid` int unsigned NOT NULL,
  PRIMARY KEY (`peopleid`,`planetsid`),
  KEY `people_planets_FK_1` (`planetsid`),
  CONSTRAINT `people_planets_FK` FOREIGN KEY (`peopleid`) REFERENCES `people` (`peopleid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `people_planets_FK_1` FOREIGN KEY (`planetsid`) REFERENCES `planets` (`planetsid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_planets`
--

LOCK TABLES `people_planets` WRITE;
/*!40000 ALTER TABLE `people_planets` DISABLE KEYS */;
/*!40000 ALTER TABLE `people_planets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people_species`
--

DROP TABLE IF EXISTS `people_species`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_species` (
  `peopleid` int unsigned NOT NULL,
  `speciesid` int unsigned NOT NULL,
  PRIMARY KEY (`peopleid`,`speciesid`),
  KEY `people_species_FK_1` (`speciesid`),
  CONSTRAINT `people_species_FK` FOREIGN KEY (`peopleid`) REFERENCES `people` (`peopleid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `people_species_FK_1` FOREIGN KEY (`speciesid`) REFERENCES `species` (`speciesid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_species`
--

LOCK TABLES `people_species` WRITE;
/*!40000 ALTER TABLE `people_species` DISABLE KEYS */;
/*!40000 ALTER TABLE `people_species` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people_starships`
--

DROP TABLE IF EXISTS `people_starships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_starships` (
  `peopleid` int unsigned NOT NULL,
  `starshipsid` int unsigned NOT NULL,
  PRIMARY KEY (`peopleid`,`starshipsid`),
  KEY `people_starships_FK_1` (`starshipsid`),
  CONSTRAINT `people_starships_FK` FOREIGN KEY (`peopleid`) REFERENCES `people` (`peopleid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `people_starships_FK_1` FOREIGN KEY (`starshipsid`) REFERENCES `starships` (`starshipsid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_starships`
--

LOCK TABLES `people_starships` WRITE;
/*!40000 ALTER TABLE `people_starships` DISABLE KEYS */;
/*!40000 ALTER TABLE `people_starships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `people_vehicles`
--

DROP TABLE IF EXISTS `people_vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_vehicles` (
  `peopleid` int unsigned NOT NULL,
  `vehiclesid` int unsigned NOT NULL,
  KEY `people_vehicles_FK` (`peopleid`),
  KEY `people_vehicles_FK_1` (`vehiclesid`),
  CONSTRAINT `people_vehicles_FK` FOREIGN KEY (`peopleid`) REFERENCES `people` (`peopleid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `people_vehicles_FK_1` FOREIGN KEY (`vehiclesid`) REFERENCES `vehicles` (`vehiclesid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_vehicles`
--

LOCK TABLES `people_vehicles` WRITE;
/*!40000 ALTER TABLE `people_vehicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `people_vehicles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planets`
--

DROP TABLE IF EXISTS `planets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planets` (
  `planetsid` int unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `rotation_period` varchar(100) DEFAULT NULL,
  `orbital_period` varchar(100) DEFAULT NULL,
  `diameter` varchar(100) DEFAULT NULL,
  `climate` varchar(100) DEFAULT NULL,
  `gravity` varchar(100) DEFAULT NULL,
  `terrain` varchar(100) DEFAULT NULL,
  `surface_water` varchar(100) DEFAULT NULL,
  `population` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`planetsid`),
  KEY `planets_planetsid_IDX` (`planetsid`) USING BTREE,
  KEY `planets_name_IDX` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planets`
--

LOCK TABLES `planets` WRITE;
/*!40000 ALTER TABLE `planets` DISABLE KEYS */;
INSERT INTO `planets` VALUES (1,'Tatooine','23','304','10465','arid','1 standard','desert','1','200000','2014-12-09T13:50:49.641000Z','2014-12-20T20:58:18.411000Z','http://swapi.dev/api/planets/1/'),(2,'Alderaan','24','364','12500','temperate','1 standard','grasslands, mountains','40','2000000000','2014-12-10T11:35:48.479000Z','2014-12-20T20:58:18.420000Z','http://swapi.dev/api/planets/2/'),(3,'Yavin IV','24','4818','10200','temperate, tropical','1 standard','jungle, rainforests','8','1000','2014-12-10T11:37:19.144000Z','2014-12-20T20:58:18.421000Z','http://swapi.dev/api/planets/3/'),(4,'Hoth','23','549','7200','frozen','1.1 standard','tundra, ice caves, mountain ranges','100','unknown','2014-12-10T11:39:13.934000Z','2014-12-20T20:58:18.423000Z','http://swapi.dev/api/planets/4/'),(5,'Dagobah','23','341','8900','murky','N/A','swamp, jungles','8','unknown','2014-12-10T11:42:22.590000Z','2014-12-20T20:58:18.425000Z','http://swapi.dev/api/planets/5/'),(6,'Bespin','12','5110','118000','temperate','1.5 (surface), 1 standard (Cloud City)','gas giant','0','6000000','2014-12-10T11:43:55.240000Z','2014-12-20T20:58:18.427000Z','http://swapi.dev/api/planets/6/'),(7,'Endor','18','402','4900','temperate','0.85 standard','forests, mountains, lakes','8','30000000','2014-12-10T11:50:29.349000Z','2014-12-20T20:58:18.429000Z','http://swapi.dev/api/planets/7/'),(8,'Naboo','26','312','12120','temperate','1 standard','grassy hills, swamps, forests, mountains','12','4500000000','2014-12-10T11:52:31.066000Z','2014-12-20T20:58:18.430000Z','http://swapi.dev/api/planets/8/'),(9,'Coruscant','24','368','12240','temperate','1 standard','cityscape, mountains','unknown','1000000000000','2014-12-10T11:54:13.921000Z','2014-12-20T20:58:18.432000Z','http://swapi.dev/api/planets/9/'),(10,'Kamino','27','463','19720','temperate','1 standard','ocean','100','1000000000','2014-12-10T12:45:06.577000Z','2014-12-20T20:58:18.434000Z','http://swapi.dev/api/planets/10/'),(11,'Geonosis','30','256','11370','temperate, arid','0.9 standard','rock, desert, mountain, barren','5','100000000000','2014-12-10T12:47:22.350000Z','2014-12-20T20:58:18.437000Z','http://swapi.dev/api/planets/11/'),(12,'Utapau','27','351','12900','temperate, arid, windy','1 standard','scrublands, savanna, canyons, sinkholes','0.9','95000000','2014-12-10T12:49:01.491000Z','2014-12-20T20:58:18.439000Z','http://swapi.dev/api/planets/12/'),(13,'Mustafar','36','412','4200','hot','1 standard','volcanoes, lava rivers, mountains, caves','0','20000','2014-12-10T12:50:16.526000Z','2014-12-20T20:58:18.440000Z','http://swapi.dev/api/planets/13/'),(14,'Kashyyyk','26','381','12765','tropical','1 standard','jungle, forests, lakes, rivers','60','45000000','2014-12-10T13:32:00.124000Z','2014-12-20T20:58:18.442000Z','http://swapi.dev/api/planets/14/'),(15,'Polis Massa','24','590','0','artificial temperate ','0.56 standard','airless asteroid','0','1000000','2014-12-10T13:33:46.405000Z','2014-12-20T20:58:18.444000Z','http://swapi.dev/api/planets/15/'),(16,'Mygeeto','12','167','10088','frigid','1 standard','glaciers, mountains, ice canyons','unknown','19000000','2014-12-10T13:43:39.139000Z','2014-12-20T20:58:18.446000Z','http://swapi.dev/api/planets/16/'),(17,'Felucia','34','231','9100','hot, humid','0.75 standard','fungus forests','unknown','8500000','2014-12-10T13:44:50.397000Z','2014-12-20T20:58:18.447000Z','http://swapi.dev/api/planets/17/'),(18,'Cato Neimoidia','25','278','0','temperate, moist','1 standard','mountains, fields, forests, rock arches','unknown','10000000','2014-12-10T13:46:28.704000Z','2014-12-20T20:58:18.449000Z','http://swapi.dev/api/planets/18/'),(19,'Saleucami','26','392','14920','hot','unknown','caves, desert, mountains, volcanoes','unknown','1400000000','2014-12-10T13:47:46.874000Z','2014-12-20T20:58:18.450000Z','http://swapi.dev/api/planets/19/'),(20,'Stewjon','unknown','unknown','0','temperate','1 standard','grass','unknown','unknown','2014-12-10T16:16:26.566000Z','2014-12-20T20:58:18.452000Z','http://swapi.dev/api/planets/20/'),(21,'Eriadu','24','360','13490','polluted','1 standard','cityscape','unknown','22000000000','2014-12-10T16:26:54.384000Z','2014-12-20T20:58:18.454000Z','http://swapi.dev/api/planets/21/'),(22,'Corellia','25','329','11000','temperate','1 standard','plains, urban, hills, forests','70','3000000000','2014-12-10T16:49:12.453000Z','2014-12-20T20:58:18.456000Z','http://swapi.dev/api/planets/22/'),(23,'Rodia','29','305','7549','hot','1 standard','jungles, oceans, urban, swamps','60','1300000000','2014-12-10T17:03:28.110000Z','2014-12-20T20:58:18.458000Z','http://swapi.dev/api/planets/23/'),(24,'Nal Hutta','87','413','12150','temperate','1 standard','urban, oceans, swamps, bogs','unknown','7000000000','2014-12-10T17:11:29.452000Z','2014-12-20T20:58:18.460000Z','http://swapi.dev/api/planets/24/'),(25,'Dantooine','25','378','9830','temperate','1 standard','oceans, savannas, mountains, grasslands','unknown','1000','2014-12-10T17:23:29.896000Z','2014-12-20T20:58:18.461000Z','http://swapi.dev/api/planets/25/'),(26,'Bestine IV','26','680','6400','temperate','unknown','rocky islands, oceans','98','62000000','2014-12-12T11:16:55.078000Z','2014-12-20T20:58:18.463000Z','http://swapi.dev/api/planets/26/'),(27,'Ord Mantell','26','334','14050','temperate','1 standard','plains, seas, mesas','10','4000000000','2014-12-15T12:23:41.661000Z','2014-12-20T20:58:18.464000Z','http://swapi.dev/api/planets/27/'),(29,'Trandosha','25','371','0','arid','0.62 standard','mountains, seas, grasslands, deserts','unknown','42000000','2014-12-15T12:53:47.695000Z','2014-12-20T20:58:18.468000Z','http://swapi.dev/api/planets/29/'),(30,'Socorro','20','326','0','arid','1 standard','deserts, mountains','unknown','300000000','2014-12-15T12:56:31.121000Z','2014-12-20T20:58:18.469000Z','http://swapi.dev/api/planets/30/'),(31,'Mon Cala','21','398','11030','temperate','1','oceans, reefs, islands','100','27000000000','2014-12-18T11:07:01.792000Z','2014-12-20T20:58:18.471000Z','http://swapi.dev/api/planets/31/'),(32,'Chandrila','20','368','13500','temperate','1','plains, forests','40','1200000000','2014-12-18T11:11:51.872000Z','2014-12-20T20:58:18.472000Z','http://swapi.dev/api/planets/32/'),(33,'Sullust','20','263','12780','superheated','1','mountains, volcanoes, rocky deserts','5','18500000000','2014-12-18T11:25:40.243000Z','2014-12-20T20:58:18.474000Z','http://swapi.dev/api/planets/33/'),(34,'Toydaria','21','184','7900','temperate','1','swamps, lakes','unknown','11000000','2014-12-19T17:47:54.403000Z','2014-12-20T20:58:18.476000Z','http://swapi.dev/api/planets/34/'),(35,'Malastare','26','201','18880','arid, temperate, tropical','1.56','swamps, deserts, jungles, mountains','unknown','2000000000','2014-12-19T17:52:13.106000Z','2014-12-20T20:58:18.478000Z','http://swapi.dev/api/planets/35/'),(36,'Dathomir','24','491','10480','temperate','0.9','forests, deserts, savannas','unknown','5200','2014-12-19T18:00:40.142000Z','2014-12-20T20:58:18.480000Z','http://swapi.dev/api/planets/36/'),(37,'Ryloth','30','305','10600','temperate, arid, subartic','1','mountains, valleys, deserts, tundra','5','1500000000','2014-12-20T09:46:25.740000Z','2014-12-20T20:58:18.481000Z','http://swapi.dev/api/planets/37/'),(38,'Aleen Minor','unknown','unknown','unknown','unknown','unknown','unknown','unknown','unknown','2014-12-20T09:52:23.452000Z','2014-12-20T20:58:18.483000Z','http://swapi.dev/api/planets/38/'),(39,'Vulpter','22','391','14900','temperate, artic','1','urban, barren','unknown','421000000','2014-12-20T09:56:58.874000Z','2014-12-20T20:58:18.485000Z','http://swapi.dev/api/planets/39/'),(40,'Troiken','unknown','unknown','unknown','unknown','unknown','desert, tundra, rainforests, mountains','unknown','unknown','2014-12-20T10:01:37.395000Z','2014-12-20T20:58:18.487000Z','http://swapi.dev/api/planets/40/'),(41,'Tund','48','1770','12190','unknown','unknown','barren, ash','unknown','0','2014-12-20T10:07:29.578000Z','2014-12-20T20:58:18.489000Z','http://swapi.dev/api/planets/41/'),(42,'Haruun Kal','25','383','10120','temperate','0.98','toxic cloudsea, plateaus, volcanoes','unknown','705300','2014-12-20T10:12:28.980000Z','2014-12-20T20:58:18.491000Z','http://swapi.dev/api/planets/42/'),(43,'Cerea','27','386','unknown','temperate','1','verdant','20','450000000','2014-12-20T10:14:48.178000Z','2014-12-20T20:58:18.493000Z','http://swapi.dev/api/planets/43/'),(44,'Glee Anselm','33','206','15600','tropical, temperate','1','lakes, islands, swamps, seas','80','500000000','2014-12-20T10:18:26.110000Z','2014-12-20T20:58:18.495000Z','http://swapi.dev/api/planets/44/'),(45,'Iridonia','29','413','unknown','unknown','unknown','rocky canyons, acid pools','unknown','unknown','2014-12-20T10:26:05.788000Z','2014-12-20T20:58:18.497000Z','http://swapi.dev/api/planets/45/'),(46,'Tholoth','unknown','unknown','unknown','unknown','unknown','unknown','unknown','unknown','2014-12-20T10:28:31.117000Z','2014-12-20T20:58:18.498000Z','http://swapi.dev/api/planets/46/'),(47,'Iktotch','22','481','unknown','arid, rocky, windy','1','rocky','unknown','unknown','2014-12-20T10:31:32.413000Z','2014-12-20T20:58:18.500000Z','http://swapi.dev/api/planets/47/'),(48,'Quermia','unknown','unknown','unknown','unknown','unknown','unknown','unknown','unknown','2014-12-20T10:34:08.249000Z','2014-12-20T20:58:18.502000Z','http://swapi.dev/api/planets/48/'),(49,'Dorin','22','409','13400','temperate','1','unknown','unknown','unknown','2014-12-20T10:48:36.141000Z','2014-12-20T20:58:18.504000Z','http://swapi.dev/api/planets/49/'),(50,'Champala','27','318','unknown','temperate','1','oceans, rainforests, plateaus','unknown','3500000000','2014-12-20T10:52:51.524000Z','2014-12-20T20:58:18.506000Z','http://swapi.dev/api/planets/50/'),(51,'Mirial','unknown','unknown','unknown','unknown','unknown','deserts','unknown','unknown','2014-12-20T16:44:46.318000Z','2014-12-20T20:58:18.508000Z','http://swapi.dev/api/planets/51/'),(52,'Serenno','unknown','unknown','unknown','unknown','unknown','rainforests, rivers, mountains','unknown','unknown','2014-12-20T16:52:13.357000Z','2014-12-20T20:58:18.510000Z','http://swapi.dev/api/planets/52/'),(53,'Concord Dawn','unknown','unknown','unknown','unknown','unknown','jungles, forests, deserts','unknown','unknown','2014-12-20T16:54:39.909000Z','2014-12-20T20:58:18.512000Z','http://swapi.dev/api/planets/53/'),(55,'Ojom','unknown','unknown','unknown','frigid','unknown','oceans, glaciers','100','500000000','2014-12-20T17:27:41.286000Z','2014-12-20T20:58:18.516000Z','http://swapi.dev/api/planets/55/'),(56,'Skako','27','384','unknown','temperate','1','urban, vines','unknown','500000000000','2014-12-20T17:50:47.864000Z','2014-12-20T20:58:18.517000Z','http://swapi.dev/api/planets/56/'),(57,'Muunilinst','28','412','13800','temperate','1','plains, forests, hills, mountains','25','5000000000','2014-12-20T17:57:47.420000Z','2014-12-20T20:58:18.519000Z','http://swapi.dev/api/planets/57/'),(58,'Shili','unknown','unknown','unknown','temperate','1','cities, savannahs, seas, plains','unknown','unknown','2014-12-20T18:43:14.049000Z','2014-12-20T20:58:18.521000Z','http://swapi.dev/api/planets/58/'),(59,'Kalee','23','378','13850','arid, temperate, tropical','1','rainforests, cliffs, canyons, seas','unknown','4000000000','2014-12-20T19:43:51.278000Z','2014-12-20T20:58:18.523000Z','http://swapi.dev/api/planets/59/'),(60,'Umbara','unknown','unknown','unknown','unknown','unknown','unknown','unknown','unknown','2014-12-20T20:18:36.256000Z','2014-12-20T20:58:18.525000Z','http://swapi.dev/api/planets/60/');
/*!40000 ALTER TABLE `planets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `species`
--

DROP TABLE IF EXISTS `species`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `species` (
  `speciesid` int unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `classification` varchar(100) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL,
  `average_height` varchar(100) DEFAULT NULL,
  `skin_colors` varchar(100) DEFAULT NULL,
  `hair_colors` varchar(100) DEFAULT NULL,
  `eye_colors` varchar(100) DEFAULT NULL,
  `average_lifespan` varchar(100) DEFAULT NULL,
  `homeworld` varchar(100) DEFAULT NULL,
  `language` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`speciesid`),
  KEY `species_speciesid_IDX` (`speciesid`) USING BTREE,
  KEY `species_name_IDX` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `species`
--

LOCK TABLES `species` WRITE;
/*!40000 ALTER TABLE `species` DISABLE KEYS */;
INSERT INTO `species` VALUES (1,'Human','mammal','sentient','180','caucasian, black, asian, hispanic','blonde, brown, black, red','brown, blue, green, hazel, grey, amber','120','http://swapi.dev/api/planets/9/','Galactic Basic','2014-12-10T13:52:11.567000Z','2014-12-20T21:36:42.136000Z','http://swapi.dev/api/species/1/'),(2,'Droid','artificial','sentient','n/a','n/a','n/a','n/a','indefinite',NULL,'n/a','2014-12-10T15:16:16.259000Z','2014-12-20T21:36:42.139000Z','http://swapi.dev/api/species/2/'),(3,'Wookie','mammal','sentient','210','gray','black, brown','blue, green, yellow, brown, golden, red','400','http://swapi.dev/api/planets/14/','Shyriiwook','2014-12-10T16:44:31.486000Z','2014-12-20T21:36:42.142000Z','http://swapi.dev/api/species/3/'),(4,'Rodian','sentient','reptilian','170','green, blue','n/a','black','unknown','http://swapi.dev/api/planets/23/','Galatic Basic','2014-12-10T17:05:26.471000Z','2014-12-20T21:36:42.144000Z','http://swapi.dev/api/species/4/'),(5,'Hutt','gastropod','sentient','300','green, brown, tan','n/a','yellow, red','1000','http://swapi.dev/api/planets/24/','Huttese','2014-12-10T17:12:50.410000Z','2014-12-20T21:36:42.146000Z','http://swapi.dev/api/species/5/'),(6,'Yoda\'s species','mammal','sentient','66','green, yellow','brown, white','brown, green, yellow','900','http://swapi.dev/api/planets/28/','Galactic basic','2014-12-15T12:27:22.877000Z','2014-12-20T21:36:42.148000Z','http://swapi.dev/api/species/6/'),(7,'Trandoshan','reptile','sentient','200','brown, green','none','yellow, orange','unknown','http://swapi.dev/api/planets/29/','Dosh','2014-12-15T13:07:47.704000Z','2014-12-20T21:36:42.151000Z','http://swapi.dev/api/species/7/'),(8,'Mon Calamari','amphibian','sentient','160','red, blue, brown, magenta','none','yellow','unknown','http://swapi.dev/api/planets/31/','Mon Calamarian','2014-12-18T11:09:52.263000Z','2014-12-20T21:36:42.153000Z','http://swapi.dev/api/species/8/'),(9,'Ewok','mammal','sentient','100','brown','white, brown, black','orange, brown','unknown','http://swapi.dev/api/planets/7/','Ewokese','2014-12-18T11:22:00.285000Z','2014-12-20T21:36:42.155000Z','http://swapi.dev/api/species/9/'),(10,'Sullustan','mammal','sentient','180','pale','none','black','unknown','http://swapi.dev/api/planets/33/','Sullutese','2014-12-18T11:26:20.103000Z','2014-12-20T21:36:42.157000Z','http://swapi.dev/api/species/10/'),(11,'Neimodian','unknown','sentient','180','grey, green','none','red, pink','unknown','http://swapi.dev/api/planets/18/','Neimoidia','2014-12-19T17:07:31.319000Z','2014-12-20T21:36:42.160000Z','http://swapi.dev/api/species/11/'),(12,'Gungan','amphibian','sentient','190','brown, green','none','orange','unknown','http://swapi.dev/api/planets/8/','Gungan basic','2014-12-19T17:30:37.341000Z','2014-12-20T21:36:42.163000Z','http://swapi.dev/api/species/12/'),(13,'Toydarian','mammal','sentient','120','blue, green, grey','none','yellow','91','http://swapi.dev/api/planets/34/','Toydarian','2014-12-19T17:48:56.893000Z','2014-12-20T21:36:42.165000Z','http://swapi.dev/api/species/13/'),(14,'Dug','mammal','sentient','100','brown, purple, grey, red','none','yellow, blue','unknown','http://swapi.dev/api/planets/35/','Dugese','2014-12-19T17:53:11.214000Z','2014-12-20T21:36:42.167000Z','http://swapi.dev/api/species/14/'),(15,'Twi\'lek','mammals','sentient','200','orange, yellow, blue, green, pink, purple, tan','none','blue, brown, orange, pink','unknown','http://swapi.dev/api/planets/37/','Twi\'leki','2014-12-20T09:48:02.406000Z','2014-12-20T21:36:42.169000Z','http://swapi.dev/api/species/15/'),(16,'Aleena','reptile','sentient','80','blue, gray','none','unknown','79','http://swapi.dev/api/planets/38/','Aleena','2014-12-20T09:53:16.481000Z','2014-12-20T21:36:42.171000Z','http://swapi.dev/api/species/16/'),(17,'Vulptereen','unknown','sentient','100','grey','none','yellow','unknown','http://swapi.dev/api/planets/39/','vulpterish','2014-12-20T09:57:33.128000Z','2014-12-20T21:36:42.173000Z','http://swapi.dev/api/species/17/'),(18,'Xexto','unknown','sentient','125','grey, yellow, purple','none','black','unknown','http://swapi.dev/api/planets/40/','Xextese','2014-12-20T10:02:13.915000Z','2014-12-20T21:36:42.175000Z','http://swapi.dev/api/species/18/'),(19,'Toong','unknown','sentient','200','grey, green, yellow','none','orange','unknown','http://swapi.dev/api/planets/41/','Tundan','2014-12-20T10:08:36.795000Z','2014-12-20T21:36:42.177000Z','http://swapi.dev/api/species/19/'),(20,'Cerean','mammal','sentient','200','pale pink','red, blond, black, white','hazel','unknown','http://swapi.dev/api/planets/43/','Cerean','2014-12-20T10:15:33.765000Z','2014-12-20T21:36:42.179000Z','http://swapi.dev/api/species/20/'),(22,'Zabrak','mammal','sentient','180','pale, brown, red, orange, yellow','black','brown, orange','unknown','http://swapi.dev/api/planets/45/','Zabraki','2014-12-20T10:26:59.894000Z','2014-12-20T21:36:42.183000Z','http://swapi.dev/api/species/22/'),(23,'Tholothian','mammal','sentient','unknown','dark','unknown','blue, indigo','unknown','http://swapi.dev/api/planets/46/','unknown','2014-12-20T10:29:13.798000Z','2014-12-20T21:36:42.186000Z','http://swapi.dev/api/species/23/'),(24,'Iktotchi','unknown','sentient','180','pink','none','orange','unknown','http://swapi.dev/api/planets/47/','Iktotchese','2014-12-20T10:32:13.046000Z','2014-12-20T21:36:42.188000Z','http://swapi.dev/api/species/24/'),(25,'Quermian','mammal','sentient','240','white','none','yellow','86','http://swapi.dev/api/planets/48/','Quermian','2014-12-20T10:34:50.827000Z','2014-12-20T21:36:42.189000Z','http://swapi.dev/api/species/25/'),(26,'Kel Dor','unknown','sentient','180','peach, orange, red','none','black, silver','70','http://swapi.dev/api/planets/49/','Kel Dor','2014-12-20T10:49:21.692000Z','2014-12-20T21:36:42.191000Z','http://swapi.dev/api/species/26/'),(27,'Chagrian','amphibian','sentient','190','blue','none','blue','unknown','http://swapi.dev/api/planets/50/','Chagria','2014-12-20T10:53:28.795000Z','2014-12-20T21:36:42.193000Z','http://swapi.dev/api/species/27/'),(28,'Geonosian','insectoid','sentient','178','green, brown','none','green, hazel','unknown','http://swapi.dev/api/planets/11/','Geonosian','2014-12-20T16:40:45.618000Z','2014-12-20T21:36:42.195000Z','http://swapi.dev/api/species/28/'),(29,'Mirialan','mammal','sentient','180','yellow, green','black, brown','blue, green, red, yellow, brown, orange','unknown','http://swapi.dev/api/planets/51/','Mirialan','2014-12-20T16:46:48.290000Z','2014-12-20T21:36:42.197000Z','http://swapi.dev/api/species/29/'),(30,'Clawdite','reptilian','sentient','180','green, yellow','none','yellow','70','http://swapi.dev/api/planets/54/','Clawdite','2014-12-20T16:57:46.171000Z','2014-12-20T21:36:42.199000Z','http://swapi.dev/api/species/30/'),(31,'Besalisk','amphibian','sentient','178','brown','none','yellow','75','http://swapi.dev/api/planets/55/','besalisk','2014-12-20T17:28:28.821000Z','2014-12-20T21:36:42.200000Z','http://swapi.dev/api/species/31/'),(32,'Kaminoan','amphibian','sentient','220','grey, blue','none','black','80','http://swapi.dev/api/planets/10/','Kaminoan','2014-12-20T17:31:24.838000Z','2014-12-20T21:36:42.202000Z','http://swapi.dev/api/species/32/'),(33,'Skakoan','mammal','sentient','unknown','grey, green','none','unknown','unknown','http://swapi.dev/api/planets/56/','Skakoan','2014-12-20T17:53:54.515000Z','2014-12-20T21:36:42.204000Z','http://swapi.dev/api/species/33/'),(34,'Muun','mammal','sentient','190','grey, white','none','black','100','http://swapi.dev/api/planets/57/','Muun','2014-12-20T17:58:19.088000Z','2014-12-20T21:36:42.207000Z','http://swapi.dev/api/species/34/'),(35,'Togruta','mammal','sentient','180','red, white, orange, yellow, green, blue','none','red, orange, yellow, green, blue, black','94','http://swapi.dev/api/planets/58/','Togruti','2014-12-20T18:44:03.246000Z','2014-12-20T21:36:42.209000Z','http://swapi.dev/api/species/35/'),(36,'Kaleesh','reptile','sentient','170','brown, orange, tan','none','yellow','80','http://swapi.dev/api/planets/59/','Kaleesh','2014-12-20T19:45:42.537000Z','2014-12-20T21:36:42.210000Z','http://swapi.dev/api/species/36/'),(37,'Pau\'an','mammal','sentient','190','grey','none','black','700','http://swapi.dev/api/planets/12/','Utapese','2014-12-20T20:35:06.777000Z','2014-12-20T21:36:42.212000Z','http://swapi.dev/api/species/37/');
/*!40000 ALTER TABLE `species` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `starships`
--

DROP TABLE IF EXISTS `starships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `starships` (
  `starshipsid` int unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `model` varchar(100) DEFAULT NULL,
  `manufacturer` varchar(100) DEFAULT NULL,
  `cost_in_credits` varchar(100) DEFAULT NULL,
  `length` varchar(100) DEFAULT NULL,
  `max_atmosphering_speed` varchar(100) DEFAULT NULL,
  `crew` varchar(100) DEFAULT NULL,
  `passengers` varchar(100) DEFAULT NULL,
  `cargo_capacity` varchar(100) DEFAULT NULL,
  `consumables` varchar(100) DEFAULT NULL,
  `hyperdrive_rating` varchar(100) DEFAULT NULL,
  `MGLT` varchar(100) DEFAULT NULL,
  `starship_class` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`starshipsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `starships`
--

LOCK TABLES `starships` WRITE;
/*!40000 ALTER TABLE `starships` DISABLE KEYS */;
INSERT INTO `starships` VALUES (2,'CR90 corvette','CR90 corvette','Corellian Engineering Corporation','3500000','150','950','30-165','600','3000000','1 year','2.0','60','corvette','2014-12-10T14:20:33.369000Z','2014-12-20T21:23:49.867000Z','http://swapi.dev/api/starships/2/'),(3,'Star Destroyer','Imperial I-class Star Destroyer','Kuat Drive Yards','150000000','1,600','975','47,060','n/a','36000000','2 years','2.0','60','Star Destroyer','2014-12-10T15:08:19.848000Z','2014-12-20T21:23:49.870000Z','http://swapi.dev/api/starships/3/'),(5,'Sentinel-class landing craft','Sentinel-class landing craft','Sienar Fleet Systems, Cyngus Spaceworks','240000','38','1000','5','75','180000','1 month','1.0','70','landing craft','2014-12-10T15:48:00.586000Z','2014-12-20T21:23:49.873000Z','http://swapi.dev/api/starships/5/'),(9,'Death Star','DS-1 Orbital Battle Station','Imperial Department of Military Research, Sienar Fleet Systems','1000000000000','120000','n/a','342,953','843,342','1000000000000','3 years','4.0','10','Deep Space Mobile Battlestation','2014-12-10T16:36:50.509000Z','2014-12-20T21:26:24.783000Z','http://swapi.dev/api/starships/9/'),(10,'Millennium Falcon','YT-1300 light freighter','Corellian Engineering Corporation','100000','34.37','1050','4','6','100000','2 months','0.5','75','Light freighter','2014-12-10T16:59:45.094000Z','2014-12-20T21:23:49.880000Z','http://swapi.dev/api/starships/10/'),(11,'Y-wing','BTL Y-wing','Koensayr Manufacturing','134999','14','1000km','2','0','110','1 week','1.0','80','assault starfighter','2014-12-12T11:00:39.817000Z','2014-12-20T21:23:49.883000Z','http://swapi.dev/api/starships/11/'),(12,'X-wing','T-65 X-wing','Incom Corporation','149999','12.5','1050','1','0','110','1 week','1.0','100','Starfighter','2014-12-12T11:19:05.340000Z','2014-12-20T21:23:49.886000Z','http://swapi.dev/api/starships/12/'),(13,'TIE Advanced x1','Twin Ion Engine Advanced x1','Sienar Fleet Systems','unknown','9.2','1200','1','0','150','5 days','1.0','105','Starfighter','2014-12-12T11:21:32.991000Z','2014-12-20T21:23:49.889000Z','http://swapi.dev/api/starships/13/'),(15,'Executor','Executor-class star dreadnought','Kuat Drive Yards, Fondor Shipyards','1143350000','19000','n/a','279,144','38000','250000000','6 years','2.0','40','Star dreadnought','2014-12-15T12:31:42.547000Z','2014-12-20T21:23:49.893000Z','http://swapi.dev/api/starships/15/'),(17,'Rebel transport','GR-75 medium transport','Gallofree Yards, Inc.','unknown','90','650','6','90','19000000','6 months','4.0','20','Medium transport','2014-12-15T12:34:52.264000Z','2014-12-20T21:23:49.895000Z','http://swapi.dev/api/starships/17/'),(21,'Slave 1','Firespray-31-class patrol and attack','Kuat Systems Engineering','unknown','21.5','1000','1','6','70000','1 month','3.0','70','Patrol craft','2014-12-15T13:00:56.332000Z','2014-12-20T21:23:49.897000Z','http://swapi.dev/api/starships/21/'),(22,'Imperial shuttle','Lambda-class T-4a shuttle','Sienar Fleet Systems','240000','20','850','6','20','80000','2 months','1.0','50','Armed government transport','2014-12-15T13:04:47.235000Z','2014-12-20T21:23:49.900000Z','http://swapi.dev/api/starships/22/'),(23,'EF76 Nebulon-B escort frigate','EF76 Nebulon-B escort frigate','Kuat Drive Yards','8500000','300','800','854','75','6000000','2 years','2.0','40','Escort ship','2014-12-15T13:06:30.813000Z','2014-12-20T21:23:49.902000Z','http://swapi.dev/api/starships/23/'),(27,'Calamari Cruiser','MC80 Liberty type Star Cruiser','Mon Calamari shipyards','104000000','1200','n/a','5400','1200','unknown','2 years','1.0','60','Star Cruiser','2014-12-18T10:54:57.804000Z','2014-12-20T21:23:49.904000Z','http://swapi.dev/api/starships/27/'),(28,'A-wing','RZ-1 A-wing Interceptor','Alliance Underground Engineering, Incom Corporation','175000','9.6','1300','1','0','40','1 week','1.0','120','Starfighter','2014-12-18T11:16:34.542000Z','2014-12-20T21:23:49.907000Z','http://swapi.dev/api/starships/28/'),(29,'B-wing','A/SF-01 B-wing starfighter','Slayn & Korpil','220000','16.9','950','1','0','45','1 week','2.0','91','Assault Starfighter','2014-12-18T11:18:04.763000Z','2014-12-20T21:23:49.909000Z','http://swapi.dev/api/starships/29/'),(31,'Republic Cruiser','Consular-class cruiser','Corellian Engineering Corporation','unknown','115','900','9','16','unknown','unknown','2.0','unknown','Space cruiser','2014-12-19T17:01:31.488000Z','2014-12-20T21:23:49.912000Z','http://swapi.dev/api/starships/31/'),(32,'Droid control ship','Lucrehulk-class Droid Control Ship','Hoersch-Kessel Drive, Inc.','unknown','3170','n/a','175','139000','4000000000','500 days','2.0','unknown','Droid control ship','2014-12-19T17:04:06.323000Z','2014-12-20T21:23:49.915000Z','http://swapi.dev/api/starships/32/'),(39,'Naboo fighter','N-1 starfighter','Theed Palace Space Vessel Engineering Corps','200000','11','1100','1','0','65','7 days','1.0','unknown','Starfighter','2014-12-19T17:39:17.582000Z','2014-12-20T21:23:49.917000Z','http://swapi.dev/api/starships/39/'),(40,'Naboo Royal Starship','J-type 327 Nubian royal starship','Theed Palace Space Vessel Engineering Corps, Nubia Star Drives','unknown','76','920','8','unknown','unknown','unknown','1.8','unknown','yacht','2014-12-19T17:45:03.506000Z','2014-12-20T21:23:49.919000Z','http://swapi.dev/api/starships/40/'),(41,'Scimitar','Star Courier','Republic Sienar Systems','55000000','26.5','1180','1','6','2500000','30 days','1.5','unknown','Space Transport','2014-12-20T09:39:56.116000Z','2014-12-20T21:23:49.922000Z','http://swapi.dev/api/starships/41/'),(43,'J-type diplomatic barge','J-type diplomatic barge','Theed Palace Space Vessel Engineering Corps, Nubia Star Drives','2000000','39','2000','5','10','unknown','1 year','0.7','unknown','Diplomatic barge','2014-12-20T11:05:51.237000Z','2014-12-20T21:23:49.925000Z','http://swapi.dev/api/starships/43/'),(47,'AA-9 Coruscant freighter','Botajef AA-9 Freighter-Liner','Botajef Shipyards','unknown','390','unknown','unknown','30000','unknown','unknown','unknown','unknown','freighter','2014-12-20T17:24:23.509000Z','2014-12-20T21:23:49.928000Z','http://swapi.dev/api/starships/47/'),(48,'Jedi starfighter','Delta-7 Aethersprite-class interceptor','Kuat Systems Engineering','180000','8','1150','1','0','60','7 days','1.0','unknown','Starfighter','2014-12-20T17:35:23.906000Z','2014-12-20T21:23:49.930000Z','http://swapi.dev/api/starships/48/'),(49,'H-type Nubian yacht','H-type Nubian yacht','Theed Palace Space Vessel Engineering Corps','unknown','47.9','8000','4','unknown','unknown','unknown','0.9','unknown','yacht','2014-12-20T17:46:46.847000Z','2014-12-20T21:23:49.932000Z','http://swapi.dev/api/starships/49/'),(52,'Republic Assault ship','Acclamator I-class assault ship','Rothana Heavy Engineering','unknown','752','unknown','700','16000','11250000','2 years','0.6','unknown','assault ship','2014-12-20T18:08:42.926000Z','2014-12-20T21:23:49.935000Z','http://swapi.dev/api/starships/52/'),(58,'Solar Sailer','Punworcca 116-class interstellar sloop','Huppla Pasa Tisc Shipwrights Collective','35700','15.2','1600','3','11','240','7 days','1.5','unknown','yacht','2014-12-20T18:37:56.969000Z','2014-12-20T21:23:49.937000Z','http://swapi.dev/api/starships/58/'),(59,'Trade Federation cruiser','Providence-class carrier/destroyer','Rendili StarDrive, Free Dac Volunteers Engineering corps.','125000000','1088','1050','600','48247','50000000','4 years','1.5','unknown','capital ship','2014-12-20T19:40:21.902000Z','2014-12-20T21:23:49.941000Z','http://swapi.dev/api/starships/59/'),(61,'Theta-class T-2c shuttle','Theta-class T-2c shuttle','Cygnus Spaceworks','1000000','18.5','2000','5','16','50000','56 days','1.0','unknown','transport','2014-12-20T19:48:40.409000Z','2014-12-20T21:23:49.944000Z','http://swapi.dev/api/starships/61/'),(63,'Republic attack cruiser','Senator-class Star Destroyer','Kuat Drive Yards, Allanteen Six shipyards','59000000','1137','975','7400','2000','20000000','2 years','1.0','unknown','star destroyer','2014-12-20T19:52:56.232000Z','2014-12-20T21:23:49.946000Z','http://swapi.dev/api/starships/63/'),(64,'Naboo star skiff','J-type star skiff','Theed Palace Space Vessel Engineering Corps/Nubia Star Drives, Incorporated','unknown','29.2','1050','3','3','unknown','unknown','0.5','unknown','yacht','2014-12-20T19:55:15.396000Z','2014-12-20T21:23:49.948000Z','http://swapi.dev/api/starships/64/'),(65,'Jedi Interceptor','Eta-2 Actis-class light interceptor','Kuat Systems Engineering','320000','5.47','1500','1','0','60','2 days','1.0','unknown','starfighter','2014-12-20T19:56:57.468000Z','2014-12-20T21:23:49.951000Z','http://swapi.dev/api/starships/65/'),(66,'arc-170','Aggressive Reconnaissance-170 starfighte','Incom Corporation, Subpro Corporation','155000','14.5','1000','3','0','110','5 days','1.0','100','starfighter','2014-12-20T20:03:48.603000Z','2014-12-20T21:23:49.953000Z','http://swapi.dev/api/starships/66/'),(68,'Banking clan frigte','Munificent-class star frigate','Hoersch-Kessel Drive, Inc, Gwori Revolutionary Industries','57000000','825','unknown','200','unknown','40000000','2 years','1.0','unknown','cruiser','2014-12-20T20:07:11.538000Z','2014-12-20T21:23:49.956000Z','http://swapi.dev/api/starships/68/'),(74,'Belbullab-22 starfighter','Belbullab-22 starfighter','Feethan Ottraw Scalable Assemblies','168000','6.71','1100','1','0','140','7 days','6','unknown','starfighter','2014-12-20T20:38:05.031000Z','2014-12-20T21:23:49.959000Z','http://swapi.dev/api/starships/74/'),(75,'V-wing','Alpha-3 Nimbus-class V-wing starfighter','Kuat Systems Engineering','102500','7.9','1050','1','0','60','15 hours','1.0','unknown','starfighter','2014-12-20T20:43:04.349000Z','2014-12-20T21:23:49.961000Z','http://swapi.dev/api/starships/75/');
/*!40000 ALTER TABLE `starships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicles`
--

DROP TABLE IF EXISTS `vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicles` (
  `vehiclesid` int unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `model` varchar(100) DEFAULT NULL,
  `manufacturer` varchar(100) DEFAULT NULL,
  `cost_in_credits` varchar(100) DEFAULT NULL,
  `length` varchar(100) DEFAULT NULL,
  `max_atmosphering_speed` varchar(100) DEFAULT NULL,
  `crew` varchar(100) DEFAULT NULL,
  `passengers` varchar(100) DEFAULT NULL,
  `cargo_capacity` varchar(100) DEFAULT NULL,
  `consumables` varchar(100) DEFAULT NULL,
  `vehicle_class` varchar(100) DEFAULT NULL,
  `created` varchar(100) DEFAULT NULL,
  `edited` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`vehiclesid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicles`
--

LOCK TABLES `vehicles` WRITE;
/*!40000 ALTER TABLE `vehicles` DISABLE KEYS */;
INSERT INTO `vehicles` VALUES (4,'Sand Crawler','Digger Crawler','Corellia Mining Corporation','150000','36.8 ','30','46','30','50000','2 months','wheeled','2014-12-10T15:36:25.724000Z','2014-12-20T21:30:21.661000Z','http://swapi.dev/api/vehicles/4/'),(6,'T-16 skyhopper','T-16 skyhopper','Incom Corporation','14500','10.4 ','1200','1','1','50','0','repulsorcraft','2014-12-10T16:01:52.434000Z','2014-12-20T21:30:21.665000Z','http://swapi.dev/api/vehicles/6/'),(7,'X-34 landspeeder','X-34 landspeeder','SoroSuub Corporation','10550','3.4 ','250','1','1','5','unknown','repulsorcraft','2014-12-10T16:13:52.586000Z','2014-12-20T21:30:21.668000Z','http://swapi.dev/api/vehicles/7/'),(8,'TIE/LN starfighter','Twin Ion Engine/Ln Starfighter','Sienar Fleet Systems','unknown','6.4','1200','1','0','65','2 days','starfighter','2014-12-10T16:33:52.860000Z','2014-12-20T21:30:21.670000Z','http://swapi.dev/api/vehicles/8/'),(14,'Snowspeeder','t-47 airspeeder','Incom corporation','unknown','4.5','650','2','0','10','none','airspeeder','2014-12-15T12:22:12Z','2014-12-20T21:30:21.672000Z','http://swapi.dev/api/vehicles/14/'),(16,'TIE bomber','TIE/sa bomber','Sienar Fleet Systems','unknown','7.8','850','1','0','none','2 days','space/planetary bomber','2014-12-15T12:33:15.838000Z','2014-12-20T21:30:21.675000Z','http://swapi.dev/api/vehicles/16/'),(18,'AT-AT','All Terrain Armored Transport','Kuat Drive Yards, Imperial Department of Military Research','unknown','20','60','5','40','1000','unknown','assault walker','2014-12-15T12:38:25.937000Z','2014-12-20T21:30:21.677000Z','http://swapi.dev/api/vehicles/18/'),(19,'AT-ST','All Terrain Scout Transport','Kuat Drive Yards, Imperial Department of Military Research','unknown','2','90','2','0','200','none','walker','2014-12-15T12:46:42.384000Z','2014-12-20T21:30:21.679000Z','http://swapi.dev/api/vehicles/19/'),(20,'Storm IV Twin-Pod cloud car','Storm IV Twin-Pod','Bespin Motors','75000','7','1500','2','0','10','1 day','repulsorcraft','2014-12-15T12:58:50.530000Z','2014-12-20T21:30:21.681000Z','http://swapi.dev/api/vehicles/20/'),(24,'Sail barge','Modified Luxury Sail Barge','Ubrikkian Industries Custom Vehicle Division','285000','30','100','26','500','2000000','Live food tanks','sail barge','2014-12-18T10:44:14.217000Z','2014-12-20T21:30:21.684000Z','http://swapi.dev/api/vehicles/24/'),(25,'Bantha-II cargo skiff','Bantha-II','Ubrikkian Industries','8000','9.5','250','5','16','135000','1 day','repulsorcraft cargo skiff','2014-12-18T10:48:03.208000Z','2014-12-20T21:30:21.688000Z','http://swapi.dev/api/vehicles/25/'),(26,'TIE/IN interceptor','Twin Ion Engine Interceptor','Sienar Fleet Systems','unknown','9.6','1250','1','0','75','2 days','starfighter','2014-12-18T10:50:28.225000Z','2014-12-20T21:30:21.691000Z','http://swapi.dev/api/vehicles/26/'),(30,'Imperial Speeder Bike','74-Z speeder bike','Aratech Repulsor Company','8000','3','360','1','1','4','1 day','speeder','2014-12-18T11:20:04.625000Z','2014-12-20T21:30:21.693000Z','http://swapi.dev/api/vehicles/30/'),(33,'Vulture Droid','Vulture-class droid starfighter','Haor Chall Engineering, Baktoid Armor Workshop','unknown','3.5','1200','0','0','0','none','starfighter','2014-12-19T17:09:53.584000Z','2014-12-20T21:30:21.697000Z','http://swapi.dev/api/vehicles/33/'),(34,'Multi-Troop Transport','Multi-Troop Transport','Baktoid Armor Workshop','138000','31','35','4','112','12000','unknown','repulsorcraft','2014-12-19T17:12:04.400000Z','2014-12-20T21:30:21.700000Z','http://swapi.dev/api/vehicles/34/'),(35,'Armored Assault Tank','Armoured Assault Tank','Baktoid Armor Workshop','unknown','9.75','55','4','6','unknown','unknown','repulsorcraft','2014-12-19T17:13:29.799000Z','2014-12-20T21:30:21.703000Z','http://swapi.dev/api/vehicles/35/'),(36,'Single Trooper Aerial Platform','Single Trooper Aerial Platform','Baktoid Armor Workshop','2500','2','400','1','0','none','none','repulsorcraft','2014-12-19T17:15:09.511000Z','2014-12-20T21:30:21.705000Z','http://swapi.dev/api/vehicles/36/'),(37,'C-9979 landing craft','C-9979 landing craft','Haor Chall Engineering','200000','210','587','140','284','1800000','1 day','landing craft','2014-12-19T17:20:36.373000Z','2014-12-20T21:30:21.707000Z','http://swapi.dev/api/vehicles/37/'),(38,'Tribubble bongo','Tribubble bongo','Otoh Gunga Bongameken Cooperative','unknown','15','85','1','2','1600','unknown','submarine','2014-12-19T17:37:37.924000Z','2014-12-20T21:30:21.710000Z','http://swapi.dev/api/vehicles/38/'),(42,'Sith speeder','FC-20 speeder bike','Razalon','4000','1.5','180','1','0','2','unknown','speeder','2014-12-20T10:09:56.095000Z','2014-12-20T21:30:21.712000Z','http://swapi.dev/api/vehicles/42/'),(44,'Zephyr-G swoop bike','Zephyr-G swoop bike','Mobquet Swoops and Speeders','5750','3.68','350','1','1','200','none','repulsorcraft','2014-12-20T16:24:16.026000Z','2014-12-20T21:30:21.714000Z','http://swapi.dev/api/vehicles/44/'),(45,'Koro-2 Exodrive airspeeder','Koro-2 Exodrive airspeeder','Desler Gizh Outworld Mobility Corporation','unknown','6.6','800','1','1','80','unknown','airspeeder','2014-12-20T17:17:33.526000Z','2014-12-20T21:30:21.716000Z','http://swapi.dev/api/vehicles/45/'),(46,'XJ-6 airspeeder','XJ-6 airspeeder','Narglatch AirTech prefabricated kit','unknown','6.23','720','1','1','unknown','unknown','airspeeder','2014-12-20T17:19:19.991000Z','2014-12-20T21:30:21.719000Z','http://swapi.dev/api/vehicles/46/'),(50,'LAAT/i','Low Altitude Assault Transport/infrantry','Rothana Heavy Engineering','unknown','17.4','620','6','30','170','unknown','gunship','2014-12-20T18:01:21.014000Z','2014-12-20T21:30:21.723000Z','http://swapi.dev/api/vehicles/50/'),(51,'LAAT/c','Low Altitude Assault Transport/carrier','Rothana Heavy Engineering','unknown','28.82','620','1','0','40000','unknown','gunship','2014-12-20T18:02:46.802000Z','2014-12-20T21:30:21.725000Z','http://swapi.dev/api/vehicles/51/'),(53,'AT-TE','All Terrain Tactical Enforcer','Rothana Heavy Engineering, Kuat Drive Yards','unknown','13.2','60','6','36','10000','21 days','walker','2014-12-20T18:10:07.560000Z','2014-12-20T21:30:21.728000Z','http://swapi.dev/api/vehicles/53/'),(54,'SPHA','Self-Propelled Heavy Artillery','Rothana Heavy Engineering','unknown','140','35','25','30','500','7 days','walker','2014-12-20T18:12:32.315000Z','2014-12-20T21:30:21.731000Z','http://swapi.dev/api/vehicles/54/'),(55,'Flitknot speeder','Flitknot speeder','Huppla Pasa Tisc Shipwrights Collective','8000','2','634','1','0','unknown','unknown','speeder','2014-12-20T18:15:20.312000Z','2014-12-20T21:30:21.735000Z','http://swapi.dev/api/vehicles/55/'),(56,'Neimoidian shuttle','Sheathipede-class transport shuttle','Haor Chall Engineering','unknown','20','880','2','6','1000','7 days','transport','2014-12-20T18:25:44.912000Z','2014-12-20T21:30:21.739000Z','http://swapi.dev/api/vehicles/56/'),(57,'Geonosian starfighter','Nantex-class territorial defense','Huppla Pasa Tisc Shipwrights Collective','unknown','9.8','20000','1','0','unknown','unknown','starfighter','2014-12-20T18:34:12.541000Z','2014-12-20T21:30:21.742000Z','http://swapi.dev/api/vehicles/57/'),(60,'Tsmeu-6 personal wheel bike','Tsmeu-6 personal wheel bike','Z-Gomot Ternbuell Guppat Corporation','15000','3.5','330','1','1','10','none','wheeled walker','2014-12-20T19:43:54.870000Z','2014-12-20T21:30:21.745000Z','http://swapi.dev/api/vehicles/60/'),(62,'Emergency Firespeeder','Fire suppression speeder','unknown','unknown','unknown','unknown','2','unknown','unknown','unknown','fire suppression ship','2014-12-20T19:50:58.559000Z','2014-12-20T21:30:21.749000Z','http://swapi.dev/api/vehicles/62/'),(67,'Droid tri-fighter','tri-fighter','Colla Designs, Phlac-Arphocc Automata Industries','20000','5.4','1180','1','0','0','none','droid starfighter','2014-12-20T20:05:19.992000Z','2014-12-20T21:30:21.752000Z','http://swapi.dev/api/vehicles/67/'),(69,'Oevvaor jet catamaran','Oevvaor jet catamaran','Appazanna Engineering Works','12125','15.1','420','2','2','50','3 days','airspeeder','2014-12-20T20:20:53.931000Z','2014-12-20T21:30:21.756000Z','http://swapi.dev/api/vehicles/69/'),(70,'Raddaugh Gnasp fluttercraft','Raddaugh Gnasp fluttercraft','Appazanna Engineering Works','14750','7','310','2','0','20','none','air speeder','2014-12-20T20:21:55.648000Z','2014-12-20T21:30:21.759000Z','http://swapi.dev/api/vehicles/70/'),(71,'Clone turbo tank','HAVw A6 Juggernaut','Kuat Drive Yards','350000','49.4','160','20','300','30000','20 days','wheeled walker','2014-12-20T20:24:45.587000Z','2014-12-20T21:30:21.762000Z','http://swapi.dev/api/vehicles/71/'),(72,'Corporate Alliance tank droid','NR-N99 Persuader-class droid enforcer','Techno Union','49000','10.96','100','0','4','none','none','droid tank','2014-12-20T20:26:55.522000Z','2014-12-20T21:30:21.765000Z','http://swapi.dev/api/vehicles/72/'),(73,'Droid gunship','HMP droid gunship','Baktoid Fleet Ordnance, Haor Chall Engineering','60000','12.3','820','0','0','0','none','airspeeder','2014-12-20T20:32:05.687000Z','2014-12-20T21:30:21.768000Z','http://swapi.dev/api/vehicles/73/'),(76,'AT-RT','All Terrain Recon Transport','Kuat Drive Yards','40000','3.2','90','1','0','20','1 day','walker','2014-12-20T20:47:49.189000Z','2014-12-20T21:30:21.772000Z','http://swapi.dev/api/vehicles/76/');
/*!40000 ALTER TABLE `vehicles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'starwarsapi'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-14 23:36:55
