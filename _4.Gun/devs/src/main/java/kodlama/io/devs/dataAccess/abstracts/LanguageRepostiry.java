package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LanguageRepostiry {
    void add(Language language);
    void delete(Language language);
    void update(Language language,int id);
    List<Language> getAll();
}
