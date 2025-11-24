
package Minggu6;
public class Days078 {    
    public static void main(String[] args) {
        String Nama = "Rusmiati";
        System.out.println(Nama);
       
        System.out.println();
        
        String Nama1 = "Rusmiati";
        String Nama2 = "Rusmi";
  
        System.out.println("contains()              : " + Nama.contains("Rusmiati"));
        System.out.println("equals()                : " + Nama1.equals(Nama2));
        System.out.println("equalsIgnoreCase()      : " + Nama1.equalsIgnoreCase(Nama2));
        System.out.println("isEmpty()               : " + Nama.isEmpty());  
        System.out.println("length (panjang teks)   : " + Nama.length());
        System.out.println("Upercase (huruf besar)  : " + Nama.toUpperCase());
        System.out.println("lowercase (huruf kecil) : " + Nama.toLowerCase());
        System.out.println("Substring (0-3)         : " + Nama.substring(0, 3));
        System.out.println("Replace 'a' dengan 'o'  : " + Nama.replace("a", "o"));
        System.out.println("Trim (hapus spasi)      : '" + Nama.trim() + "'");
       
    }
}
