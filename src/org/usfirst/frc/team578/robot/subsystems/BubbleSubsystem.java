package org.usfirst.frc.team578.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import org.usfirst.frc.team578.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BubbleSubsystem extends Subsystem{

	private Relay bubbler;
	
	public BubbleSubsystem()
	{
		bubbler = new Relay(RobotMap.BUBBLE_RELAY);
	}
	
	public void on()
	{
		bubbler.set(Value.kOn);
	}
	
	public void off()
	{
		bubbler.set(Value.kOff);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
