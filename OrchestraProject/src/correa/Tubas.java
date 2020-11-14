package correa;

public class Tubas implements Observer{
	public void update(StateChange m) {
		System.out.println("Notifications to Tubas: " + m.getMessageContent());
	}

}
