package org.usfirst.frc.team578.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team578.robot.Robot;

public class BubbleCommand extends Command {
	private static boolean relayState=false;
	
	public BubbleCommand()
	{
		requires(Robot.bubbleSubsystem);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(relayState)
		{
			Robot.bubbleSubsystem.off();
			relayState=false;
		}
		else
		{
			Robot.bubbleSubsystem.on();
			relayState=true;
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
	

}
