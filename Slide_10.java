// Tipe data non primitive
//Array: koleksi elemen bertipe sama, diakses via indeks.
int [] arr = {1, 2, 3};
double[] arr2 = {1.1, 2.2};

//Interface: Kontrak berisi method tanpa implementasi. Merupakan class yang meng-implement wajib isi semua method
interface Operasi  {
  int tambah( int a,int b);
}
class Klakulator implements Operasi {
  public int tambah(int a,innt b){ return a+b; }
}
