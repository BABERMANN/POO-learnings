package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Video video = new Video("eredin tira 10 em POO entenda");

        video.curtirVideo();
        video.curtirVideo();

        System.out.println(video.Getsaldo());
    }
}