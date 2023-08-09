
public abstract class Animal {
	
	protected String name;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public abstract String speak();

}


class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	@Override
	public String speak() {
		
		return super.name+":"+"meow meow";
	}
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	@Override
	public String speak() {
		
		return super.name+" : "+"Bhow bhow";
	}
}

class AbstractMain{
	public static void main(String[] args) {
		Animal animal;
		
		animal= new Cat("Tom");
		System.out.println(animal.speak());
		
		
		animal = new Dog("Pluto");
		
		System.out.println(animal.speak());
	}
}
