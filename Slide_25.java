// Label
int month = 8;
switch (month) {
    case 1: name = "Januari"; break;
    case 2: name = "Februari"; break;   
    case 3: name = "Maret"; break;
    case 4: name = "April"; break;
    case 5: name = "Mei"; break;
    case 6: name = "Juni"; break;
    case 7: name = "Juli"; break;
    case 8: name = "Agustus"; break;
    case 9: name = "September"; break;
    case 10: name = "Oktober"; break;
    case 11: name = "November"; break;
    case 12: name = "Desember"; break;
    default: name="Invalid"; break;/* handle invalid */
}

// Multi-Label
switch (month) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
    case 4: case 6: case 9: case 11: days = 30; break;
    case 2: days = iseLeap(year)?29:28; break;
    default; /* handle invalid */
}