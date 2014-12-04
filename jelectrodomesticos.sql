-- phpMyAdmin SQL Dump
-- version 4.2.6deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 04-12-2014 a las 09:33:11
-- Versión del servidor: 5.5.40-0ubuntu1
-- Versión de PHP: 5.5.12-2ubuntu4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `jelectrodomesticos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `electrodomesticos`
--

CREATE TABLE IF NOT EXISTS `electrodomesticos` (
  `precio_base` double NOT NULL,
  `peso` double NOT NULL,
  `color` text NOT NULL,
  `consumo` text NOT NULL,
  `descripcion` text NOT NULL,
  `carga` double DEFAULT NULL,
  `resolucion` double DEFAULT NULL,
  `tdt` tinyint(1) DEFAULT NULL,
`id_electrodomestico` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=51 ;

--
-- Volcado de datos para la tabla `electrodomesticos`
--

INSERT INTO `electrodomesticos` (`precio_base`, `peso`, `color`, `consumo`, `descripcion`, `carga`, `resolucion`, `tdt`, `id_electrodomestico`) VALUES
(8555, 20, 'azul', 'B', 'Samsung', 11, NULL, NULL, 1),
(12171, 11, 'negro', 'B', 'Hitachi', NULL, 47, 0, 2),
(5981, 10, 'rojo', 'A', 'Samsung', 6, NULL, NULL, 3),
(4527, 16, 'rojo', 'D', 'Samsung', NULL, 20, 0, 4),
(8859, 36, 'blanco', 'D', 'LG', 11, NULL, NULL, 5),
(5833, 24, 'blanco', 'A', 'Phillips', NULL, 46, 1, 6),
(7413, 34, 'azul', 'D', 'Drean', 9, NULL, NULL, 7),
(12942, 22, 'blanco', 'C', 'Phillips', NULL, 50, 1, 8),
(9854, 30, 'negro', 'C', 'LG', 7, NULL, NULL, 9),
(13784, 11, 'azul', 'F', 'Sony', NULL, 36, 1, 10),
(9131, 37, 'gris', 'A', 'Drean', 8, NULL, NULL, 11),
(6551, 33, 'gris', 'D', 'Noblex', NULL, 17, 1, 12),
(7017, 12, 'gris', 'B', 'Drean', 11, NULL, NULL, 13),
(8633, 17, 'rojo', 'A', 'Phillips', NULL, 13, 0, 14),
(6918, 14, 'negro', 'B', 'LG', 7, NULL, NULL, 15),
(13440, 39, 'gris', 'A', 'Samsung', NULL, 40, 1, 16),
(4919, 16, 'azul', 'D', 'Samsung', 11, NULL, NULL, 17),
(11195, 14, 'blanco', 'E', 'LG', NULL, 19, 1, 18),
(9318, 29, 'azul', 'F', 'Whirlpool', 9, NULL, NULL, 19),
(8419, 11, 'azul', 'D', 'Noblex', NULL, 41, 1, 20),
(9486, 26, 'azul', 'A', 'Philco', 10, NULL, NULL, 21),
(13027, 23, 'rojo', 'D', 'Ken Brown', NULL, 25, 0, 22),
(7978, 37, 'rojo', 'F', 'Philco', 7, NULL, NULL, 23),
(11787, 32, 'gris', 'A', 'Sony', NULL, 30, 0, 24),
(8165, 26, 'azul', 'E', 'Philco', 7, NULL, NULL, 25),
(8188, 30, 'negro', 'D', 'Hitachi', NULL, 31, 1, 26),
(6115, 12, 'rojo', 'E', 'Ken Brown', 4, NULL, NULL, 27),
(10376, 11, 'azul', 'A', 'Hitachi', NULL, 34, 0, 28),
(6990, 18, 'gris', 'F', 'LG', 9, NULL, NULL, 29),
(13176, 26, 'negro', 'F', 'Sony', NULL, 36, 1, 30),
(8639, 23, 'negro', 'B', 'Drean', 8, NULL, NULL, 31),
(5525, 32, 'negro', 'E', 'Noblex', NULL, 13, 0, 32),
(8516, 14, 'blanco', 'F', 'Eslabon de Lujo', 8, NULL, NULL, 33),
(9655, 26, 'rojo', 'B', 'Philco', NULL, 23, 0, 34),
(7033, 23, 'gris', 'A', 'Samsung', 10, NULL, NULL, 35),
(12429, 15, 'blanco', 'D', 'Philco', NULL, 41, 1, 36),
(9157, 33, 'azul', 'C', 'Whirlpool', 6, NULL, NULL, 37),
(12249, 19, 'rojo', 'F', 'Philco', NULL, 43, 0, 38),
(8883, 30, 'rojo', 'C', 'Samsung', 8, NULL, NULL, 39),
(3715, 28, 'gris', 'F', 'Ken Brown', NULL, 46, 1, 40),
(9226, 34, 'negro', 'A', 'LG', 11, NULL, NULL, 41),
(14360, 31, 'gris', 'C', 'Phillips', NULL, 38, 1, 42),
(6095, 16, 'blanco', 'F', 'LG', 9, NULL, NULL, 43),
(4133, 34, 'azul', 'B', 'Philco', NULL, 38, 1, 44),
(8215, 37, 'negro', 'B', 'Ken Brown', 9, NULL, NULL, 45),
(11770, 25, 'gris', 'B', 'Phillips', NULL, 12, 1, 46),
(4862, 13, 'azul', 'C', 'Eslabon de Lujo', 5, NULL, NULL, 47),
(7847, 32, 'gris', 'C', 'Hitachi', NULL, 50, 1, 48),
(4803, 21, 'rojo', 'D', 'Ken Brown', 5, NULL, NULL, 49),
(4973, 29, 'rojo', 'C', 'Samsung', NULL, 45, 1, 50);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `electrodomesticos`
--
ALTER TABLE `electrodomesticos`
 ADD PRIMARY KEY (`id_electrodomestico`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `electrodomesticos`
--
ALTER TABLE `electrodomesticos`
MODIFY `id_electrodomestico` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=51;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
