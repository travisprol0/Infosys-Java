CREATE TABLE Tournament(
    TId     INTEGER CONSTRAINT match_tid_pk PRIMARY KEY,
    TName   VARCHAR(30)  CONSTRAINT table_tname_nn NOT NULL,
    StartDt DATE CONSTRAINT  table_startdt_nn NOT NULL,
    EndDt   DATE CONSTRAINT  table_enddt_nn NOT NULL,
    Prize INTEGER CONSTRAINT table_prize_nn NOT NULL
)