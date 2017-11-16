package serviceArithmetic;
/**
 * FCFS一个队列算法
 * author by zugen
 * data: 2017/11/1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class FCFS {

	private List<Task> task;
	private List<Task> processor;
	
	public FCFS(String fileString) {
		task = new ArrayList<Task>();
		processor = new ArrayList<Task>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileString));
            while (scanner.hasNext()) {
                 int processID = scanner.nextInt();
                 int arrivalTime = scanner.nextInt();
                 int serviceTime = scanner.nextInt();
                 task.add(new Task(processID, arrivalTime, serviceTime));
            }
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
        scanner.close();
        runFCFS();
	}
	
	private void runFCFS() {
		int Time = 0;
		while (!task.isEmpty()) {
			if (!processor.isEmpty() && Time == processor.get(0).getFinishingTime()) {
				processor.remove(0);
			}
			if (processor.isEmpty()) {
				processor.add(task.get(0));
				SetTime(Time);
        		System.out.println("The Time is :" + Time + "s " + processor.get(0).toString());
        		task.remove(0);
			}
			Time++;
		}
	}
	
	private void SetTime(int Time) {
		processor.get(0).setStartingTime(Time);
		processor.get(0).setFinishingTime(Time + processor.get(0).getServiceTime());
		processor.get(0).setTurnAroundTime(processor.get(0).getFinishingTime() - processor.get(0).getArrivalTime());
		processor.get(0).setWeightTurnAround(processor.get(0).getTurnAroundTime() * 1.0 / processor.get(0).getServiceTime());
	}

}
