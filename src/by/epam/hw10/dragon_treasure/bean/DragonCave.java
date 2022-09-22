package by.epam.hw10.dragon_treasure.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable {

	private static final long serialVersionUID = -944634297940480267L;

	private List<Treasure> dragonTreasures;

	public DragonCave() {

	}

	public DragonCave(List<Treasure> dragonTreasures) {
		this.dragonTreasures = dragonTreasures;
	}

	public List<Treasure> getDragonTreasures() {
		return dragonTreasures;
	}

	public void setDragonTreasures(List<Treasure> dragonTreasures) {
		this.dragonTreasures = dragonTreasures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dragonTreasures);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DragonCave other = (DragonCave) obj;
		return Objects.equals(dragonTreasures, other.dragonTreasures);
	}

	@Override
	public String toString() {
		return "DragonCave [dragonTreasures=" + dragonTreasures + "]";
	}

}
