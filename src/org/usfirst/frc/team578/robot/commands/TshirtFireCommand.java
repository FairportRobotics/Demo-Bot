package org.usfirst.frc.team578.robot.commands;

import org.usfirst.frc.team578.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TshirtFireCommand extends Command {

	private boolean finished = false;
	
	public TshirtFireCommand()
	{
		requires(Robot.tshirtCannonSubSystem);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		finished = Robot.tshirtCannonSubSystem.fire();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return finished;
		
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
