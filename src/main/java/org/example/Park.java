package org.example;

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Attraction {
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkTime() {
            return workTime;
        }

        public int getPrice() {
            return price;
        }
    }
}
