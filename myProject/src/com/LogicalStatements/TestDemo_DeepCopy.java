package com.LogicalStatements;
/*Deep Copy creates a new object along with new copies of all nested objects.
*So the cloned object is completely independent of the original.
*
*Characteristics:
-Creates a new object
-Inner objects are also separately copied
-Changes in clone do NOT affect the original
-Slightly slower but safe
*
*/
class AddressDeep {
    String city;

    public AddressDeep(String city) {
        this.city = city;
    }
}

class Student_DeepCopy1 implements Cloneable {
    String sname;
    AddressDeep add;
		

    public Student_DeepCopy1(String sname, AddressDeep add) {
        this.sname = sname;
        this.add = add;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Step 1: Shallow copy (top-level fields)
        Student_DeepCopy1 temp = (Student_DeepCopy1) super.clone();
        
        // Step 2: DEEP COPY — manually clone reference fields
        temp.add = new AddressDeep(this.add.city);

        return temp;
    }
}

public class TestDemo_DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

    	AddressDeep add = new AddressDeep("Hyderabad");
        Student_DeepCopy1 s1 = new Student_DeepCopy1("Bhavani", add);

        // Perform deep clone
        Student_DeepCopy1 s2 = (Student_DeepCopy1) s1.clone();

        // Modify clone
        s2.add.city = "Tenali";

        System.out.println("------ Original Object ------");
        System.out.println("Name: " + s1.sname);
        System.out.println("City: " + s1.add.city);

        System.out.println("------ Cloned Object ------");
        System.out.println("Name: " + s2.sname);
        System.out.println("City: " + s2.add.city);
    }
}
