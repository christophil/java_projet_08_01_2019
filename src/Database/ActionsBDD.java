package Database;

import java.util.ArrayList;

public interface ActionsBDD {
    
  public ArrayList getProgrammeurs();
  public Programmeur getProgrammeur(String matricule);
  public int updateProgrammeur(Programmeur prog);
  public boolean addProgrammeur(Programmeur prog);
  public int deleteProgrammeur(String matricule);
    
}
