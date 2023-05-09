package Hibernate_Practice.Prac;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Type")
	private String type;
	@Column(name = "Placed_On")
	@Temporal(TemporalType.DATE)
	private Date orderplacedOn;
	@Column(name = "Recieved_On")
	@Temporal(TemporalType.DATE)
	private Date ordertoreceiveOn;
	//@Transient
	@Column(name = "Delivered_By")
	private String deliveryName;
	public Order( String type, Date orderplacedOn, Date ordertoreceiveOn, String deliveryName) {
		super();
		
		this.type = type;
		this.orderplacedOn = orderplacedOn;
		this.ordertoreceiveOn = ordertoreceiveOn;
		this.deliveryName = deliveryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getOrderplacedOn() {
		return orderplacedOn;
	}
	public void setOrderplacedOn(Date orderplacedOn) {
		this.orderplacedOn = orderplacedOn;
	}
	public Date getOrdertoreceiveOn() {
		return ordertoreceiveOn;
	}
	public void setOrdertoreceiveOn(Date ordertoreceiveOn) {
		this.ordertoreceiveOn = ordertoreceiveOn;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", type=" + type + ", orderplacedOn=" + orderplacedOn + ", ordertoreceiveOn="
				+ ordertoreceiveOn + ", deliveryName=" + deliveryName + "]";
	}
	public Order() {
		super();
	}
	
	
	
	
}
