package com.example.Walkocity.accessingdatamysql;

public enum StationCategory {
    TOILET(1), TRASHCAN(2);
    private final int categoryOption;

    private StationCategory(int categoryOption) {
        this.categoryOption = categoryOption;
    }
    public int getCategoryOption() {
        return categoryOption;
    }
}
