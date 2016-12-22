package kr.or.dgit.jdbc.dao;

import java.util.List;

import kr.or.dgit.jdbc.dto.Student;

public interface StudentDao {
	void insertItem(Student item);

	void deleteItem(int idx);

	void updateItem(Student item);

	Student selectByNo(int idx);

	List<Student> selectByAll();

}
