package JAVA.OOP;

// Encapsulation can  be defined as the bundling of data with the methods that operate on that data.
// It restricts direct access of data Outside the class.
// It uses 'Private' Keyword to restrict access of data members.
// To over ride accesing data members, we use 'getters' and 'setters'.

class encap1{
    private String personal_data = "This is private data";

    String getMyPersonalData(){
        return personal_data;
    }
}

class encap2{
    public static void main(String[] args) {
        encap1 obj = new encap1();
        System.out.println(obj.getMyPersonalData());
    } 
}