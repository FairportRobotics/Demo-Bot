
package org.usfirst.frc.team578.robot.subsystems;

import org.usfirst.frc.team578.robot.RobotMap;
import org.usfirst.frc.team578.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private Talon leftTalon;
	private Talon rightTalon;
	
	private Relay relayLeft;
    private Relay relayRight;
    
	public DriveSubsystem()
	{
		leftTalon = initializeTalon(RobotMap.LEFT_TALON_CHANNEL);
		rightTalon = initializeTalon(RobotMap.RIGHT_TALON_CHANNEL);
		relayLeft = new Relay(0);
		relayLeft.set(Value.kForward);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveCommand());
	}

	private Talon initializeTalon(int channel) {
		Talon talon = new Talon(channel);
		//talon.changeControlMode(ControlMode.Speed);
		//talon.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		//talon.setPID(1, 0.01, 0.85, 1.5, 0, 0, 0);
		return talon;
	}

	public void drive(double leftY, double rightY)
	{
		leftTalon.set(leftY);
		rightTalon.set(rightY);
	}
}

