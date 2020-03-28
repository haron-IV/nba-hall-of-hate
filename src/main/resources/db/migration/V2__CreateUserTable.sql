CREATE TABLE public.users
(
    user_id bigint NOT NULL,
    username character varying(25) UNIQUE,
    CONSTRAINT user_id_pk PRIMARY KEY (user_id)
);

ALTER TABLE public.users
    OWNER to ipxqayfdetskjg;