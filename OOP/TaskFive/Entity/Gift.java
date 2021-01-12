package OOP.TaskFive.Entity;

public class Gift {
    private final String personName;
    private final Sweets sweets;
    private final Package aPackage;

    private Gift(Builder builder){
        this.personName = builder.personName;
        this.sweets = builder.sweets;
        this.aPackage = builder.aPackage;
    }

    public static class Builder {

        private final String personName;
        private Sweets sweets;
        private Package aPackage;

        public Builder(String personName){
            if (personName == null){
                System.out.println("Имя получателя подарка не может быть пустым");
            }
            this.personName = personName;
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
}
