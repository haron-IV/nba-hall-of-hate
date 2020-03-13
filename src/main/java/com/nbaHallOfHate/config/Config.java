package com.nbaHallOfHate.config;

public class Config {
    public String dev = "http://localhost:8081";
    public String prod = "prod_url";
    public String host;

    public Config(String env) {
        this.host = this.setHost(env);
    }

    public String getDev() {
        return dev;
    }

    public String getProd() {
        return prod;
    }

    public String getHost() {
        return this.host;
    }

    public String setHost(String env) {
        switch (env) {
            case "dev":
                this.host = this.getDev();

            case "prod":
                this.host = this.getProd();
        }

        return this.getHost();
    }




}
