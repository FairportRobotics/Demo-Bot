package org.usfirst.frc.team578.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TshirtCannonSubSystem extends Subsystem {

	private int LOCKOUTTIME = 30;
	private boolean leftCannon = false;
	private long lastFired;
	private int fireTime = 100;
	
	private Relay cannons; 
	
	public TshirtCannonSubSystem()
	{
		cannons = new Relay(1);
	}
	
	public boolean fire()
	{
		boolean ret = false;
		if((cannons.get()== Relay.Value.kForward) || (cannons.get() == Relay.Value.kReverse) )
		{
			System.out.println("I'm firing!");
			if((System.currentTimeMillis() - lastFired) >= fireTime)
			{
				System.out.println("I stopped firing!");
				cannons.set(Relay.Value.kOff);
				ret = true;
			}
		} else {
			
			if((System.currentTimeMillis() - lastFired) >= (fireTime + (LOCKOUTTIME * 1000)))
			{
				
				if(leftCannon)
				{
					System.out.println("I fired forward!");
					cannons.set(Relay.Value.kForward);
					//lastFired = System.currentTimeMillis();
					leftCannon = false;
				} else {
					System.out.println("I fired backward!");
					cannons.set(Relay.Value.kReverse);
					lastFired = System.currentTimeMillis();
					leftCannon = true;
					
				}
				
			} else 
			{
				System.out.println("I think I already fired!");
				ret = true;
			}
			
		}
		return ret;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
