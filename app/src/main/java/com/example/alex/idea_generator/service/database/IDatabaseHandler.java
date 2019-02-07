package com.example.alex.idea_generator.service.database;

import com.example.alex.idea_generator.ideas.IdeaStructure;

import java.util.List;

public interface IDatabaseHandler {
    public void addContact(IdeaStructure ideaStructure);
    public IdeaStructure getContact(int id);
    public List<IdeaStructure> getAllContacts();
    public int getContactsCount();
    public int updateContact(IdeaStructure ideaStructure);
    public void deleteContact(IdeaStructure ideaStructure);
    public void deleteAll();
}
