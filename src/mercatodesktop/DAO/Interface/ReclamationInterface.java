/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Reclamation;

/**
 *
 * @author PC-Yassine
 */
public interface ReclamationInterface {
    public void addReclamation(Reclamation r);
    public Reclamation getReclamationById(int id);
    public void deleteReclamation(Reclamation r);
    public void modifyReclamation(Reclamation r);
    public List<Reclamation> showAll();
    public List<Reclamation> search(Reclamation r);
    public List<Reclamation> getReclamationByUserId(int user_id);
    public List<Reclamation> getReclamationByType(String type);
    public List<Reclamation> getReclamationByProblemeStatus(Reclamation r,String problemeStatus);
    public List<Reclamation> sortReclamation();
    
}
