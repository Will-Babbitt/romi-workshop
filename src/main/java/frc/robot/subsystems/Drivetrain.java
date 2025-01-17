package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    // The Romi has the left and right motors set to
    // PWM channels 0 and 1 respectively
    private final Spark m_leftMotor = new Spark(0);
    private final Spark m_rightMotor = new Spark(1);

    private final DifferentialDrive m_Drive = new DifferentialDrive(m_leftMotor, m_rightMotor);

    public Drivetrain() {
        m_rightMotor.setInverted(true);
    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        m_Drive.arcadeDrive(xSpeed, zRotation);
    }
}