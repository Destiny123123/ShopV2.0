package dao.impl;
/**
 * �û������ӿ�ʵ��
 * @author ����
 * @date 2017��7��3��15:03:18
 * @modify BUPT
 * @modifyDate 
 */
import java.util.List;


import dao.IUserDao;
import domain.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> searchUser(List<Object> choose) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List findPage(String hql, List param, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countUser(String hql, List param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
