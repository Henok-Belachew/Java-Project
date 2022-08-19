/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Henok's Pc
 */
class Books {
    private int num; 
    private String BookTitle, BookEdition; 
    public Books(int num, String BookTitle, String BookEdition){
        this.num = num; 
        this.BookTitle = BookTitle; 
        this.BookEdition = BookEdition; 
    }
    
    public int getnum (){
        return num;
    }
    public String BookTitle (){
        return BookTitle;
    }
    public String BookEdition (){
        return BookEdition; 
    }
    
}
