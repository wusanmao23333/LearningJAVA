package serviceArithmetic;
/**
 * 
 * author by zugen
 * data: 2017/11/1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FCFS_two {

	private List<Task> task;
	private List<Task> processor;
	private List<Task> processor2;
	
	public FCFS_two(String fileString) {
		task = new ArrayList<Task>();
		processor = new ArrayList<Task>();
		processor2 = new ArrayList<Task>();	
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
			if (!processor2.isEmpty() && Time == processor2.get(0).getFinishingTime()) {
				processor2.remove(0);
			}
			if (processor.isEmpty()) {
				processor.add(task.get(0));
				SetTime(Time,1);
        		System.out.println("First processor : The Time is :" + Time + "s " + processor.get(0).toString());
        		task.remove(0);
			}
			if (processor2.isEmpty()) {
				processor2.add(task.get(0));
				SetTime(Time,2);
        		System.out.println("Second processor : The Time is :" + Time + "s " + processor2.get(0).toString());
        		task.remove(0);
			}
			Time++;
		}
	}
	
	private void SetTime(int Time, int num) {
		if (num == 1) {
			processor.get(0).setStartingTime(Time);
			processor.get(0).setFinishingTime(Time + processor.get(0).getServiceTime());
			processor.get(0).setTurnAroundTime(processor.get(0).getFinishingTime() - processor.get(0).getArrivalTime());
			processor.get(0).setWeightTurnAround(processor.get(0).getTurnAroundTime() * 1.0 / processor.get(0).getServiceTime());
		} else {
			processor2.get(0).setStartingTime(Time);
			processor2.get(0).setFinishingTime(Time + processor2.get(0).getServiceTime());
			processor2.get(0).setTurnAroundTime(processor2.get(0).getFinishingTime() - processor2.get(0).getArrivalTime());
			processor2.get(0).setWeightTurnAround(processor2.get(0).getTurnAroundTime() * 1.0 / processor2.get(0).getServiceTime());
		}
		
	}

}
