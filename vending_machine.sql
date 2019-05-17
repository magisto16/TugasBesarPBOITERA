-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17 Mei 2019 pada 07.50
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vending_machine`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `User_ID` int(4) NOT NULL,
  `username` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`User_ID`, `username`, `nama`, `password`) VALUES
(2, '1411701515', 'Eko', 'itera1234'),
(1, '1411702020', 'Ujang', 'itera123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `User_ID` int(4) NOT NULL,
  `username` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `password` varchar(10) NOT NULL,
  `saldo` int(11) NOT NULL,
  `admin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`User_ID`, `username`, `nama`, `password`, `saldo`, `admin`) VALUES
(1, '14117016', 'Dhiko JangJaya Putra', '12345', 1843000, '1411702020'),
(4, '14117021', 'Iqbal CJR', '12345', 500000, '1411701515'),
(2, '14117035', 'Yudi Gunawan', '12345', 2000000, '1411702020'),
(3, '14117037', 'Nardiyansah Tri Jatmiko', '73071141', 2889000, '1411701515');

-- --------------------------------------------------------

--
-- Struktur dari tabel `makanan`
--

CREATE TABLE `makanan` (
  `id` int(4) NOT NULL,
  `nama` varchar(15) NOT NULL,
  `slot` int(2) NOT NULL,
  `stok` int(20) NOT NULL,
  `harga` int(11) NOT NULL,
  `admin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `makanan`
--

INSERT INTO `makanan` (`id`, `nama`, `slot`, `stok`, `harga`, `admin`) VALUES
(1, 'Lays', 1, 11, 12000, '1411702020'),
(2, 'Chitato', 2, 9, 12000, '1411702020'),
(3, 'Freshtea', 3, 10, 3000, '1411701515'),
(4, 'Sprite', 4, 14, 7000, '1411702020');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`username`),
  ADD KEY `admin` (`admin`);

--
-- Indexes for table `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `slot` (`slot`),
  ADD KEY `admin` (`admin`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`admin`) REFERENCES `admin` (`username`);

--
-- Ketidakleluasaan untuk tabel `makanan`
--
ALTER TABLE `makanan`
  ADD CONSTRAINT `makanan_ibfk_1` FOREIGN KEY (`admin`) REFERENCES `admin` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
