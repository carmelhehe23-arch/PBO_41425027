int[] nilai = {80, 90, 75, 88}
int total = 0;
fot(int n : nilai) {    //enchaned for loop
    total += n;
}
double rata = (double) total / nilai.length;
system.out.println("Rata-rata nilai: " + rata);