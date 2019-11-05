package Day191105.dao_;

public class MyApp {

    public static void main(String[] args) {

        DAO<Person> pps =
                new DAOPersonHashMap();


        Person p1 = new Person(1, "Alex", 33);
        Person p2 = new Person(2, "Natale", 44);
        Person p3 = new Person(3, "Mike", 14);
        Person p4 = new Person(4, "John", 24);
        Person p5 = new Person(5, "Bob", 43);
        Person p6 = new Person(6, "Tom", 45);
        Person p7 = new Person(7, "Tony", 74);
        Person p8 = new Person(8, "Part", 11);

        pps.put(p1);
        pps.put(p2);
        pps.put(p3);
        pps.put(p4);
        pps.put(p5);
        pps.put(p6);
        pps.put(p7);
        pps.put(p8);

        System.out.printf("%s\n",pps.get(5));

        pps.delete(5);

        for (Person pr: pps.getAll())
            System.out.printf("%s\n",pr);
    }
}
