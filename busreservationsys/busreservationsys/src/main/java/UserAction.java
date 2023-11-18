/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cool
 */
import java.io.*;
public class UserAction {
 public static void add(User ob1)throws Exception
 {
 File f = new File("user.txt");
 try {
 if(f.length()==0)
 {
 ObjectOutputStream oos= new
ObjectOutputStream(new FileOutputStream("users.txt", true));
 oos.writeObject(ob1);
 oos.close();
 }
 else{
 MyObjectOutputStream oos = new
MyObjectOutputStream(new FileOutputStream("users.txt",
true));
 oos.writeObject(ob1);
 oos.close();
 }
 }
 catch (Exception e) {
 System.out.println("Error Occurred" + e);
 } }
 public static boolean search(String u,String p)throws Exception
 {
 ObjectInputStream fread=new ObjectInputStream(new FileInputStream("user.txt"));
 User ob;
 while(true)
 {
 try
 {
 ob=(User)fread.readObject();
 if(ob.uname.equals(u)&& ob.pword.equals(p))
 {
 fread.close();
 return true;
 } }
 catch(EOFException e)
 {
 break;
 } }
 fread.close();
 return false; } } 
