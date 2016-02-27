import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	
	Robot r = new Robot();
	r.penDown();
	r.setSpeed(10);
	r.move(230);
	r.turn(90);	
	for (int i = 0; i < 180; i++) {
		r.move(1);
		r.turn(1);
	
	}
	r.turn(180);
	for(int i = 0; i < 180; i++)
	{r.move(1);
	 r.turn(1);
}	 r.hide();
}
}
