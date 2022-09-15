-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 14. Jun 2021 um 21:05
-- Server-Version: 10.4.17-MariaDB
-- PHP-Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `songs`
--
CREATE DATABASE IF NOT EXISTS `songs` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `songs`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bands`
--

CREATE TABLE `bands` (
  `ID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `creation_date` date NOT NULL,
  `Num_o_Published_Songs` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONEN DER TABELLE `bands`:
--

--
-- Daten für Tabelle `bands`
--

INSERT INTO `bands` (`ID`, `Name`, `creation_date`, `Num_o_Published_Songs`) VALUES
(1, 'Future', '2012-01-20', 151),
(2, 'Bad Bunny', '2021-06-22', 94),
(3, 'Takashi 6ix9ine', '2021-11-10', 35);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `songs`
--

CREATE TABLE `songs` (
  `ID` int(11) NOT NULL,
  `S_from_artist_ID` int(11) NOT NULL,
  `S_Name` text NOT NULL,
  `S_Description` text NOT NULL,
  `URL` text NOT NULL,
  `S_Views` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELATIONEN DER TABELLE `songs`:
--   `S_from_artist_ID`
--       `bands` -> `ID`
--

--
-- Daten für Tabelle `songs`
--

INSERT INTO `songs` (`ID`, `S_from_artist_ID`, `S_Name`, `S_Description`, `URL`, `S_Views`) VALUES
(1, 1, 'Life Is Good', 'Workin\' on a weekend like usual\r\nWay off in the deep end like usual\r\nNiggas swear they passed us, they doin\' too much\r\nHaven\'t done my taxes, I\'m too turnt up\r\nVirgil got a Patek on my wrist goin\' nuts\r\nNiggas caught me slippin\' once, okay, so what?\r\nSomeone hit your block up, I\'d tell you if it was us\r\nManor house in Rosewood, this shit too plush', 'https://www.youtube.com/watch?v=l0U7SxXHkPY', 1924),
(2, 2, 'JHAY CORTEZ', 'Baby, ya yo me enteré, se nota cuando me ve\'\r\nAhí donde no has llega\'o sabe\' que yo te llevaré\r\nY dime qué quiere\' beber, es que tú ere\' mi bebé\r\n¿Y de nosotro\' quién va a hablar? Si no nos dejamo\' ver', 'https://www.youtube.com/watch?v=TmKh7lAwnBI', 817426405),
(3, 3, 'GOOBA', 'I tell a nigga don\'t dick ride, don\'t blick ride\r\nLeave it to the double thick thighs, twin sisters\r\nDrop it down and wobble, wobble up, mami booted up\r\nShe get down and gobble, gobble up \'cause my money up\r\nSlide, slide in the Bentley truck-a, the Wraith truck-a\r\nYour bestie is a dick sucker, I big dub her\r\nAs-salama-lama alaykum, you big hater\r\nYou nothin\' but a hater, hater, clout chaser', 'https://www.youtube.com/watch?v=pPw_izFr5PA', 726189562);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `bands`
--
ALTER TABLE `bands`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `songs`
--
ALTER TABLE `songs`
  ADD PRIMARY KEY (`ID`,`S_from_artist_ID`),
  ADD KEY `S_from_artist_ID` (`S_from_artist_ID`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `bands`
--
ALTER TABLE `bands`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `songs`
--
ALTER TABLE `songs`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `songs`
--
ALTER TABLE `songs`
  ADD CONSTRAINT `songs_ibfk_1` FOREIGN KEY (`S_from_artist_ID`) REFERENCES `bands` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
