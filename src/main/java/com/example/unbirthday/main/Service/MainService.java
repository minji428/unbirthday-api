package com.example.unbirthday.main.Service;

import com.example.unbirthday.main.Dao.MainDao;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    final
    MainDao mainDao;

    public MainService(MainDao mainDao) {
        this.mainDao = mainDao;
    }

}
