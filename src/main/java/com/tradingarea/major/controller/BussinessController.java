/* CopyRight www.smallyu.net */

package com.tradingarea.major.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tradingarea.major.entity.Bussiness;
import com.tradingarea.major.repository.BussinessRepository;
import com.tradingarea.major.util.ResUtil;

/**
 * @author smallyu
 * @date 2019/8/20 15:58
 */
@RestController
@RequestMapping("/bussiness")
public class BussinessController {

	@Autowired
	BussinessRepository bussinessRepository;

	/*
	 * 新增用户
	 */
	@RequestMapping("/savebusiness")
	public String save() {
		System.out.println("添加用户");
		bussinessRepository.save(new Bussiness("商圈", "introduction", "detail", "address", "logo", "picture", 1, 1));
		return "save";
	}

	@RequestMapping("/delete")
	public void delete(Integer id) {
		bussinessRepository.deleteById(id);
	}

	/*
	 * 根据ID查询
	 */
	@RequestMapping("/findByid")
	public Map<String, Object> findAllById(Integer i) {
		int code = 200;
		String msg = "请求成功";
		Bussiness bussiness = bussinessRepository.findAllById(i);
		return ResUtil.resMap(code, msg, bussiness);
	}

	/*
	 * 通过name查询
	 * 
	 */
	@RequestMapping(value = "/findByname", method = RequestMethod.GET)
	public Map<String, Object> findByName(String name) {
		int code = 200;
		String msg = "根据name查找成功";
		Bussiness info = bussinessRepository.findByName(name);
		return ResUtil.resMap(code, msg, info);
	}

	/*
	 * limit 0,10
	 */
	@RequestMapping("/findten")
	public Map<String, Object> findten(String StockCode) {
		int code = 200;
		String msg = "请求成功";
		List<Bussiness> list = bussinessRepository.findten();
		return ResUtil.resMap(code, msg, list);
	}

	/*
	 * 查询表中所有数据
	 *
	 */
	@RequestMapping("/findAll")
	public Map<String, Object> toIndex() {
		int code = 200;
		String msg = "请求成功";
		List<Bussiness> findAll = bussinessRepository.findAll();
		return ResUtil.resMap(code, msg, findAll);
	}

	/*
	 * 根据ID修改用户信息
	 */
	@RequestMapping(value = "/updated")
	public Map<String, Object> updatedBusiness(Integer id, String name, String introduction, String detail,
			String address, String logo, String picture, Integer status, Integer level) {
		int code = 200;
		String msg = "修改成功";
		bussinessRepository.updateById(2, "商圈2", "修改", detail, address, logo, picture, 1, 1);
		return ResUtil.resMap(code, msg, "修改成功");
	}

	/*
	 * 
	 */
	@RequestMapping("/page")
	public Map<String, Object> findAllByPage() {
		PageRequest pageable = PageRequest.of(0, 5);

		int code = 200;
		String msg = "请求成功";
		Page<Bussiness> bussiness = bussinessRepository.findAll(pageable);

		return ResUtil.resMap(code, msg, bussiness);
	}

	/*
	 * 分页
	 */
	@RequestMapping("/pageable")
	public Map<String, Object> pageable() {
		int code = 200;
		String msg = "请求成功";
		PageRequest pageable = PageRequest.of(0, 5);

		Page<Bussiness> page = bussinessRepository.findByName("商圈", pageable);
		/*
		 * //查询结果总行数
		 * 
		 * System.out.println(page.getTotalElements());
		 * 
		 * //按照当前分页大小，总页数
		 * 
		 * System.out.println(page.getTotalPages());
		 * 
		 * //按照当前页数、分页大小，查出的分页结果集合
		 * 
		 * for (Bussiness bussiness: page.getContent()) {
		 * 
		 * System.out.println(bussiness.toString());
		 * 
		 * }
		 */

		return ResUtil.resMap(code, msg, page);
	}
}
