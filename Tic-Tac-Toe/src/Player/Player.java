package Player;

import Pieces.Piece;
import Pieces.PieceType;

public class Player{
    public Integer playerId;
    public Piece piece;
    public Player(Integer playerId, Piece piece){
        this.playerId=playerId;
        this.piece=piece;
    }
}
