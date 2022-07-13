DROP DATABASE IF EXISTS proshop;
CREATE DATABASE proshop;

USE proshop;

-- TABLE Account --
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
id 			INT PRIMARY KEY AUTO_INCREMENT,
 `name` 	VARCHAR(50),
 email 		VARCHAR(50) NOT NULL UNIQUE,
 `password` VARCHAR(50) NOT NULL,
 `status`	ENUM('NOT_ACTIVE','ACTIVE') NOT NULL,
 token		VARCHAR(255)

 );
 
 /* TABLE Category */
 DROP TABLE IF EXISTS `Category`;
 CREATE TABLE `Category` (
 id 		INT PRIMARY KEY AUTO_INCREMENT,
 category 	VARCHAR(50) NOT NULL
 );
 
 -- TABLE Product --
  DROP TABLE IF EXISTS `Product`;
CREATE Table `Product` (
id				INT PRIMARY KEY AUTO_INCREMENT,
`name` 			VARCHAR(50) ,
image 			VARCHAR(50) ,
`description` 	VARCHAR(255),
brand 			VARCHAR(50),
categoryid 		INT NOT NULL ,
price 			FLOAT UNSIGNED,
count_in_stock 	INT UNSIGNED,
rating 			FLOAT UNSIGNED,
num_reviews 	INT UNSIGNED,
  FOREIGN KEY (categoryid) REFERENCES `Category`(id)
  );
  
  INSERT INTO `Account`(`name`,               email,     `password`,  `status`    ,  token   )VALUES
						( 'Admin User','admin@example.com','123456' , 'ACTIVE'    ,     ''   ),                    
						( 'John Doe'  ,'john@example.com' ,'123456' , 'NOT_ACTIVE',     ''   ),                    
						( 'Jane Doe'  ,'jane@example.com' ,'123456' , 'NOT_ACTIVE',     ''   );                    
  
  INSERT INTO `Category`(category)VALUES
						('Electronics' );
                        
   INSERT INTO `Product`(`name`, image, `description`, brand , categoryid ,price,count_in_stock, rating, num_reviews  )VALUES 
						('Airpods Wireless Bluetooth Headphones','/images/airpods.jpg',
                        'Bluetooth technology lets you connect it with compatible devices wirelessly High-quality AAC audio offers immersive listening 
                        experience Built-in microphone allows you to take calls while working',
                        'Apple',1,89.99,3,2,6),
                        ('iPhone 11 Pro 256GB Memory','/images/phone.jpg',
                        'Introducing the iPhone 11 Pro. A transformative triple-camera system that adds tons of capability without complexity. 
                        An unprecedented leap in battery life',
                        'Apple',1,599.99,10,2,5),
                        ('Cannon EOS 80D DSLR Camera','/images/camera.jpg',
                        'Characterized by versatile imaging specs, the Canon EOS 80D further clarifies itself using a pair of robust focusing 
                        systems and an intuitive design',
                        'Cannon',1,929.99,0,3.5,5),
                        ('Sony Playstation 4 Pro White Version','/images/playstation.jpg',
                        'The ultimate home entertainment center starts with PlayStation. Whether you are into gaming, HD movies, television, music',
                        'Sony',1,399.99,5,3.5,1),
                        ('Logitech G-Series Gaming Mouse','/images/mouse.jpg',
                        'Get a better handle on your games with this Logitech LIGHTSYNC gaming mouse. The six programmable buttons allow customization
                        for a smooth playing experience',
                        'Logitech',1,49.99,4,5,2),
                        ('Amazon Echo Dot 3rd Generation','/images/alexa.jpg',
                        'Meet Echo Dot - Our most popular smart speaker with a fabric design. It is our most compact smart speaker that fits perfectly into small space',
                        'Amazon',1,29.99,2,4,3);

-- End --



  
  