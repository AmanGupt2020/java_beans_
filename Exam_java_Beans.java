package com.company;

public class Exam_java_Beans implements java.io.Serializable {
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static void main(String args[]){
        Exam_java_Beans e=new Exam_java_Beans();
        e.setId(5);
        System.out.println(e.getId());
        e.setName("aman");
        System.out.println(e.getName());
    }
}
