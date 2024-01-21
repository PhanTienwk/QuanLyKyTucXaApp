-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2024 at 12:17 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyktxsinhvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `chuyenphong`
--

CREATE TABLE `chuyenphong` (
  `maSV` varchar(50) NOT NULL,
  `maPhongHT` varchar(50) DEFAULT NULL,
  `maPhongChuyen` varchar(50) DEFAULT NULL,
  `lyDoChuyen` varchar(50) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chuyenphong`
--

INSERT INTO `chuyenphong` (`maSV`, `maPhongHT`, `maPhongChuyen`, `lyDoChuyen`, `trangThai`) VALUES
('N22DCCN005', 'Nu03', 'Nu02', 'Nhu cầu riêng!', 1),
('N22DCCN006', 'Na03', 'Na06', 'Phòng đông', 1);

-- --------------------------------------------------------

--
-- Table structure for table `dangkyphong`
--

CREATE TABLE `dangkyphong` (
  `maSV` varchar(50) NOT NULL,
  `loaiPhong` varchar(50) DEFAULT NULL,
  `ngayHDBD` date DEFAULT NULL,
  `ngayHDKT` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dichvu`
--

CREATE TABLE `dichvu` (
  `ID` int(11) NOT NULL,
  `tienDien` float DEFAULT NULL,
  `tienNuoc` float DEFAULT NULL,
  `tienMang` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dichvu`
--

INSERT INTO `dichvu` (`ID`, `tienDien`, `tienNuoc`, `tienMang`) VALUES
(1, 6000, 10000, 120000);

-- --------------------------------------------------------

--
-- Table structure for table `dichvuphong`
--

CREATE TABLE `dichvuphong` (
  `ngayThang` date NOT NULL,
  `maPhong` varchar(50) NOT NULL,
  `soDienCu` float DEFAULT NULL,
  `soDienMoi` float DEFAULT NULL,
  `soNuocCu` float DEFAULT NULL,
  `soNuocMoi` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dichvuphong`
--

INSERT INTO `dichvuphong` (`ngayThang`, `maPhong`, `soDienCu`, `soDienMoi`, `soNuocCu`, `soNuocMoi`) VALUES
('2023-07-01', 'Na02', 0, 67, 0, 23),
('2023-07-01', 'Na03', 0, 89, 0, 18),
('2023-07-01', 'Na04', 0, 75, 0, 22),
('2023-07-01', 'Na05', 0, 68, 0, 15),
('2023-07-01', 'Na06', 0, 89, 0, 15),
('2023-07-01', 'Nu01', 0, 56, 0, 12),
('2023-07-01', 'Nu02', 0, 78, 0, 18),
('2023-07-01', 'Nu03', 0, 78, 0, 14),
('2023-08-01', 'Na02', 67, 115, 23, 34),
('2023-08-01', 'Na03', 89, 135, 18, 34),
('2023-08-01', 'Na04', 75, 118, 22, 32),
('2023-08-01', 'Na05', 68, 114, 15, 24),
('2023-08-01', 'Na06', 89, 156, 15, 24),
('2023-08-01', 'Nu01', 56, 112, 12, 24),
('2023-08-01', 'Nu02', 78, 116, 18, 29),
('2023-08-01', 'Nu03', 78, 134, 14, 24),
('2023-09-01', 'Na02', 115, 189, 34, 45),
('2023-09-01', 'Na03', 135, 198, 34, 44),
('2023-09-01', 'Na04', 118, 197, 32, 45),
('2023-09-01', 'Na05', 114, 188, 24, 34),
('2023-09-01', 'Na06', 156, 232, 24, 36),
('2023-09-01', 'Nu01', 112, 189, 24, 32),
('2023-09-01', 'Nu02', 116, 187, 29, 36),
('2023-09-01', 'Nu03', 134, 199, 24, 35),
('2023-10-01', 'Na02', 189, 234, 45, 59),
('2023-10-01', 'Na03', 198, 254, 44, 56),
('2023-10-01', 'Na04', 197, 256, 45, 54),
('2023-10-01', 'Na05', 188, 245, 34, 45),
('2023-10-01', 'Na06', 232, 289, 36, 45),
('2023-10-01', 'Nu01', 189, 225, 32, 41),
('2023-10-01', 'Nu02', 187, 231, 36, 43),
('2023-10-01', 'Nu03', 199, 267, 35, 43),
('2023-11-01', 'Na02', 234, 312, 59, 72),
('2023-11-01', 'Na03', 254, 321, 56, 65),
('2023-11-01', 'Na04', 256, 334, 54, 67),
('2023-11-01', 'Na05', 245, 302, 45, 56),
('2023-11-01', 'Na06', 289, 354, 45, 67),
('2023-11-01', 'Nu01', 225, 298, 41, 53),
('2023-11-01', 'Nu02', 231, 300, 43, 54),
('2023-11-01', 'Nu03', 267, 331, 43, 60);

-- --------------------------------------------------------

--
-- Table structure for table `giahan`
--

CREATE TABLE `giahan` (
  `maSV` varchar(50) NOT NULL,
  `ngayKTHD` date DEFAULT NULL,
  `thoiGianGH` int(11) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `giahan`
--

INSERT INTO `giahan` (`maSV`, `ngayKTHD`, `thoiGianGH`, `trangThai`) VALUES
('N21DCCN004', '2024-07-01', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `hoadonphong`
--

CREATE TABLE `hoadonphong` (
  `ngayThang` date NOT NULL,
  `maPhong` varchar(50) NOT NULL,
  `soNuocTieuThu` float NOT NULL,
  `soDienTieuThu` float NOT NULL,
  `tongTien` double NOT NULL DEFAULT 0,
  `trangThai` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoadonphong`
--

INSERT INTO `hoadonphong` (`ngayThang`, `maPhong`, `soNuocTieuThu`, `soDienTieuThu`, `tongTien`, `trangThai`) VALUES
('2023-07-01', 'Na02', 23, 67, 752000, b'1'),
('2023-07-01', 'Na03', 18, 89, 834000, b'1'),
('2023-07-01', 'Na04', 22, 75, 790000, b'1'),
('2023-07-01', 'Na05', 15, 68, 678000, b'1'),
('2023-07-01', 'Na06', 15, 89, 804000, b'1'),
('2023-07-01', 'Nu01', 12, 56, 576000, b'1'),
('2023-07-01', 'Nu02', 18, 78, 768000, b'1'),
('2023-07-01', 'Nu03', 14, 78, 728000, b'1'),
('2023-08-01', 'Na02', 11, 48, 518000, b'1'),
('2023-08-01', 'Na03', 16, 46, 556000, b'1'),
('2023-08-01', 'Na04', 10, 43, 478000, b'1'),
('2023-08-01', 'Na05', 9, 46, 486000, b'1'),
('2023-08-01', 'Na06', 9, 67, 612000, b'1'),
('2023-08-01', 'Nu01', 12, 56, 576000, b'1'),
('2023-08-01', 'Nu02', 11, 38, 458000, b'1'),
('2023-08-01', 'Nu03', 10, 56, 556000, b'1'),
('2023-09-01', 'Na02', 11, 74, 674000, b'0'),
('2023-09-01', 'Na03', 10, 63, 598000, b'0'),
('2023-09-01', 'Na04', 13, 79, 724000, b'0'),
('2023-09-01', 'Na05', 10, 74, 664000, b'0'),
('2023-09-01', 'Na06', 12, 76, 696000, b'0'),
('2023-09-01', 'Nu01', 8, 77, 662000, b'0'),
('2023-09-01', 'Nu02', 7, 71, 616000, b'0'),
('2023-09-01', 'Nu03', 11, 65, 620000, b'0'),
('2023-10-01', 'Na02', 14, 45, 530000, b'0'),
('2023-10-01', 'Na03', 12, 56, 576000, b'0'),
('2023-10-01', 'Na04', 9, 59, 564000, b'0'),
('2023-10-01', 'Na05', 11, 57, 572000, b'0'),
('2023-10-01', 'Na06', 9, 57, 552000, b'0'),
('2023-10-01', 'Nu01', 9, 36, 426000, b'0'),
('2023-10-01', 'Nu02', 7, 44, 454000, b'0'),
('2023-10-01', 'Nu03', 8, 68, 608000, b'0'),
('2023-11-01', 'Na02', 13, 78, 718000, b'0'),
('2023-11-01', 'Na03', 9, 67, 612000, b'0'),
('2023-11-01', 'Na04', 13, 78, 718000, b'0'),
('2023-11-01', 'Na05', 11, 57, 572000, b'0'),
('2023-11-01', 'Na06', 22, 65, 730000, b'0'),
('2023-11-01', 'Nu01', 12, 73, 678000, b'0'),
('2023-11-01', 'Nu02', 11, 69, 644000, b'0'),
('2023-11-01', 'Nu03', 17, 64, 674000, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `hoadonsv`
--

CREATE TABLE `hoadonsv` (
  `ngayThang` date NOT NULL,
  `maSV` varchar(50) NOT NULL,
  `tienThanhToan` float DEFAULT NULL,
  `trangThai` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoadonsv`
--

INSERT INTO `hoadonsv` (`ngayThang`, `maSV`, `tienThanhToan`, `trangThai`) VALUES
('2023-07-01', 'N20DCCN004', 1300000, b'1'),
('2023-07-01', 'N21DCCN002', 900000, b'1'),
('2023-07-01', 'N21DCCN003', 700000, b'1'),
('2023-07-01', 'N21DCCN004', 1300000, b'1'),
('2023-07-01', 'N22DCCN005', 700000, b'1'),
('2023-08-01', 'N20DCCN001', 400000, b'1'),
('2023-08-01', 'N20DCCN002', 900000, b'1'),
('2023-08-01', 'N20DCCN003', 900000, b'1'),
('2023-08-01', 'N20DCCN004', 1300000, b'1'),
('2023-08-01', 'N21DCCN001', 700000, b'1'),
('2023-08-01', 'N21DCCN002', 900000, b'1'),
('2023-08-01', 'N21DCCN003', 700000, b'1'),
('2023-08-01', 'N21DCCN004', 1300000, b'1'),
('2023-08-01', 'N22DCCN005', 700000, b'1'),
('2023-09-01', 'N20DCCN001', 400000, b'0'),
('2023-09-01', 'N20DCCN002', 900000, b'1'),
('2023-09-01', 'N20DCCN003', 900000, b'0'),
('2023-09-01', 'N20DCCN004', 1300000, b'1'),
('2023-09-01', 'N21DCCN001', 700000, b'0'),
('2023-09-01', 'N21DCCN002', 900000, b'1'),
('2023-09-01', 'N21DCCN003', 700000, b'0'),
('2023-09-01', 'N21DCCN004', 1300000, b'0'),
('2023-09-01', 'N22DCCN005', 700000, b'0'),
('2023-09-01', 'N22DCCN006', 700000, b'1'),
('2023-10-01', 'N19DCCN034', 900000, b'0'),
('2023-10-01', 'N20DCCN001', 400000, b'0'),
('2023-10-01', 'N20DCCN002', 900000, b'0'),
('2023-10-01', 'N20DCCN003', 900000, b'0'),
('2023-10-01', 'N20DCCN004', 1300000, b'0'),
('2023-10-01', 'N20DCCN042', 700000, b'0'),
('2023-10-01', 'N21DCCN001', 700000, b'0'),
('2023-10-01', 'N21DCCN002', 900000, b'0'),
('2023-10-01', 'N21DCCN003', 700000, b'0'),
('2023-10-01', 'N21DCCN004', 1300000, b'0'),
('2023-10-01', 'N22DCCN005', 700000, b'0'),
('2023-10-01', 'N22DCCN006', 700000, b'0'),
('2023-11-01', 'N19DCCN034', 900000, b'0'),
('2023-11-01', 'N20DCCN001', 400000, b'0'),
('2023-11-01', 'N20DCCN002', 900000, b'0'),
('2023-11-01', 'N20DCCN003', 900000, b'0'),
('2023-11-01', 'N20DCCN041', 900000, b'0'),
('2023-11-01', 'N20DCCN042', 700000, b'0'),
('2023-11-01', 'N21DCCN001', 700000, b'0'),
('2023-11-01', 'N21DCCN002', 900000, b'0'),
('2023-11-01', 'N21DCCN003', 700000, b'0'),
('2023-11-01', 'N21DCCN004', 1300000, b'0'),
('2023-11-01', 'N22DCCN005', 700000, b'0'),
('2023-11-01', 'N22DCCN006', 700000, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `hopdongktx`
--

CREATE TABLE `hopdongktx` (
  `maSV` varchar(50) NOT NULL,
  `maPhong` varchar(50) NOT NULL,
  `ngayHDBD` date NOT NULL,
  `ngayHDKT` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hopdongktx`
--

INSERT INTO `hopdongktx` (`maSV`, `maPhong`, `ngayHDBD`, `ngayHDKT`) VALUES
('N19DCCN034', 'Na02', '2023-10-01', '2024-04-01'),
('N20DCCN001', 'Na05', '2023-08-01', '2024-07-01'),
('N20DCCN002', 'Nu02', '2023-08-01', '2024-03-01'),
('N20DCCN003', 'Nu02', '2023-08-01', '2024-04-01'),
('N20DCCN004', 'Nu01', '2023-07-01', '2023-11-01'),
('N20DCCN039', 'Na04', '2024-01-01', '2024-04-01'),
('N20DCCN041', 'Nu02', '2023-11-01', '2024-03-01'),
('N20DCCN042', 'Nu03', '2023-10-01', '2023-12-01'),
('N21DCCN001', 'Na03', '2023-08-01', '2024-07-01'),
('N21DCCN002', 'Na02', '2023-07-01', '2024-02-01'),
('N21DCCN003', 'Nu03', '2023-07-01', '2024-07-01'),
('N21DCCN004', 'Nu01', '2023-07-01', '2024-07-01'),
('N22DCCN005', 'Nu03', '2023-07-01', '2024-03-01'),
('N22DCCN006', 'Na03', '2023-09-01', '2024-02-01');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `tenNV` varchar(50) DEFAULT NULL,
  `CCCD` varchar(50) NOT NULL,
  `gioiTinh` varchar(50) DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `soDienThoai` varchar(50) DEFAULT NULL,
  `queQuan` varchar(50) DEFAULT NULL,
  `chucVu` varchar(50) DEFAULT NULL,
  `trangThai` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`tenNV`, `CCCD`, `gioiTinh`, `ngaySinh`, `email`, `soDienThoai`, `queQuan`, `chucVu`, `trangThai`) VALUES
('Hồ B', '212333444', 'Nam', '2001-12-13', 'hob@gmail.com', '0456767676', 'Đồng Nai', 'Nhân Viên', 'Đang làm việc'),
('Hồ A', '212453454', 'Nữ', '2000-12-14', 'hoa@gmail.com', '0264447888', 'Hà Giang', 'Nhân Viên', 'Đang làm việc'),
('Cao A', '212928740', 'Nữ', '1991-12-12', 'caoa@gmail.com', '0826745550', 'Đồng Tháp', 'Quản lý', 'Đang làm việc'),
('Cao B', '212928741', 'Nam', '1990-12-07', 'caob@gmail.com', '0826745551', 'Khánh Hòa', 'Nhân viên', 'Đang làm việc'),
('Cao C', '212928744', 'Nam', '1990-12-24', 'caoc@gmail.com', '0826745556', 'Quảng Ninh', 'Nhân viên', 'Đã nghỉ việc'),
('Admin', '232526352', 'Nữ', '2000-12-23', 'admin@gmail.com', '0836475628', 'An Giang', 'Quản lý', 'Đang làm việc');

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `maPhong` varchar(50) NOT NULL,
  `tenPhong` varchar(50) DEFAULT NULL,
  `soLuongSVPhong` int(11) DEFAULT NULL,
  `loaiphong` varchar(50) DEFAULT NULL,
  `tienPhong` float DEFAULT NULL,
  `gioiTinh` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`maPhong`, `tenPhong`, `soLuongSVPhong`, `loaiphong`, `tienPhong`, `gioiTinh`) VALUES
('Na02', 'Phòng Nam 02', 6, 'Loại 3', 900000, 'Nam'),
('Na03', 'Phòng Nam 03', 8, 'Loại 3', 700000, 'Nam'),
('Na04', 'Phòng Nam 04', 4, 'Loại 1', 600000, 'Nam'),
('Na05', 'Phòng Nam 05', 6, 'Loại 5', 400000, 'Nam'),
('Na06', 'Phòng Nam 06', 8, 'Loại 6', 200000, 'Nam'),
('Nu01', 'Phòng Nam 01', 4, 'Loại 1', 1300000, 'Nữ'),
('Nu02', 'Phòng Nam 02', 6, 'Loại 2', 900000, 'Nữ'),
('Nu03', 'Phòng Nam 03', 8, 'Loại 3', 700000, 'Nữ');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `maSV` varchar(50) NOT NULL,
  `tenSV` varchar(50) DEFAULT NULL,
  `CCCD` varchar(50) DEFAULT NULL,
  `gioiTinh` varchar(50) DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `soDienThoai` varchar(50) DEFAULT NULL,
  `queQuan` varchar(50) DEFAULT NULL,
  `maLop` varchar(50) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`maSV`, `tenSV`, `CCCD`, `gioiTinh`, `ngaySinh`, `email`, `soDienThoai`, `queQuan`, `maLop`, `trangThai`) VALUES
('N19DCCN034', 'Huỳnh G', '212556675', 'Nam', '2001-09-12', 'huynhg@gmail.com', '0739283718', 'Đắk Nông', 'D19CQCN01', 2),
('N20DCCN001', 'Phan A', '212827641', 'Nam', '2001-06-09', 'phana@gmail.com', '0828936761', 'An Giang', 'D20CQCN01', 2),
('N20DCCN002', 'Phan B', '212827642', 'Nữ', '2001-06-19', 'phanb@gmail.com', '0828936762', 'An Giang', 'D20CQCN02', 2),
('N20DCCN003', 'Phan C', '212827643', 'Nữ', '2001-04-10', 'phanc@gmail.com', '0828936763', 'An Giang', 'D20CQCN02', 2),
('N20DCCN004', 'Phan D', '212827644', 'Nữ', '2001-02-13', 'phand@gmail.com', '0828936764', 'An Giang', 'D20CQCN02', 3),
('N20DCCN039', 'Huỳnh A', '212467584', 'Nam', '2002-04-10', 'phantienk@gmail.com', '0283718293', 'An Giang', 'D21CQCN02', 2),
('N20DCCN040', 'Huỳnh B', '212467585', 'Nữ', '2002-07-16', 'huynhb@gmail.com', '0283718294', 'An Giang', 'D21CQCN02', 0),
('N20DCCN041', 'Huỳnh C', '212467586', 'Nữ', '2002-07-16', 'huynhc@gmail.com', '0283718295', 'An Giang', 'D21CQCN01', 2),
('N20DCCN042', 'Huỳnh D', '212467587', 'Nữ', '2002-08-13', 'huynhd@gmail.com', '0283718296', 'An Giang', 'D21CQCN01', 3),
('N21DCCN001', 'Nguyễn A', '212456767', 'Nam', '2003-12-13', 'nguyena@gmail.com', '0826374827', 'An Giang', 'D21CQCN01', 2),
('N21DCCN002', 'Nguyễn B', '212456763', 'Nam', '2003-12-03', 'nguyenb@gmail.com', '0826374828', 'An Giang', 'D21CQCN01', 2),
('N21DCCN003', 'Nguyễn C', '212456766', 'Nữ', '2002-12-03', 'nguyenc@gmail.com', '0826374829', 'An Giang', 'D21CQCN02', 2),
('N21DCCN004', 'Nguyễn D', '212456769', 'Nữ', '2002-12-03', 'nguyend@gmail.com', '0826374824', 'An Giang', 'D21CQCN02', 2),
('N22DCCN005', 'Trần A', '212827630', 'Nữ', '2002-12-03', 'trana@gmail.com', '0828936780', 'An Giang', 'D22CQCN02', 2),
('N22DCCN006', 'Trần B', '212827631', 'Nam', '2002-06-06', 'tranb@gmail.com', '0828936781', 'An Giang', 'D22CQCN02', 2),
('N22DCCN007', 'Trần C', '212827632', 'Nữ', '2002-06-12', 'tranc@gmail.com', '0828936782', 'An Giang', 'D22CQCN02', 0),
('N22DCCN008', 'Trần D', '212827633', 'Nam', '2002-06-12', 'trand@gmail.com', '0828936783', 'An Giang', 'D22CQCN01', 0);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `tenDangNhap` varchar(50) NOT NULL,
  `matKhau` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phanQuyen` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`tenDangNhap`, `matKhau`, `email`, `phanQuyen`) VALUES
('123', '123', 'phana@gmail.com', 'Sinh Viên'),
('admin', '123', 'admin@gmail.com', 'Quản lý'),
('admin02', '123', 'caoa@gmail.com', 'Quản lý'),
('admin03', '123', 'caob@gmail.com', 'Nhân viên'),
('admin04', '123', 'caoc@gmail.com', 'Nhân viên'),
('adminhoa', '123', 'hoa@gmail.com', 'Nhân viên'),
('adminhob', '123', 'hob@gmail.com', 'Nhân viên'),
('auhffzuao', '1769718', 'phantienk@gmail.com', 'Sinh Viên'),
('huynhb', '123', 'huynhb@gmail.com', 'Sinh Viên'),
('huynhc', '123', 'huynhc@gmail.com', 'Sinh Viên'),
('huynhd', '123', 'huynhd@gmail.com', 'Sinh Viên'),
('huynhg', '123', 'huynhg@gmail.com', 'Sinh Vien'),
('user123', '123', 'nguyena@gmail.com', 'Sinh Viên'),
('usernguyenb', '123', 'nguyenb@gmail.com', 'Sinh Viên'),
('usernguyenc', '123', 'nguyenc@gmail.com', 'Sinh Viên'),
('usernguyend', '123', 'nguyend@gmail.com', 'Sinh Viên'),
('userphanb', '123', 'phanb@gmail.com', 'Sinh Viên'),
('userphanc', '123', 'phanc@gmail.com', 'Sinh Viên'),
('userphand', '123', 'phand@gmail.com', 'Sinh Viên'),
('usertrana', '123', 'trana@gmail.com', 'Sinh Viên'),
('usertranb', '123', 'tranb@gmail.com', 'Sinh Viên'),
('usertranc', '123', 'tranc@gmail.com', 'Sinh Viên'),
('usertrand', '123', 'trand@gmail.com', 'Sinh Viên');

-- --------------------------------------------------------

--
-- Table structure for table `thongbao`
--

CREATE TABLE `thongbao` (
  `ngayThongBao` date NOT NULL,
  `soPhong` varchar(50) NOT NULL,
  `tieuDe` varchar(200) NOT NULL,
  `noiDung` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `thongbao`
--

INSERT INTO `thongbao` (`ngayThongBao`, `soPhong`, `tieuDe`, `noiDung`) VALUES
('2023-12-25', 'Na02', 'Thông báo Na', 'Phòng Na02 dọn dẹp vệ sinh'),
('2023-12-25', 'Na02', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Na03', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Na04', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Na05', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Na06', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Nu01', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Nu02', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng'),
('2023-12-25', 'Nu03', 'Thông báo đóng tiền phòng', 'Các phòng đóng tiền phòng');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chuyenphong`
--
ALTER TABLE `chuyenphong`
  ADD PRIMARY KEY (`maSV`);

--
-- Indexes for table `dangkyphong`
--
ALTER TABLE `dangkyphong`
  ADD PRIMARY KEY (`maSV`);

--
-- Indexes for table `dichvuphong`
--
ALTER TABLE `dichvuphong`
  ADD PRIMARY KEY (`ngayThang`,`maPhong`),
  ADD KEY `maPhong` (`maPhong`);

--
-- Indexes for table `giahan`
--
ALTER TABLE `giahan`
  ADD PRIMARY KEY (`maSV`);

--
-- Indexes for table `hoadonphong`
--
ALTER TABLE `hoadonphong`
  ADD PRIMARY KEY (`ngayThang`,`maPhong`),
  ADD KEY `maPhong` (`maPhong`);

--
-- Indexes for table `hoadonsv`
--
ALTER TABLE `hoadonsv`
  ADD PRIMARY KEY (`ngayThang`,`maSV`),
  ADD KEY `maSV` (`maSV`);

--
-- Indexes for table `hopdongktx`
--
ALTER TABLE `hopdongktx`
  ADD PRIMARY KEY (`maSV`,`maPhong`),
  ADD KEY `maPhong` (`maPhong`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`CCCD`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`maPhong`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`maSV`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`tenDangNhap`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `thongbao`
--
ALTER TABLE `thongbao`
  ADD PRIMARY KEY (`ngayThongBao`,`soPhong`,`tieuDe`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chuyenphong`
--
ALTER TABLE `chuyenphong`
  ADD CONSTRAINT `chuyenphong_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `dangkyphong`
--
ALTER TABLE `dangkyphong`
  ADD CONSTRAINT `dangkyphong_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `dichvuphong`
--
ALTER TABLE `dichvuphong`
  ADD CONSTRAINT `dichvuphong_ibfk_1` FOREIGN KEY (`maPhong`) REFERENCES `phong` (`maPhong`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `giahan`
--
ALTER TABLE `giahan`
  ADD CONSTRAINT `giahan_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hoadonphong`
--
ALTER TABLE `hoadonphong`
  ADD CONSTRAINT `hoadonphong_ibfk_1` FOREIGN KEY (`ngayThang`,`maPhong`) REFERENCES `dichvuphong` (`ngayThang`, `maPhong`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hoadonsv`
--
ALTER TABLE `hoadonsv`
  ADD CONSTRAINT `hoadonsv_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hopdongktx`
--
ALTER TABLE `hopdongktx`
  ADD CONSTRAINT `hopdongktx_ibfk_1` FOREIGN KEY (`maPhong`) REFERENCES `phong` (`maPhong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hopdongktx_ibfk_2` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`email`) REFERENCES `taikhoan` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `sinhvien_ibfk_1` FOREIGN KEY (`email`) REFERENCES `taikhoan` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `thongbao`
--
ALTER TABLE `thongbao`
  ADD CONSTRAINT `thongbao_ibfk_1` FOREIGN KEY (`soPhong`) REFERENCES `phong` (`maPhong`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
