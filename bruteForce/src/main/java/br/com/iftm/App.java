package br.com.iftm;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("É necessário informar a hash como argumento.");
            System.exit(-1);
        }
            
        // Recebe o primeiro argumento (primeira string informada após ./meu_projeto.jar):
        // a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3
        String password = args[0];
        System.out.println(password);

        // 0 - 9
        Tasks tasks0 = new Tasks(password, "0");
        Thread thread0 = new Thread(tasks0);
        thread0.start();

        Tasks tasks1 = new Tasks(password, "1");
        Thread thread1 = new Thread(tasks1);
        thread1.start();

        Tasks tasks2 = new Tasks(password, "2");
        Thread thread2 = new Thread(tasks2);
        thread2.start();

        Tasks tasks3 = new Tasks(password, "3");
        Thread thread3 = new Thread(tasks3);
        thread3.start();

        Tasks tasks4 = new Tasks(password, "4");
        Thread thread4 = new Thread(tasks4);
        thread4.start();

        Tasks tasks5 = new Tasks(password, "5");
        Thread thread5 = new Thread(tasks5);
        thread5.start();

        Tasks tasks6 = new Tasks(password, "6");
        Thread thread6 = new Thread(tasks6);
        thread6.start();

        Tasks tasks7 = new Tasks(password, "7");
        Thread thread7 = new Thread(tasks7);
        thread7.start();

        Tasks tasks8 = new Tasks(password, "8");
        Thread thread8 = new Thread(tasks8);
        thread8.start();

        Tasks tasks9 = new Tasks(password, "9");
        Thread thread9 = new Thread(tasks9);
        thread9.start();

        // : - @
        Tasks tasks11 = new Tasks(password, ":");
        Thread thread11 = new Thread(tasks11);
        thread11.start();

        Tasks tasks12 = new Tasks(password, ";");
        Thread thread12 = new Thread(tasks12);
        thread12.start();

        Tasks tasks13 = new Tasks(password, "<");
        Thread thread13 = new Thread(tasks13);
        thread13.start();

        Tasks tasks14 = new Tasks(password, "=");
        Thread thread14 = new Thread(tasks14);
        thread14.start();

        Tasks tasks15 = new Tasks(password, ">");
        Thread thread15 = new Thread(tasks15);
        thread15.start();

        Tasks tasks16 = new Tasks(password, "?");
        Thread thread16 = new Thread(tasks16);
        thread16.start();

        Tasks tasks17 = new Tasks(password, "@");
        Thread thread17 = new Thread(tasks17);
        thread17.start();

        // A - Z
        Tasks tasks18 = new Tasks(password, "A");
        Thread thread18 = new Thread(tasks18);
        thread18.start();

        Tasks tasks19 = new Tasks(password, "B");
        Thread thread19 = new Thread(tasks19);
        thread19.start();

        Tasks tasks20 = new Tasks(password, "C");
        Thread thread20 = new Thread(tasks20);
        thread20.start();

        Tasks tasks21 = new Tasks(password, "D");
        Thread thread21 = new Thread(tasks21);
        thread21.start();

        Tasks tasks22 = new Tasks(password, "E");
        Thread thread22 = new Thread(tasks22);
        thread22.start();

        Tasks tasks23 = new Tasks(password, "F");
        Thread thread23 = new Thread(tasks23);
        thread23.start();

        Tasks tasks24 = new Tasks(password, "G");
        Thread thread24 = new Thread(tasks24);
        thread24.start();

        Tasks tasks25 = new Tasks(password, "H");
        Thread thread25 = new Thread(tasks25);
        thread25.start();

        Tasks tasks26 = new Tasks(password, "I");
        Thread thread26 = new Thread(tasks26);
        thread26.start();

        Tasks tasks27 = new Tasks(password, "J");
        Thread thread27 = new Thread(tasks27);
        thread27.start();

        Tasks tasks28 = new Tasks(password, "K");
        Thread thread28 = new Thread(tasks28);
        thread28.start();

        Tasks tasks29 = new Tasks(password, "L");
        Thread thread29 = new Thread(tasks29);
        thread29.start();

        Tasks tasks30 = new Tasks(password, "M");
        Thread thread30 = new Thread(tasks30);
        thread30.start();

        Tasks tasks31 = new Tasks(password, "N");
        Thread thread31 = new Thread(tasks31);
        thread31.start();

        Tasks tasks32 = new Tasks(password, "O");
        Thread thread32 = new Thread(tasks32);
        thread32.start();

        Tasks tasks33 = new Tasks(password, "P");
        Thread thread33 = new Thread(tasks33);
        thread33.start();

        Tasks tasks34 = new Tasks(password, "Q");
        Thread thread34 = new Thread(tasks34);
        thread34.start();

        Tasks tasks35 = new Tasks(password, "R");
        Thread thread35 = new Thread(tasks35);
        thread35.start();

        Tasks tasks36 = new Tasks(password, "S");
        Thread thread36 = new Thread(tasks36);
        thread36.start();

        Tasks tasks37 = new Tasks(password, "T");
        Thread thread37 = new Thread(tasks37);
        thread37.start();

        Tasks tasks38 = new Tasks(password, "U");
        Thread thread38 = new Thread(tasks38);
        thread38.start();

        Tasks tasks39 = new Tasks(password, "V");
        Thread thread39 = new Thread(tasks39);
        thread39.start();

        Tasks tasks40 = new Tasks(password, "W");
        Thread thread40 = new Thread(tasks40);
        thread40.start();

        Tasks tasks41 = new Tasks(password, "X");
        Thread thread41 = new Thread(tasks41);
        thread41.start();

        Tasks tasks42 = new Tasks(password, "Y");
        Thread thread42 = new Thread(tasks42);
        thread42.start();

        Tasks tasks43 = new Tasks(password, "Z");
        Thread thread43 = new Thread(tasks43);
        thread43.start();


    }

}
