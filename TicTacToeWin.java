public boolean checkWin(char s) {
    char[][] b = getBoard();

    for (int i = 0; i < 3; i++) {
        if ((b[i][0]==s && b[i][1]==s && b[i][2]==s) || 
            (b[0][i]==s && b[1][i]==s && b[2][i]==s)) {
            return true;
        }
    }

    return (b[0][0]==s && b[1][1]==s && b[2][2]==s) ||
           (b[0][2]==s && b[1][1]==s && b[2][0]==s);
}