package overriding;

import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();

        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
    }
}

/*
Nama:Carmel JH Silalahi
NIM:41425027
1. Apa yang terjadi jika tidak menggunakan @Override?

Program tetap bisa berjalan jika method yang dibuat benar-benar sama dengan method dari class induknya. Tetapi @Override berguna untuk membantu memastikan method tersebut benar-benar melakukan overriding.

2. Apa keuntungan polymorphism?

Polymorphism membuat objek dari class turunan seperti HarryPotter dan Hermione dapat dipanggil melalui referensi Penyihir, tetapi masing-masing tetap menjalankan method sesuai class-nya.
*/