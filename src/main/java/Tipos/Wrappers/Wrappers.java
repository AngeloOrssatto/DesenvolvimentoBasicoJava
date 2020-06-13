package Tipos.Wrappers;

public class Wrappers {

    public static void main(String[] args){

        //Wrappers são objetos dos tipos primitivos
        //permitem valores nulos e disponibilizam metodos uteis

        Byte b;
        Character c;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Boolean bo;

        i = Integer.valueOf(1);
        bo = Boolean.TRUE;

        System.out.println(i);
        System.out.println(bo);
    }
}
