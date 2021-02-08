INSERT INTO `doctorspeciality` (specialityType) VALUES ('ENT Surgeon');
INSERT INTO `doctorspeciality` (specialityType) VALUES ('Cardiologist');
INSERT INTO `doctorspeciality` (specialityType) VALUES ('Dermatologyst');
INSERT INTO `doctorspeciality` (specialityType) VALUES ('General Surgeon');




INSERT INTO `doctors` (`id`, `address`, `email`, `firstName`, `lastName`, `phoneNumber`, `regNo`, `typeId`) VALUES
(1, 'kokuvil', 'sivansuthan@gmail.com', 'Sivansuthan', 'Suthan', '0759017400', 'Doc1000', 1);

INSERT INTO `doctors` (`id`, `address`, `email`, `firstName`, `lastName`, `phoneNumber`, `regNo`, `typeId`) VALUES
(2, 'Manippai', 'Thirumaran@gmail.com', 'Thirumaran', 'Nadaraj', '0759017402', 'Doc1001', 1);

INSERT INTO `doctors` (`id`, `address`, `email`, `firstName`, `lastName`, `phoneNumber`, `regNo`, `typeId`) VALUES
(3, 'kondavil', 'felicia@gmail.com', 'felicia', 'mano', '0759017403', 'Doc1002', 3);

INSERT INTO `doctors` (`id`, `address`, `email`, `firstName`, `lastName`, `phoneNumber`, `regNo`, `typeId`) VALUES
(4, 'Kondavil', 'tharma@gmail.com', 'tharma', 'sivam', '0759017404', 'Doc1003', 2);

INSERT INTO `doctors` (`id`, `address`, `email`, `firstName`, `lastName`, `phoneNumber`, `regNo`, `typeId`) VALUES
(5, 'Kokuvil', 'malini@gmail.com', 'Malini', 'Tharma', '0759017405', 'Doc1004', 2);