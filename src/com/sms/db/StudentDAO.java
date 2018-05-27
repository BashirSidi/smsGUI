/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.db;

import com.sms.business.Student;
import java.util.List;

/**
 *
 * @author JSIIT
 */
public interface StudentDAO {
    Student get(String id);
    List<Student> gets();
    boolean add(Student s);
    boolean edit(Student s);
    boolean delete(Student s);
}
