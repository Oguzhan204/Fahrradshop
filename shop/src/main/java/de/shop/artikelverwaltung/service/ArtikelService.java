package de.shop.artikelverwaltung.service;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import de.shop.artikelverwaltung.domain.Artikel;
import de.shop.util.interceptor.Log;
import de.shop.util.Mock;

import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:oguzhan.atmaca@web.de">Oguzhan Atmaca</a>
 */
@Dependent
@Log
public class ArtikelService implements Serializable {
	private static final long serialVersionUID = -5105686816948437276L;

	
	@NotNull(message = "{artikel.notFound.id}")
	public Artikel findArtikelById(Long id) {
		// TODO id pruefen
		// TODO Datenbanzugriffsschicht statt Mock
		return Mock.findArtikelById(id);
	}
	
	@NotNull(message = "{artikel.notFound.id}")
	public Artikel createArtikel(Artikel artikel) {
	
		if (artikel == null) {
			return artikel;
		}
		
		artikel = Mock.createArtikel(artikel);
		return artikel;
		

		
		
	}
	
	
}
