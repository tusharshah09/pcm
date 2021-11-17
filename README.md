# Product Catalog Managment System
- **High Level Architecture Diagram**
![PCM-HLD](https://user-images.githubusercontent.com/18443728/141943635-a1f3bce2-5d64-422e-a2fa-9d2592d60d68.JPG)

- **API List (Swagger Document)**

  http://localhost:9010/swagger-ui/index.html
  
![image](https://user-images.githubusercontent.com/18443728/141943999-e8e725a3-2ba8-4726-8208-e1138a34d8ee.png)

- **Database Schema Design**

![image](https://user-images.githubusercontent.com/18443728/141944759-46f13504-6965-4c13-93d3-d4306d37e9e0.png)

- **Design Pattern**
- 
  * Command Query REsponsibility Segregation (CQRS)
  * Repository Pattern

![image](https://user-images.githubusercontent.com/18443728/142081973-4f4f9516-494b-4002-8116-2596a8fb2cb3.png)

- **SQL Script (MySQL):**
```
CREATE DATABASE `pcm` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
```
```
CREATE TABLE `category` (
  `id` bigint NOT NULL,
  `name` varchar(100) NOT NULL,
  `active` tinyint DEFAULT NULL,
  `is_featured` tinyint DEFAULT NULL,
  `navigation_included` tinyint DEFAULT NULL,
  `url` varchar(500) NOT NULL,
  `url_key` varchar(100) DEFAULT NULL,
  `parent_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `category_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `currency` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `product` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` longtext,
  `url` varchar(255) DEFAULT NULL,
  `is_active` tinyint DEFAULT '1',
  `is_new` tinyint DEFAULT '1',
  `retail_price` varchar(100) DEFAULT NULL,
  `sale_price` varchar(100) DEFAULT NULL,
  `discount` varchar(5) DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  `currency_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_fk_1` (`category_id`),
  KEY `currency_fk_1_idx` (`currency_id`),
  CONSTRAINT `category_fk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `currency_fk_1` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `fulfillment_type` (
  `id` bigint NOT NULL,
  `friendly_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `media` (
  `id` bigint NOT NULL,
  `url` longtext NOT NULL,
  `alt_text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `tags` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `sku` (
  `id` bigint NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `short_description` longtext NOT NULL,
  `start_date` datetime(3) DEFAULT NULL,
  `retail_price` decimal(18,2) DEFAULT NULL,
  `sale_price` decimal(18,2) DEFAULT NULL,
  `base_price_unit` char(1) DEFAULT NULL,
  `discount` decimal(18,2) DEFAULT NULL,
  `is_active` tinyint NOT NULL DEFAULT '1',
  `is_available` tinyint NOT NULL DEFAULT '0',
  `inventory_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ww_sku` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `product_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `quantity_available` bigint NOT NULL,
  `is_subscription` tinyint DEFAULT '0',
  `tax_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `fulfillment_type_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_sku_fulfillmentType` (`fulfillment_type_id`),
  CONSTRAINT `FK_sku_fulfillmentType` FOREIGN KEY (`fulfillment_type_id`) REFERENCES `fulfillment_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `sku_media` (
  `id` bigint NOT NULL,
  `sku_id` bigint NOT NULL,
  `media_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_sku_media_media` (`media_id`),
  KEY `FK_sku_media_sku` (`sku_id`),
  CONSTRAINT `FK_sku_media_media` FOREIGN KEY (`media_id`) REFERENCES `media` (`id`),
  CONSTRAINT `FK_sku_media_sku` FOREIGN KEY (`sku_id`) REFERENCES `sku` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```
CREATE TABLE `product_sku` (
  `id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  `sku_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_id_idx` (`product_id`),
  KEY `fk_sku_id_idx` (`sku_id`),
  CONSTRAINT `fk_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_sku_id` FOREIGN KEY (`sku_id`) REFERENCES `sku` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

- **Application Configuraton**:

 * application.properties

Please update application properties file if your MySQL details are different like MySql Server URL, Username and Password.

```
server.port=9010
springdoc.swagger-ui.tags-sorter=true
springdoc.swagger-ui.operations-sorter=true
spring.datasource.url=jdbc:mysql://localhost:3306/pcm
spring.datasource.username=username
spring.datasource.password=password
```

Applicaton running on below port

(1) pcm-gateway: http://localhost:9000

(2) pcm-api: http://localhost:9010

(3) Swagger URL: http://localhost:9010/swagger-ui/index.html

Here is the postman collection for pcm-api with different environment (internal and gateway environment)

[postman collection.zip](https://github.com/tusharshah09/pcm/files/7551969/postman.collection.zip)

