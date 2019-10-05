package com.bridgelabz.collable.services;

import com.bridgelabz.collable.model.Student;

public interface CallableImpl
{
 public int insertDataCollable(Student student);
 public void readDataCollable();
 public int updateDataCollable(int id, Student student);
 public int deleteDataCollable(int id);

}
