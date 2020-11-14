package correa;

public class Trombones implements Observer{
	public void update(StateChange m) {
		System.out.println("Notifications to Trombones: " + m.getMessageContent());
	}

}
