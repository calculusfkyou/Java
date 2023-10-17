import java.util.Scanner;

public class A411177034_4 {
    public static String direction(String instruction, String side) {
        switch (side) {
            case "E": {
                if (instruction.equals("R"))
                    return "S";
                else if (instruction.equals("L"))
                    return "N";
            }
            case "W": {
                if (instruction.equals("R"))
                    return "N";
                else if (instruction.equals("L"))
                    return "S";
            }
            case "N": {
                if (instruction.equals("R"))
                    return "E";
                else if (instruction.equals("L"))
                    return "W";
            }
            case "S": {
                if (instruction.equals("R"))
                    return "W";
                else if (instruction.equals("L"))
                    return "E";
            }
        }
        return side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        int[][] world = new int[y + 1][x + 1];
        for (int i = 0; i <= y; i++) {
            for (int j = 0; j <= x; j++) {
                world[i][j] = 1;
            }
        }

        while (true) {
            try {
                int initialX = scanner.nextInt();
                int initialY = scanner.nextInt();
                String side = scanner.next();
                String instructions = scanner.next();
                int subX = 0, subY = 0, check = 0;
                String subSide = "";

                for (int i = 0; i < instructions.length(); i++) {
                    char instruction = instructions.charAt(i);
                    subSide = side;
                    subX = initialX;
                    subY = initialY;

                    if (instruction == 'R' || instruction == 'L')
                        side = direction(Character.toString(instruction), side);
                    else {

                        if (side.equals("E"))
                            initialX += 1;
                        else if (side.equals("W"))
                            initialX -= 1;
                        else if (side.equals("N"))
                            initialY += 1;
                        else if (side.equals("S"))
                            initialY -= 1;

                    }

                    if (initialX > x || initialX < 0 || initialY > y || initialY < 0) {

                        if (world[subY][subX] != 0) {
                            world[subY][subX] = 0;
                            check = 1;
                            break;
                        } else {
                            initialX = subX;
                            initialY = subY;
                        }

                    }

                }

                if (check == 1)
                    System.out.println(subX + " " + subY + " " + subSide + " LOST");
                else
                    System.out.println(initialX + " " + initialY + " " + side);

            } catch (Exception e) {
                break;
            }
        }

        scanner.close();
    }
}
