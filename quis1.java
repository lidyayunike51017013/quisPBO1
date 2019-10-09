/** 
 * @(#)quis1.java
 *
 *
 * @author 
 * @version 1.00 2019/10/3
 */

import java.io.*;
public class quis1 {

    public static void main (String[] args) throws IOException{
    		InputStreamReader input = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(input);
    		
    	String nama,ktp;
    	double diskon, kembalian,tbayar;  
    	int bayar, biaya,status,kode;
    	
    	System.out.println("------------------|--------------------|------------");
    	System.out.println("Jenis Penerbangan | Tujuan Penerbangan | Biaya      ");
    	System.out.println("------------------|--------------------|------------");
    	System.out.println(" Ekonomi          | Jakarta-Makassar   | Rp1.000.000");
    	System.out.println(" Ekonomi          | Makassar-Jakarta   | Rp1.500.000");
    	System.out.println(" Bisnis           | Jakarta-Makassar   | Rp2.500.000");
    	System.out.println(" Bisnis           | Makassar-Jakarta   | Rp3.500.000");
    	
    	
    	System.out.print("Masukkan Nama Anda : ");
    	nama = br.readLine();
    	System.out.print("Masukkan No. KTP : ");
    	ktp = br.readLine();
    	System.out.println();
    	
    	System.out.print("Kode : ");
    	biaya = Integer.parseInt(br.readLine());
    	System.out.println();
    	
    		if(biaya==1){
    			System.out.println("Jenis Penerbangan : Ekonomi");
    			System.out.println();
    			System.out.println("Tujuan Penerbangan : JKT-MKS");
    			System.out.println("Harga : Rp 1.000.000");
    			biaya = 1000000;
    		
    		}
    		else if(biaya==2){
    			System.out.println("Jenis Penerbangan : Ekonomi");
    			System.out.println();
    			System.out.println("Tujuan Penerbangan : MKS-JKT");
    			System.out.println("Harga : Rp 1.500.000");
    			biaya = 1500000;
    			
    		}
    		else if(biaya==3){
    			System.out.println("Jenis Penerbangan : Bisnis");
    			System.out.println();
    			System.out.println("Tujuan Penerbangan : JKT-MKS");
    			System.out.println("Harga : Rp 2.500.000");
    			biaya = 2500000;
    			
    		}		
    		else if(biaya==4){
    			System.out.println("Jenis Penerbangan : Bisnis");
    			System.out.println();
    			System.out.println("Tujuan Penerbangan : MKS-JKT");
    			System.out.println("Harga : Rp 3.000.000");
    			biaya = 3000000;
    		}
    		else{
    		System.out.println("Maaf anda salah memasukkan tipe pesawat");
    		}
    		
    	System.out.print("Apakah anda merupakan member(1/10): ");
    	status = Integer.parseInt(br.readLine());
    	System.out.println();
    	
    	if(status==1){
    		System.out.println("Anda Mendapat Diskon");
    		diskon=biaya*0.1;
    	}
    	else {
    		System.out.println("Anda Mendapat Diskon");
    		diskon=biaya+0;
    	}
    	
    	System.out.println("Total Diskon : "+diskon);
    	tbayar= biaya-diskon;
    	System.out.println("Total Bayar : "+tbayar);
    	System.out.println();
    	System.out.println("Bayar : ");
    	bayar=Integer.parseInt(br.readLine());
    	kembalian=bayar-tbayar;
    	System.out.println("kembalian: "+kembalian);
    
    }
    
    
}