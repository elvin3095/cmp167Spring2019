/*
- name : String
- birthYear : int
- weight : double
- gender : char

+ Animal()            // Set name="", birthYear=1900, weight=0.0, gender='u'
+ Animal(String, int, double, char)

+ getName() : String
+ setName(String) : void
+ getBirthYear() : int
+ setBirthYear(int) : void
+ getWeight() : double
+ setWeight(double) : void    //if input value is negative, set weight to -1
+ getGender() : char           
+ setGender(char) : void    // if input value is not 'm' or 'f', set gender to 'u' (unknown)
+ calculateAge(int) : int    // use birthYear and the argument of currentYear to calculate age. 
	If currentYear <  birthYear, return -1.
+ isMale() : boolean        // return true if gender is 'm'
+ isFemale() : boolean    // return true if gender is 'f'
+ printDetails() : void        // prints Animal attributes in the following format: 
                                // "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n"
+ gainWeight() : void        //increase weight by 1.
+ gainWeight(double): void    // increase weight by the input amount. Weight cannot drop below zero.
+ loseWeight() : void        // decrease by 1.  Weight cannot drop below zero.
+ loseWeight(double) : void    // dncrease weight by the input amount. Weight cannot drop below zero.
 */

import java.lang.Object;
public class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Animal() {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
	}
	
	public Animal (String name, int birthYear, double weight, char gender) {
		this.name = name;
		this.birthYear = birthYear;
		if (weight < 0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
		
		if ((gender == 'm') || (gender == 'f')) {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight < 0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		if ((gender == 'm') || (gender == 'f')) {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}
	}
	
	public int calculateAge(int currYear) {
		if (currYear < birthYear) {
			return -1;
		}
		else {
			return currYear - birthYear;
		}
	}
	
	
	public boolean isMale() {
		if (gender == 'm') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFemale() {
		if (gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", 
				name, birthYear, weight, gender);
	}
	
	public void gainWeight() {
		++weight;
	}
	
	public void gainWeight(double weightGain) {
		weight += weightGain;
		if (weight < 0) {
			weight = 0;
		}
	}
	
	public void loseWeight() {
		--weight;
		if (weight < 0) {
			weight = 0;
		}
	}
	
	public void loseWeight(double weightLoss) {
		weight -= weightLoss;
		if (weight < 0) {
			weight = 0;
		}
	}
}
	


