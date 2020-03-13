CREATE TABLE public.player
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name character varying(30),
    surname character varying(30),
    jersey_number integer,
    height character varying(6),
    birth_date date,
    hate_count bigint,
    respect_count bigint,
    follow_count integer
);

ALTER TABLE public.player
    OWNER to koder;