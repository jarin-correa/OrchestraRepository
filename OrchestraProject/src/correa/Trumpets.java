package correa;

public class Trumpets implements Observer{
	public void update(StateChange m) {
		System.out.println("Notifications to Trumpets: " + m.getMessageContent());
	}

}
