import java.util.StringTokenizer;
public class StringToken{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StringTokenizer st=new StringTokenizer("hi 45 45.6");
				while(st.hasMoreElements())
				{
					//String data=st.nextToken();
					Object o=st.nextElement();
					if(o instanceof String) {
					int n1=Integer.parseInt(st.nextToken());
					System.out.println(n1);
					}
					else if(o instanceof Integer)
					{
						int n1=Integer.parseInt((String)o);
						System.out.println(n1);
					}
					else if(o instanceof Float)
					{
						float n1=Float.parseFloat((String)o);
						System.out.println(n1);
					}
				}
			}
	}
