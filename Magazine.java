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
    private String issueNumber;
    private int publicationFrequency;
    private String editor;
    
    public Magazine(String title,String ISBN){
        super(title,ISBN);
    }
    
    //Setter and getters
    public String getIssueNumber(){
        return this.issueNumber;
    }
    
     public String getEditor(){
        return this.editor;
    }
    
    public int getPublicationFrequency(){
        return this.publicationFrequency;
    }
   
    public void setIssueNumber(String issueNumber){
        this.issueNumber=issueNumber;
    }
    
    public void setEditor(String editor){
        this.editor=editor;
    }
    
    public void setPulicationFrequency(int publicationFrequency){
        this.publicationFrequency = publicationFrequency;
    }
    
    @Override
    public String toString(){
        return super.toString()+", Issue Number = "+this.getIssueNumber()+", Editor = "+this.getEditor()+", Publicatioon Frequency = "+this.getPublicationFrequency();
    }
    
}
