CREATE TABLE Match(
    MId INTEGER,
    TId INTEGER             CONSTRAINT match_tid_fk REFERENCES Tournament(TId),
    Player1 INTEGER         CONSTRAINT match_player1_pid REFERENCES Player(PId),
    Player2 INTEGER         CONSTRAINT match_player2_pid REFERENCES Player(PId),
    CONSTRAINT p1_notequal_p2 CHECK (Player1 <> Player2),
    MatchDt DATE            CONSTRAINT match_dt_nn NOT NULL,
    Winner INTEGER          CONSTRAINT match_winner_pid REFERENCES Player(PId),
    Score VARCHAR2(30)      CONSTRAINT match_score_nn NOT NULL,
    CONSTRAINT match_mid_tid_pk PRIMARY KEY(MId, TId)
);