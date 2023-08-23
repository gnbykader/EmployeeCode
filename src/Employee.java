
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax = 0;
	int bonus = 0;
	double raiseSalary = 0;

	
	public Employee(String name, double salary,int workHours, int hireyear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireyear;
	}
	
	public void tax() {
		if (salary > 1000) {
			tax = salary*0.03;
			System.out.println("Vergi: "+tax);	
		}
		else {
			System.out.println("Vergi Uygulanmadi");
		}
	}
	public void bonus() {
		int i;
		if (workHours > 40) {
			i = workHours - 40;
			bonus = i*30;			
			System.out.println("Bonus: "+bonus);
		}
		else {
			System.out.println("Bonus: "+bonus);
		}
	}
	public void raiseSalary() {
	
		if (2021-hireYear <= 9) {
			raiseSalary +=  (salary*0.05);
			this.salary = this.salary + raiseSalary;
		}
		else if (2021-hireYear >= 10 && 2021-hireYear <= 19 ) {
			raiseSalary +=  (salary*0.10);
			this.salary = this.salary + raiseSalary;
		}
		else {
			raiseSalary +=  (salary*0.15);
			this.salary = this.salary + raiseSalary;
		}
		System.out.println("Maas Artisi: "+raiseSalary);
	}
	public void printSalary() {
		System.out.println("Adi: "+this.name);
		System.out.println("Maasi: "+this.salary);
		System.out.println("Calisma Saati: "+this.workHours);
		System.out.println("Baslangic Yili: "+this.hireYear);
		tax();
		bonus();
		raiseSalary();
		System.out.println("Vergi ve Bonuslar Ile Birlikte Maas: "+(this.salary-tax+bonus));
		System.out.println("Toplam Maas: "+this.salary);
	}

}
