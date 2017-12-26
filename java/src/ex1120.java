public class ex1120 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true){
            String d = scanner.next();
            String n = scanner.next();
            if (d.equals("0") && n.equals("0"))
                System.exit(0);
            String impresso = n.replaceAll(d, "");
            int i = 0;
            try {
                for (i = 0; impresso.charAt(i) == '0' && i < impresso.length(); i++);
            }catch (Exception e) {

            }
            impresso = impresso.substring(i, impresso.length());
            System.out.println(impresso.equals("") ? "0" : impresso);
        }

    }
}
