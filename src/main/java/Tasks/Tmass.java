package Tasks;

import java.util.Random;

public class Tmass {
    public Tmass() {
    }

    public void tass() {
        int[] mass = new int[20];
        Random random = new Random();
        int otrchislo = -11;
        int polozchislo = 11;

        int i1;
        for(i1 = 0; i1 < mass.length; ++i1) {
            mass[i1] = random.nextInt() % 11;
            System.out.print(mass[i1] + " ");
            if (mass[i1] < 0 & mass[i1] > otrchislo) {
                otrchislo = mass[i1];
            } else if (mass[i1] > 0 & mass[i1] < polozchislo) {
                polozchislo = mass[i1];
            }
        }

        System.out.println();

        for(i1 = 0; i1 < mass.length; ++i1) {
            if (mass[i1] == polozchislo) {
                mass[i1] = otrchislo;
            } else if (mass[i1] == otrchislo) {
                mass[i1] = polozchislo;
            }

            System.out.print(mass[i1] + " ");
        }

        System.out.println(" ");
        System.out.println("Минимальное положительное " + polozchislo);
        System.out.println("Максимальное отрицательное " + otrchislo);
    }
}
