public enum Company {
    GOOGLE(1000){
        @Override
        public int getValue() {
            return 10+this.value;
        }
        public String getCurrency(){
            return "dollars";
        }
    },
    YANDEX(500){
        @Override
        public String getCurrency() {
            return "cents";
        }
    },
    SCYNET(10){
        @Override
        public String getCurrency() {
            return "euros";
        }
        @Override
        public String toString() {
            return "Company "+ super.toString();
        }
    };
    int value;
    Company(int value){
        this.value=value;
    }
    public String toString(){
        return "Company "+super.toString()+" salary = "+getValue()+" "+getCurrency();
    }
    public int getValue() {
        return value;
    }
    public abstract String getCurrency();

}