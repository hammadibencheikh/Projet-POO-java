public class Etagere{
Livre[] l ;
int i=1,n ;
public Etagere(int n){
	this.n=n ;
l=new Livre[n] ;
}
public void nblivre(){
System.out.println("L'etagere contient "+(i-1)+" Livres et elle peut contenir encore "+(n-i+1)) ;
}
public boolean ajouter(Livre ll){
l[i]=ll ;
i++ ;
return true ;
}
public Livre getLivre(int p){
return l[p] ;
}
public int chercher(String a,String t){
	for(int j=1;j<=i;j++){
		if ((l[j].getTitre().equals(a))&&(l[j].getAuteur()==a))
			return j ;
	}
	return 0 ;
}
public Livre[] rechercheauteur(String a){
	Livre[] ll=new Livre[n] ;
	int k=1;
	for (int j=1;j<=i;i++){
		if(l[j].getAuteur().equals(a)){
			ll[k]=l[j] ;
			k++ ;
		}
			
	}
		return ll ;
}
public Livre[] recherchetitre(String t){
	Livre[] ll=new Livre[n] ;
	int k=1;
	for (int j=1;j<=i;i++){
		if(l[j].getTitre().equals(t)){
			ll[k]=l[j] ;
			k++ ;
		}
			
	}
		i-- ;
		return ll ;

}
Livre enleverLivre(int p){
	Livre ll;
	if((p>i)||(p<1))
		return null ;
	ll=l[p] ;
	for(int j=i ;j>=p;j--){
		l[j-1]=l[j] ;
	}
	i-- ;
	return ll ;
	
}
Livre enleverLivre(String a, String t){
	int p=chercher(a,t) ;
	if (p==0)
		return null ;
	Livre ll=l[p] ;
	for(int j=i ;j>=p;j--){
		l[j-1]=l[j] ;
	}
	return ll ;
}
public Livre enlever(int p) {
	Livre ll ;
	ll=l[p] ;
	l[p]=l[i] ;
	i-- ;
	return ll ;
}
public Livre enlever(String a,String t){
	int p=chercher(a,t) ;
	Livre ll=l[p] ;
	l[p]=l[i] ;
	i-- ;
	return ll ;
}
public static void main(String[] args){
	Livre l=new Livre("Livre a","Auteur a",50,500) ;
	Livre l2=new Livre("Livre b","Auteur b",55,1000) ;
	Livre l3=new Livre("Livre c","Auteur c",100,300) ;
	Livre l4=new Livre("Livre d","Auteur d",20,200) ;
	Etagere e=new Etagere(50) ;
	Etagere e2=new Etagere(50) ;
	e.ajouter(l) ;
	e.ajouter(l2) ;
	e2.ajouter(l3) ;
	e2.ajouter(l4) ;
	System.out.println(e.getLivre(1)) ;
	e.enlever(e.getLivre(1).getAuteur(),e.getLivre(1).getTitre()) ;
}
}