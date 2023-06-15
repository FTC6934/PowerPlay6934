import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous (name = "Motor")

public class Motor extends OpMode {

    public DcMotor FrontRight = null;
    public DcMotor FrontLeft = null;



    @Override
    public void init() {

        FrontRight = hardwareMap.get(DcMotor.class, "FR");
        FrontLeft = hardwareMap.get(DcMotor.class, "FL");

    }

    public void start() {
    }

    @Override
    public void loop() {

        FrontRight.setPower(1.0);
        //FrontLeft.setPower(1.0);
    }

}
