// Break unlabeled
int[] a={32, 87, 3, 589, 12};
int target=12; int idx=-1
for(int i=0; i<a.length; i++) {
    if(a[i] == target) {
        idx=i;
        break; // keluar dari loop
    }
}

// Break berlabel
for(int i=0; i<m.length; i++) {
    for(int j=0; j<m[i].length; j++) {
        if(m[i][j] == target) {
            found=true;
            break search; // keluar dari loop luar
        }
    }
}