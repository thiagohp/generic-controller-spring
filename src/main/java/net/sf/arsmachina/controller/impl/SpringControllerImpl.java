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

package net.sf.arsmachina.controller.impl;

import java.io.Serializable;

import net.sf.arsmachina.controller.impl.ControllerImpl;
import net.sf.arsmachina.dao.DAO;

import org.springframework.transaction.annotation.Transactional;

/**
 * Abstract class that extends {@link ControllerImpl} to annotate with
 * <code>@</code>{@link Transactional} all methods that can write to the object store.
 * 
 * @author Thiago H. de Paula Figueiredo (ThiagoHP)
 * @param <T> the entity class related to this controller.
 * @param <K> the type of the field that represents the entity class' primary key.
 */
public class SpringControllerImpl<T, K extends Serializable> extends
		ControllerImpl<T, K> {

	/**
	 * Single constructor of this class.
	 * 
	 * @param dao a {@link DAO<T, K>}. It cannot be <code>null</code>.
	 */
	public SpringControllerImpl(DAO<T, K> dao) {
		super(dao);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#delete(java.io.Serializable)
	 */
	@Override
	@Transactional
	public void delete(K id) {
		super.delete(id);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public void delete(T object) {
		super.delete(object);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#merge(java.lang.Object)
	 */
	@Override
	@Transactional
	public T merge(T object) {
		return super.merge(object);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#save(java.lang.Object)
	 */
	@Override
	@Transactional
	public void save(T object) {
		super.save(object);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#saveOrUpdate(java.lang.Object)
	 */
	@Override
	@Transactional
	public void saveOrUpdate(T object) {
		super.saveOrUpdate(object);
	}

	/**
	 * @see net.sf.arsmachina.controller.impl.GenericControllerImpl#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public void update(T object) {
		super.update(object);
	}

}
