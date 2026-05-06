public boolean checkDraw() {
    char[][] b = getBoard();
    int filled = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (b[i][j] != ' ') {
                filled++;
            }
        }
    }

    return filled == 9;
}