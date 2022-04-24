package code.codeguru.equinix.oms.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderRequestType;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderResponseType;

@Service
public class ShellOrderSOAPClient extends WebServiceGatewaySupport {

	@Autowired
	Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public ShellOrderResponseType getShellOrder(GenericOrdersProducts order) {

		ShellOrderRequestType request = new ShellOrderRequestType();
		request.setAccountName(order.getAccountName());
		request.setProductType(order.getProductType());
		request.setProductSubType(order.getProductSubType());
		request.setAccountNumber(order.getAccountNumber());
		request.setAccountUCID(order.getAccountUCID());
		request.setFirstName("Prasad");
		request.setLastName("deshpande");
		request.setIbx(order.getIbxTime());
		request.setAssetNumber("assest number");
		request.setCountry("hongkong");
		request.setRegion("APAC");
		request.setMetro("HK");
		request.setSeverity("S1");
		request.setProductCategory("Equinix Fabric");
		request.setNetworkTrouble(Boolean.TRUE.toString());
		request.setCallMeFromCage(Boolean.TRUE.toString());
		request.setContactUCID(order.getContactUcid());
		request.setEmail("abc@gmail.com");
		request.setWorkPhone("12345");
		// populate request object with attributes from order param

		marshaller.setCheckForXmlRootElement(false);

		JAXBElement<ShellOrderRequestType> jaxbElement = new JAXBElement<ShellOrderRequestType>(
				new QName("", "ShellOrderRequest"), ShellOrderRequestType.class, request);

		template = new WebServiceTemplate(marshaller);

		String END_POINT_URL = System.getenv("SHELL_ORDER_SOAP_END_POINT_URL");

		if (END_POINT_URL == null) {
			END_POINT_URL = "http://localhost:8080/shellorder/services/shellorder";

		}
		JAXBElement object = (JAXBElement) template.marshalSendAndReceive(END_POINT_URL, jaxbElement, null);
		ShellOrderResponseType response = (ShellOrderResponseType) object.getValue();

		return response;
	}

}
