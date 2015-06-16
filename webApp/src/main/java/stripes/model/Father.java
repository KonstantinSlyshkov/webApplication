package stripes.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * (c) Swissquote 6/15/15
 *
 * @author kslyshkov
 */
@Entity
public class Father {

	@Id
	private int fatherID;

	@EmbeddedId
	private EmbeddedStaff embeddedStaff;

	@Embeddable
	private static class EmbeddedStaff implements Serializable {

		@MapsId
		@ManyToMany
		List<Daughter> daughters;

		public List<Daughter> getDaughters() {
			return daughters;
		}

		public void setDaughters(List<Daughter> daughters) {
			this.daughters = daughters;
		}
	}

	@ManyToMany(mappedBy = "father")
	private List<Son> sons;

	@ManyToMany(mappedBy = "father")
	private List<Daughter> daughters;

	public int getFatherID() {
		return fatherID;
	}

	public void setFatherID(int fatherID) {
		this.fatherID = fatherID;
	}

	public List<Son> getSons() {
		return sons;
	}

	public void setSons(List<Son> sons) {
		this.sons = sons;
	}

	public List<Daughter> getDaughters() {
		return daughters;
	}

	public void setDaughters(List<Daughter> daughters) {
		this.daughters = daughters;
	}
}
