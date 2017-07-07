/**
 * Created by arfan on 7/7/2017.
 */
public class Main {
    public static void main(String ... args) {
        //sebut3(922);

        sebut(1_123_123_123);
        sebut(1000);
        sebut(1001000);
        sebut(9000);



    }

    private static void sebut(int i) {

        if(i==1000){
            System.out.println("seribu");
            return;
        }

        int satuan = i%1000;
        int ribuan = (i/1000) %1000;
        int jutaan = (i/1000000) %1000;;
        int milyaran = (i/1000000000) %1000;;

        if(milyaran>0) {
            sebut3(milyaran);
            System.out.print(" milyar ");
        }
        if(jutaan>0) {
            sebut3(jutaan);
            System.out.print(" juta ");
        }
        if(ribuan>0) {
            sebut3(ribuan);
            System.out.print(" ribu ");
        }

        if(satuan>0) {
            sebut3(satuan);
        }

        System.out.println();

    }

    private static void sebut3(int i) {
        if(i>999){
            System.out.print("ngaco angka");
            return;
        }

        int ratusan,puluhan, satuan;

        ratusan = i/100 %10;
        puluhan = i/10 % 10;
        satuan = i % 10;

        if(ratusan==1) {
            System.out.print("seratus");
        } else if(ratusan ==2) {
            System.out.print("dua ratus");
        } else if(ratusan ==3) {
            System.out.print("tiga ratus");
        } else if(ratusan ==4) {
            System.out.print("empat ratus");
        } else if(ratusan ==5) {
            System.out.print("lima ratus");
        } else if(ratusan ==6) {
            System.out.print("enam ratus");
        } else if(ratusan ==7) {
            System.out.print("tujuh ratus");
        } else if(ratusan ==8) {
            System.out.print("delapan ratus");
        } else if(ratusan ==9) {
            System.out.print("sembilan ratus");
        }

        if(ratusan>0)
            System.out.print(" ");

        boolean skipSatuan = false;
        if(puluhan==1) {
            if(satuan==0) {
                System.out.print("sepuluh");
            } else if(satuan==1) {
                System.out.print("sebelas");
            } else if(satuan==2) {
                System.out.print("dua belas");
            } else if(satuan==3) {
                System.out.print("tiga belas");
            } else if(satuan==4) {
                System.out.print("empat belas");
            } else if(satuan==5) {
                System.out.print("lima belas");
            } else if(satuan==6) {
                System.out.print("enam belas");
            } else if(satuan==7) {
                System.out.print("tujuh belas");
            } else if(satuan==8) {
                System.out.print("delapan belas");
            } else if(satuan==9) {
                System.out.print("sembilan belas");
            }

            skipSatuan = true;
        } else if(puluhan==2) {
            System.out.print("dua puluh");
        } else if(puluhan==3) {
            System.out.print("tiga puluh");
        } else if(puluhan==4) {
            System.out.print("empat puluh");
        } else if(puluhan==5) {
            System.out.print("lima puluh");
        } else if(puluhan==6) {
            System.out.print("enam puluh");
        } else if(puluhan==7) {
            System.out.print("tujuh puluh");
        } else if(puluhan==8) {
            System.out.print("delapan puluh");
        } else if(puluhan==9) {
            System.out.print("sembilan puluh");
        }

        if(!skipSatuan) {
            if(puluhan>0)
                System.out.print(" ");

            if(satuan==1) {
                System.out.print("satu");
            } else if(satuan ==2) {
                System.out.print("dua");
            } else if(satuan ==3) {
                System.out.print("tiga");
            } else if(satuan ==4) {
                System.out.print("empat");
            } else if(satuan ==5) {
                System.out.print("lima");
            } else if(satuan ==6) {
                System.out.print("enam");
            } else if(satuan ==7) {
                System.out.print("tujuh");
            } else if(satuan ==8) {
                System.out.print("delapan");
            } else if(satuan ==9) {
                System.out.print("sembilan");
            }
        }

        //System.out.println();
    }
}
