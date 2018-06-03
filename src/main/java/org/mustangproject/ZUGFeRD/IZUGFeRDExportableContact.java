/** **********************************************************************
 *
 * Copyright 2018 Jochen Staerk
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *********************************************************************** */
package org.mustangproject.ZUGFeRD;
/**
 * Mustangproject's ZUGFeRD implementation
 * Neccessary interface for ZUGFeRD exporter
 * Licensed under the APLv2
 * @date 2014-05-10
 * @version 1.2.0
 * @author jstaerk
 * */


public interface IZUGFeRDExportableContact {

	/**
	 * First and last name of the recipient
	 * @return
	 */
	String getName();

	/**
	 * Postal code of the recipient
	 * @return
	 */
	String getZIP();

	/**
	 * VAT ID (Umsatzsteueridentifikationsnummer) of the contact
	 * @return
	 */
	String getVATID();

	/**
	 * two-letter country code of the contact
	 * @return
	 */
	String getCountry();

	/***
	 * Returns the city of the contact
	 * @return
	 */
	String getLocation();

	/***
	 * Returns the street address (street+number) of the contact
	 */
	String getStreet();

}