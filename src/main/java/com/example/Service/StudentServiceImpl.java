package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.StudentDao;
//import com.example.Dao.IStudentDao;
//import com.example.Dao.StudentDao;
import com.example.Model.StudentDto;

@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private StudentDao dao;
	
	public List<StudentDto> GetListStudent() {
		return dao.GetListStudent();
	}

	public void insert(StudentDto obj) {
		dao.insert(obj);
	}

	public StudentDto findById(int idStudent) {
		return dao.findById(idStudent);
	}

	public void update(StudentDto obj) {
		dao.update(obj);
	}

	public void delete(Integer id) {
		dao.delete(id);
	}

	public List<StudentDto> findByName(String name) {
		return dao.findByName(name);
	}
	
	public List<StudentDto> findByClass(String classStudent) {
		return dao.findByClass(classStudent);
	}
}
