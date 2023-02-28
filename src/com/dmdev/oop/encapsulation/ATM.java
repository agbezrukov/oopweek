package com.dmdev.oop.encapsulation;

public class ATM {

    private final int TEN_BANKNOTES = 10;
    private final int TWENTY_BANKNOTES = 20;
    private final int FIFTY_BANKNOTES = 50;

    private int banknotes50;
    private int banknotes20;
    private int banknotes10;

    public ATM(int banknotes50, int banknotes20, int banknotes10) {
        this.banknotes50 = banknotes50;
        this.banknotes20 = banknotes20;
        this.banknotes10 = banknotes10;
    }

    public void cashIn(int totalBanknotes) {
        setBanknotes50(getBanknotes50() + totalBanknotes / FIFTY_BANKNOTES);
        setBanknotes20(getBanknotes20() + totalBanknotes % FIFTY_BANKNOTES / TWENTY_BANKNOTES);
        setBanknotes10(getBanknotes10() + totalBanknotes % FIFTY_BANKNOTES % TWENTY_BANKNOTES / TEN_BANKNOTES);
    }

    public boolean isCashOut(int totalBanknotes) {

        if (totalBanknotes > balanceATM()) {
            System.out.println("Недостаточно денег");
            return false;
        }

        int fiftyBanknotes = 0;
        int twentyBanknotes = 0;
        int tenBanknotes = 0;

        while (totalBanknotes > 0) {
            if (getBanknotes50() > 0 && totalBanknotes / FIFTY_BANKNOTES > 0) {
                setBanknotes50(getBanknotes50() - 1);
                totalBanknotes -= getBanknotes50() * FIFTY_BANKNOTES;
                fiftyBanknotes++;
            } else if (getBanknotes20() > 0 && totalBanknotes / TWENTY_BANKNOTES > 0) {
                setBanknotes20(getBanknotes20() - 1);
                totalBanknotes -= getBanknotes20() * TWENTY_BANKNOTES;
                twentyBanknotes++;
            } else {
                setBanknotes10(getBanknotes10() - 1);
                totalBanknotes -= getBanknotes10() * TEN_BANKNOTES;
                tenBanknotes++;
            }
        }
        System.out.println("Операция выполнена успешно");
        System.out.println("Номинал | Кол-во |Сумма");
        if (fiftyBanknotes > 0) {
            System.out.println(FIFTY_BANKNOTES + "      |      " + fiftyBanknotes + " | " + FIFTY_BANKNOTES * fiftyBanknotes);
        }
        if (twentyBanknotes > 0) {
            System.out.println(TWENTY_BANKNOTES + "      |      " + twentyBanknotes + " | " + FIFTY_BANKNOTES * twentyBanknotes);
        }
        if (tenBanknotes > 0) {
            System.out.println(TEN_BANKNOTES + "      |      " + tenBanknotes + " | " + TEN_BANKNOTES * tenBanknotes);
        }

        return true;
    }

    public int balanceATM() {
        return getBanknotes50() * FIFTY_BANKNOTES + getBanknotes20() * TWENTY_BANKNOTES + getBanknotes10() * TEN_BANKNOTES;
    }

    public int getBanknotes10() {
        return banknotes10;
    }

    public void setBanknotes10(int banknotes10) {
        this.banknotes10 = banknotes10;
    }

    public int getBanknotes20() {
        return banknotes20;
    }

    public void setBanknotes20(int banknotes20) {
        this.banknotes20 = banknotes20;

    }

    public int getBanknotes50() {
        return banknotes50;
    }

    public void setBanknotes50(int banknotes50) {
        this.banknotes50 = banknotes50;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "banknotes10=" + banknotes10 +
                ", banknotes20=" + banknotes20 +
                ", banknotes50=" + banknotes50 +
                '}';
    }
}
