package se.lexicon.impl;

import se.lexicon.model.AppUser;

import java.util.Collection;
import java.util.Optional;

public interface AppUserDao {

    AppUser persist(AppUser appUser);
    Optional<AppUser> findByUsername (String username);
    Collection<AppUser> findAll();
    void remove (String username);

}
