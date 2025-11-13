package QuickRecallInterface;

@FunctionalInterface
interface ConcatenateName {

    String concatenateName(String firstName, String lastname);

    default void printFullName(String fullName){
        System.out.println("Full Name : " + fullName);
    }

}
