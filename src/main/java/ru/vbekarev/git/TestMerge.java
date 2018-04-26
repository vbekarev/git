package ru.vbekarev.git;

public enum TestMerge {
    FIRST("one_first"),
    SECOND("one_second");

    private String name;

    TestMerge(String name) {
        this.name = name;
    }
}
