package OOP.TaskFive.Entity;

import java.util.Objects;

public class Gift {
    private final String message;
    private final Sweets sweets;
    private final Package aPackage;

    private Gift(Builder builder){
        this.message = builder.message;
        this.sweets = builder.sweets;
        this.aPackage = builder.aPackage;
    }

    public static class Builder {

        private final String message;
        private Sweets sweets;
        private Package aPackage;

        public Builder(String message){
            if (message == null){
                System.out.println("Имя получателя подарка не может быть пустым");
            }
            this.message = message;
        }

        public Builder sweets(Sweets sweets){
            this.sweets = sweets;
            return this;
        }

        public Builder inPackage(Package aPackage){
            this.aPackage = aPackage;
            return this;
        }

        public Gift build(){
            return new Gift(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(message, gift.message) &&
                sweets == gift.sweets &&
                aPackage == gift.aPackage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, sweets, aPackage);
    }

    @Override
    public String toString() {
        if (message.equals("")) return "Сладость " + sweets.getSweetTag() +
                " в упакове " + aPackage.getPackageTag() +
                " без сообщения";
        return "Сладость " + sweets.getSweetTag() +
                " в упакове " + aPackage.getPackageTag() +
                " с сообщением \n\"" + message + "\"";
    }
}
