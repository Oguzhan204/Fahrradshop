package de.shop.artikelverwaltung.domain;

import java.io.Serializable;
import java.net.URI;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author <a href="mailto:oguzhan.atmaca@web.de">Oguzhan Atmaca</a>
 */
public class Artikel implements Serializable {
	private static final long serialVersionUID = 1472129607838538329L;
	
	private static final int BEZEICHNUNG_LENGTH_MIN = 2;
	private static final int BEZEICHNUNG_LENGTH_MAX = 32;
	private static final String BEZEICHNUNG_PATTERN = "[A-Z\u00C4\u00D6\u00DC][a-z\u00E4\u00F6\u00FC\u00DF]+";
	private static final int PREIS_MAX = 16;
	private static final String PREIS_PATTERN = "\\d";
	
	
	
	@Size(max = PREIS_MAX, message = "{artikel.preis.max}" )
	@NotNull(message = "{artikel.preis.notNull}")
	@Pattern(regexp = PREIS_PATTERN, message = "{artikel.preis.pattern}")
	private double preis;


	@Size(min = BEZEICHNUNG_LENGTH_MIN, max = BEZEICHNUNG_LENGTH_MAX, message = "{artikel.bezeichnung.length}" )
	@NotNull(message = "{artikel.bezeichnung.notNull}")
	@Pattern(regexp = BEZEICHNUNG_PATTERN, message = "{artikel.bezeichnung.pattern}")
	private String bezeichnung;
	
	private Long id;
	
	
	private URI artikelUri;
	
	public URI getArtikelUri() {
		return artikelUri;
	}
	public void setArtikelUri(URI artikelUri) {
		this.artikelUri = artikelUri;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bezeichnung == null) ? 0 : bezeichnung.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikel other = (Artikel) obj;
		if (bezeichnung == null) {
			if (other.bezeichnung != null)
				return false;
		} else if (!bezeichnung.equals(other.bezeichnung))
			return false;
		if (Double.doubleToLongBits(preis) != Double
				.doubleToLongBits(other.preis))
			return false;
		return true;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Artikel [ID:" + id + ", Bezeichnung:" + bezeichnung + ", Preis: " + preis + "]";
	}
}
