package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    public void init() {

    }

    @Override
    public void loop(){
        //runs 50x per second
        double speedForward = -gamepad1.right_stick_y / 2.0;
        double diffLeftRight = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTrigers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", speedForward);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("diff leftjoystick to right", diffLeftRight);

        telemetry.addData("b", gamepad1.b);
        telemetry.addData("a", gamepad1.a);

        telemetry.addData("Sum Triger", sumTrigers);
    }
}