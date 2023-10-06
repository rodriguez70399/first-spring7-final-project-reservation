CREATE TABLE `reservations` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `clientName` varchar(100) DEFAULT NULL,
  `clientDni` varchar(9) NOT NULL,
  `hotelId` bigint NOT NULL,
  `flightId` bigint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci