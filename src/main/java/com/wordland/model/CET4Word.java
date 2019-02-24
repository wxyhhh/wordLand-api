package com.wordland.model;

public class CET4Word {
    private Integer id;

    private Integer cet4Num;

    private String cet4Word;

    private String cet4Describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCet4Num() {
        return cet4Num;
    }

    public void setCet4Num(Integer cet4Num) {
        this.cet4Num = cet4Num;
    }

    public String getCet4Word() {
        return cet4Word;
    }

    public void setCet4Word(String cet4Word) {
        this.cet4Word = cet4Word == null ? null : cet4Word.trim();
    }

    public String getCet4Describe() {
        return cet4Describe;
    }

    public void setCet4Describe(String cet4Describe) {
        this.cet4Describe = cet4Describe == null ? null : cet4Describe.trim();
    }
}