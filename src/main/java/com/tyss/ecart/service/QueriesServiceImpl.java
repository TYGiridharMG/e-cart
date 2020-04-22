package com.tyss.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ecart.dao.QueriesDao;
import com.tyss.ecart.model.Queries;

@Service
public class QueriesServiceImpl implements QueriesService {

	@Autowired
	private QueriesDao queryDao;

	public void addQuery(Queries queries) {

		queryDao.addQuery(queries);
	}

}
