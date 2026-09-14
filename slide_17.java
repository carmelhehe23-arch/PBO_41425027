//Operator dalam java part 2
// Compund assigment: +=, -=, *=, /=, %=
int x = 10;
x+= 5; // x = 15

// Dampak tipe dta:
double d = 10.0/3; // 3.333....
int i 10/3; // 3 (truncation)

//Pada ekspresi campuran, tipe lebih kecil dipromosikan
//(mis. int -> double). Math utility
double p = Math.pow(2, 3); //8.0
double s = Math.sqrt(64); // 8.0
