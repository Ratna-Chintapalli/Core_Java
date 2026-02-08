package com.constructors;

// command line arguments code and here run the code by clicking the right 
// u will get an run configuration on that select arguments and pass any no of the arguments  
public class TestDemo {

	public static void main(String[] names) {
		for(String name: names) {
			System.out.println(name);
		}

	}
}

/*  📌 Constructor Rules in Java
===========================

1) Constructor name and class name must be the same.

2) Constructor cannot have a return type (not even void).
   - If you write a return type, it becomes a method, not a constructor.

3) If a class has no constructor, compiler adds a default no-arg constructor.
   - If you create any constructor, compiler won’t add the default one.
   - Write a no-arg constructor if you want to create objects without values.

4) Constructor overloading is possible.
   - Multiple constructors allowed with different parameter lists.

5) Access modifiers:
   - private   → Cannot create objects outside the class.
   - default   → Accessible within same package.
   - protected → Accessible within package + subclasses.
   - public    → Accessible everywhere.

6) Scope of compiler-generated default constructor:
   - If class is public → constructor is public.
   - If class is default → constructor is default.

7) this and super:
   - this → Refers to current object.
   - super → Refers to parent object.
   - this() → Calls another constructor in same class.
   - super() → Calls parent class constructor.
   - Both must be first statement in constructor.
   - Cannot use both in same constructor.

8) Recursive constructor calls are not allowed.
   - Example: this() in no-arg constructor causes compile error.

9) Constructor chaining in inheritance:
   - Child constructor calls parent constructor first.
   - If parent has no no-arg constructor, call parameterized constructor explicitly.

10) Constructors cannot be inherited, only called using super().
    - Abstract and final classes can have constructors.
    
    
*/