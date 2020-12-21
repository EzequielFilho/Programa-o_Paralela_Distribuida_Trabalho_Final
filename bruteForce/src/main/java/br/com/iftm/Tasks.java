package br.com.iftm;

public class Tasks implements Runnable{

    private String hashString;
    private String firstValue;

    public Tasks (String hashString, String firstValue) {
        this.hashString = hashString;
        this.firstValue = firstValue;
    }

    @Override
    public void run() {
        boolean twoDigits = false;
        boolean threeDigits = false;
        boolean fourDigits = false;
        boolean fiveDigits = false;
        boolean sixDigits = false;
        String word = "";
        // double count = 0;

        String characters[] = {"0","1","2","3","4","5","6","7","8","9",":",";","<","=",">","?","@","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};


        Sha256 sha256 = new Sha256();
        if (sha256.compare(this.firstValue, this.hashString)) {
            System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  this.firstValue);
            System.exit(0);
            // Thread.currentThread().interrupt();
        } else {
            // System.out.println("false");
            twoDigits = true;
            // count++;
            // System.out.println(Thread.currentThread().getName());
        }

        if (twoDigits) {
            for (int i = 0; i < 43; i++) {
                if (!threeDigits){
                    word = this.firstValue + characters[i];
                }
                if (sha256.compare(word, this.hashString) && !threeDigits) {
                    System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  word);
                    System.exit(0);
                    // System.out.println(Thread.currentThread().getName());
                } else {
                    // System.out.println("false");
                    // count++;
                }
                if (i == 42 && !threeDigits) {
                    threeDigits = true;
                    i = 0;
                }
                if (threeDigits) {
                    for (int j = 0; j < 43; j++) {
                        if (!fourDigits) {
                            word = this.firstValue + characters[i] + characters[j];
                        }
                        if (sha256.compare(word, this.hashString) && !fourDigits) {
                            System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  word);
                            System.exit(0);
                        } else {
                            // System.out.println("false");
                            // count++;
                        }
                        if (word.equals(this.firstValue + "ZZ") && !fourDigits) {
                            fourDigits = true;
                            i = 0;
                            j = 0;
                            // System.out.println(count);
                        }
                        if (fourDigits) {
                            for (int k = 0; k < 43; k++) {
                                if (!fiveDigits) {
                                    word = this.firstValue + characters[i] + characters[j] + characters[k];
                                    // System.out.println(word);
                                }
                                if (sha256.compare(word, this.hashString) && !fiveDigits) {
                                    System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  word);
                                    System.exit(0);
                                } else {
                                    // System.out.println("false");
                                    // count++;
                                }
                                if (word.equals(this.firstValue + "ZZZ") && !fiveDigits) {
                                    fiveDigits = true;
                                    i = 0;
                                    j = 0;
                                    k = 0;
                                    // System.out.println(count);
                                }
                                if (fiveDigits) {
                                    for (int l = 0; l < 43; l++) {
                                        if (!sixDigits) {
                                            word = this.firstValue + characters[i] + characters[j] + characters[k] + characters[l];
                                            // System.out.println(word);
                                        }
                                        if (sha256.compare(word, this.hashString) && !sixDigits) {
                                            System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  word);
                                            System.exit(0);
                                        } else {
                                            // System.out.println("false");
                                            // count++;
                                        }
                                        if (word.equals(this.firstValue + "ZZZZ") && !sixDigits) {
                                            sixDigits = true;
                                            i = 0;
                                            j = 0;
                                            k = 0;
                                            l = 0;
                                            // System.out.println(count);
                                        }
                                        if (sixDigits) {
                                            for (int m = 0; m < 43; m++) {
                                                word = this.firstValue + characters[i] + characters[j] + characters[k] + characters[l] + characters[m];

                                                if (sha256.compare(word, this.hashString)) {
                                                    System.out.println("Senha encontrada na " + Thread.currentThread().getName() + "!  \nA senha eh: " +  word);
                                                    System.exit(0);
                                                } else {
                                                    // System.out.println("false");
                                                    // count++;
                                                }
                                                if (word.equals(this.firstValue + "ZZZZZ")) {                    
                                                    // System.out.println(count);
                                                    System.out.println(Thread.currentThread().getName());
                                                    System.err.println("Senha não encontrada!!!!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}