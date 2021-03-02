CREATE TABLE Player(
    PId INTEGER          CONSTRAINT player_pid_pk PRIMARY KEY,
    PName VARCHAR2(20)   CONSTRAINT player_name_nn NOT NULL,
    Ranking INTEGER
)