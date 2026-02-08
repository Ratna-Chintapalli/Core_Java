package com.LogicalStatements;
/*Shallow Copy creates a new object, but does not create copies of the referenced objects inside it.
 * Instead, it copies the references of inner objects.
 * So both original and cloned objects share the same nested objects.
 * 
 * 
 * Characteristics:
-Creates a new object
-Inner objects are shared (same memory reference)
-Changes in inner objects reflect in both copies
-Faster but unsafe for mutable fields
*
*
*Deep Copy creates a new object along with new copies of all nested objects.
*So the cloned object is completely independent of the original.
*
*Characteristics:
-Creates a new object
-Inner objects are also separately copied
-Changes in clone do NOT affect the original
-Slightly slower but safe
*
*
 */

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Student_ShallowCopy implements Cloneable {
    String sname;
    Address address;

    public Student_ShallowCopy(String sname, Address address) {
        this.sname = sname;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow copy: only top-level object is cloned
        return super.clone();
    }
}

public class TestDemo_ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address add = new Address("Hyderabad");
        Student_ShallowCopy s1 = new Student_ShallowCopy("Bhavani", add);

        System.out.println("Before Cloning:");
        System.out.println("s1 Name: " + s1.sname);
        System.out.println("s1 City: " + s1.address.city);

        // Shallow copy
        Student_ShallowCopy s2 = (Student_ShallowCopy) s1.clone();

        // Modify clone’s city
        s2.address.city = "Tenali";

        System.out.println("\nAfter Cloning (Shallow Copy Result):");
        System.out.println("s1 City: " + s1.address.city);  // Affected due to shallow copy
        System.out.println("s2 City: " + s2.address.city);
    }
}