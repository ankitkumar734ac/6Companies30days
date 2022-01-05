class Q_SquaresInNNChessboard{
	static Long squaresInChessBoard(Long N) {
        if(N==1) return 1L;
        return (N*N)+squaresInChessBoard(N-1);
        //return (n*(n+1)*((2*n)+1))/6;
    }
}