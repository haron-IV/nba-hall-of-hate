--CREATE TABLE public.players
--(
--    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
--    status text
--);
--
--ALTER TABLE public.players
--    OWNER to postgres;




CREATE TABLE public.player
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name character varying(50)
);

ALTER TABLE public.player
    OWNER to koder;