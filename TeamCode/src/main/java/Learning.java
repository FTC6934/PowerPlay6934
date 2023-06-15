import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;


@TeleOp (name = "Learning", group = "Tests")
public class Learning extends OpMode {

    Hardwaremap hm = new Hardwaremap( );

    @Override
    public void init() {

        telemetry.addLine("Press Play to start");
        hm.Init_robot(hardwareMap);

    }

    @Override
    public void loop() {

        if (gamepad1.a == true) {
            hm.FrontRight.setPower(1);
        } else {
            hm.FrontRight.setPower(0);
        }

        telemetry.addData("", gamepad1.a);

    }
}
