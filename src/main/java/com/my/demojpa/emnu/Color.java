package com.my.demojpa.emnu;

public enum Color {
    RED("红色"){
        @Override
        public String getMessage() {
            return "[RED]"+this;
        }
    },GREED("蓝色"){
        @Override
        public String getMessage() {
            return "[GREED]"+this;
        }
    },BLUE("蓝色") {
        @Override
        public String getMessage() {
            return "BLUE"+this;
        }
    };
    private String title;

    private Color(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public abstract String getMessage();
}
