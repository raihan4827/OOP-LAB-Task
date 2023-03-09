public class Employee {
        int id;
        String name;
        Address address;
        public Employee(int id,String name,Address address){
            this.id = id;
            this.name = name;
            this.address = address;
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("City: "+address.city);
            System.out.println("State: "+address.state);
            System.out.println("Country: "+address.country);
            System.out.println("\n");
        }
        public static void main(String[] args){
            Address address1 = new Address("Barinagar","Jashore","Bangladesh");
            Address address2 = new Address("Gopalpur","Dhaka","Bangladesh");
            Employee e1 = new Employee(5658,"Raihan",address1);
            Employee e2 = new Employee(5688,"Moin",address2);

            e1.display();
            e2.display();
        }
    }
