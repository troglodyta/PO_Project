-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Czas wygenerowania: 28 Sty 2014, 09:03
-- Wersja serwera: 5.5.34
-- Wersja PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza danych: `carsdata`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `adresy`
--

CREATE TABLE IF NOT EXISTS `adresy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Ulica` varchar(255) NOT NULL,
  `KodPocztowy` varchar(255) NOT NULL,
  `Miejscowosc` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=42 ;

--
-- Zrzut danych tabeli `adresy`
--

INSERT INTO `adresy` (`ID`, `Ulica`, `KodPocztowy`, `Miejscowosc`) VALUES
(1, 'Słoneczna 35', '55812', 'Wrocław'),
(2, 'Czekoladowa 48', '55986', 'Wrocław'),
(3, 'Jesienna 32/2', '55823', 'Kraków'),
(4, 'Wiosenna 32', '34987', 'Wrocław'),
(5, 'Wilcza 41', '34563', 'Wrocław');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `akcesories`
--

CREATE TABLE IF NOT EXISTS `akcesories` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `OddzialyID` int(11) NOT NULL,
  `NazwaAkcesorium` varchar(255) NOT NULL,
  `CenaWypozyczenia` double NOT NULL,
  `IloscWOddziale` int(4) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAkcesories975413` (`OddzialyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Zrzut danych tabeli `akcesories`
--

INSERT INTO `akcesories` (`ID`, `OddzialyID`, `NazwaAkcesorium`, `CenaWypozyczenia`, `IloscWOddziale`) VALUES
(1, 1, 'Fotelik Samochodowy', 50, 20),
(2, 1, 'Nawigacja GPS', 50, 15);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danemodelipojazdow`
--

CREATE TABLE IF NOT EXISTS `danemodelipojazdow` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Marka` varchar(255) NOT NULL,
  `Model` varchar(255) NOT NULL,
  `Typ` varchar(255) NOT NULL,
  `Kategoria` varchar(255) NOT NULL,
  `Zdjecie` varchar(255) DEFAULT NULL,
  `MiejscaSiedzace` int(11) NOT NULL,
  `MaxMasaCalkowita` int(11) NOT NULL,
  `MasaWlasna` int(11) NOT NULL,
  `PojemnoscSilnika` int(11) NOT NULL,
  `Moc` int(11) NOT NULL,
  `CenaWypozyczenia` double NOT NULL,
  `Kaucja` double NOT NULL,
  `RodzajPaliwa` varchar(255) NOT NULL,
  `CenaRynkowa` double NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Zrzut danych tabeli `danemodelipojazdow`
--

INSERT INTO `danemodelipojazdow` (`ID`, `Marka`, `Model`, `Typ`, `Kategoria`, `Zdjecie`, `MiejscaSiedzace`, `MaxMasaCalkowita`, `MasaWlasna`, `PojemnoscSilnika`, `Moc`, `CenaWypozyczenia`, `Kaucja`, `RodzajPaliwa`, `CenaRynkowa`) VALUES
(1, 'Ford', 'Fiesta', '1.3 v.6', 'M', NULL, 5, 1600, 2500, 1300, 55, 300, 1500, 'Benzyna', 10000),
(2, 'Suzuki', 'Alto', '1.0', 'A', '', 5, 810, 710, 1000, 68, 59, 500, 'Benzyna', 28000),
(3, 'Fiat', 'Panda', '1.2', 'A', '', 5, 1135, 840, 1200, 69, 69, 500, 'Benzyna', 39000),
(4, 'Kia', 'Picanto', '1.0', 'A', '', 5, 1045, 929, 1000, 62, 69, 500, 'Benzyna', 18000),
(5, 'Renault', 'Clio', '1.2', 'B', '', 5, 1015, 900, 1200, 75, 79, 800, 'Benzyna', 41000),
(6, 'Citroen', 'C3', '1.4', 'B', '', 5, 1400, 1105, 1400, 75, 79, 800, 'Benzyna', 58000),
(7, 'Renault', 'Thalia', '1.2', 'B', '', 5, 1090, 910, 1200, 75, 0, 0, '', 44000),
(8, 'Renault', 'Thalia', '1.2', 'B', '', 5, 1090, 910, 1200, 75, 79, 800, 'Benzyna', 44000);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczen`
--

CREATE TABLE IF NOT EXISTS `danewypozyczen` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PojazdyID` int(11) NOT NULL,
  `OddzialyID2` int(11) NOT NULL,
  `OddzialyID` int(11) NOT NULL,
  `DataGodzinaOd` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `DataGodzinaDo` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `DataWpatyZaliczki` date NOT NULL,
  `DataWplatyKaucji` date NOT NULL,
  `Platnosc` double NOT NULL,
  `Kaucja` double NOT NULL,
  `WplaconaZaliczka` double NOT NULL,
  `WplaconaKaucja` double NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKDaneWypozy704323` (`OddzialyID`),
  KEY `FKDaneWypozy139096` (`OddzialyID2`),
  KEY `FKDaneWypozy289303` (`PojazdyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Zrzut danych tabeli `danewypozyczen`
--

INSERT INTO `danewypozyczen` (`ID`, `PojazdyID`, `OddzialyID2`, `OddzialyID`, `DataGodzinaOd`, `DataGodzinaDo`, `DataWpatyZaliczki`, `DataWplatyKaucji`, `Platnosc`, `Kaucja`, `WplaconaZaliczka`, `WplaconaKaucja`) VALUES
(1, 1, 1, 1, '2014-01-30 10:00:00', '2014-01-31 10:00:00', '2014-01-15', '2014-01-15', 300, 1500, 100, 1500),
(2, 2, 1, 1, '2014-01-25 09:00:00', '2014-01-26 12:00:00', '2014-01-18', '2014-01-22', 300, 1500, 300, 0),
(3, 3, 1, 1, '2014-01-31 08:00:00', '2014-02-01 10:00:00', '2014-01-17', '2014-01-17', 400, 1500, 400, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczen_akcesories`
--

CREATE TABLE IF NOT EXISTS `danewypozyczen_akcesories` (
  `DaneWypozyczenID` int(11) NOT NULL,
  `AkcesoriesID` int(11) NOT NULL,
  `Ilosc` int(4) NOT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`),
  KEY `FKDaneWypozy751695` (`DaneWypozyczenID`),
  KEY `FKDaneWypozy400871` (`AkcesoriesID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Zrzut danych tabeli `danewypozyczen_akcesories`
--

INSERT INTO `danewypozyczen_akcesories` (`DaneWypozyczenID`, `AkcesoriesID`, `Ilosc`, `ID`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 2);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `firmy`
--

CREATE TABLE IF NOT EXISTS `firmy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdresyID` int(11) NOT NULL,
  `NazwaFirmy` varchar(255) NOT NULL,
  `NIP` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKFirmy788084` (`AdresyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `firmy`
--

INSERT INTO `firmy` (`ID`, `AdresyID`, `NazwaFirmy`, `NIP`) VALUES
(1, 5, 'TransBud', '7251801126');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kierownicy`
--

CREATE TABLE IF NOT EXISTS `kierownicy` (
  `OsobyID` int(11) NOT NULL,
  `OddzialyID` int(11) DEFAULT NULL,
  `SzefowieOsobyID2` int(11) DEFAULT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKKierownicy519873` (`OsobyID`),
  KEY `Mianuje2` (`SzefowieOsobyID2`),
  KEY `FKKierownicy199641` (`OddzialyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `kierownicy`
--

INSERT INTO `kierownicy` (`OsobyID`, `OddzialyID`, `SzefowieOsobyID2`) VALUES
(4, 1, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `klienci`
--

CREATE TABLE IF NOT EXISTS `klienci` (
  `NumerPrawaJazdy` varchar(255) NOT NULL,
  `KrajWydaniaPrawaJazdy` varchar(255) NOT NULL,
  `Znizka` double DEFAULT '0',
  `OsobyID` int(11) NOT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKKlienci81113` (`OsobyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `klienci`
--

INSERT INTO `klienci` (`NumerPrawaJazdy`, `KrajWydaniaPrawaJazdy`, `Znizka`, `OsobyID`) VALUES
('M0092979', 'Polska', 0, 5),
('AQR1235', 'Polska', 0, 6),
('YUI2346', 'Polska', 0, 8),
('UIY8765', 'Polska', 0, 9);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `klienci_firmy`
--

CREATE TABLE IF NOT EXISTS `klienci_firmy` (
  `KlienciOsobyID` int(11) NOT NULL,
  `FirmyID` int(11) NOT NULL,
  PRIMARY KEY (`KlienciOsobyID`,`FirmyID`),
  KEY `FKKlienci_Fi699215` (`KlienciOsobyID`),
  KEY `FKKlienci_Fi961388` (`FirmyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `klienci_firmy`
--

INSERT INTO `klienci_firmy` (`KlienciOsobyID`, `FirmyID`) VALUES
(5, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `oddzialy`
--

CREATE TABLE IF NOT EXISTS `oddzialy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdresyID` int(11) NOT NULL,
  `Telefon` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKOddzialy142095` (`AdresyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `oddzialy`
--

INSERT INTO `oddzialy` (`ID`, `AdresyID`, `Telefon`, `Email`) VALUES
(1, 1, '697123888', 'odziaWro@gmail.com');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `osoby`
--

CREATE TABLE IF NOT EXISTS `osoby` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdresyID` int(11) NOT NULL,
  `Imie` varchar(255) NOT NULL,
  `Nazwisko` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `DataUrodzenia` date NOT NULL,
  `Plec` varchar(255) NOT NULL,
  `Telefon` int(15) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKOsoby394468` (`AdresyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Zrzut danych tabeli `osoby`
--

INSERT INTO `osoby` (`ID`, `AdresyID`, `Imie`, `Nazwisko`, `Email`, `DataUrodzenia`, `Plec`, `Telefon`) VALUES
(1, 1, 'Jan', 'Chranowski', 'jchrzanow@o2.pl', '1990-01-01', 'M', 698456785),
(3, 1, 'Filip', 'Manoga', 'fm@gmail.com', '1950-01-10', 'M', 786456785),
(4, 1, 'Ewelina', 'Mikołajek', 'ewlein@onet.pl', '1989-01-02', 'K', 657856912),
(5, 4, 'Judyta', 'Kowalska', 'judytaK@o2.pl', '1975-01-08', 'K', 656245785),
(6, 4, 'Wikotor', 'Janik', 'wjanik@o2.pl', '1987-12-10', 'M', 623457859),
(8, 3, 'Oskar', 'Zwoliński', 'zwolin@wp.pl', '1980-04-22', 'M', 694254789),
(9, 2, 'Justyna', 'Kubica', 'jKubica@gmail.com', '1978-01-11', 'K', 697452586);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pojazdy`
--

CREATE TABLE IF NOT EXISTS `pojazdy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `OddzialyID` int(11) DEFAULT NULL,
  `DaneModeliPojazdowID` int(11) NOT NULL,
  `NrRejstracyjny` varchar(255) NOT NULL,
  `DataWymianyOleju` date NOT NULL,
  `DataPrzegladu` date NOT NULL,
  `DataProdukcji` date NOT NULL,
  `ZdatnyDoWypozyczenia` tinyint(1) NOT NULL,
  `CenaZakupu` double NOT NULL,
  `CzyWypozyczony` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKPojazdy5018` (`DaneModeliPojazdowID`),
  KEY `znajduje się` (`OddzialyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Zrzut danych tabeli `pojazdy`
--

INSERT INTO `pojazdy` (`ID`, `OddzialyID`, `DaneModeliPojazdowID`, `NrRejstracyjny`, `DataWymianyOleju`, `DataPrzegladu`, `DataProdukcji`, `ZdatnyDoWypozyczenia`, `CenaZakupu`, `CzyWypozyczony`) VALUES
(1, 1, 1, 'DWR1234', '2014-02-21', '2014-02-13', '1997-01-07', 1, 8000, 1),
(2, 1, 2, 'DWR1644', '2014-01-05', '2014-01-08', '2010-03-17', 1, 12000, 1),
(3, 1, 2, 'DWR4571', '2014-01-01', '2013-11-12', '2011-09-13', 1, 12500, 1),
(4, 1, 2, 'DWR2254', '2013-11-13', '2013-11-29', '2011-08-16', 1, 11000, 1),
(5, 1, 3, 'DWR1547', '2013-11-12', '2013-08-20', '2008-08-06', 1, 10000, 1),
(6, 1, 3, 'DWR2598', '2013-12-11', '2013-11-12', '2008-09-12', 1, 9000, 0),
(7, 1, 3, 'DWR7436', '2013-11-05', '2013-11-12', '2008-08-06', 1, 11000, 0),
(8, 1, 3, 'DWR8513', '2013-11-12', '2013-11-11', '2011-08-16', 1, 13000, 0),
(9, 1, 3, 'DWR7531', '2014-01-05', '2013-11-12', '2003-06-05', 1, 12000, 0),
(10, 1, 4, 'DWR7412', '2014-01-07', '2014-01-07', '2005-12-05', 1, 13000, 0),
(11, 1, 4, 'DWR6453', '2013-10-22', '2014-01-06', '2003-09-18', 1, 12000, 0),
(12, 1, 4, 'DWR8573', '2013-12-16', '2013-10-20', '2005-12-05', 0, 10000, 0),
(13, 1, 5, 'DWR8641', '2014-01-05', '2014-01-01', '2003-09-18', 1, 30000, 0),
(14, 1, 6, 'DWR5437', '2014-01-06', '2014-01-06', '2011-08-16', 1, 36000, 0),
(15, 1, 7, 'DWR5567', '2014-01-13', '2014-01-13', '2003-06-05', 1, 31000, 0),
(16, 1, 8, 'DWR5286', '2013-10-21', '2013-11-12', '2007-04-16', 1, 40000, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `polisy`
--

CREATE TABLE IF NOT EXISTS `polisy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NumerPolisy` varchar(255) NOT NULL,
  `DataUbezpieczenia` date NOT NULL,
  `PojazdyID` int(11) NOT NULL,
  `UbezpieczycieleID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Polisa` (`PojazdyID`),
  KEY `Polisa2` (`UbezpieczycieleID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `polisy`
--

INSERT INTO `polisy` (`ID`, `NumerPolisy`, `DataUbezpieczenia`, `PojazdyID`, `UbezpieczycieleID`) VALUES
(1, 'ART21234', '2014-01-02', 1, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pracownicy`
--

CREATE TABLE IF NOT EXISTS `pracownicy` (
  `NumerKonta` varchar(255) NOT NULL,
  `DataZatrudnienia` date NOT NULL,
  `Login` varchar(255) NOT NULL,
  `Haslo` varchar(255) NOT NULL,
  `OsobyID` int(11) NOT NULL,
  `SzefowieOsobyID` int(11) NOT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKPracownicy732664` (`OsobyID`),
  KEY `FKPracownicy320669` (`SzefowieOsobyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `pracownicy`
--

INSERT INTO `pracownicy` (`NumerKonta`, `DataZatrudnienia`, `Login`, `Haslo`, `OsobyID`, `SzefowieOsobyID`) VALUES
('lkjgslkfdj', '2014-01-08', 'pracLog1', 'pracHas1', 3, 1),
('jdsljl', '2014-01-09', 'pracLog2', 'pracHas2', 4, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rezerwacje`
--

CREATE TABLE IF NOT EXISTS `rezerwacje` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DaneWypozyczenID` int(11) NOT NULL,
  `KlienciOsobyID` int(11) NOT NULL,
  `PracownicyOsobyID` int(11) DEFAULT NULL,
  `DataRezerwacji` date NOT NULL,
  `Uwagi` varchar(255) DEFAULT NULL,
  `SposobWplatyZaliczki` varchar(255) NOT NULL,
  `SposobWplatyKaucji` varchar(255) NOT NULL,
  `CzyPotwierdzona` tinyint(1) DEFAULT '0',
  `CzyAnulowana` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `Potwierdza` (`PracownicyOsobyID`),
  KEY `FKRezerwacje161361` (`KlienciOsobyID`),
  KEY `FKRezerwacje817441` (`DaneWypozyczenID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Zrzut danych tabeli `rezerwacje`
--

INSERT INTO `rezerwacje` (`ID`, `DaneWypozyczenID`, `KlienciOsobyID`, `PracownicyOsobyID`, `DataRezerwacji`, `Uwagi`, `SposobWplatyZaliczki`, `SposobWplatyKaucji`, `CzyPotwierdzona`, `CzyAnulowana`) VALUES
(1, 1, 5, 3, '2014-01-14', 'brak uwag', 'Przelew', 'Przelew', 0, 0),
(2, 2, 6, NULL, '2014-01-12', NULL, 'Przelew', 'Gotówka', 0, 0),
(3, 3, 8, 4, '2014-01-02', NULL, 'Przelew', 'Gotówka', 1, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `szefowie`
--

CREATE TABLE IF NOT EXISTS `szefowie` (
  `NumerKonta` varchar(255) NOT NULL,
  `Login` varchar(255) NOT NULL,
  `Haslo` varchar(255) DEFAULT NULL,
  `OsobyID` int(11) NOT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKSzefowie419793` (`OsobyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `szefowie`
--

INSERT INTO `szefowie` (`NumerKonta`, `Login`, `Haslo`, `OsobyID`) VALUES
('89 1560 0013 2026 0001 2120 0003', 'szefLog', 'szefHas', 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `ubezpieczyciele`
--

CREATE TABLE IF NOT EXISTS `ubezpieczyciele` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdresyID` int(11) NOT NULL,
  `NazwaUbezpieczyciela` varchar(255) NOT NULL,
  `Telefon` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUbezpieczy107951` (`AdresyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `ubezpieczyciele`
--

INSERT INTO `ubezpieczyciele` (`ID`, `AdresyID`, `NazwaUbezpieczyciela`, `Telefon`, `Email`) VALUES
(1, 2, 'AXA', '789456578', 'axa@gmail.com');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `umowy`
--

CREATE TABLE IF NOT EXISTS `umowy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DataUmowy` date NOT NULL,
  `Tresc` varchar(255) NOT NULL,
  `WypozyczeniaID` int(11) NOT NULL,
  `KlienciOsobyID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUmowy35800` (`WypozyczeniaID`),
  KEY `FKUmowy543565` (`KlienciOsobyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `umowy`
--

INSERT INTO `umowy` (`ID`, `DataUmowy`, `Tresc`, `WypozyczeniaID`, `KlienciOsobyID`) VALUES
(1, '2014-01-14', 'XXX', 1, 5);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wypozyczenia`
--

CREATE TABLE IF NOT EXISTS `wypozyczenia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PracownicyOsobyID` int(11) NOT NULL,
  `DaneWypozyczenID` int(11) NOT NULL,
  `DataZwrotu` timestamp NULL DEFAULT NULL,
  `WplaconaPlatnosc` double DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `FKWypozyczen118496` (`DaneWypozyczenID`),
  KEY `Potwierdza2` (`PracownicyOsobyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `wypozyczenia`
--

INSERT INTO `wypozyczenia` (`ID`, `PracownicyOsobyID`, `DaneWypozyczenID`, `DataZwrotu`, `WplaconaPlatnosc`) VALUES
(1, 3, 1, NULL, 0);

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `akcesories`
--
ALTER TABLE `akcesories`
  ADD CONSTRAINT `FKAkcesories975413` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`);

--
-- Ograniczenia dla tabeli `danewypozyczen`
--
ALTER TABLE `danewypozyczen`
  ADD CONSTRAINT `FKDaneWypozy139096` FOREIGN KEY (`OddzialyID2`) REFERENCES `oddzialy` (`ID`),
  ADD CONSTRAINT `FKDaneWypozy289303` FOREIGN KEY (`PojazdyID`) REFERENCES `pojazdy` (`ID`),
  ADD CONSTRAINT `FKDaneWypozy704323` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`);

--
-- Ograniczenia dla tabeli `danewypozyczen_akcesories`
--
ALTER TABLE `danewypozyczen_akcesories`
  ADD CONSTRAINT `FKDaneWypozy400871` FOREIGN KEY (`AkcesoriesID`) REFERENCES `akcesories` (`ID`),
  ADD CONSTRAINT `FKDaneWypozy751695` FOREIGN KEY (`DaneWypozyczenID`) REFERENCES `danewypozyczen` (`ID`);

--
-- Ograniczenia dla tabeli `firmy`
--
ALTER TABLE `firmy`
  ADD CONSTRAINT `FKFirmy788084` FOREIGN KEY (`AdresyID`) REFERENCES `adresy` (`ID`);

--
-- Ograniczenia dla tabeli `kierownicy`
--
ALTER TABLE `kierownicy`
  ADD CONSTRAINT `FKKierownicy199641` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`),
  ADD CONSTRAINT `FKKierownicy519873` FOREIGN KEY (`OsobyID`) REFERENCES `osoby` (`ID`),
  ADD CONSTRAINT `Mianuje` FOREIGN KEY (`SzefowieOsobyID2`) REFERENCES `szefowie` (`OsobyID`);

--
-- Ograniczenia dla tabeli `klienci`
--
ALTER TABLE `klienci`
  ADD CONSTRAINT `FKKlienci81113` FOREIGN KEY (`OsobyID`) REFERENCES `osoby` (`ID`);

--
-- Ograniczenia dla tabeli `klienci_firmy`
--
ALTER TABLE `klienci_firmy`
  ADD CONSTRAINT `FKKlienci_Fi699215` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`),
  ADD CONSTRAINT `FKKlienci_Fi961388` FOREIGN KEY (`FirmyID`) REFERENCES `firmy` (`ID`);

--
-- Ograniczenia dla tabeli `oddzialy`
--
ALTER TABLE `oddzialy`
  ADD CONSTRAINT `FKOddzialy142095` FOREIGN KEY (`AdresyID`) REFERENCES `adresy` (`ID`);

--
-- Ograniczenia dla tabeli `osoby`
--
ALTER TABLE `osoby`
  ADD CONSTRAINT `FKOsoby394468` FOREIGN KEY (`AdresyID`) REFERENCES `adresy` (`ID`);

--
-- Ograniczenia dla tabeli `pojazdy`
--
ALTER TABLE `pojazdy`
  ADD CONSTRAINT `FKPojazdy5018` FOREIGN KEY (`DaneModeliPojazdowID`) REFERENCES `danemodelipojazdow` (`ID`),
  ADD CONSTRAINT `znajduje się` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`);

--
-- Ograniczenia dla tabeli `polisy`
--
ALTER TABLE `polisy`
  ADD CONSTRAINT `Polisa` FOREIGN KEY (`PojazdyID`) REFERENCES `pojazdy` (`ID`),
  ADD CONSTRAINT `Polisa2` FOREIGN KEY (`UbezpieczycieleID`) REFERENCES `ubezpieczyciele` (`ID`);

--
-- Ograniczenia dla tabeli `pracownicy`
--
ALTER TABLE `pracownicy`
  ADD CONSTRAINT `FKPracownicy320669` FOREIGN KEY (`SzefowieOsobyID`) REFERENCES `szefowie` (`OsobyID`),
  ADD CONSTRAINT `FKPracownicy732664` FOREIGN KEY (`OsobyID`) REFERENCES `osoby` (`ID`);

--
-- Ograniczenia dla tabeli `rezerwacje`
--
ALTER TABLE `rezerwacje`
  ADD CONSTRAINT `FKRezerwacje161361` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`),
  ADD CONSTRAINT `FKRezerwacje817441` FOREIGN KEY (`DaneWypozyczenID`) REFERENCES `danewypozyczen` (`ID`),
  ADD CONSTRAINT `Potwierdza` FOREIGN KEY (`PracownicyOsobyID`) REFERENCES `pracownicy` (`OsobyID`);

--
-- Ograniczenia dla tabeli `szefowie`
--
ALTER TABLE `szefowie`
  ADD CONSTRAINT `FKSzefowie419793` FOREIGN KEY (`OsobyID`) REFERENCES `osoby` (`ID`);

--
-- Ograniczenia dla tabeli `ubezpieczyciele`
--
ALTER TABLE `ubezpieczyciele`
  ADD CONSTRAINT `FKUbezpieczy107951` FOREIGN KEY (`AdresyID`) REFERENCES `adresy` (`ID`);

--
-- Ograniczenia dla tabeli `umowy`
--
ALTER TABLE `umowy`
  ADD CONSTRAINT `FKUmowy35800` FOREIGN KEY (`WypozyczeniaID`) REFERENCES `wypozyczenia` (`ID`),
  ADD CONSTRAINT `FKUmowy543565` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`);

--
-- Ograniczenia dla tabeli `wypozyczenia`
--
ALTER TABLE `wypozyczenia`
  ADD CONSTRAINT `FKWypozyczen118496` FOREIGN KEY (`DaneWypozyczenID`) REFERENCES `danewypozyczen` (`ID`),
  ADD CONSTRAINT `Potwierdza2` FOREIGN KEY (`PracownicyOsobyID`) REFERENCES `pracownicy` (`OsobyID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
