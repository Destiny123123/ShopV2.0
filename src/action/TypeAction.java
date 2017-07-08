package action;


import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
/**
 * ����Action
 * @author ����
 * @date 2017��7��3��14:28:18
 * @modify BUPT
 * @modifyDate 
 */
import com.opensymphony.xwork2.ActionSupport;

import domain.Commodity;
import domain.Order;
import domain.User;
import service.IShowTypeService;
public class TypeAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public IShowTypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(IShowTypeService typeService) {
		this.typeService = typeService;
	}

	TypeAction(){};
	TypeAction(String type){
		this.type = type;
	};
	
	@Resource
	private IShowTypeService typeService;
	
	public String classify(){
		
		List<Commodity> list = typeService.findCommodityByType(this.type);
		System.out.println(type);
		if(list!=null){
			ActionContext actionContext = ActionContext.getContext();
			actionContext.getSession().put("Item", list);
			return SUCCESS;
		}
		else {
			return ERROR;
		}
		
	}
	
}
