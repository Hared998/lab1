public class Quest implements Observer {
    private String itemName;
    private int requiredCount;
    private int currentCount;
    private Subject subject

    public Quest(String itemName, int requiredCount, Subject subject) {
        this.itemName = itemName;
        this.requiredCount = requiredCount;
        this.currentCount = 0;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String item, int count) {
        if (item.equals(itemName)) {
            currentCount = count;
            checkCompletion();
        }
    }

    private void checkCompletion() {
        if (currentCount >= requiredCount) {
            System.out.println("Zadanie ukończone: Zbierz " + requiredCount + " " + itemName + "(y)");

            this.subject.removeObserver(this);
            // Here you would remove this quest from the observer list in Inventory
        } else {
            System.out.println("Postęp zadania: " + currentCount + "/" + requiredCount + " " + itemName + "(y)");
        }
    }

    public String getItemName() {
        return itemName;
    }

    public int getRequiredCount() {
        return requiredCount;
    }
}
