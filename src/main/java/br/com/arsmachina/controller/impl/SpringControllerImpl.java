// Copyright 2008 Thiago H. de Paula Figueiredo
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package br.com.arsmachina.controller.impl;

import java.io.Serializable;
import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import br.com.arsmachina.controller.impl.ControllerImpl;
import br.com.arsmachina.dao.DAO;
import br.com.arsmachina.dao.SortCriterion;

/**
 * Abstract class that extends {@link ControllerImpl} to annotate with {@link Transactional} all
 * methods that can write to the object store and {@link Transactional}<code>(readOnly=true)</code>
 * all  methods that read from the object store.
 * 
 * @author Thiago H. de Paula Figueiredo
 * @param <T> the entity class related to this controller.
 * @param <K> the type of the field that represents the entity class' primary key.
 */
public abstract class SpringControllerImpl<T, K extends Serializable> extends ControllerImpl<T, K> {

	/**
	 * Single constructor of this class.
	 * 
	 * @param dao a {@link DAO<T, K>}. It cannot be <code>null</code>.
	 */
	public SpringControllerImpl(DAO<T, K> dao) {
		super(dao);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.GenericControllerImpl#delete(java.io.Serializable)
	 */
	@Override
	@Transactional
	public void delete(K id) {
		super.delete(id);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.GenericControllerImpl#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public void delete(T object) {
		super.delete(object);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.GenericControllerImpl#save(java.lang.Object)
	 */
	@Override
	@Transactional
	public void save(T object) {
		super.save(object);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.GenericControllerImpl#saveOrUpdate(java.lang.Object)
	 */
	@Override
	@Transactional
	public void saveOrUpdate(T object) {
		super.saveOrUpdate(object);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.GenericControllerImpl#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public void update(T object) {
		super.update(object);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#countAll()
	 */
	@Transactional(readOnly = true)
	@Override
	public int countAll() {
		return super.countAll();
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#findAll()
	 */
	@Transactional(readOnly = true)
	@Override
	public List<T> findAll() {
		return super.findAll();
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#findAll(int, int,
	 * br.com.arsmachina.dao.SortCriterion[])
	 */
	@Transactional(readOnly = true)
	@Override
	public List<T> findAll(int firstResult, int maxResults, SortCriterion... sortCriteria) {
		return super.findAll(firstResult, maxResults, sortCriteria);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#findById(java.io.Serializable)
	 */
	@Transactional(readOnly = true)
	@Override
	public T findById(K id) {
		return super.findById(id);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#findByIds(K[])
	 */
	@Transactional(readOnly = true)
	@Override
	public List<T> findByIds(K... ids) {
		return super.findByIds(ids);
	}

	/**
	 * @see br.com.arsmachina.controller.impl.ControllerImpl#refresh(java.lang.Object)
	 */
	@Transactional(readOnly = true)
	@Override
	public void refresh(T object) {
		super.refresh(object);
	}

}
