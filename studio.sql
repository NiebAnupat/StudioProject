-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 21, 2022 at 02:15 PM
-- Server version: 10.7.3-MariaDB-log
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studio`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(50) NOT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `pwd`, `name`) VALUES
('a', 'a', 'a'),
('admin', 'admin', 'Admin'),
('admin01', 'Admin', 'admin'),
('b', 'b', 'b');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `id_cus` varchar(50) DEFAULT NULL,
  `stu_id` varchar(50) DEFAULT NULL,
  `hours` int(11) DEFAULT NULL,
  `time_in` datetime DEFAULT NULL,
  `time_out` datetime DEFAULT NULL,
  `net_price` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `id_cus`, `stu_id`, `hours`, `time_in`, `time_out`, `net_price`) VALUES
(1, 'a', 'r10', 4, '2022-04-21 06:24:12', '2022-04-21 10:24:12', 1800),
(2, 'a', 'r1', 2, '2022-04-21 06:24:28', '2022-04-21 08:24:28', 500),
(3, 'a', 'r11', 1, '2022-04-21 06:24:33', '2022-04-21 07:24:33', 550),
(4, 'a', 'r6', 3, '2022-04-21 06:41:51', '2022-04-21 09:41:51', 1350),
(5, 'a', 'r12', 2, '2022-04-21 06:43:04', '2022-04-21 08:43:04', 1100),
(6, 'a', 'r2', 1, '2022-04-21 06:43:18', '2022-04-21 07:43:18', 250),
(7, 'b', 'r1', 1, '2022-04-21 20:15:53', '2022-04-21 21:15:53', 250),
(8, 'a', 'r11', 2, '2022-04-21 20:24:06', '2022-04-21 22:24:06', 1100),
(9, 'a', 'r12', 2, '2022-04-21 20:25:33', '2022-04-21 22:25:33', 1100);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `stu_id` varchar(50) NOT NULL,
  `size` varchar(50) NOT NULL,
  `price` int(11) NOT NULL DEFAULT 0,
  `status` char(50) NOT NULL DEFAULT 't',
  `timeout_latest` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`stu_id`, `size`, `price`, `status`, `timeout_latest`) VALUES
('r1', 'small', 250, 'f', '2022-04-21 21:15:53'),
('r10', 'medium', 450, 't', '2022-04-21 10:24:12'),
('r11', 'large', 550, 'f', '2022-04-21 22:24:06'),
('r12', 'large', 550, 'f', '2022-04-21 22:25:33'),
('r13', 'large', 550, 't', NULL),
('r14', 'large', 550, 't', NULL),
('r15', 'large', 550, 't', NULL),
('r2', 'small', 250, 't', '2022-04-21 07:43:18'),
('r3', 'small', 250, 't', NULL),
('r4', 'small', 250, 't', NULL),
('r5', 'small', 250, 't', NULL),
('r6', 'medium', 450, 't', '2022-04-21 09:41:51'),
('r7', 'medium', 450, 't', NULL),
('r8', 'medium', 450, 't', NULL),
('r9', 'medium', 450, 't', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_history_customer` (`id_cus`),
  ADD KEY `FK_history_room` (`stu_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`stu_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `FK_history_customer` FOREIGN KEY (`id_cus`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `FK_history_room` FOREIGN KEY (`stu_id`) REFERENCES `room` (`stu_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
