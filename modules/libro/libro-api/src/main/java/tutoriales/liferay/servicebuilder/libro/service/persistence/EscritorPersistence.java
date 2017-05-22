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

package tutoriales.liferay.servicebuilder.libro.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tutoriales.liferay.servicebuilder.libro.exception.NoSuchEscritorException;
import tutoriales.liferay.servicebuilder.libro.model.Escritor;

/**
 * The persistence interface for the escritor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tutoriales.liferay.servicebuilder.libro.service.persistence.impl.EscritorPersistenceImpl
 * @see EscritorUtil
 * @generated
 */
@ProviderType
public interface EscritorPersistence extends BasePersistence<Escritor> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EscritorUtil} to access the escritor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the escritors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching escritors
	*/
	public java.util.List<Escritor> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the escritors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the escritors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns an ordered range of all the escritors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first escritor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the first escritor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the last escritor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the last escritor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the escritors before and after the current escritor in the ordered set where uuid = &#63;.
	*
	* @param escritorId the primary key of the current escritor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next escritor
	* @throws NoSuchEscritorException if a escritor with the primary key could not be found
	*/
	public Escritor[] findByUuid_PrevAndNext(long escritorId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Removes all the escritors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of escritors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching escritors
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the escritor where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchEscritorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchEscritorException;

	/**
	* Returns the escritor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the escritor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the escritor where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the escritor that was removed
	*/
	public Escritor removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchEscritorException;

	/**
	* Returns the number of escritors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching escritors
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the escritors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching escritors
	*/
	public java.util.List<Escritor> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the escritors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the escritors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns an ordered range of all the escritors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first escritor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the first escritor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the last escritor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the last escritor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the escritors before and after the current escritor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param escritorId the primary key of the current escritor
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next escritor
	* @throws NoSuchEscritorException if a escritor with the primary key could not be found
	*/
	public Escritor[] findByUuid_C_PrevAndNext(long escritorId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Removes all the escritors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of escritors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching escritors
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the escritors where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the matching escritors
	*/
	public java.util.List<Escritor> findByNombre(java.lang.String nombre);

	/**
	* Returns a range of all the escritors where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of matching escritors
	*/
	public java.util.List<Escritor> findByNombre(java.lang.String nombre,
		int start, int end);

	/**
	* Returns an ordered range of all the escritors where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByNombre(java.lang.String nombre,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns an ordered range of all the escritors where nombre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nombre the nombre
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching escritors
	*/
	public java.util.List<Escritor> findByNombre(java.lang.String nombre,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first escritor in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByNombre_First(java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the first escritor in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByNombre_First(java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the last escritor in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor
	* @throws NoSuchEscritorException if a matching escritor could not be found
	*/
	public Escritor findByNombre_Last(java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Returns the last escritor in the ordered set where nombre = &#63;.
	*
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public Escritor fetchByNombre_Last(java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns the escritors before and after the current escritor in the ordered set where nombre = &#63;.
	*
	* @param escritorId the primary key of the current escritor
	* @param nombre the nombre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next escritor
	* @throws NoSuchEscritorException if a escritor with the primary key could not be found
	*/
	public Escritor[] findByNombre_PrevAndNext(long escritorId,
		java.lang.String nombre,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator)
		throws NoSuchEscritorException;

	/**
	* Removes all the escritors where nombre = &#63; from the database.
	*
	* @param nombre the nombre
	*/
	public void removeByNombre(java.lang.String nombre);

	/**
	* Returns the number of escritors where nombre = &#63;.
	*
	* @param nombre the nombre
	* @return the number of matching escritors
	*/
	public int countByNombre(java.lang.String nombre);

	/**
	* Caches the escritor in the entity cache if it is enabled.
	*
	* @param escritor the escritor
	*/
	public void cacheResult(Escritor escritor);

	/**
	* Caches the escritors in the entity cache if it is enabled.
	*
	* @param escritors the escritors
	*/
	public void cacheResult(java.util.List<Escritor> escritors);

	/**
	* Creates a new escritor with the primary key. Does not add the escritor to the database.
	*
	* @param escritorId the primary key for the new escritor
	* @return the new escritor
	*/
	public Escritor create(long escritorId);

	/**
	* Removes the escritor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor that was removed
	* @throws NoSuchEscritorException if a escritor with the primary key could not be found
	*/
	public Escritor remove(long escritorId) throws NoSuchEscritorException;

	public Escritor updateImpl(Escritor escritor);

	/**
	* Returns the escritor with the primary key or throws a {@link NoSuchEscritorException} if it could not be found.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor
	* @throws NoSuchEscritorException if a escritor with the primary key could not be found
	*/
	public Escritor findByPrimaryKey(long escritorId)
		throws NoSuchEscritorException;

	/**
	* Returns the escritor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor, or <code>null</code> if a escritor with the primary key could not be found
	*/
	public Escritor fetchByPrimaryKey(long escritorId);

	@Override
	public java.util.Map<java.io.Serializable, Escritor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the escritors.
	*
	* @return the escritors
	*/
	public java.util.List<Escritor> findAll();

	/**
	* Returns a range of all the escritors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of escritors
	*/
	public java.util.List<Escritor> findAll(int start, int end);

	/**
	* Returns an ordered range of all the escritors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of escritors
	*/
	public java.util.List<Escritor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator);

	/**
	* Returns an ordered range of all the escritors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of escritors
	*/
	public java.util.List<Escritor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Escritor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the escritors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of escritors.
	*
	* @return the number of escritors
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}