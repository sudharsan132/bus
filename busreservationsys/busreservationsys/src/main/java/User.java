/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cool
 */
import java.io.*;
class MyObjectOutputStream extends ObjectOutputStream {
 MyObjectOutputStream() throws IOException
 {
 super();
 }
 MyObjectOutputStream(OutputStream o) throws IOException
{
 super(o); }
 public void writeStreamHeader() throws IOException
 { }
}
public class User implements Serializable{
 String name,gender,uname,pword;
 public User(String n,String g, String u,String p)
 {
 name=n;
 gender=g;
 uname=u;
 pword=p;
 } }
