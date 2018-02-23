int i, j ,k;

for(i = 0 ; i < n ; i++){
    for(j = 0 ; j < n ; j++){
        r[i][j]=0;
        for(k = 0; k < n ; k++){
          r[i][j] += a[i][k] * b[k][j];
        }
    }
}

2 + 2n + 2(2 + 2n + 1n + n( 2 + 2n +3n ) )
2 + 2n + n (2 + 3n +2n +2n² + 3n²)
2 + 2n + 2n + 3n² + 2n² + 2n³ + 3n³
2 + 4n + 5n² + 5n³
