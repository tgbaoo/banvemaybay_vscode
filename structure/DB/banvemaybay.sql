-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2022 at 10:07 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banvemaybay`
--

-- --------------------------------------------------------

--
-- Table structure for table `chuyenbay`
--

CREATE TABLE `chuyenbay` (
  `maChuyenBay` varchar(20) NOT NULL,
  `maTuyenBay` varchar(20) NOT NULL,
  `maMayBay` varchar(20) NOT NULL,
  `soLgVeConLai` int(11) NOT NULL,
  `trangThai` varchar(20) NOT NULL,
  `ngayCatCanh` date NOT NULL,
  `ngayHaCanh` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cthoadon`
--

CREATE TABLE `cthoadon` (
  `maHD` varchar(20) NOT NULL,
  `maLoaiVe` varchar(20) NOT NULL,
  `maVeKH` varchar(20) NOT NULL,
  `soLgVe` int(11) NOT NULL,
  `maKM` varchar(20) NOT NULL,
  `thue` double NOT NULL,
  `thanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ctkhuyenmai`
--

CREATE TABLE `ctkhuyenmai` (
  `maKM` varchar(20) NOT NULL,
  `maLoaiVe` varchar(20) NOT NULL,
  `phanTramKM` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hangbay`
--

CREATE TABLE `hangbay` (
  `maHang` varchar(20) NOT NULL,
  `tenHang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `maHD` varchar(20) NOT NULL,
  `maNV` varchar(20) NOT NULL,
  `maKH` varchar(20) NOT NULL,
  `ngayLap` date NOT NULL,
  `tongtien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKH` varchar(20) NOT NULL,
  `hoKH` varchar(20) NOT NULL,
  `tenKH` varchar(20) NOT NULL,
  `gioiTinh` varchar(20) NOT NULL,
  `ngaySinh` date NOT NULL,
  `canCuoc` varchar(20) NOT NULL,
  `sdt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `maKM` varchar(20) NOT NULL,
  `tenKM` varchar(20) NOT NULL,
  `ngayBD` date NOT NULL,
  `ngayKT` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `loaive`
--

CREATE TABLE `loaive` (
  `maLoaiVe` varchar(20) NOT NULL,
  `tenLoaiVe` varchar(20) NOT NULL,
  `donGia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `maybay`
--

CREATE TABLE `maybay` (
  `maMayBay` varchar(20) NOT NULL,
  `tenMayBay` varchar(20) NOT NULL,
  `maHang` varchar(20) NOT NULL,
  `soLgGhe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` varchar(20) NOT NULL,
  `hoNV` varchar(20) NOT NULL,
  `tenNV` varchar(20) NOT NULL,
  `gioiTinh` varchar(20) NOT NULL,
  `canCuoc` varchar(20) NOT NULL,
  `sdt` varchar(20) NOT NULL,
  `luong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sanbay`
--

CREATE TABLE `sanbay` (
  `maSanBay` varchar(20) NOT NULL,
  `tenSanBay` varchar(20) NOT NULL,
  `diaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tuyenbay`
--

CREATE TABLE `tuyenbay` (
  `maTuyenBay` varchar(20) NOT NULL,
  `sanBayCatCanh` varchar(20) NOT NULL,
  `sanBayHaCanh` varchar(20) NOT NULL,
  `gioCatCanh` time NOT NULL,
  `gioHaCanh` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ve`
--

CREATE TABLE `ve` (
  `maVe` varchar(20) NOT NULL,
  `maChuyenBay` varchar(29) NOT NULL,
  `maLoaiVe` varchar(20) NOT NULL,
  `maGhe` varchar(20) NOT NULL,
  `gioLenMayBay` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ve-kh`
--

CREATE TABLE `ve-kh` (
  `maVeKH` varchar(20) NOT NULL,
  `maVe` varchar(20) NOT NULL,
  `maKH` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD PRIMARY KEY (`maChuyenBay`),
  ADD KEY `maTuyenBay` (`maTuyenBay`,`maMayBay`),
  ADD KEY `maMayBay` (`maMayBay`);

--
-- Indexes for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`maHD`,`maLoaiVe`),
  ADD KEY `maVeKH` (`maVeKH`),
  ADD KEY `maKM` (`maKM`),
  ADD KEY `maLoaiVe` (`maLoaiVe`);

--
-- Indexes for table `ctkhuyenmai`
--
ALTER TABLE `ctkhuyenmai`
  ADD PRIMARY KEY (`maKM`,`maLoaiVe`),
  ADD KEY `maLoaiVe` (`maLoaiVe`);

--
-- Indexes for table `hangbay`
--
ALTER TABLE `hangbay`
  ADD PRIMARY KEY (`maHang`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`maHD`),
  ADD KEY `maNV` (`maNV`),
  ADD KEY `maKH` (`maKH`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKH`);

--
-- Indexes for table `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`maKM`);

--
-- Indexes for table `loaive`
--
ALTER TABLE `loaive`
  ADD PRIMARY KEY (`maLoaiVe`);

--
-- Indexes for table `maybay`
--
ALTER TABLE `maybay`
  ADD PRIMARY KEY (`maMayBay`),
  ADD KEY `maHang` (`maHang`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`);

--
-- Indexes for table `sanbay`
--
ALTER TABLE `sanbay`
  ADD PRIMARY KEY (`maSanBay`);

--
-- Indexes for table `tuyenbay`
--
ALTER TABLE `tuyenbay`
  ADD PRIMARY KEY (`maTuyenBay`),
  ADD KEY `sanBayCatCanh` (`sanBayCatCanh`,`sanBayHaCanh`),
  ADD KEY `sanBayHaCanh` (`sanBayHaCanh`);

--
-- Indexes for table `ve`
--
ALTER TABLE `ve`
  ADD PRIMARY KEY (`maVe`),
  ADD KEY `maChuyenBay` (`maChuyenBay`,`maLoaiVe`),
  ADD KEY `maLoaiVe` (`maLoaiVe`);

--
-- Indexes for table `ve-kh`
--
ALTER TABLE `ve-kh`
  ADD PRIMARY KEY (`maVeKH`),
  ADD KEY `maVe` (`maVe`),
  ADD KEY `maKH` (`maKH`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`maTuyenBay`) REFERENCES `tuyenbay` (`maTuyenBay`),
  ADD CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`maMayBay`) REFERENCES `maybay` (`maMayBay`);

--
-- Constraints for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`maVeKH`) REFERENCES `ve-kh` (`maVeKH`),
  ADD CONSTRAINT `cthoadon_ibfk_2` FOREIGN KEY (`maLoaiVe`) REFERENCES `loaive` (`maLoaiVe`),
  ADD CONSTRAINT `cthoadon_ibfk_3` FOREIGN KEY (`maHD`) REFERENCES `hoadon` (`maHD`),
  ADD CONSTRAINT `cthoadon_ibfk_4` FOREIGN KEY (`maKM`) REFERENCES `khuyenmai` (`maKM`);

--
-- Constraints for table `ctkhuyenmai`
--
ALTER TABLE `ctkhuyenmai`
  ADD CONSTRAINT `ctkhuyenmai_ibfk_1` FOREIGN KEY (`maKM`) REFERENCES `khuyenmai` (`maKM`),
  ADD CONSTRAINT `ctkhuyenmai_ibfk_2` FOREIGN KEY (`maLoaiVe`) REFERENCES `loaive` (`maLoaiVe`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`);

--
-- Constraints for table `maybay`
--
ALTER TABLE `maybay`
  ADD CONSTRAINT `maybay_ibfk_1` FOREIGN KEY (`maHang`) REFERENCES `hangbay` (`maHang`);

--
-- Constraints for table `tuyenbay`
--
ALTER TABLE `tuyenbay`
  ADD CONSTRAINT `tuyenbay_ibfk_1` FOREIGN KEY (`sanBayCatCanh`) REFERENCES `sanbay` (`maSanBay`),
  ADD CONSTRAINT `tuyenbay_ibfk_2` FOREIGN KEY (`sanBayHaCanh`) REFERENCES `sanbay` (`maSanBay`);

--
-- Constraints for table `ve`
--
ALTER TABLE `ve`
  ADD CONSTRAINT `ve_ibfk_1` FOREIGN KEY (`maChuyenBay`) REFERENCES `chuyenbay` (`maChuyenBay`),
  ADD CONSTRAINT `ve_ibfk_2` FOREIGN KEY (`maLoaiVe`) REFERENCES `loaive` (`maLoaiVe`);

--
-- Constraints for table `ve-kh`
--
ALTER TABLE `ve-kh`
  ADD CONSTRAINT `ve-kh_ibfk_1` FOREIGN KEY (`maVe`) REFERENCES `ve` (`maVe`),
  ADD CONSTRAINT `ve-kh_ibfk_2` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
