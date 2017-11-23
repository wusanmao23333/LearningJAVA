# JAVA集合类综合小实验

### 模拟实现FCFS（先来先服务）算法
#### 实验要求  

FCFS算法按照任务到达的顺序进行服务，先来先服务  
每个Task对象可以描述为至少包含下列属性：  
taskID //任务ID  
arrivalTime //到达时间   
serviceTime //服务时间    
startingTime //开始时间    
finishingTime //完成时间=开始时间+服务时间    
turnAroundTime //周转时间=完成时间-达到时间    
weightTurnAround //带权周转时间=周转时间/服务时间  
其他的属性根据程序需要设置  


![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS0.png)   

#### 一个队列情况  

	`public class FCFS {

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
}`  

#### 两个队列情况  

	`public class FCFS_two {

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
}
`
#### 实验结果
一个队列情况   

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS1.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS2.png)  
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS3.png)  
   
  
两个队列情况  

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS4.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS5.png)  
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FCFS6.png)  

### 模拟实现SJF（短作业优先）

#### 实验要求  

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF0.png)  

#### 一个队列情况  

	`public class SJF {  
  
	private List<Task> task;
	private List<Task> processor;
	
	public SJF(String fileString) {
		task = new ArrayList<Task>();
		processor = new ArrayList<Task>();
        Scanner scanner = null;
        int Time = 0;  //起始时刻
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
	}`
#### 两个队列情况  

	`public class SJF_two {
	private List<Task> task;
	private List<Task> processor;
	private List<Task> processor2;
	
	public SJF_two(String fileString) {
		task = new ArrayList<Task>();
		processor = new ArrayList<Task>();
		processor2 = new ArrayList<Task>();	
        Scanner scanner = null;
        int Time = 0;  //起始时刻
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
     			if (!processor2.isEmpty() && Time == processor2.get(0).getFinishingTime()) {
     				processor2.remove(0);
     			}
    			if (processor.isEmpty() && !task.isEmpty()) {
      				int index = Search();
      				processor.add(task.get(index));
      				SetTime(Time,1);
              		System.out.println("First processor : Time is :" + Time + "s " + processor.get(0).toString());
              		task.remove(index);
      			}
    			if (processor2.isEmpty() && !task.isEmpty()) {
      				int index = Search();
      				processor2.add(task.get(index));
      				SetTime(Time,2);
              		System.out.println("Second processor : The Time is :" + Time + "s " + processor.get(0).toString());
              		task.remove(index);
      			}
     			Time++;
         	}  
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
        scanner.close();
        sortByserviceTime(task);
        
	}`
#### 实验结果
一个队列情况   

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF1.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF2.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF3.png)   
    

两个队列情况  

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF4.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF5.png)   
![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/SJF6.png)   
 






