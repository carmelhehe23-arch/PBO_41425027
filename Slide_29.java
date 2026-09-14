// Continue 
int count = 0; String s="peter piper picked..."; 
for(int i=0; i<s.length(); i++) 
    { if(s.charAt(i)=='p') continue; 
      count++; 
    }

// return
if (x > 0) { 
    return ++count; // harus cocok dengan tipe hasil method
}