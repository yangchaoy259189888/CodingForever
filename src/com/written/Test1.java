package com.written;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        helpWatcherEscape(a, b, c);
    }

    public static void helpWatcherEscape(int uiMagic, int uiDistance, int uiSec) {
        int SpaceElse = 0, TimeleftElse = uiSec;
        while (uiMagic >= 10 && uiSec > 0 && uiDistance - SpaceElse > 0) {
            if (uiDistance - SpaceElse > 17) {
                SpaceElse += 60;
                uiMagic -= 10;
                uiSec--;
            } else {
                System.out.println("Yes" + (TimeleftElse - uiSec + 1));
            }
        }
        while (uiSec > 0 && uiDistance - SpaceElse > 0) {
            if ((uiMagic == 0 || uiMagic == 1) && uiSec >= 7
                    && uiDistance - SpaceElse > 102)
            {
                uiSec -= 7;
                SpaceElse += 120;
            } else if (uiMagic >= 2 && uiMagic <= 5 && uiSec >= 3
                    && uiDistance - SpaceElse > 34)
            {
                uiMagic -= 2;
                uiSec -= 3;
                SpaceElse += 60;
            } else if (uiMagic >= 6 && uiSec >= 2
                    && uiDistance - SpaceElse > 17)
            {
                uiMagic -= 6;
                uiSec -= 2;
                SpaceElse += 60;
            } else {
                SpaceElse += 17;
                uiSec--;
            }
        }
        if (uiDistance <= SpaceElse) {
            System.out.println("Yes " + TimeleftElse);
        } else {
            System.out.println("No " + SpaceElse);
        }
    }
}