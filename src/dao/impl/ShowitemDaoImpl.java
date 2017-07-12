package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;

import dao.IShowitemDao;
import domain.Comment;
import domain.Commodity;
import domain.User;

@Repository
public class ShowitemDaoImpl extends BaseDaoImpl<Commodity> implements IShowitemDao{
	private static Logger LOG = Logger.getLogger(ShowitemDaoImpl.class);
	
	@Override
	public Commodity findCommodityById(String idcommodity) {
		// TODO Auto-generated method stub
		try {
			List<Commodity> list = new ArrayList<Commodity>();
			int id = Integer.parseInt(idcommodity);
			list = super.find("from Commodity as c where c.id.idcommodity =?",new Integer[]{id});
		    ActionContext actionContext = ActionContext.getContext(); 
		    actionContext.getSession().put("item", list.get(0));
		    
		    return list.get(0);
		    
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);
			return null;
		}
	}
	
	@Override
	public List<Commodity> find(String hql, Commodity[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity get(String hql, Commodity[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count(String hql, Commodity[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer executeHql(String hql, Commodity[] param) {
		// TODO Auto-generated method stub
		return null;
	}


}