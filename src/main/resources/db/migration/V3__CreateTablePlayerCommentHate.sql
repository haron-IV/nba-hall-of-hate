CREATE TABLE public.player_comment_hate
(
    comment_id SERIAL PRIMARY KEY,
    player_id bigint NOT NULL,
    author character varying(25) NOT NULL,
    author_id bigint NOT NULL,
    created_date date,
    content character varying(500),
    comment_like integer,
    comment_dislike integer,
    CONSTRAINT player_id_fk FOREIGN KEY (player_id)
    REFERENCES public.player (player_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT user_id_fk FOREIGN KEY (author_id)
    REFERENCES public.users (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE public.player_comment_hate
    OWNER to ipxqayfdetskjg;