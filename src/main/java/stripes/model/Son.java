package stripes.model;

import javax.persistence.*;
import java.util.List;

/**
 * (c) Swissquote 6/15/15
 *
 * @author kslyshkov
 */
@Entity
@Table(name = "son")
public class Son {

	@Id
	private int id;

	@ManyToMany
	@JoinColumn(name = "id")
	private List<Father> fathers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Father> getFathers() {
		return fathers;
	}

	public void setFathers(List<Father> fathers) {
		this.fathers = fathers;
	}
}
