package com.example.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.Model.StudentDto;

@Repository
public class StudentDao extends SqlSessionDaoSupport implements IStudentDao {
//	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyBatisUtil.class);
	 
	@Override
	@Autowired
	public void setSqlSessionFactory(@Qualifier("defaultDS") SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<StudentDto> GetListStudent() {
		return getSqlSession().selectList("getAllStudents");
	}

	public void insert(StudentDto obj) {
		getSqlSession().insert("insertStudent", obj);
	}

	public void delete(Integer idStudent) {
		getSqlSession().delete("deleteStudent", idStudent);
	}
	public StudentDto findById(int idStudent) {
		return getSqlSession().selectOne("findById", idStudent);
	}
	

	public void update(StudentDto obj) {
		getSqlSession().update("updateStudent", obj);
	}

	public List<StudentDto> findByName(String name) {
		return getSqlSession().selectList("findByName", name);
	}
	public List<StudentDto> findByClass(String classStudent) {
		return getSqlSession().selectList("findByClass", classStudent);
	}
}


