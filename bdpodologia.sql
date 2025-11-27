-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2025 a las 21:01:18
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdpodologia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `codigo` varchar(30) NOT NULL,
  `fecha` varchar(10) DEFAULT NULL,
  `hora` varchar(5) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`codigo`, `fecha`, `hora`, `nombre`, `apellido`, `edad`) VALUES
('01-02-2026_10:00', '01-02-2026', '10:00', 'Matias', 'Lobos', 28),
('04-01-2025_17:00', '04-01-2025', '17:00', 'Sofia', 'Jorquera', 34),
('09-01-2026_14:00', '09-01-2026', '14:00', 'Max', 'Herrera', 45),
('27-11-2025_15:00', '27-11-2025', '15:00', 'Felipe', 'Fernandez', 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_tratamiento`
--

CREATE TABLE `registro_tratamiento` (
  `codigo` varchar(30) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registro_tratamiento`
--

INSERT INTO `registro_tratamiento` (`codigo`, `nombre`) VALUES
('01-02-2026_10:00', 'Hiperqueratosis'),
('01-02-2026_10:00', 'Pie de atleta'),
('01-02-2026_10:00', 'Uña con hongo'),
('04-01-2025_17:00', 'Callos'),
('04-01-2025_17:00', 'Uña encarnada'),
('09-01-2026_14:00', 'Diagnostico'),
('27-11-2025_15:00', 'Diagnostico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `nombre` varchar(50) NOT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`nombre`, `precio`) VALUES
('Callos', 25000),
('Diagnostico', 10000),
('Hiperqueratosis', 30000),
('Pie de atleta', 35000),
('Uña con hongo', 20000),
('Uña encarnada', 15000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `registro_tratamiento`
--
ALTER TABLE `registro_tratamiento`
  ADD PRIMARY KEY (`codigo`,`nombre`),
  ADD KEY `nombre` (`nombre`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`nombre`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `registro_tratamiento`
--
ALTER TABLE `registro_tratamiento`
  ADD CONSTRAINT `fk_pe_del` FOREIGN KEY (`codigo`) REFERENCES `registro` (`codigo`) ON DELETE CASCADE,
  ADD CONSTRAINT `registro_tratamiento_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `registro` (`codigo`),
  ADD CONSTRAINT `registro_tratamiento_ibfk_2` FOREIGN KEY (`nombre`) REFERENCES `tratamiento` (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
