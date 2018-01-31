
public class Main {
	public 	static void main(String args[]) {
		Fields email = new EmailField();
		if(email.setValue("alejandrodelvillar@gmail.com")) {
			System.out.println("Validation in process...");
			System.out.println("Your E-Mail has been validated: " + email.getValue() + "\n");
		}//end if
		else {
			System.out.println("Validation in process...");
			System.out.println("E-Mail: " + email.getValue() + "could not be validated.\n");
		}//end else
		
		Fields name = new NameField();
		if(name.setValue("Chancho1")) {
			System.out.println("Validation in process...");
			System.out.println("Your Name has been validated: " + name.getValue() + "\n");
		}//end if
		else {
			System.out.println("Validation in process...");
			System.out.println("Name: " + name.getValue() + "could not be validated.\n");
		}//end else
		
		Fields phone = new PhoneField();
		if(phone.setValue("6643054756")) {
			System.out.println("Validation in process...");
			System.out.println("Your Phone has been validated: " + phone.getValue() + "\n");
		}//end if
		else {
			System.out.println("Validation in process...");
			System.out.println("Phone: " + phone.getValue() + "could not be validated.\n");
		}//end else
		
		Fields id = new IDField();
		if(id.setValue("20957")) {
			System.out.println("Validation in process...");
			System.out.println("Your ID has been validated: " + id.getValue() + "\n");
		}//end if
		else {
			System.out.println("Validation in process...");
			System.out.println("ID: " + id.getValue() + "could not be validated.\n");
		}//end else
		
		Fields city = new CityField();
		if(city.setValue("Tijuana")) {
			System.out.println("Validation in process...");
			System.out.println("Your City has been validated: " + city.getValue() + "/n");
		}//end if
		else {
			System.out.println("Validation in process...");
			System.out.println("City: " + city.getValue() + "could not be validated.\n");
		}//end else
		
		
	}//end main

}//end Main class
