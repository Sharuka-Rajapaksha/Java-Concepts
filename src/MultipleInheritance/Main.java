package MultipleInheritance;

class A1 {

}

interface A {

}

interface B {

}

/*
 * One class can't extends two classes
 * one class can inherit two or more interfaces
 */

// Example 2: Class inherit a class AND class inherit two interfaces
class C extends A1 implements A, B {

}

// Explame 2: Class inherit two interfaces
class C1 implements A, B {

}

/// Example 3: Interface inherit two interfaces
// Can use extends when a interface inhherit two interfaces
interface D extends A, B {

}

public class Main {

}
