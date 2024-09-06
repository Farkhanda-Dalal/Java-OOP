
public class Football extends Sports {
	
	String card;
	String position;
	int time;
	
	public Football(String name, int playerNo,int time, String type, String equipment, String points, String card,
			String position) {
		super(name, playerNo, type, equipment, points);
		this.card = card;
		this.position = position;
		this.time=time;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	

}
