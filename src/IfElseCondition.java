public class IfElseCondition {
    public static void main(String[] args) {
        boolean isAdmin = false;
        int defaultAge = 18;
        int currentAge = 20;

        if(isAdmin) {
            System.out.println("Logged In");
        } else {
            System.out.println("Not Logged In");
        }

        if(currentAge > defaultAge) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }

        String role = "User";
        String canAccess = role.equals("Admin") ? "You can access" : "You cannot access it";
        System.out.println(canAccess);
    }
}
