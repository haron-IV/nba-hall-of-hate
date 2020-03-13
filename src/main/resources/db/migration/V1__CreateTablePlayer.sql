CREATE TABLE public.players
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    status text
);

ALTER TABLE public.players
    OWNER to postgres;