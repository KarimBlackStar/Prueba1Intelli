public class Main {
    public static void main() {

        System.out.println("Hello and welcome!");
        System.out.println("println desde master");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }   //Fin bucle for

        if(true){   //nunca poner if(true)
            System.out.println("Hello desde develop");
        }
    }
}
