package org.gustavojesus;

import java.util.ArrayList;
import java.util.List;

class DuplicateList {
    private List<String> originalList;
    private List<String> filteredList;
    private List<String> duplicatesList;

    public DuplicateList() {
        this.originalList = new ArrayList<>();
        this.filteredList = new ArrayList<>();
        this.duplicatesList = new ArrayList<>();
    }

    public void addElement(String element) {
        originalList.add(element);
    }

    public void processLists() {
        for (String element : originalList) {
            if (!filteredList.contains(element)) {
                filteredList.add(element);
            } else {
                if (!duplicatesList.contains(element)) {
                    duplicatesList.add(element);
                }
            }
        }
    }

    public List<String> getFilteredList() {
        return filteredList;
    }

    public List<String> getDuplicatesList() {
        return duplicatesList;
    }

    public List<String> getOriginalList() {
        return originalList;
    }
}