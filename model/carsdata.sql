-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Czas wygenerowania: 24 Sty 2014, 18:26
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Zrzut danych tabeli `adresy`
--

INSERT INTO `adresy` (`ID`, `Ulica`, `KodPocztowy`, `Miejscowosc`) VALUES
(1, 'Słoneczna 35', '55-812', 'Wrocław');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `akcesories`
--

CREATE TABLE IF NOT EXISTS `akcesories` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `OddzialyID` int(11) NOT NULL,
  `NazwaAkcesorium` varchar(255) NOT NULL,
  `CenaWypozyczenia` double NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAkcesories975413` (`OddzialyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczen`
--

CREATE TABLE IF NOT EXISTS `danewypozyczen` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PojazdyID` int(11) NOT NULL,
  `OddzialyID2` int(11) NOT NULL,
  `OddzialyID` int(11) NOT NULL,
  `DataGodzinaOd` date NOT NULL,
  `DataGodzinaDo` date NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczenia`
--

CREATE TABLE IF NOT EXISTS `danewypozyczenia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RezerwacjaID` int(11) DEFAULT NULL,
  `DataGodzinaOd` date DEFAULT NULL,
  `DataGodzinaDo` date DEFAULT NULL,
  `DataWpatyZaliczki` date DEFAULT NULL,
  `DataWplatyKaucji` date DEFAULT NULL,
  `Platnosc` double NOT NULL,
  `Kaucja` double NOT NULL,
  `WplaconaZaliczka` double NOT NULL,
  `WplaconaKaucja` double NOT NULL,
  `DaneWypozyczeniaID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczenia_akcesoria`
--

CREATE TABLE IF NOT EXISTS `danewypozyczenia_akcesoria` (
  `DaneWypozyczeniaID` int(11) NOT NULL,
  `AkcesoriaID` int(11) NOT NULL,
  PRIMARY KEY (`DaneWypozyczeniaID`,`AkcesoriaID`),
  KEY `FKDaneWypozy996837` (`DaneWypozyczeniaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `danewypozyczen_akcesories`
--

CREATE TABLE IF NOT EXISTS `danewypozyczen_akcesories` (
  `DaneWypozyczenID` int(11) NOT NULL,
  `AkcesoriesID` int(11) NOT NULL,
  PRIMARY KEY (`DaneWypozyczenID`,`AkcesoriesID`),
  KEY `FKDaneWypozy751695` (`DaneWypozyczenID`),
  KEY `FKDaneWypozy400871` (`AkcesoriesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kierownicy`
--

CREATE TABLE IF NOT EXISTS `kierownicy` (
  `OsobyID` int(11) NOT NULL,
  `OddzialyID` int(11) NOT NULL,
  `SzefowieOsobyID` int(11) NOT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKKierownicy519873` (`OsobyID`),
  KEY `Mianuje2` (`SzefowieOsobyID`),
  KEY `FKKierownicy199641` (`OddzialyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `klienci`
--

CREATE TABLE IF NOT EXISTS `klienci` (
  `NumerPrawaJazdy` varchar(255) NOT NULL,
  `KrajWydaniaPrawaJazdy` varchar(255) NOT NULL,
  `Znizka` double DEFAULT NULL,
  `OsobyID` int(11) NOT NULL,
  PRIMARY KEY (`OsobyID`),
  KEY `FKKlienci81113` (`OsobyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `klient_firma2`
--

CREATE TABLE IF NOT EXISTS `klient_firma2` (
  `FirmaID` int(11) NOT NULL AUTO_INCREMENT,
  `Index` int(11) DEFAULT NULL,
  PRIMARY KEY (`FirmaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `oddzialy`
--

CREATE TABLE IF NOT EXISTS `oddzialy` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdresyID` int(11) NOT NULL,
  `Telefon` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKOddzialy142095` (`AdresyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
  PRIMARY KEY (`ID`),
  KEY `FKOsoby394468` (`AdresyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rezerwacje`
--

CREATE TABLE IF NOT EXISTS `rezerwacje` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DaneWypozyczenID` int(11) DEFAULT NULL,
  `KlienciOsobyID` int(11) NOT NULL,
  `PracownicyOsobyID` int(11) DEFAULT NULL,
  `DataRezerwacji` date NOT NULL,
  `Uwagi` varchar(255) DEFAULT NULL,
  `SposobWplatyZaliczki` varchar(255) NOT NULL,
  `SposobWplatyKaucji` varchar(255) NOT NULL,
  `CzyPotwierdzona` tinyint(1) DEFAULT NULL,
  `CzyAnulowana` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Potwierdza` (`PracownicyOsobyID`),
  KEY `FKRezerwacje161361` (`KlienciOsobyID`),
  KEY `FKRezerwacje817441` (`DaneWypozyczenID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wypozyczenia`
--

CREATE TABLE IF NOT EXISTS `wypozyczenia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PracownicyOsobyID` int(11) NOT NULL,
  `DaneWypozyczenID` int(11) NOT NULL,
  `DataZwrotu` date NOT NULL,
  `WplaconaPlatnosc` double NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKWypozyczen118496` (`DaneWypozyczenID`),
  KEY `Potwierdza2` (`PracownicyOsobyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
  ADD CONSTRAINT `FKDaneWypozy289303` FOREIGN KEY (`PojazdyID`) REFERENCES `pojazdy` (`ID`),
  ADD CONSTRAINT `FKDaneWypozy139096` FOREIGN KEY (`OddzialyID2`) REFERENCES `oddzialy` (`ID`),
  ADD CONSTRAINT `FKDaneWypozy704323` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`);

--
-- Ograniczenia dla tabeli `danewypozyczenia_akcesoria`
--
ALTER TABLE `danewypozyczenia_akcesoria`
  ADD CONSTRAINT `FKDaneWypozy996837` FOREIGN KEY (`DaneWypozyczeniaID`) REFERENCES `danewypozyczenia` (`ID`);

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
  ADD CONSTRAINT `Mianuje2` FOREIGN KEY (`SzefowieOsobyID`) REFERENCES `szefowie` (`OsobyID`);

--
-- Ograniczenia dla tabeli `klienci`
--
ALTER TABLE `klienci`
  ADD CONSTRAINT `FKKlienci81113` FOREIGN KEY (`OsobyID`) REFERENCES `osoby` (`ID`);

--
-- Ograniczenia dla tabeli `klienci_firmy`
--
ALTER TABLE `klienci_firmy`
  ADD CONSTRAINT `FKKlienci_Fi961388` FOREIGN KEY (`FirmyID`) REFERENCES `firmy` (`ID`),
  ADD CONSTRAINT `FKKlienci_Fi699215` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`);

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
  ADD CONSTRAINT `znajduje się` FOREIGN KEY (`OddzialyID`) REFERENCES `oddzialy` (`ID`),
  ADD CONSTRAINT `FKPojazdy5018` FOREIGN KEY (`DaneModeliPojazdowID`) REFERENCES `danemodelipojazdow` (`ID`);

--
-- Ograniczenia dla tabeli `polisy`
--
ALTER TABLE `polisy`
  ADD CONSTRAINT `Polisa2` FOREIGN KEY (`UbezpieczycieleID`) REFERENCES `ubezpieczyciele` (`ID`),
  ADD CONSTRAINT `Polisa` FOREIGN KEY (`PojazdyID`) REFERENCES `pojazdy` (`ID`);

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
  ADD CONSTRAINT `FKRezerwacje817441` FOREIGN KEY (`DaneWypozyczenID`) REFERENCES `danewypozyczen` (`ID`),
  ADD CONSTRAINT `FKRezerwacje161361` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`),
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
  ADD CONSTRAINT `FKUmowy543565` FOREIGN KEY (`KlienciOsobyID`) REFERENCES `klienci` (`OsobyID`),
  ADD CONSTRAINT `FKUmowy35800` FOREIGN KEY (`WypozyczeniaID`) REFERENCES `wypozyczenia` (`ID`);

--
-- Ograniczenia dla tabeli `wypozyczenia`
--
ALTER TABLE `wypozyczenia`
  ADD CONSTRAINT `Potwierdza2` FOREIGN KEY (`PracownicyOsobyID`) REFERENCES `pracownicy` (`OsobyID`),
  ADD CONSTRAINT `FKWypozyczen118496` FOREIGN KEY (`DaneWypozyczenID`) REFERENCES `danewypozyczen` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
