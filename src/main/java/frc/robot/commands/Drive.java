package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command {
    private final Drivetrain m_Drivetrain;
    private final DoubleSupplier m_xSpeed;
    private final DoubleSupplier m_zRotation;
    
    public Drive(Drivetrain drivetrain, DoubleSupplier xSpeed, DoubleSupplier zRotation) {
        m_Drivetrain = drivetrain;
        m_xSpeed = xSpeed;
        m_zRotation = zRotation;

        addRequirements(drivetrain);
    }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drivetrain.arcadeDrive(m_xSpeed.getAsDouble(), m_zRotation.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}