/**
 * Created by Пользователь on 23.03.2017.
 */
public class pow_class {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("Invalid number of arguments.");
            System.exit(1);
        }
        try{
            int pow = Integer.parseInt(args[0]);
            for (int i = 1; i < Integer.parseInt(args[1]); i++) {
                pow *= Integer.parseInt(args[0]);
            }
            System.out.println(pow);
        }catch (NumberFormatException ex){
            System.out.println("Error. Perhaps incorrect arguments");
        }
    }
}
