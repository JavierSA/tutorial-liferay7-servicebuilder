/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tutoriales.liferay.servicebuilder.libro.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Libro service. Represents a row in the &quot;LIBRO_Libro&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LibroModel
 * @see tutoriales.liferay.servicebuilder.libro.model.impl.LibroImpl
 * @see tutoriales.liferay.servicebuilder.libro.model.impl.LibroModelImpl
 * @generated
 */
@ImplementationClassName("tutoriales.liferay.servicebuilder.libro.model.impl.LibroImpl")
@ProviderType
public interface Libro extends LibroModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tutoriales.liferay.servicebuilder.libro.model.impl.LibroImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Libro, Long> LIBRO_ID_ACCESSOR = new Accessor<Libro, Long>() {
			@Override
			public Long get(Libro libro) {
				return libro.getLibroId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Libro> getTypeClass() {
				return Libro.class;
			}
		};
}