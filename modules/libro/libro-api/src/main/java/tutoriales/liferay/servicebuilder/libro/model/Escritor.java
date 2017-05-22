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
 * The extended model interface for the Escritor service. Represents a row in the &quot;LIBRO_Escritor&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EscritorModel
 * @see tutoriales.liferay.servicebuilder.libro.model.impl.EscritorImpl
 * @see tutoriales.liferay.servicebuilder.libro.model.impl.EscritorModelImpl
 * @generated
 */
@ImplementationClassName("tutoriales.liferay.servicebuilder.libro.model.impl.EscritorImpl")
@ProviderType
public interface Escritor extends EscritorModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tutoriales.liferay.servicebuilder.libro.model.impl.EscritorImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Escritor, Long> ESCRITOR_ID_ACCESSOR = new Accessor<Escritor, Long>() {
			@Override
			public Long get(Escritor escritor) {
				return escritor.getEscritorId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Escritor> getTypeClass() {
				return Escritor.class;
			}
		};
}