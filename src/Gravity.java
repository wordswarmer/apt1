
public class Gravity {
	public double falling(double time, double velo){
        double grav = 9.8;
		return velo*time + 0.5*grav*time*time;
      }
}
