package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.apollo.Util.HibernateUtil;
import com.test.PharmacyDataLoadGetModel;
import com.test.RejectedDataResponse;

public class PharmacyDataLoadDAO {
	Connection conn;
	public void pharmacy(List list) throws IOException 
    {
		String newline = "\n";
		String comma = ",";
		FileWriter fw = null;
		List rejectlist = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://ec2-35-154-252-200.ap-south-1.compute.amazonaws.com:3306/AskApollo_Wellness","root","HappQA808");
	        Statement stat = conn.createStatement();
	        int count=stat.executeUpdate("truncate table Apollo_Pharmacy_Masterload");
		    String insertTableSQL = "INSERT INTO Apollo_Pharmacy_Masterload VALUES(?,?,?,?,?,?,?,?,?,?)";
		    PreparedStatement preparedStatement = conn.prepareStatement(insertTableSQL);
		    PharmacyDataLoadGetModel pharmacylist;
			Iterator itr=list.iterator();
					while (itr.hasNext()) {
						pharmacylist = (PharmacyDataLoadGetModel) itr.next();
						preparedStatement.setInt(1, pharmacylist.getStoreid());
					    preparedStatement.setString(2, pharmacylist.getStorename());
					    preparedStatement.setString(3, pharmacylist.getBaddress());
					    preparedStatement.setString(4, pharmacylist.getPincode());
					    preparedStatement.setString(5, pharmacylist.getPlat());
					    preparedStatement.setString(6, pharmacylist.getPlon());
					    preparedStatement.setString(7, pharmacylist.getPhno());
					    preparedStatement.setString(8, pharmacylist.getBranchtype());
					    preparedStatement.setString(9, pharmacylist.getPcity());
					    preparedStatement.setString(10, pharmacylist.getStaten());
					    int count1=preparedStatement.executeUpdate();
					}
					CallableStatement checkstatus = conn.prepareCall
						     ("{call usp_Apollo_Pharmacy_Masterload()}");
					
				ResultSet rs=checkstatus.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				RejectedDataResponse rejecteddata;
				rejectlist=new ArrayList();
				while(rs.next()){
					rejecteddata=new RejectedDataResponse();
					rejecteddata.setBaddress(rs.getString("Address"));
					rejecteddata.setBranchtype(rs.getString("StoreHours"));
					rejecteddata.setI_message(rs.getString("i_message"));
					rejecteddata.setI_status(rs.getString("i_status"));
					rejecteddata.setLocation(rs.getString("Location"));
					rejecteddata.setPcity(rs.getString("CityName"));
					rejecteddata.setPhno(rs.getString("Phone"));
					rejecteddata.setPincode(rs.getString("PinCode"));
					rejecteddata.setPlat(rs.getString("LAT"));
					rejecteddata.setPlon(rs.getString("LNG"));
					rejecteddata.setStaten(rs.getString("StateName"));
					rejecteddata.setStoreid(rs.getInt("StoreID"));
					rejecteddata.setStorename(rs.getString("StoreName"));
					rejectlist.add(rejecteddata);
				}
				
				String header = null;
				
					fw = new FileWriter("/home/ec2-user/rejected.csv");
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						header = rsmd.getColumnName(i);
						fw.append(header);
						fw.append(comma);
					}
					fw.append(newline);
				Iterator it = rejectlist.iterator();
				RejectedDataResponse lis;
				while (it.hasNext()) {
					
						lis = (RejectedDataResponse) it.next();
						fw.append(String.valueOf(lis.getStoreid()));
						fw.append(comma);
						fw.append(lis.getStorename().replace(',', ' '));
						fw.append(comma);
						fw.append(lis.getLocation().replace(',', ' '));
						fw.append(comma);
						fw.append(lis.getBaddress().replace(',', ' '));
						fw.append(comma);
						fw.append(lis.getPincode());
						fw.append(comma);
						fw.append(lis.getPlat());
						fw.append(comma);
						fw.append(lis.getPlon());
						fw.append(comma);
						fw.append(lis.getPcity());
						fw.append(comma);
						fw.append(lis.getStaten());
						fw.append(comma);
						fw.append(lis.getPhno());
						fw.append(comma);
						fw.append(lis.getBranchtype());
						fw.append(comma);
						fw.append(lis.getI_status());
						fw.append(comma);
						fw.append(lis.getI_message());
						fw.append(newline);
				}
				fw.flush();
                fw.close();
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				
                // fw.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/*String fileName="rejected.csv";
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");*/
		//FileInputStream fileinput = new FileInputStream("E:\\rejected.csv");
		/*int i;
		while ((i = fileinput.read()) != -1) {
			out.write(i);

		}*/
		//fileinput.close();
		/*MailjetAttachmentConnection mailattachment=new MailjetAttachmentConnection();
		mailattachment.MailjetAttachmentService(rejectlist);*/
    }
	private SessionFactory factory;
	private Session session;
	private Transaction smsTxn;
	public void pharmacyDB(List list){
		String newline = "\n";
		String comma = ",";
		FileWriter fw = null;
		List rejecteddata;
		int result = 0;
		factory=HibernateUtil.getSessionFactory();
		session=factory.openSession();
		smsTxn=session.beginTransaction();
		//PharmacyResponseData pharmacyresponse=new PharmacyResponseData();
		PharmacyDataLoadGetModel pharmacylist;
		RejectedDataResponse rejectedpharmacydata;
		
		List rejectlist = null;
		Query query = session.createSQLQuery("insert into Apollo_Pharmacy_Masterload values(?,?,?,?,?,?,?,?,?,?)");
				//Query("insert into Apollo_Pharmacy_Masterload(?,?,?,?,?,?,?,?,?,?)");
		
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
			pharmacylist = (PharmacyDataLoadGetModel) itr.next();
			query.setInteger(0, pharmacylist.getStoreid());
			query.setString(1, pharmacylist.getStorename());
			query.setString(2, pharmacylist.getBaddress());
			query.setString(3, pharmacylist.getPincode());
			query.setString(4, pharmacylist.getPlat());
			query.setString(5, pharmacylist.getPlon());
			query.setString(6, pharmacylist.getPhno());
			query.setString(7, pharmacylist.getBranchtype());
			query.setString(8, pharmacylist.getPcity());
			query.setString(9, pharmacylist.getStaten());
			result = query.executeUpdate();
		
		/*pharmacyresponse.setBaddress(pharmacylist.getBaddress());
		pharmacyresponse.setBranchtype(pharmacylist.getBranchtype());
		pharmacyresponse.setPcity(pharmacylist.getPcity());
		pharmacyresponse.setPhno(pharmacylist.getPhno());
		pharmacyresponse.setPincode(pharmacylist.getPincode());
		pharmacyresponse.setPlat(pharmacylist.getPlat());
		pharmacyresponse.setPlon(pharmacylist.getPlon());
		pharmacyresponse.setStaten(pharmacylist.getStaten());
		pharmacyresponse.setStoreid(pharmacylist.getStoreid());
		pharmacyresponse.setStorename(pharmacylist.getStorename());
		session.save(pharmacyresponse);*/
		}
		Query pharmacyreject = session.createSQLQuery("CALL " + "usp_Apollo_Pharmacy_Masterload()");
		rejecteddata=pharmacyreject.list();
		rejectlist=new ArrayList();
		for(Integer i=0;i<rejecteddata.size();i++) {

		    Object[] objects = (Object[]) rejecteddata.get(i);
		    rejectedpharmacydata=new RejectedDataResponse();
		    rejectedpharmacydata.setBaddress(String.valueOf(objects[3]));
		    rejectedpharmacydata.setBranchtype(String.valueOf(objects[10]));
		    rejectedpharmacydata.setI_message(String.valueOf(objects[12]));
		    rejectedpharmacydata.setI_status(String.valueOf(objects[11]));
		    rejectedpharmacydata.setLocation(String.valueOf(objects[2]));
		    rejectedpharmacydata.setPcity(String.valueOf(objects[7]));
		    rejectedpharmacydata.setPhno(String.valueOf(objects[9]));
		    rejectedpharmacydata.setPincode(String.valueOf(objects[4]));
		    rejectedpharmacydata.setPlat(String.valueOf(objects[5]));
		    rejectedpharmacydata.setPlon(String.valueOf(objects[6]));
		    rejectedpharmacydata.setStaten(String.valueOf(objects[8]));
		    rejectedpharmacydata.setStoreid(Integer.parseInt(String.valueOf(objects[0])));
		    rejectedpharmacydata.setStorename(String.valueOf(objects[1]));
		    
		    rejectlist.add(rejectedpharmacydata);

		}
		String header = null;
		String[] entries = {"StoreID","StoreName","Location","Address","PinCode","LAT","LNG","CityName","StateName","Phone","StoreHours","i_status","i_message"};
		
		/*String[] columnNames = factory.getClassMetadata(PharmacyDataLoadGetModel.class).getPropertyNames();
		*/
		smsTxn.commit();
		try {
			fw = new FileWriter("E:\\rejected.csv");
			//fw = new FileWriter("/home/ec2-user/rejected.csv");
			for(int i=0;i<entries.length;i++){
				header=entries[i];
				fw.append(header);
				fw.append(comma);
				}
			/*for (int i = 1; i <= columnNames.length; i++) {
				header=columnNames[i];
				fw.append(header);
				fw.append(comma);
			}*/
			fw.append(newline);
			Iterator it = rejectlist.iterator();
			RejectedDataResponse lis;
			while (it.hasNext()) {
				
					lis = (RejectedDataResponse) it.next();
					fw.append(String.valueOf(lis.getStoreid()));
					fw.append(comma);
					fw.append(lis.getStorename().replace(',', ' '));
					fw.append(comma);
					fw.append(lis.getLocation().replace(',', ' '));
					fw.append(comma);
					fw.append(lis.getBaddress().replace(',', ' '));
					fw.append(comma);
					fw.append(lis.getPincode());
					fw.append(comma);
					fw.append(lis.getPlat());
					fw.append(comma);
					fw.append(lis.getPlon());
					fw.append(comma);
					fw.append(lis.getPcity());
					fw.append(comma);
					fw.append(lis.getStaten());
					fw.append(comma);
					fw.append(lis.getPhno());
					fw.append(comma);
					fw.append(lis.getBranchtype());
					fw.append(comma);
					fw.append(lis.getI_status());
					fw.append(comma);
					fw.append(lis.getI_message());
					fw.append(newline);
			}
			fw.flush();
		    fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
			factory.close();
		}
		/*MailjetAttachmentConnection mailattachment=new MailjetAttachmentConnection();
		mailattachment.MailjetAttachmentService(rejectlist);*/
		
	
	}
}

