-- Table: public.stocks

-- DROP TABLE IF EXISTS public.stocks;

CREATE TABLE IF NOT EXISTS public.stocks
(
    stockname character varying(40) COLLATE pg_catalog."default"
    fthigh double precision,
    ftlow double precision,
    buyprice double precision,
    sellprice double precision,
    margin double precision,
    profitpercent double precision,
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.stocks
    OWNER to postgres;


-- Table: public.mystock

-- DROP TABLE IF EXISTS public.mystock;

CREATE TABLE IF NOT EXISTS public.mystock
(
    stockname character varying(40) COLLATE pg_catalog."default",
    buyprice double precision,
    sellprice double precision,
    margin double precision,
    profitpercent double precision
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.mystock
    OWNER to postgres;