package TRAINING;

public class ENCAPSULATION {

	public String getStu_name() {
		return Stu_name;
	}

	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getStudent_batch() {
		return student_batch;
	}

	public void setStudent_batch(int student_batch) {
		this.student_batch = student_batch;
	}

	private String Stu_name;
	private int student_id;
	private int student_batch;

	public static void main(String[] args) {

		ENCAPSULATION obj = new ENCAPSULATION();

		obj.setStu_name("riyaz");
		obj.setStudent_batch(2023);
		obj.setStudent_id(12334);

		System.out.println("student name:" + obj.get_name());

		System.out.println(obj.getStudent_batch());
		System.out.println(obj.getStudent_id());

	}

	private String get_name() {
		// TODO Auto-generated method stub
		return null;
	}

}
