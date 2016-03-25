package tubes_pbo_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    Scanner inputString = new Scanner(System.in);
    Scanner inputInteger = new Scanner(System.in);
    Scanner inputLong = new Scanner(System.in);
    Scanner inputChar = new Scanner(System.in);
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    int i;
    int pilih;
    String sudah;
    
    public void addDokter(String nama, String alamat, long noHP, String jeniskelamin, String spesialis) {
        Dokter dokter = new Dokter(nama, alamat, noHP, jeniskelamin, spesialis);
        daftarDokter.add(dokter);
    }
    
    public Dokter getDokter(String id) {
        i = 0;
        while (i <= daftarDokter.size()){
            if (daftarDokter.get(i).getIdDokter().equals(id)){
                return daftarDokter.get(i);
            }
            i++;
        }
        return null;
    }
    
    public void removeDokter(String id) {
        i = 0;
        while (i <= daftarDokter.size()){
            if (daftarDokter.get(i).getIdDokter().equals(id)){
                daftarDokter.remove(i);
            }
            i++;
        }
    }

    public void addPasien(String nama, String alamat, long noHP, String jeniskelamin) {
        Pasien pasien = new Pasien(nama, alamat, noHP, jeniskelamin);
        daftarPasien.add(pasien);
    }
    
    public Pasien getPasien(String id) {
        i = 0;
        while (i <= daftarPasien.size()){
            if (daftarPasien.get(i).getIdPasien().equals(id)){
                return daftarPasien.get(i);
            }
            i++;
        }
        return null;
    }
    
    public void removePasien(String id){
        i = 0;
        while (i <= daftarPasien.size()){
            if (daftarPasien.get(i).getIdPasien().equals(id)){
                daftarPasien.remove(i);
            }
        }
    }

    public void addRuangan(int jumlahPasienInap, String namaRuangan) {
        Ruangan ruangan = new Ruangan(jumlahPasienInap, namaRuangan);
        daftarRuangan.add(ruangan);
    }
    
    public Ruangan getRuangan(String id){
        i = 0;
        while (i <= daftarRuangan.size()){
            if (daftarRuangan.get(i).getNomorRuangan().equals(id)){
                return daftarRuangan.get(i);
            }
        }
        return null;
    }
    
    public void menu_1(){
        System.out.println("Dokter");
        System.out.println("1. Input Data Dokter");
        System.out.println("2. View Data Dokter");
        System.out.println("3. Edit Data Dokter");
        System.out.println("4. Delete Data Dokter");
        System.out.println("5. Kembali");
    }
    
    public void menu_2(){
        System.out.println("Pasien");
        System.out.println("1. Input Data Pasien");
        System.out.println("2. View Data Pasien");
        System.out.println("3. Edit Data Pasien");
        System.out.println("4. Delete Data Pasien");
        System.out.println("5. Kembali");
    }
    
    public void menu_3(){
        System.out.println("Ruangan");
        System.out.println("1. Input Data Ruangan");
        System.out.println("2. View Data Ruangan");
        System.out.println("3. Edit Data Ruangan");
        System.out.println("4. Delete Data Ruangan");
        System.out.println("5. Kembali");
    }
    
    public void menu_1_1(){
        System.out.println("Input Data Dokter");
        System.out.print("nama: ");
        String inNama = inputString.nextLine();
        System.out.print("Spesialis: ");
        String inSpesialis = inputString.nextLine();
        System.out.print("Alamat: ");
        String inAlamat = inputString.nextLine();
        System.out.print("No Hp: ");
        long inNoHp = inputLong.nextLong();
        System.out.print("Jenis Kelamin: ");
        String inJenisKelamin = inputString.nextLine();
        addDokter(inNama, inAlamat, inNoHp, inJenisKelamin, inSpesialis);
    }
    
    public void menu_1_2(){
        System.out.println("View Data Dokter");
        i = 0;
        while(i < daftarDokter.size()){
            System.out.println("Id: "+daftarDokter.get(i).getIdDokter());
            System.out.println("Nama: "+daftarDokter.get(i).getNama());
            System.out.println("Alamat: "+daftarDokter.get(i).getAlamat());
            System.out.println("Jenis Kelamin: "+daftarDokter.get(i).getJenisKelamin());
            System.out.println("No Hp: "+daftarDokter.get(i).getNoHP());
            System.out.println("");
            i++;
        }
    }
    
    public void menu_1_3(){
        System.out.println("Edit Data Dokter");
        System.out.print("Masukkan Id Dokter yang ingin diedit: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i <= daftarDokter.size() && daftarDokter.get(i).getIdDokter().equals(idCari) == false){
            i++;
        }
        if (daftarDokter.get(i).getIdDokter().equals(idCari)){
            System.out.print("nama: ");
            String inNama = inputString.nextLine();
            System.out.print("Spesialis: ");
            String inSpesialis = inputString.nextLine();
            System.out.print("Alamat: ");
            String inAlamat = inputString.nextLine();
            System.out.print("No Hp: ");
            long inNoHp = inputLong.nextLong();
            System.out.print("Jenis Kelamin: ");
            String inJenisKelamin = inputString.nextLine();
            Dokter tempDokter = daftarDokter.get(i);
            tempDokter.updateDokter(inNama, inAlamat, inNoHp, inJenisKelamin, inSpesialis);
            daftarDokter.set(i, tempDokter);
        }
    }
    
    public void menu_1_4(){
        System.out.println("Delete Data Dokter");
        System.out.print("Masukkan Id Dokter yg ingin didelete: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i < daftarDokter.size()){
            if (daftarDokter.get(i).getIdDokter().equals(idCari)){
                daftarDokter.remove(i);
            }
            i++;
        }
    }
    
    public void menu_2_1(){
        System.out.println("Input Data Pasien");
        System.out.print("nama: ");
        String inNama = inputString.nextLine();
        System.out.print("Alamat: ");
        String inAlamat = inputString.nextLine();
        System.out.print("No Hp: ");
        long inNoHp = inputLong.nextLong();
        System.out.print("Jenis Kelamin: ");
        String inJenisKelamin = inputString.nextLine();
        addPasien(inNama, inAlamat, inNoHp, inJenisKelamin);
    }
    
    public void menu_2_2(){
        System.out.println("View Data Pasien");
        i = 0;
        while(i < daftarPasien.size()){
            System.out.println("Id: "+daftarPasien.get(i).getIdPasien());
            System.out.println("Nama: "+daftarPasien.get(i).getNama());
            System.out.println("Alamat: "+daftarPasien.get(i).getAlamat());
            System.out.println("Jenis Kelamin: "+daftarPasien.get(i).getJenisKelamin());
            System.out.println("No Hp: "+daftarPasien.get(i).getNoHP());
            i++;
            System.out.println("");
        }
    }
    
    public void menu_2_3(){
        System.out.println("Edit Data Pasien");
        System.out.print("Masukkan Id pasien yang ingin diedit: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i <= daftarPasien.size() && daftarPasien.get(i).getIdPasien().equals(idCari) == false){
            i++;
        }
        if (daftarPasien.get(i).getIdPasien().equals(idCari)){
            System.out.print("nama: ");
            String inNama = inputString.nextLine();
            System.out.print("Alamat: ");
            String inAlamat = inputString.nextLine();
            System.out.print("No Hp: ");
            long inNoHp = inputLong.nextLong();
            System.out.print("Jenis Kelamin: ");
            String inJenisKelamin = inputString.nextLine();
            Pasien tempPasien = daftarPasien.get(i);
            tempPasien.updatePasien(inNama, inAlamat, inNoHp, inJenisKelamin);
            daftarPasien.set(i, tempPasien);
        }
    }
    
    public void menu_2_4(){
        System.out.println("Delete Data Pasien");
        System.out.print("Masukkan data pasien yg ingin diedit: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i < daftarPasien.size()){
            if (daftarPasien.get(i).getIdPasien().equals(idCari)){
                daftarPasien.remove(i);
            }
            i++;
        }
    }
    
    public void menu_3_1(){
        System.out.println("Input Data Ruangan");
        System.out.print("nama: ");
        String inNama = inputString.nextLine();
        System.out.println("Jumlah Pasien Inap: ");
        int inJmlPasienInap = inputInteger.nextInt();
        addRuangan(inJmlPasienInap, inNama);
    }
    
    public void menu_3_2(){
        System.out.println("View Data Ruangan");
        i = 0;
        while(i < daftarPasien.size()){
            System.out.println("No Ruangan: "+daftarRuangan.get(i).getNomorRuangan());
            System.out.println("Nama: "+daftarRuangan.get(i).getNamaRuangan());
            System.out.println("Kapasitas: "+daftarRuangan.get(i).getJumlahPasienInap()+" Orang");
            System.out.println("");
            i++;
        }
    }
    
    public void menu_3_3(){
        System.out.println("Edit Data Ruangan");
        System.out.print("Masukkan no ruangan yang ingin diedit: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i <= daftarRuangan.size() && daftarRuangan.get(i).getNomorRuangan().equals(idCari) == false){
            i++;
        }
        if (daftarRuangan.get(i).getNomorRuangan().equals(idCari)){
            System.out.print("nama: ");
            String inNama = inputString.nextLine();
            System.out.print("Jumlah Pasien Inap: ");
            int inJmlPasienInap = inputInteger.nextInt();
            Ruangan tempRuangan = daftarRuangan.get(i);
            tempRuangan.updateRuangan(inJmlPasienInap, inNama);
            daftarRuangan.set(i, tempRuangan);
        }
    }
    
    public void menu_3_4(){
        System.out.println("Delete Data Ruangan");
        System.out.print("Masukkan no Ruangan yg ingin diedit: ");
        String idCari = inputString.nextLine();
        i = 0;
        while (i < daftarRuangan.size()){
            if (daftarRuangan.get(i).getNomorRuangan().equals(idCari)){
                daftarRuangan.remove(i);
            }
            i++;
        }
    }
    
    public void mainMenu(String args[]) {
        String back1 = "y";
        while (back1.equals("y")){
            System.out.println("Menu");
            System.out.println("1. Dokter");
            System.out.println("2. Pasien");
            System.out.println("3. Ruangan");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            try{
                pilih = inputInteger.nextInt();
            }
            catch(Exception e){
                System.out.println("maaf inputan salah");
            }
            switch (pilih) {
                case 1:
                    String back2 = "y";
                    while (back2.equals("y") || back2.equals("Y")){
                        menu_1();
                        System.out.print("Pilih: ");
                        pilih = inputInteger.nextInt();
                        switch (pilih) {
                            case 1:
                                String back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_1_1();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 2:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_1_2();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 3:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_1_3();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 4:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_1_4();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 5:
                                back1 = "y";
                                back2 = "n";
                                break;
                        }
                    }
                    break;
                case 2:
                    String back3 = "y";
                    while(back3.equals("y") || back3.equals("Y")){
                        menu_2();
                        System.out.print("Pilih: ");
                        pilih = inputInteger.nextInt();
                        switch (pilih) {
                            case 1:
                                String back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_2_1();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 2:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_2_2();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 3:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_2_3();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 4:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_2_4();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 5:
                                back1 = "y";
                                back3 = "n";
                                break;
                        }
                    }
                    break;
                case 3:
                    String back4 = "y";
                    while (back4.equals("y") || back4.equals("Y")){
                        menu_3();
                        System.out.print("Pilih: ");
                        pilih = inputInteger.nextInt();
                        switch (pilih) {
                            case 1:
                                String back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_3_1();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 2:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_3_2();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 3:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_3_3();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 4:
                                back2_1 = "n";
                                while (back2_1.equals("n") || back2_1.equals("N")){
                                    menu_3_4();
                                    System.out.print("Sudah..? (y/n) ");
                                    sudah = inputString.nextLine();
                                    back2_1 = sudah;
                                }
                                break;
                            case 5:
                                back1 = "y";
                                back4 = "n";
                                break;
                        }
                    }
                    break;
                case 4:
                    System.exit(pilih);
            }
        }
    }
}