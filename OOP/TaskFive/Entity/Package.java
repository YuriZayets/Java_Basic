package OOP.TaskFive.Entity;

public enum Package {
    PAPER_BOX("Бумажная коробка", 3), CORRUGATED_BOX("Картонная коробка", 3),

    PLASTIC_BOX("Пластиковая коробка", 2), RIGID_BOX("Плотная бумажная коробка", 2),

    FOIL_SEALED_BAG("Герметичный мешочек из фольги", 2), PLASTIC_BAG("Пластиковый пакет", 1),

    PAPER_BAG("Бумажный пакетик", 1);

    private int size;
    private String tag;

    Package(String tag, int size) {
        this.tag = tag;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getPackageTag() {
        return tag;
    }
}

