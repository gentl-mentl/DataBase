package com.company;

import parson.Group;
import parson.Parson;

import  java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

       Group t1=new Group(2);
       t1.addParson("misha","j",9);
        t1.addParson("anton","2",9);
        t1.searchPerson("j");
        t1.deletePerson("maks");
        t1.displayParson();

    }
}
