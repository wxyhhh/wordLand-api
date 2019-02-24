package com.wordland.model;

public class CET6Word {
    private Integer id;

    private Integer cet6Num;

    private String cet6Word;

    private String cet6Describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCet6Num() {
        return cet6Num;
    }

    public void setCet6Num(Integer cet6Num) {
        this.cet6Num = cet6Num;
    }

    public String getCet6Word() {
        return cet6Word;
    }

    public void setCet6Word(String cet6Word) {
        this.cet6Word = cet6Word == null ? null : cet6Word.trim();
    }

    public String getCet6Describe() {
        return cet6Describe;
    }

    public void setCet6Describe(String cet6Describe) {
        this.cet6Describe = cet6Describe == null ? null : cet6Describe.trim();
    }
}