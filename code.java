import java.util.Scanner;

public class HealthData {
  private String name;
  private int age;
  private int weight;
  private int height;
  private String bloodType;
  
  public HealthData(String name, int age, int weight, int height, String bloodType) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.bloodType = bloodType;
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public int getWeight() {
    return weight;
  }
  
  public int getHeight() {
    return height;
  }
  
  public String getBloodType() {
    return bloodType;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    
    System.out.print("Enter your weight: ");
    int weight = input.nextInt();
    
    System.out.print("Enter your height: ");
    int height = input.nextInt();
    
    System.out.print("Enter your blood type: ");
    input.nextLine();
    String bloodType = input.nextLine();
    
    HealthData healthData = new HealthData(name, age, weight, height, bloodType);
    
    System.out.println("\nHealth Data:");
    System.out.println("Name: " + healthData.getName());
    System.out.println("Age: " + healthData.getAge());
    System.out.println("Weight: " + healthData.getWeight());
    System.out.println("Height: " + healthData.getHeight());
    System.out.println("Blood Type: " + healthData.getBloodType());
    
    input.close();
  }
}