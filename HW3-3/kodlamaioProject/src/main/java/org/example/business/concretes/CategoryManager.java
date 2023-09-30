package org.example.business.concretes;

import org.example.core.ILogger;
import org.example.dataAccess.ICategoryDao;
import org.example.entities.Category;
import org.example.entities.Course;

import java.util.List;
import java.util.logging.Logger;

public class CategoryManager {

    ICategoryDao iCategoryDao;
    ILogger[] loggers;

    public CategoryManager(ICategoryDao iCategoryDao, ILogger[] loggers) {
        this.iCategoryDao = iCategoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        List<Category> categories = iCategoryDao.getAll();
        if (categories != null) {
            for (Category category1 : categories) {
                if (category1.getName() == category.getName()) {
                    System.out.println("You cannot save a category with the same name.");
                    return;
                }
            }
        }
        log(category.getName());
        iCategoryDao.add(category);
    }


    public List<Category> getAll() {
        return iCategoryDao.getAll();
    }


    public void update(Category category) {
        iCategoryDao.update(category);
    }


    public void delete(Category category) {
        iCategoryDao.delete(category);
    }


    public Category getById(int id) {
        Category category = iCategoryDao.getById(id);
        System.out.println(category.getName());
        return iCategoryDao.getById(id);
    }

    public void log(String message) {
        for (ILogger logger : loggers) {
            logger.Log(message);
        }
    }
}
