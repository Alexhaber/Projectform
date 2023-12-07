package Dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection
{
	String strconnectDB = "jdbc:sqlite:db/registro_usuarios.s3db";
        String strconnectDA = "jdbc:sqlite:db/registro_item.s3db";
	Connection conexion = null;
	
        //Hay dos "connections strings" dependiendo del boton que se presione en el menu principal se le da
        //a los objetos creados la conexion "a" o la conexion "b", a sinceridad no se porque hice dos DB.
        
	public connection(String variable)
	{
            if(variable == "a")
            {
		try
                {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection(strconnectDB);
			System.out.println("Conexion lograda");
		}
		catch(Exception e){
			System.out.println("Conexion fallada" + e);
		}
            }
            else if(variable.equals("b"))
            {
		try
                {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection(strconnectDA);
			System.out.println("Conexion lograda");
		}
		catch(Exception e){
			System.out.println("Conexion fallada" + e);
		}
            }
	}
	
        //Metodo que se llama para ejecutar un comando sql de "Insert" o "Update"
	public int EjecutarSql(String sentenciasql)
	{
		try{
			PreparedStatement prm = conexion.prepareStatement(sentenciasql);
			prm.execute();
			return 1;
		}
		catch(Exception e){
			System.out.println(e);
			return 0;
		}
	}
	
        //Metodo que se llama para ejecutar un comando sql de "Select"
	public ResultSet Consultasql(String sentenciasql)
	{
		try
		{
			PreparedStatement prm = conexion.prepareStatement(sentenciasql);
			ResultSet retorno = prm.executeQuery();
			return retorno;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
}
