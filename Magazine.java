/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

/**
 *
 * @author User
 */
public class Magazine extends Item{
    
    //Instance variables
    private String editor;
    private int publicationFreq;
    private int issueNumber;
    
    //Constructor
    public Magazine(String title,String ISBN){
        super(title,ISBN);
    }
    
    //Getters and setrers
    public String getEditor(){
        return this.editor;
    }
    
    public int getPublicationFreq(){
        return this.publicationFreq;
    }
    
    public int getIssueNumber(){
        return this.issueNumber;
    }
    
    public void setEditor(String editor){
        this.editor = editor;
    }
    
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
    
    public void setPublicationFreq(int publicationFreq){
        this.publicationFreq = publicationFreq;
    }
    
    @Override
    public String toString(){
        return super.toString()+", Editor : "+this.editor+", Issue Number : "+this.issueNumber+", Publication Frequency : "+this.publicationFreq;
    }
    
}
