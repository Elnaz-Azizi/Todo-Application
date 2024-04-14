package se.lexicon.impl;

import se.lexicon.model.TodoItem;
import se.lexicon.sequencers.TodoItemIdSequencer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class TodoItemDaoCollection implements TodoItemDao {
    private Collection<TodoItem> todoItemRepository;

    public TodoItemDaoCollection() {
        todoItemRepository = new ArrayList<>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("Todo item cannot be null.");
        todoItem.setId(TodoItemIdSequencer.nextId());
        todoItemRepository.add(todoItem);
        return todoItem;
    }

    @Override
    public Optional<TodoItem> findById(int id) {
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.getId() == id) {
                return Optional.of(todoItem);
            }
        }

        return Optional.empty();
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItemRepository);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> doneTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.isDone() == done) {
                doneTodoItems.add(todoItem);
            }
        }
        return doneTodoItems;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        List<TodoItem> titleTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.getTitle().equals(titleTodoItems)) {
                titleTodoItems.add(todoItem);
            }
        }
        return titleTodoItems;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        List<TodoItem> filteredTodoItemsByPersonId = new ArrayList<>();
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.getCreator().getId() == personId) {
                filteredTodoItemsByPersonId.add(todoItem);
            }
        }
        return filteredTodoItemsByPersonId;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        List<TodoItem> filteredTodoItemsByDeadlineBefore = new ArrayList<>();
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.getDeadLine().isBefore(date)) {
                filteredTodoItemsByDeadlineBefore.add(todoItem);
            }
        }
        return filteredTodoItemsByDeadlineBefore;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        List<TodoItem> filteredTodoItemsByDeadlineAfter = new ArrayList<>();
        for (TodoItem todoItem : todoItemRepository) {
            if (todoItem.getDeadLine().isAfter(date)) {
                filteredTodoItemsByDeadlineAfter.add(todoItem);
            }
        }
        return filteredTodoItemsByDeadlineAfter;
    }

    @Override
    public void remove(int id) {
        Optional<TodoItem> foundById = findById(id);
        if (!foundById.isPresent()) {
            throw new IllegalArgumentException("Id not found");
        }
        todoItemRepository.remove(foundById.get());

    }
}
