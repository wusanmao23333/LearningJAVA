package iostram;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import serviceArithmetic.Task;

public class StudentSerialization {

	private List<Student> student;
	
	private File destFile;
	
	public StudentSerialization() throws IOException {
		
		File file = new File("src/iostram/list.txt");
		
		this.destFile = new File("src/iostram/student.bin");
		this.student = new ArrayList<Student>();
		
        Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {
                long StudentID = scanner.nextLong();
                String name = scanner.next();
                char sex = scanner.next().charAt(0);
                this.student.add(new Student(StudentID, name, sex));
            }
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("FileStreamsTest: " + e);
		}
		sortByStudentID(this.student);
	}
	
	//按学号排序
	private void sortByStudentID(List<Student> student) {
		Collections.sort(student, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				if (arg0.getStudentID() > arg1.getStudentID()) {
					return 1;
				} else if (arg0.getStudentID() == arg1.getStudentID()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
	}

	//使用ObjectOutputStream将已经排序的学生信息写出到文件“student.bin”中。
	public void write () { 
		try {
			FileOutputStream foutS = new FileOutputStream(destFile);
			ObjectOutputStream OoutS = new ObjectOutputStream(foutS);
			Iterator<Student> it = this.student.iterator();
			while (it.hasNext()) {
				OoutS.writeObject(it.next());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("FileStreamsTest: " + e);
		}
	}
	
	//使用ObjectInputStream将“student.bin”中的对象信息读入程序，显示在控制台中。
	public void read () throws EOFException {
		List<Student> out = new ArrayList<Student>();
		try {
			FileInputStream finS = new FileInputStream(destFile);
			ObjectInputStream OinS = new ObjectInputStream(finS);
			Student st = null;
			System.out.println("学号" + "\t\t姓名" + "\t性别");
			while (true) { //直接用while(true),让读取操作一直进行  
				st = (Student) OinS.readObject(); //循环下面的数据   
			    System.out.println(st.getStudentID() + "\t" + st.getName() + "\t" + st.getSex());   
			}  
//			Iterator<Student> it = out.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.next().toString());
//			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("FileStreamsTest: " + e);
		} 
	}
	
}
