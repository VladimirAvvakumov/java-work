package forthelessonwork;

public class task6 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder(29);
        StringBuilder month = new StringBuilder(01);
        Boolean f = 123 < 234;
        System.out.println(f);
        String mass = "Fucking brain";
        String d = mass + "1";
        System.out.println(d);
        var g = 1236;
        mass.split(d);
        System.out.println(getType(g));
        System.out.println(Integer.SIZE);
        System.out.println(d);
        boolean k =  mass.charAt(3) == 'k';
        System.out.println(k);
        String v = mass + g;
        System.out.println(v);


    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

             

    
}
