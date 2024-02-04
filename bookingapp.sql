-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2023 at 08:09 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookingapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `hotel_users`
--

CREATE TABLE `hotel_users` (
  `id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `numberofperson` varchar(100) NOT NULL,
  `roomType` varchar(100) NOT NULL,
  `checkin` varchar(100) NOT NULL,
  `checkout` varchar(100) NOT NULL,
  `num` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hotel_users`
--

INSERT INTO `hotel_users` (`id`, `name`, `email`, `phone`, `address`, `numberofperson`, `roomType`, `checkin`, `checkout`, `num`) VALUES
(17, 'fahim', 'fahim@gmail.com', '04646497979', 'Rangpur', '12', 'Double Bed Room', '06/28/23', '06/29/23', '4'),
(18, 'Akhter', 'ak@ter.com', '949491948', 'khulna', '1', 'Super Delux Bed Room', '06/30/23', '07/01/23', '1'),
(19, 'Muhammad ', 'muhammad@gmail.com', '94916194488', 'Madina ', '1', 'Super Delux Bed Room', '06/29/23', '06/30/23', '1'),
(20, 'seven stars', 'seven@gmail.com', '946464879', 'Seven rings road', '2', 'Super Delux Bed Room', '06/28/23', '06/29/23', '2'),
(22, 'Al Muktadir', 'muktadir.j729@gmail.com', '01865753789', 'mirpur, dhaka', '4', 'Single Bed Room', '25 June 2023', '27 June 2023', '2'),
(23, 'hasan', 'hasan@gmail.com', '4545821521', 'gulshan', '4', 'single room', '14 July 2023', '15 July 2023', '2'),
(24, 'Jim', 'jim@gmail.com', '46481378', 'gulshan ', '4', 'Single Bed Room', '07/14/23', '07/15/23', '2'),
(25, 'Al muktadir', 'muktadir.j729@gmail.com', '65515666', 'mirpur 2 ', '5', 'Single Bed Room', '07/14/23', '07/15/23', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hotel_users`
--
ALTER TABLE `hotel_users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hotel_users`
--
ALTER TABLE `hotel_users`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
