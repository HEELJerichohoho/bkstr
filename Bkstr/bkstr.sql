-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 03, 2025 at 01:45 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bkstr`
--

-- --------------------------------------------------------

--
-- Table structure for table `acc`
--

CREATE TABLE `acc` (
  `Acc_ID` int(11) NOT NULL,
  `Acc_User` varchar(100) NOT NULL,
  `Acc_Pass` varchar(255) NOT NULL,
  `Acc_Cntc` varchar(20) NOT NULL,
  `Acc_DtCrtd` timestamp(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  `Acc_Type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acc`
--

INSERT INTO `acc` (`Acc_ID`, `Acc_User`, `Acc_Pass`, `Acc_Cntc`, `Acc_DtCrtd`, `Acc_Type`) VALUES
(1, 'Jeckkk', 'Admin123', '09673120841', '2025-08-27 13:39:07.019871', 'Admin'),
(2, 'Jeck', 'Admin123', '09673120841', '2025-08-20 13:39:15.000000', 'Admin'),
(3, 'Jecky', 'Adminnn', '09673120841', '2025-08-27 13:42:25.639703', 'Admin'),
(4, 'Jeckkkkk1111', 'Jeckkkkk_1', '111111111', '2025-09-02 16:22:41.490684', 'Admin'),
(5, 'Jeckkks', 'Jeckkkkk_1', '88888', '2025-09-02 16:24:43.024602', 'Admin'),
(6, '111J', '29c75f2100413470fe11b1f36540ae6eead33f14da19c3a7fa6af2c32e84e238', '111111', '2025-09-02 17:38:02.958204', 'Admin'),
(7, 'Wawa', '29c75f2100413470fe11b1f36540ae6eead33f14da19c3a7fa6af2c32e84e238', '9999', '2025-09-02 17:53:14.440373', 'Admin'),
(8, 'Jeckkk9', '7ac4279e314d7a75c1fb0285d1a03e46dfc99416f2256fba8868ed5690a3ff2e', '6666666', '2025-09-02 18:14:33.203145', 'Admin'),
(9, '11123', '29c75f2100413470fe11b1f36540ae6eead33f14da19c3a7fa6af2c32e84e238', '0000', '2025-09-02 18:19:53.436617', 'Admin'),
(10, 'Jeckk', '29c75f2100413470fe11b1f36540ae6eead33f14da19c3a7fa6af2c32e84e238', '11111111111', '2025-09-02 19:48:37.406710', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acc`
--
ALTER TABLE `acc`
  ADD PRIMARY KEY (`Acc_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acc`
--
ALTER TABLE `acc`
  MODIFY `Acc_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
