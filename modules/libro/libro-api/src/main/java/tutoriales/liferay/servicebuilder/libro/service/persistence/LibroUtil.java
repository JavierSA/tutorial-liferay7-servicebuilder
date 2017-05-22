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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tutoriales.liferay.servicebuilder.libro.model.Libro;

import java.util.List;

/**
 * The persistence utility for the libro service. This utility wraps {@link tutoriales.liferay.servicebuilder.libro.service.persistence.impl.LibroPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LibroPersistence
 * @see tutoriales.liferay.servicebuilder.libro.service.persistence.impl.LibroPersistenceImpl
 * @generated
 */
@ProviderType
public class LibroUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Libro libro) {
		getPersistence().clearCache(libro);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Libro update(Libro libro) {
		return getPersistence().update(libro);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Libro update(Libro libro, ServiceContext serviceContext) {
		return getPersistence().update(libro, serviceContext);
	}

	/**
	* Returns all the libros where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching libros
	*/
	public static List<Libro> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public static List<Libro> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Libro> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByUuid_First(java.lang.String uuid,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the libros before and after the current libro in the ordered set where uuid = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro[] findByUuid_PrevAndNext(long libroId,
		java.lang.String uuid, OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByUuid_PrevAndNext(libroId, uuid, orderByComparator);
	}

	/**
	* Removes all the libros where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of libros where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching libros
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLibroException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByUUID_G(java.lang.String uuid, long groupId)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the libro where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the libro that was removed
	*/
	public static Libro removeByUUID_G(java.lang.String uuid, long groupId)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of libros where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching libros
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the libros where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching libros
	*/
	public static List<Libro> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public static List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Libro> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the libros before and after the current libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro[] findByUuid_C_PrevAndNext(long libroId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(libroId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the libros where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of libros where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching libros
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the libros where titulo = &#63;.
	*
	* @param titulo the titulo
	* @return the matching libros
	*/
	public static List<Libro> findByTitulo(java.lang.String titulo) {
		return getPersistence().findByTitulo(titulo);
	}

	/**
	* Returns a range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public static List<Libro> findByTitulo(java.lang.String titulo, int start,
		int end) {
		return getPersistence().findByTitulo(titulo, start, end);
	}

	/**
	* Returns an ordered range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByTitulo(java.lang.String titulo, int start,
		int end, OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .findByTitulo(titulo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByTitulo(java.lang.String titulo, int start,
		int end, OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTitulo(titulo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByTitulo_First(java.lang.String titulo,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByTitulo_First(titulo, orderByComparator);
	}

	/**
	* Returns the first libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByTitulo_First(java.lang.String titulo,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence().fetchByTitulo_First(titulo, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByTitulo_Last(java.lang.String titulo,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByTitulo_Last(titulo, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByTitulo_Last(java.lang.String titulo,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence().fetchByTitulo_Last(titulo, orderByComparator);
	}

	/**
	* Returns the libros before and after the current libro in the ordered set where titulo = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro[] findByTitulo_PrevAndNext(long libroId,
		java.lang.String titulo, OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByTitulo_PrevAndNext(libroId, titulo, orderByComparator);
	}

	/**
	* Removes all the libros where titulo = &#63; from the database.
	*
	* @param titulo the titulo
	*/
	public static void removeByTitulo(java.lang.String titulo) {
		getPersistence().removeByTitulo(titulo);
	}

	/**
	* Returns the number of libros where titulo = &#63;.
	*
	* @param titulo the titulo
	* @return the number of matching libros
	*/
	public static int countByTitulo(java.lang.String titulo) {
		return getPersistence().countByTitulo(titulo);
	}

	/**
	* Returns all the libros where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @return the matching libros
	*/
	public static List<Libro> findByEscritorId(long escritorId) {
		return getPersistence().findByEscritorId(escritorId);
	}

	/**
	* Returns a range of all the libros where escritorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param escritorId the escritor ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public static List<Libro> findByEscritorId(long escritorId, int start,
		int end) {
		return getPersistence().findByEscritorId(escritorId, start, end);
	}

	/**
	* Returns an ordered range of all the libros where escritorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param escritorId the escritor ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByEscritorId(long escritorId, int start,
		int end, OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .findByEscritorId(escritorId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the libros where escritorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param escritorId the escritor ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public static List<Libro> findByEscritorId(long escritorId, int start,
		int end, OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEscritorId(escritorId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first libro in the ordered set where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByEscritorId_First(long escritorId,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByEscritorId_First(escritorId, orderByComparator);
	}

	/**
	* Returns the first libro in the ordered set where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByEscritorId_First(long escritorId,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .fetchByEscritorId_First(escritorId, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public static Libro findByEscritorId_Last(long escritorId,
		OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByEscritorId_Last(escritorId, orderByComparator);
	}

	/**
	* Returns the last libro in the ordered set where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static Libro fetchByEscritorId_Last(long escritorId,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence()
				   .fetchByEscritorId_Last(escritorId, orderByComparator);
	}

	/**
	* Returns the libros before and after the current libro in the ordered set where escritorId = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param escritorId the escritor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro[] findByEscritorId_PrevAndNext(long libroId,
		long escritorId, OrderByComparator<Libro> orderByComparator)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence()
				   .findByEscritorId_PrevAndNext(libroId, escritorId,
			orderByComparator);
	}

	/**
	* Removes all the libros where escritorId = &#63; from the database.
	*
	* @param escritorId the escritor ID
	*/
	public static void removeByEscritorId(long escritorId) {
		getPersistence().removeByEscritorId(escritorId);
	}

	/**
	* Returns the number of libros where escritorId = &#63;.
	*
	* @param escritorId the escritor ID
	* @return the number of matching libros
	*/
	public static int countByEscritorId(long escritorId) {
		return getPersistence().countByEscritorId(escritorId);
	}

	/**
	* Caches the libro in the entity cache if it is enabled.
	*
	* @param libro the libro
	*/
	public static void cacheResult(Libro libro) {
		getPersistence().cacheResult(libro);
	}

	/**
	* Caches the libros in the entity cache if it is enabled.
	*
	* @param libros the libros
	*/
	public static void cacheResult(List<Libro> libros) {
		getPersistence().cacheResult(libros);
	}

	/**
	* Creates a new libro with the primary key. Does not add the libro to the database.
	*
	* @param libroId the primary key for the new libro
	* @return the new libro
	*/
	public static Libro create(long libroId) {
		return getPersistence().create(libroId);
	}

	/**
	* Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param libroId the primary key of the libro
	* @return the libro that was removed
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro remove(long libroId)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().remove(libroId);
	}

	public static Libro updateImpl(Libro libro) {
		return getPersistence().updateImpl(libro);
	}

	/**
	* Returns the libro with the primary key or throws a {@link NoSuchLibroException} if it could not be found.
	*
	* @param libroId the primary key of the libro
	* @return the libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public static Libro findByPrimaryKey(long libroId)
		throws tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException {
		return getPersistence().findByPrimaryKey(libroId);
	}

	/**
	* Returns the libro with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param libroId the primary key of the libro
	* @return the libro, or <code>null</code> if a libro with the primary key could not be found
	*/
	public static Libro fetchByPrimaryKey(long libroId) {
		return getPersistence().fetchByPrimaryKey(libroId);
	}

	public static java.util.Map<java.io.Serializable, Libro> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the libros.
	*
	* @return the libros
	*/
	public static List<Libro> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of libros
	*/
	public static List<Libro> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of libros
	*/
	public static List<Libro> findAll(int start, int end,
		OrderByComparator<Libro> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of libros
	*/
	public static List<Libro> findAll(int start, int end,
		OrderByComparator<Libro> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the libros from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of libros.
	*
	* @return the number of libros
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LibroPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LibroPersistence, LibroPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LibroPersistence.class);
}