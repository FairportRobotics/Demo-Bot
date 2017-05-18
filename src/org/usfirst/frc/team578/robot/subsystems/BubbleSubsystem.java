package org.usfirst.frc.team578.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;

import org.usfirst.frc.team578.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.*;

public class BubbleSubsystem extends Subsystem{

	private CANTalon bubbler;
	
	public BubbleSubsystem()
	{
		bubbler = new CANTalon(RobotMap.BUBBLE_TALON);
		bubbler.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
		bubbler.enableControl();
	}
	
	public void on()
	{
		bubbler.set(1);
	}
	
	public void off()
	{
		bubbler.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
