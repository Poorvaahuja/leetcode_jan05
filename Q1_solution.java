//simulate the iteration through the matrix, going from left to right in each row and wrapping around to the next row when hte end of a row is reached,
// flip method provides the current indices in a linear fashion, imitating the traversal
class Solution {
    int i=0,j=0; // variables representing current row and column
     int m=0;int n=0; // intitialized with the input dimension of the matrix
    public Solution(int m, int n) {
        this.m=m;
        this.n=n;
    }
    public int[] flip() {
        j++; //increment the column index with each call
        if(j==n){ // if j becomes equal to n, reset j to 0 and increment the row index
            j=0;
            i++;
        }
        if(i==m){
            i=0; // if i equals ot m, reset both i and j to 0
            j=0;
        }
        return new int[]{i,j};   // return the current indices {i,j}
    }
    public void reset() {       
    }
}
