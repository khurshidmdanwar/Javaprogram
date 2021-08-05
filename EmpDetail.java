class EmpDetail
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee(); // Reference Data type
        emp1.name = "Habib";
        emp1.aadhar = "4525-4545-4345-3423";
        emp1.emailAddress = "habib@abc.com";
        Employee emp2 = new Employee();// Reference Data type
        emp2.name = "Sachin";
        emp2.aadhar = "4563-7384-9031";
        emp2.yearOfBirth = 1974;
        System.out.println("Name: " + emp1.name);
        System.out.println("Aadhar: " + emp1.aadhar);
        System.out.println("Email Address: " + emp1.emailAddress);
        System.out.println("Year Of Birth: " + emp1.yearOfBirth);
        System.out.println("Name: " + emp2.name);
        System.out.println("Aadhar: " + emp2.aadhar);
        System.out.println("Email Address: " + emp2.emailAddress);
        System.out.println("Year Of Birth: " + emp2.yearOfBirth);
    }
}
