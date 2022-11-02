package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepostiry;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {


    LanguageRepostiry languageRepostiry;


    public LanguageManager(LanguageRepostiry languageRepostiry) {
        
        this.languageRepostiry = languageRepostiry;
    }

    @Override
    public void add(Language language) {

    }

    @Override
    public void delete(Language language) {

    }

    @Override
    public void update(Language language, int id) {

    }

    @Override
    public List<Language> getAll() {
        return null;
    }
}
