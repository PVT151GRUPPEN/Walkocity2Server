package com.example.Walkocity.accessingdatamysql;

public enum Category {
    TOILET(1), TRASHCAN(2);
    private final int categoryOption;

    private Category(int categoryOption) {
        this.categoryOption = categoryOption;
    }
    public int getCategoryOption() {
        return categoryOption;
    }
}
