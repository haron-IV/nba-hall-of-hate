CREATE ROLE koder admin;

CREATE TABLE public.player
(
    player_id bigint NOT NULL,
    views bigint default 0,
    name character varying(30),
    surname character varying(30),
    jersey_number integer,
    height character varying(6),
    birth_date character varying(10),
    hate_count bigint,
    respect_count bigint,
    follow_count integer,
    CONSTRAINT player_id_pk PRIMARY KEY (player_id)
);

ALTER TABLE public.player
    OWNER to koder;