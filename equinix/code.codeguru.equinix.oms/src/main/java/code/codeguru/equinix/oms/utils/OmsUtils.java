package code.codeguru.equinix.oms.utils;

import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;
import code.codeguru.equinix.oms.requestmodels.Orders;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderResponseType;

public class OmsUtils {

	public static Set<GenericOrdersProducts> orderMapper(Orders order) {

		Set<GenericOrdersProducts> genericOrders = new HashSet<GenericOrdersProducts>();

		if (order != null) {

			if (order.getProducts() != null) {
				order.getProducts().forEach(ord -> {
					GenericOrdersProducts genOrder = new GenericOrdersProducts();

					if (ord.getProductType() != null) {
						genOrder.setProductType(ord.getProductType());
					}

					if (ord.getProductSubType() != null) {
						genOrder.setProductSubType(ord.getProductSubType());
					}

					if (ord.getAccountName() != null) {
						genOrder.setAccountName(ord.getAccountName());
					}

					if (ord.getAccountNumber() != null) {
						genOrder.setAccountNumber(ord.getAccountNumber());
					}

					genOrder.setQuantityRequested(ord.getQuantityRequested());

					if (ord.getIbxTime() != null) {
						genOrder.setIbxTime(ord.getIbxTime());
					}

					if (ord.getContactUCID() != null) {
						genOrder.setContactUcid(ord.getContactUCID());
					}

					if (ord.getUserName() != null) {
						genOrder.setUserName(ord.getUserName());
					}

					if (ord.getUserKey() != null) {
						genOrder.setUserKey(ord.getUserKey());
					}

					if (ord.getAccountUCID() != null) {
						genOrder.setAccountUCID(ord.getAccountUCID());
					}

//                    contacts
//                    ibxlocation
//                    notes

					genericOrders.add(genOrder);
				});
			}

		}
		return genericOrders;
	}

	public static String toXML(ShellOrderResponseType object) throws JAXBException {
		StringWriter stringWriter = new StringWriter();

		JAXBContext jaxbContext = JAXBContext.newInstance(ShellOrderResponseType.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// format the XML output
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		QName qName = new QName("", "response");
		JAXBElement root = new JAXBElement(qName, ShellOrderResponseType.class, object);

		jaxbMarshaller.marshal(root, stringWriter);

		String result = stringWriter.toString();
//		LOGGER.info(result);
		return result;
	}
}
