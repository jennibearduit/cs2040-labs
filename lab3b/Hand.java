public class Hand {
    public int player;
    public int state;   // state 1 = hands folded
                        // state 2 = hands split into fists
                        // state 3 = palms down
                        // state 4 = hands behind back

    public Hand(int player, int state) {
        this.player = player;
        this.state = state;
    }

    public int getPlayer() {
        return player;
    }
    
    public int getState() {
        return state;
    }
}