//boite de dialog

import java.util.ArrayList;
public class Main
{
  public static void main (String[]args)
  {

    ArrayList<Personne> personne = new ArrayList<Personne>();
    Male m1 = new Male();
    Male m2 = new Male();
    Female f1 = new Female();
    Female f2 = new Female();
    
    personne.add(m1);personne.add(m2);personne.add(f1);personne.add(f2);
    for(Personne p: personne){
        p.uriner();
    }
  }


}
