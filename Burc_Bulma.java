import java.util.Scanner;

public class Burc_Bulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int ay, gun;


        System.out.print("Dogdugunuz ay: ");
        ay=inp.nextInt();
        System.out.print("Dogdugunuz gun: ");
        gun=inp.nextInt();

        if (ay == 1){
            if (gun >=1 && gun <=31){
                if(gun < 22){
                    System.out.println("Oglak");
                } else {
                    System.out.println("Kova");
                }
            }
        }
        if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 2){
            if (gun >=1 && gun <=29){
                if(gun < 20){
                    System.out.println("Kova");
                } else {
                    System.out.println("Balik");
                }
            }
        }if (gun >= 30){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 3){
            if (gun >=1 && gun <=31){
                if(gun < 21){
                    System.out.println("Balik");
                } else {
                    System.out.println("Koc");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }
        if (ay == 4){
            if (gun >=1 && gun <=30){
                if(gun < 21){
                    System.out.println("Koc");
                } else {
                    System.out.println("Boga");
                }
            }
        }if (gun >= 31){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 5){
            if (gun >=1 && gun <=31){
                if(gun < 22){
                    System.out.println("Boga");
                } else {
                    System.out.println("Ikizler");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 6){
            if (gun >=1 && gun <=30){
                if(gun < 23){
                    System.out.println("Ikizler");
                } else {
                    System.out.println("Yengec");
                }
            }
        }if (gun >= 31){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 7){
            if (gun >=1 && gun <=31){
                if(gun < 23){
                    System.out.println("Yengec");
                } else {
                    System.out.println("Aslan");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 8){
            if (gun >=1 && gun <=31){
                if(gun < 23){
                    System.out.println("Aslan");
                } else {
                    System.out.println("Basak");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 9){
            if (gun >=1 && gun <=30){
                if(gun < 23){
                    System.out.println("Basak");
                } else {
                    System.out.println("Terazi");
                }
            }
        }if (gun >= 31){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 10){
            if (gun >=1 && gun <=31){
                if(gun < 23){
                    System.out.println("Terazi");
                } else {
                    System.out.println("Akrep");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 11){
            if (gun >=1 && gun <=30){
                if(gun < 22){
                    System.out.println("Akrep");
                } else {
                    System.out.println("Yay");
                }
            }
        }if (gun >= 31){
            System.out.println("Hatali giris yaptiniz!");
        }

        if (ay == 12){
            if (gun >=1 && gun <=31){
                if(gun < 22){
                    System.out.println("Yay");
                } else {
                    System.out.println("Oglak");
                }
            }
        }if (gun >= 32){
            System.out.println("Hatali giris yaptiniz!");
        }


    }
}
