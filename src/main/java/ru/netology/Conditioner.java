package ru.netology;

import lombok.Data;

@Data
public class Conditioner {

    public int minTemperature;
    public int maxTemperature = 30;   // инициализация это именно присваивание значения полю.
    private int currentTemperature;

    public Conditioner(int maxTemperature) {     // создаем конструктор с одиним параметром
        this.maxTemperature = maxTemperature;
    }

    public Conditioner() {   // дефолтный конструктор
    }

    public Conditioner(int minTemperature, int maxTemperature) { // конструктор с двумя полями
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }
//    public int getCurrentTemperature() {         // Alt + Insert - create new getter/setter
//        return currentTemperature;
//    }

    public void setCurrentTemperature(int currentTemperature) {  // setCurrentTemperature(int currentTemperature) - сигнатура метода (название метода + аргумент который он принимает
        if (currentTemperature < minTemperature) {
            return;
        }
        if (currentTemperature > maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }
}
