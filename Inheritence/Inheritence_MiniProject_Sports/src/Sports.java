
public class Sports {
	
	String name;//name of sport
	int playerNo;//no of players per team
	String type;//indoor or outdoor
	String equipment;//equipment used to play the game
	String points;//how to score a point
	
	public Sports(String name, int playerNo, String type, String equipment, String points) {
		super();
		this.name = name;
		this.playerNo = playerNo;
		this.type = type;
		this.equipment = equipment;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}
