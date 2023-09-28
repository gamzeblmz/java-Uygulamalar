package org.example.business.concretes;

import org.example.dataAccess.ICategoryDao;
import org.example.entities.Category;
import org.example.entities.Course;

import java.util.List;

public class CategoryManager {

    ICategoryDao iCategoryDao;

    public CategoryManager(ICategoryDao iCategoryDao) {
        this.iCategoryDao = iCategoryDao;
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
}
