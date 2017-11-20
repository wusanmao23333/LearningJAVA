package serviceArithmetic;
/**
 * 
 * author by zugen
 * data: 2017/11/1
 */
public class Task {

	private int taskID; //����ID
	private int arrivalTime; //����ʱ��
	private int serviceTime; //����ʱ��
	private int startingTime; //��ʼʱ��
	private int finishingTime; //���ʱ��=��ʼʱ��+����ʱ��
	private int turnAroundTime; //��תʱ��=���ʱ��-�ﵽʱ��
	private double weightTurnAround; //��Ȩ��תʱ��=��תʱ��/����ʱ��
    private boolean visited = false; 

	public Task(int taskID, int arrivalTime, int serviceTime) {
		// TODO Auto-generated constructor stub
		this.taskID = taskID;
		this.arrivalTime = arrivalTime;
		this.serviceTime = serviceTime;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public int getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}

	public int getFinishingTime() {
		return finishingTime;
	}

	public void setFinishingTime(int finishingTime) {
		this.finishingTime = finishingTime;
	}

	public int getTurnAroundTime() {
		return turnAroundTime;
	}

	public void setTurnAroundTime(int turnAroundTime) {
		this.turnAroundTime = turnAroundTime;
	}

	public double getWeightTurnAround() {
		return weightTurnAround;
	}

	public void setWeightTurnAround(double weightTurnAround) {
		this.weightTurnAround = weightTurnAround;
	}
	
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

	@Override
	public String toString() {
		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");
		return "Task [taskID=" + taskID + ", arrivalTime=" + arrivalTime + ", serviceTime=" + serviceTime
				+ ", startingTime=" + startingTime + ", finishingTime=" + finishingTime + ", turnAroundTime="
				+ turnAroundTime + ", weightTurnAround=" + df.format(weightTurnAround) + "]";
	}
	
}
