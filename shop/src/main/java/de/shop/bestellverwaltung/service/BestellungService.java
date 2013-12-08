package de.shop.bestellverwaltung.service;

import java.util.List;
import java.util.Locale;

import de.shop.bestellverwaltung.domain.Bestellung;
import de.shop.kundenverwaltung.domain.AbstractKunde;

/**
 * @author <a href="mailto:oguzhan.atmaca@web.de">Oguzhan Atmaca</a>
 */
public interface BestellungService {
	Bestellung findBestellungById(Long id);
	List<Bestellung> findBestellungenByKunde(AbstractKunde kunde);
	Bestellung createBestellung(Bestellung bestellung, AbstractKunde kunde, Locale locale);
}
