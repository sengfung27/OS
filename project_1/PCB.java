import java.io.Serializable;
public class PCB implements Serializable
{
    public static final long serialVersionUID = 42L;
    public String program_name;
    public int PID;
    public String state;
    public int priority;
    public int interruptable;
    public int est_run_time;
    public int est_remain_time;

    public PCB(String line) {
        if (line.indexOf(",") < 0)
        {
            program_name = line;
        }
        else 
        {
            String[] split = line.split(",");
            program_name = split[0];
            PID = Integer.parseInt(split[1]);
            state = split[2];
            priority = Integer.parseInt(split[3]);
            interruptable = Integer.parseInt(split[4]);
            est_run_time = Integer.parseInt(split[5]);
            est_remain_time = Integer.parseInt(split[6]);
        }

    }
}