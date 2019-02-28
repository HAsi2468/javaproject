package POJOS;
// Generated Feb 28, 2019 10:29:30 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderMaster generated by hbm2java
 */
public class OrderMaster  implements java.io.Serializable {


     private Integer orderId;
     private UserMaster userMaster;
     private String address;
     private Date orderDate;
     private Float totalPrice;
     private Set orderses = new HashSet(0);
     private Set payments = new HashSet(0);

    public OrderMaster() {
    }

    public OrderMaster(UserMaster userMaster, String address, Date orderDate, Float totalPrice, Set orderses, Set payments) {
       this.userMaster = userMaster;
       this.address = address;
       this.orderDate = orderDate;
       this.totalPrice = totalPrice;
       this.orderses = orderses;
       this.payments = payments;
    }
   
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public UserMaster getUserMaster() {
        return this.userMaster;
    }
    
    public void setUserMaster(UserMaster userMaster) {
        this.userMaster = userMaster;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }
    public Set getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set payments) {
        this.payments = payments;
    }




}

