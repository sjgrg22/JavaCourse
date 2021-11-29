package Switch;

public class SwitchExample {

    public void testSwitch(){
        String marks = "A";
        switch (marks){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            default:
                System.out.println("This is default");

        }
    }

    }

