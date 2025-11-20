-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: taf
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `apenom` varchar(70) NOT NULL,
  `telefono` varchar(14) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `telefono` (`telefono`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (18,'brian cazon','4324234','san jorge',0),(19,'ezequiel cazon','43243234','san jorge',0),(20,'lionel messi','3432432','fdsfdsf',0),(21,'angel di maria','23213213','rosario',0);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `devoluciones`
--

DROP TABLE IF EXISTS `devoluciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `devoluciones` (
  `id_devolucion` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `monto` float NOT NULL,
  `motivo` varchar(80) DEFAULT NULL,
  `id_rendicion` int NOT NULL,
  PRIMARY KEY (`id_devolucion`),
  KEY `fk_devoluciones_rendicion1_idx` (`id_rendicion`),
  KEY `fk_devoluciones_clientes1_idx` (`id_cliente`),
  CONSTRAINT `fk_devoluciones_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`codigo`),
  CONSTRAINT `fk_devoluciones_rendicion1` FOREIGN KEY (`id_rendicion`) REFERENCES `rendicion` (`id_rendicion`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `devoluciones`
--

LOCK TABLES `devoluciones` WRITE;
/*!40000 ALTER TABLE `devoluciones` DISABLE KEYS */;
INSERT INTO `devoluciones` VALUES (24,20,10000,'no se',50),(25,20,500000,'',51),(26,19,20000,'',53),(27,19,50000,'',68);
/*!40000 ALTER TABLE `devoluciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fiados`
--

DROP TABLE IF EXISTS `fiados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fiados` (
  `id_fiado` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `monto_fiado` float NOT NULL,
  `id_rendicion` int NOT NULL,
  `monto_entregado` float DEFAULT '0',
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`id_fiado`),
  KEY `fk_fiados_clientes1_idx` (`id_cliente`),
  KEY `fk_fiados_rendicion1_idx` (`id_rendicion`),
  CONSTRAINT `fk_fiados_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`codigo`),
  CONSTRAINT `fk_fiados_rendicion1` FOREIGN KEY (`id_rendicion`) REFERENCES `rendicion` (`id_rendicion`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiados`
--

LOCK TABLES `fiados` WRITE;
/*!40000 ALTER TABLE `fiados` DISABLE KEYS */;
INSERT INTO `fiados` VALUES (51,21,50000,48,10000,'pendiente'),(52,18,100000,48,100000,'pagado'),(53,21,50000,49,50000,'pagado'),(54,18,100000,49,100000,'pagado'),(55,18,40000,50,30000,'pendiente'),(56,18,500000,51,160000,'pendiente'),(57,21,30000,52,30000,'pagado'),(58,19,50000,53,0,'pendiente'),(59,18,50000,54,0,'pendiente'),(60,18,300000,55,0,'pendiente'),(61,18,50000,56,0,'pendiente'),(62,20,20000,57,0,'pendiente'),(63,19,25000,58,0,'pendiente'),(64,18,30000,59,0,'pendiente'),(65,19,50000,60,0,'pendiente'),(66,18,600000,61,0,'pendiente'),(67,20,100000,62,0,'pendiente'),(68,19,50000,63,0,'pendiente');
/*!40000 ALTER TABLE `fiados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gastos`
--

DROP TABLE IF EXISTS `gastos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gastos` (
  `id_gasto` int NOT NULL AUTO_INCREMENT,
  `nombre_gasto` varchar(60) NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`id_gasto`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastos`
--

LOCK TABLES `gastos` WRITE;
/*!40000 ALTER TABLE `gastos` DISABLE KEYS */;
INSERT INTO `gastos` VALUES (4,'combustible',0),(5,'gas',1),(6,'piso bajo',0),(7,'piso alto',1),(8,'Otros',0),(9,'papel',0),(10,'demas',0),(11,'hgf',0),(12,'gfdgf',0);
/*!40000 ALTER TABLE `gastos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gastos_realizados`
--

DROP TABLE IF EXISTS `gastos_realizados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gastos_realizados` (
  `id_gasto_realizado` int NOT NULL AUTO_INCREMENT,
  `id_gasto` int NOT NULL,
  `id_preventista` int NOT NULL,
  `monto` float NOT NULL,
  `id_rendicion` int NOT NULL,
  PRIMARY KEY (`id_gasto_realizado`),
  KEY `fk_gastos_realizados_rendicion1_idx` (`id_rendicion`),
  KEY `fk_gastos_realizados_preventista1_idx` (`id_preventista`),
  KEY `fk_gastos_realizados_gastos1_idx` (`id_gasto`),
  CONSTRAINT `fk_gastos_realizados_gastos1` FOREIGN KEY (`id_gasto`) REFERENCES `gastos` (`id_gasto`),
  CONSTRAINT `fk_gastos_realizados_preventista1` FOREIGN KEY (`id_preventista`) REFERENCES `preventista` (`codigo`),
  CONSTRAINT `fk_gastos_realizados_rendicion1` FOREIGN KEY (`id_rendicion`) REFERENCES `rendicion` (`id_rendicion`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastos_realizados`
--

LOCK TABLES `gastos_realizados` WRITE;
/*!40000 ALTER TABLE `gastos_realizados` DISABLE KEYS */;
INSERT INTO `gastos_realizados` VALUES (35,4,12,100000,48),(36,4,12,100000,49),(37,4,10,10000,50),(38,6,12,200000,51),(39,4,13,3000,52),(40,9,12,20000,53),(41,4,12,100000,55),(43,6,10,10000,57),(44,6,12,1000,58),(45,4,12,10000,59),(46,4,13,10000,60),(47,8,14,1000,66);
/*!40000 ALTER TABLE `gastos_realizados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `objetivos`
--

DROP TABLE IF EXISTS `objetivos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `objetivos` (
  `id_objetivo` int NOT NULL AUTO_INCREMENT,
  `id_preventista` int NOT NULL,
  `año` int NOT NULL,
  `mes` int NOT NULL,
  `objetivo_monto` float NOT NULL,
  `objetivo_pdv` int NOT NULL,
  `objetivo_dias` int NOT NULL,
  PRIMARY KEY (`id_objetivo`),
  KEY `fk_objetivos_preventista1_idx` (`id_preventista`),
  CONSTRAINT `fk_objetivos_preventista1` FOREIGN KEY (`id_preventista`) REFERENCES `preventista` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `objetivos`
--

LOCK TABLES `objetivos` WRITE;
/*!40000 ALTER TABLE `objetivos` DISABLE KEYS */;
INSERT INTO `objetivos` VALUES (7,12,2025,11,1000000,500,27),(8,13,2025,11,1000000,500,29),(9,14,2025,11,1000000,500,30);
/*!40000 ALTER TABLE `objetivos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preventista`
--

DROP TABLE IF EXISTS `preventista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preventista` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` int NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `año_ingreso` int NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preventista`
--

LOCK TABLES `preventista` WRITE;
/*!40000 ALTER TABLE `preventista` DISABLE KEYS */;
INSERT INTO `preventista` VALUES (6,'Lionel','messsi',10101010,'78787787',2025,1),(7,'angel','di maria',11111111,'2222',2024,1),(8,'chueco','lopez',22222222,'43432',2024,1),(9,'fdfdsfds','erewwere',44444444,'434432',2023,1),(10,'dsfdsf','fffdsfd',55555555,'34324',2024,0),(11,'rfdsfdfs','ffsdfsdf',66666666,'342432',2024,1),(12,'luca ','lopez',2312321,'342432',2023,0),(13,'brian','cazon',44948099,'3442',2003,0),(14,'lionel','messi',123312,'343432',2024,0);
/*!40000 ALTER TABLE `preventista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo` int NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (7,'papas fritas barbacoa ','TAFFI',1000,0),(8,'papas fritas limon con','lays',2000,0),(9,'gaseosa 2 litros ','coca cola',3000,1),(10,'gaseosa 3 litros','fanta',3000,0);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rendicion`
--

DROP TABLE IF EXISTS `rendicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rendicion` (
  `id_rendicion` int NOT NULL AUTO_INCREMENT,
  `id_preventista` int NOT NULL,
  `fecha` date NOT NULL,
  `id_zona` int NOT NULL,
  `total_preventa` float DEFAULT NULL,
  `total_ventido` float DEFAULT NULL,
  `total_fiado` float DEFAULT NULL,
  `total_devoluciones` float DEFAULT NULL,
  `total_gastos` float DEFAULT NULL,
  `diferencia` float DEFAULT NULL,
  `cantidad_ventas` int DEFAULT NULL,
  `observacion` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id_rendicion`),
  KEY `fk_rendicion_preventista1_idx` (`id_preventista`),
  KEY `fk_rendicion_zonas1_idx` (`id_zona`),
  CONSTRAINT `fk_rendicion_preventista1` FOREIGN KEY (`id_preventista`) REFERENCES `preventista` (`codigo`),
  CONSTRAINT `fk_rendicion_zonas1` FOREIGN KEY (`id_zona`) REFERENCES `zonas` (`id_zona`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rendicion`
--

LOCK TABLES `rendicion` WRITE;
/*!40000 ALTER TABLE `rendicion` DISABLE KEYS */;
INSERT INTO `rendicion` VALUES (48,12,'2025-09-20',11,1000000,800000,150000,0,100000,-200000,30,'nada'),(49,12,'2025-09-29',11,1000000,800000,150000,0,100000,-200000,30,'nada'),(50,10,'2025-04-20',11,65000,65000,40000,15000,10000,0,26,'nada'),(51,12,'2025-10-10',11,1500000,1500000,500000,500000,200000,0,32,'correcto'),(52,13,'2025-10-14',11,2500000,77000,30000,0,3000,-2423000,20,'ksksk'),(53,12,'2025-11-09',14,80000,85000,50000,20000,20000,5000,26,''),(54,12,'2025-11-06',14,100000,108000,50000,0,0,8000,27,''),(55,12,'2025-11-07',16,500000,600000,300000,0,100000,100000,27,''),(56,12,'2025-11-15',11,100000,100000,50000,0,20000,0,10,''),(57,10,'2025-11-20',14,50000,55000,20000,0,10000,5000,4,''),(58,12,'2025-11-22',11,50000,51000,25000,0,1000,1000,5,''),(59,12,'2025-11-29',17,70000,70000,30000,0,10000,0,65,''),(60,13,'2025-11-02',11,100000,115000,50000,0,10000,15000,10,''),(61,13,'2025-11-16',16,500000,600000,600000,0,0,100000,3432,''),(62,10,'2025-11-15',14,200000,300000,100000,0,0,100000,28,''),(63,14,'2025-11-01',14,100000,100000,50000,0,0,0,28,''),(64,14,'2025-11-10',16,200000,200000,0,0,0,0,30,''),(65,14,'2025-11-22',14,400000,400000,0,0,0,0,50,''),(66,14,'2025-11-24',16,500000,501000,0,0,1000,1000,56,''),(67,14,'2025-11-12',16,50000,50000,0,0,0,0,34,''),(68,14,'2025-11-23',14,195000,195000,0,55000,0,0,31,'');
/*!40000 ALTER TABLE `rendicion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semanas`
--

DROP TABLE IF EXISTS `semanas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semanas` (
  `id_semana` int NOT NULL AUTO_INCREMENT,
  `id_objetivo` int NOT NULL,
  `semana_num` int NOT NULL,
  `fecha_desde` date NOT NULL,
  `fecha_hasta` date NOT NULL,
  PRIMARY KEY (`id_semana`),
  KEY `fk_semanas_objetivos1_idx` (`id_objetivo`),
  CONSTRAINT `fk_semanas_objetivos1` FOREIGN KEY (`id_objetivo`) REFERENCES `objetivos` (`id_objetivo`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semanas`
--

LOCK TABLES `semanas` WRITE;
/*!40000 ALTER TABLE `semanas` DISABLE KEYS */;
INSERT INTO `semanas` VALUES (9,7,1,'2025-11-01','2025-11-08'),(10,7,2,'2025-11-10','2025-11-15'),(11,7,3,'2025-11-17','2025-11-22'),(12,7,4,'2025-11-24','2025-11-29'),(13,8,1,'2025-11-01','2025-11-08'),(14,8,2,'2025-11-10','2025-11-15'),(15,8,3,'2025-11-17','2025-11-22'),(16,8,4,'2025-11-24','2025-11-29'),(17,9,1,'2025-11-01','2025-11-08'),(18,9,2,'2025-11-10','2025-11-15'),(19,9,3,'2025-11-17','2025-11-22'),(20,9,4,'2025-11-24','2025-11-29');
/*!40000 ALTER TABLE `semanas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transferencias`
--

DROP TABLE IF EXISTS `transferencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transferencias` (
  `id_transferencia` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `id_cliente` int NOT NULL,
  `monto` float NOT NULL,
  `id_rendicion` int NOT NULL,
  `estado` varchar(45) DEFAULT 'Pendiente',
  PRIMARY KEY (`id_transferencia`),
  KEY `fk_transferencias_clientes1_idx` (`id_cliente`),
  KEY `fk_transferencias_rendicion1_idx` (`id_rendicion`),
  CONSTRAINT `fk_transferencias_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`codigo`),
  CONSTRAINT `fk_transferencias_rendicion1` FOREIGN KEY (`id_rendicion`) REFERENCES `rendicion` (`id_rendicion`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transferencias`
--

LOCK TABLES `transferencias` WRITE;
/*!40000 ALTER TABLE `transferencias` DISABLE KEYS */;
INSERT INTO `transferencias` VALUES (24,'2025-09-20',19,50000,48,'Acreditado'),(25,'2025-09-29',19,50000,49,'Acreditado'),(26,'2025-04-20',18,10000,50,'Acreditado'),(27,'2025-10-10',20,500000,51,'Acreditado'),(28,'2025-10-14',21,4000,52,'Acreditado'),(29,'2025-11-09',19,10000,53,'Pendiente'),(30,'2025-11-07',20,200000,55,'Acreditado'),(31,'2025-11-15',20,20000,56,'Pendiente'),(32,'2025-11-20',18,20000,57,'Pendiente'),(33,'2025-11-22',19,25000,58,'Pendiente'),(34,'2025-11-29',21,30000,59,'Pendiente'),(35,'2025-11-02',18,50000,60,'Pendiente');
/*!40000 ALTER TABLE `transferencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(45) NOT NULL,
  `contraseña_usuario` varchar(45) NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zonas`
--

DROP TABLE IF EXISTS `zonas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zonas` (
  `id_zona` int NOT NULL AUTO_INCREMENT,
  `nombre_zona` varchar(70) NOT NULL,
  `borrado` tinyint NOT NULL,
  PRIMARY KEY (`id_zona`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zonas`
--

LOCK TABLES `zonas` WRITE;
/*!40000 ALTER TABLE `zonas` DISABLE KEYS */;
INSERT INTO `zonas` VALUES (10,'PROVIDENCIA',1),(11,'BERNACCHI f',0),(12,'SANTA CLARA',1),(13,'PALMA SOLA',1),(14,'san cayetano',1),(15,'san cayetano',0),(16,'la merced',0),(17,'centro',0);
/*!40000 ALTER TABLE `zonas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-19 23:43:26
