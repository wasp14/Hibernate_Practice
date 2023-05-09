package Hibernate_Practice.Prac;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//import org.hibernate.annotations.Entity;

@Entity

public class Employee {
 @Id 
  @Column(name = "id")
	private int id;
  @Column(name = "first_name")
	private String first_name;
  @Column(name = "last_name")
	private String last_name;
  @Column(name = "dept_no")
	private int dept_no;
  @Temporal(TemporalType.DATE)
  private Date date;
//	public Employee(int id, String first_name, String last_name, int dept_no) {
//		super();
//		
//		this.id = id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.dept_no = dept_no;
//	}
  
  
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Employee(String first_name, String last_name, int dept_no, Date date) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.dept_no = dept_no;
	this.date = date;
}
	public Employee(int id, String first_name, String last_name, int dept_no, Date date) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dept_no = dept_no;
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dept_no=" + dept_no
				+ ", date=" + date + "]";
	}
	public Employee() {
		super();
	}

	
	
	
	
	
}
