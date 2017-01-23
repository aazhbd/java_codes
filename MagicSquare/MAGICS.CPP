#include <stdio.h>
#include <conio.h>

int a[20][20];

void main(){
	clrscr();
	int t, n, x, y, i, j, k, l;
	printf("Enter an odd number less then 20\n(One would be added with even numbers)\n");
	scanf("%d", &t);
	if(t%2==0) t=t+1;
	n=t-1;
	y=n;
	x=y/2;
	j=t*t;
	a[x][y]=1;
	for(i=2; i<=j; i++){
		x=x-1;
		y=y+1;
		if(x>-1 && y>n) y=0;
		if(x<0 && y<=n) x=n;
		if(a[x][y]){
			y=y-2;
			x=x+1;
		}
		if(x<0 && y>n){
			x=x+1;
			y=y-2;
		}
		a[x][y]=i;
	}
	printf("The MagicSquare is:\n\n\n\n");
	for(k=0; k<t; k++){
		for(l=0; l<t; l++){
			printf("%d\t", a[k][l]);
		}
		printf("\n\n\n");
	}
	getch();
}