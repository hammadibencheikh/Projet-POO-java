public class Livre{
private String titre,auteur ;
private int nbp,prix ;
public Livre(String t,String a,int n,int p){
this.titre=t ;
this.auteur=a ;
this.nbp=n ;
this.prix=p ;
}
public String getTitre(){
	return titre ;
}
public String getAuteur(){
	return auteur ;
}
public int getNbp(){
return nbp ;	
}
public int getPrix(){
	return prix ;
}
public String toString(){
	return ("livre de titre "+titre+" ecrit par "+auteur+" ayant "+nbp+" pages et de prix "+prix+" Dinars") ;
}
public void setTitre(String t){
	titre=t ;
}
public void setAuteur(String a){
	auteur=a ;
}
public void setNbp(int n){
	nbp=n ;
}
public void setPrix(int p){
	prix=p ;
}
}