package de.shop.artikelverwaltung.domain;

import java.net.URI;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement	
public class Artikel {

	/**
	 * @author <a href="mailto:oguzhan.atmaca@web.de">Oguzhan Atmaca</a>
	 */

	private Long id;
	private String Bezeichnung;
	private BigDecimal Preis;
	private URI artikelUri;
	
	public Artikel(Long id, String bezeichnung, BigDecimal preis) {
		super();
		this.id = id;
		this.Bezeichnung = bezeichnung;
		this.Preis = preis;
	}
	
	public Artikel(Long id2) {
		// TODO Auto-generated constructor stub
	}

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
		return Bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}
	public BigDecimal getPreis() {
		return Preis;
	}
	public void setPreis(BigDecimal preis) {
		Preis = preis;
	}


	@Override
	public String toString() {
		return "Artike [id=" + id + ", Bezeichnung=" + Bezeichnung + ", Preis=" + Preis
			   + ", artikelUri=" + artikelUri + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Bezeichnung == null) ? 0 : Bezeichnung.hashCode());
		result = prime * result + ((Preis == null) ? 0 : Preis.hashCode());
		result = prime * result
				+ ((artikelUri == null) ? 0 : artikelUri.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (Bezeichnung == null) {
			if (other.Bezeichnung != null)
				return false;
		} else if (!Bezeichnung.equals(other.Bezeichnung))
			return false;
		if (Preis == null) {
			if (other.Preis != null)
				return false;
		} else if (!Preis.equals(other.Preis))
			return false;
		if (artikelUri == null) {
			if (other.artikelUri != null)
				return false;
		} else if (!artikelUri.equals(other.artikelUri))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}