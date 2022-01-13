package com.ajay.BitwiseOperater;

public class FlipImage {
    public static void main(String[] args) {

    }
    static int [] [] find(int [] [] image){
        for(int i=0; i<=image.length-1;i++){
            for(int j=0; j<(image[i].length +1 )/2; j++){
                int temp = image[i][j] ^ 1;
                int value = image[i].length-1-j;
                image[i][j] = image[i][value] ^ 1;
                image[i][value] = temp;
            }
        }
        return image;
    }
}
