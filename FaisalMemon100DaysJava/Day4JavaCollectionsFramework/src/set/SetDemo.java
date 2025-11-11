package set;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JavaScript");
        set.add("Python");
        set.add("Go lang");

        for (String s : set){
            System.out.println("Languages : " + s);
        }



        Set<String> roles = new HashSet<>();
        roles.add("USER");
        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("USER"); // // It-store unique values not duplicate
        for (String r : roles){
            System.out.println("Role : " + r);
        }

        Roles roles1 = new Roles("USER");
        Roles roles2 = new Roles("ADMIN");
        Roles roles3 = new Roles("MANAGER");
        Roles roles4 = new Roles("USER");
        Set<Roles> rolesSet = new HashSet<>();
        rolesSet.add(roles1);
        rolesSet.add(roles2);
        rolesSet.add(roles3);
        rolesSet.add(roles4);
        int i = 1;

        for (Object s : rolesSet){
            System.out.println((i++ )+(" : "+ s));
        }



    }
}
