
package org.usfirst.frc.team578.robot.subsystems;

import org.usfirst.frc.team578.robot.RobotMap;
import org.usfirst.frc.team578.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private CANTalon leftTalon;
	private CANTalon rightTalon;
	
	private Relay relay;

	public DriveSubsystem()
	{
		leftTalon = initializeTalon(RobotMap.LEFT_TALON_CHANNEL);
		rightTalon = initializeTalon(RobotMap.RIGHT_TALON_CHANNEL);
		relay = new Relay(0);
		relay.set(Value.kForward);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveCommand());
	}

	private CANTalon initializeTalon(int channel) {
		CANTalon talon = new CANTalon(channel);
		talon.changeControlMode(ControlMode.PercentVbus);
		//talon.changeControlMode(ControlMode.Speed);
		//talon.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		//talon.setPID(1, 0.01, 0.85, 1.5, 0, 0, 0);
		talon.enableControl();
		return talon;
	}

	public void drive(double leftY, double rightY)
	{
		leftTalon.set(leftY);
		rightTalon.set(rightY);
	}
}

