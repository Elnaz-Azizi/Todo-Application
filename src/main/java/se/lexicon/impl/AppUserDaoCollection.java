package se.lexicon.impl;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


public class AppUserDaoCollection implements AppUserDao {
    private Collection<AppUser> users;

    public AppUserDaoCollection() {
        this.users = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null || appUser.getUserName() == null || appUser.getUserName().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
            Optional<AppUser> appUserOptional = findByUsername(appUser.getUserName());
            throw new IllegalArgumentException("Username is duplicate.");
            users.add(appUser);

            return appUser;
        }



        @Override
        public Optional<AppUser> findByUsername(String username){
            for (AppUser appUser : users) {
                if (appUser.getUserName().equals(username)) {
                    return Optional.of(appUser);
                }
            }
            return Optional.empty();
        }

        @Override
        public Collection<AppUser> findAll () {

            return new ArrayList<>(users);
        }

        @Override
        public void remove (String username){
            Optional<AppUser> appUserOptional = findByUsername(username);
            if (appUserOptional.isPresent()) {
                users.remove(appUserOptional.get());
            } else {
                throw new IllegalArgumentException("Username not found.");
            }
        }
    }


