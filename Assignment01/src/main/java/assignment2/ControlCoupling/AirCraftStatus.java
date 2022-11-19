package assignment2.ControlCoupling;

public class AirCraftStatus {

    public void air_craft_status(int air_speed)
    {
        if(air_speed<50)
        {
            System.out.println("Aircraft is on ground");
        } else {
            System.out.println("Aircraft is in-Air");
        }

    }
}
