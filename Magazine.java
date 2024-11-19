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
    
    public Magazine(String title, String ISBN) {
        super(title, ISBN);
    }
    
    //Intance methods
    public String getIssueNubmer(){
        return this.issueNumber;
    }
    
    public int getPublicationFrequency(){
        return this.publicationFrequency;
    }
       
    public void setIssueNumber(String issueNumber){
        this.issueNumber = issueNumber;
    }
    
    public void setPublicationFrequency(int publicationFrequency){
        this.publicationFrequency = publicationFrequency;
    }
    
    
    @Override
    public String toString(){
        return super.toString()+", Publications : "+this.publicationFrequency+", Issue Number : "+this.issueNumber;
    }
}
