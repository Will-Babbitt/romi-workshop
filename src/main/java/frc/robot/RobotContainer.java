// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.Drive;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {
  private final Drivetrain m_Drivetrain = new Drivetrain();
  private final Joystick m_Joystick = new Joystick(0);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    m_Drivetrain.setDefaultCommand(getArcadeDriveCommand());
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  public Command getArcadeDriveCommand() {
    return new Drive(m_Drivetrain, () -> m_Joystick.getRawAxis(1), () -> m_Joystick.getRawAxis(0)); // axis numbers depend on joystick
  }
}
