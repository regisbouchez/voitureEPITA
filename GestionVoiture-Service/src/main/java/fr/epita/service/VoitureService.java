package fr.epita.service;

import fr.epita.entite.VoitureEntite;
import fr.epita.persitance.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {
    @Autowired
    VoitureRepository voitureRepository;

    public void creerVoiture (VoitureEntite voiture) {
       voitureRepository.save(voiture);
    }
    public String afficherVoiture () {
        return " dans intellIJ";
    }
}
