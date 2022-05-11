/*
Student name: Shogo Terashima
Student ID: B2001046
 */
package Q1;

public class Customer {
    
    private String name;
    private int mileage;
    private int year;
    
    private int priority;
    
    public Customer(String name, int mileage, int year) {
        this.name = name;
        this.mileage = mileage;
        this.year = year;
                
    }
    
    // getter methods
    public String getName(){
        return name;
    }
    public int getMileage(){
        return mileage;
    }
    public int getYear(){
        return year;
    }
    
    // setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    // override toString
    @Override
    public String toString() {
        return getName() + "( years: " + getYear() + ", mileage :" + getMileage() + ")";
    }
    

    public boolean equals(Customer o) {
 
        // If the object is compared with itself
        return (o.getName() == null ? this.getName() == null : o.getName().equals(this.getName()));
    }
    
    
    // set priority
    public void setPriority(int priority) {
        this.priority = priority;
    }
   // get priority 
    public int getPriority() {
        return this.priority;
    }
}
