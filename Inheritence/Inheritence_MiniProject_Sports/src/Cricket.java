
public class Cricket extends Sports {
	
	String wicket;
	String ballingstyle;
	String shots;
	
	public Cricket(String name, int playerNo, String type, String equipment, String points, String wicket,
			String ballingstyle, String shots) {
		super(name, playerNo, type, equipment, points);
		this.wicket = wicket;
		this.ballingstyle = ballingstyle;
		this.shots = shots;
	}

	public String getWicket() {
		return wicket;
	}

	public void setWicket(String wicket) {
		this.wicket = wicket;
	}

	public String getBallingstyle() {
		return ballingstyle;
	}

	public void setBallingstyle(String ballingstyle) {
		this.ballingstyle = ballingstyle;
	}

	public String getShots() {
		return shots;
	}

	public void setShots(String shots) {
		this.shots = shots;
	}
}
