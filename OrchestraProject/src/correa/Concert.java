package correa;

public class Concert {

	public static void main(String[] args) {
		Trombones tb = new Trombones();
		Trumpets tp = new Trumpets();
		Tubas tu = new Tubas();
		MusicConductor conductor = new MusicConductor();
		conductor.attach(tb);
		conductor.attach(tp);
		
		conductor.notifyUpdate(new StateChange("Appaassionato"));
		
		conductor.detach(tb);
		conductor.attach(tu);
		
		conductor.notifyUpdate(new StateChange("Crescendo"));

	}

}
