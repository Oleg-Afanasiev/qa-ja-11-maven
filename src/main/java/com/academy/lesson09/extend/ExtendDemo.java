package com.academy.lesson09.extend;

public class ExtendDemo {
    public static void main(String[] args) {
        ContainerExt<Integer> cont1 = new ContainerExt<>();
        cont1.setElement(123);
        Integer number = cont1.getElement();
        System.out.println(number + 1);

        // ContainerExt<String> cont2 = new ContainerExt<>(); // Ошибка компиляции
    }
}
