// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class SillyAutoCMD extends SequentialCommandGroup {
  /** Creates a new SillyAutoCMD. */
  public SillyAutoCMD() {

    DriveSubsystem drive = RobotContainer.driveSubsystem;

    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new RunCommand(()->drive.setMotors(-.5,.5, .5), drive).withTimeout(5),
      RobotContainer.shoot(),
      new RunCommand(()->drive.setMotors(-.5,.5, .5), drive).withTimeout(5)
    );
  }
}
