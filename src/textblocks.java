public class textblocks {

    public static void drawImage(int imageToDraw){
        switch (imageToDraw){
            case 1:
                System.out.println("   ___|___");
                break;
            case 2:
                System.out.println("      |/");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                drawImage(1);
                break;

            case 3:
                System.out.println("      _________");
                drawImage(2);
                break;

            case 4:
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                drawImage(1);
                break;

            case 5:
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |       |");
                System.out.println("      |       |");
                System.out.println("      |");
                System.out.println("      |");
                drawImage(1);
                break;
            case 6:
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |      \\|/");
                System.out.println("      |       |");
                System.out.println("      |");
                System.out.println("      |");
                drawImage(1);
                break;
            case 7:
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |      \\|/");
                System.out.println("      |       |");
                System.out.println("      |      / \\");
                System.out.println("      |");
                drawImage(1);

        }


    }



    public static void main(String[] args) {
        drawImage(1);
        System.out.println();
        drawImage(2);
        System.out.println();
        drawImage(3);
        System.out.println();
        drawImage(4);
        System.out.println();
        drawImage(5);
        System.out.println();
        drawImage(6);
        System.out.println();
        drawImage(7);


    }
}

 /*                 _________
                    |/      |
                    |      (_)
                    |      \|/
                    |       |
                    |      / \
                    |
                 ___|___*/