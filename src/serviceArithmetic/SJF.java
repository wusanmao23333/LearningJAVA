package serviceArithmetic;
/**
 * 
 * author by zugen
 * data: 2017/11/1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SJF {

	private List<Task> task;
	private List<Task> processor;
	
	public SJF(String fileString) {
		task = new ArrayList<Task>();
		processor = new ArrayList<Task>();
        Scanner scanner = null;
        int Time = 0;  //��ʼʱ��
        try {
            scanner = new Scanner(new File(fileString));
            while (scanner.hasNext() || !task.isEmpty()) {
            	 if (scanner.hasNext()) {
            		 int processID = scanner.nextInt();
                     int arrivalTime = scanner.nextInt();
                     int serviceTime = scanner.nextInt();
                     task.add(new Task(processID, arrivalTime, serviceTime));
            	 }
                 if (!processor.isEmpty() && Time == processor.get(0).getFinishingTime()) {
     				processor.remove(0);
     			 }
     			 if (processor.isEmpty()) {
     				int index = Search();
     				processor.add(task.get(index));
     				SetTime(Time);
             		System.out.println("The Time is :" + Time + "s " + processor.get(0).toString());
             		task.remove(index);
     			 }
     			 Time++;
            }
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
        scanner.close();
        sortByserviceTime(task);
	}
	
	private int Search(){
		int index = 0;
		int shortTime = task.get(0).getServiceTime();
		for(int i=0;i<task.size();i++){
			if(task.get(i).getServiceTime()<shortTime){
				shortTime = task.get(i).getServiceTime();
				index = i;
			}
		}
		return index;
	}
	
	private void sortByserviceTime(List<Task> task) {
		Collections.sort(task,new Comparator<Task>() {
            public int compare(Task o1, Task o2) {
                if (o1.getServiceTime() > o2.getServiceTime()) {
                    return 1;
                } else if (o1.getServiceTime() == o2.getServiceTime()) {
                	return 0;
                } else {
                    return -1;
                }
             }
         });
	}
	
	private void SetTime(int Time) {
		processor.get(0).setStartingTime(Time);
		processor.get(0).setFinishingTime(Time + processor.get(0).getServiceTime());
		processor.get(0).setTurnAroundTime(processor.get(0).getFinishingTime() - processor.get(0).getArrivalTime());
		processor.get(0).setWeightTurnAround(processor.get(0).getTurnAroundTime() * 1.0 / processor.get(0).getServiceTime());
	}
	
}
