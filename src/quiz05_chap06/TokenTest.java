package quiz05_chap06;

import java.util.*;

public class TokenTest {

	public static void main(String[] args) {
		String data = "È«±æµ¿,³²,65,170/±è»õ¿µ,¿©,57,164/ÀÌÀå±º,³²,80,190/±è¸í¼ö,³²,77,167/È«¹Ì¿ë,¿©,64,165";
		double Weight = 0;
		double Count = 0;

		StringTokenizer st = new StringTokenizer(data, "/");

		while (st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");

			while (st2.hasMoreTokens()) {
				if (st2.nextToken().equals("³²")) {
					String arr[] = new String[st2.countTokens()];
					int i = 0;
					while (st2.hasMoreTokens()) {
						arr[i] = st2.nextToken();
						i++;
					}

					List<String> list = Arrays.asList(arr);
					String last = null;
					if (!list.isEmpty())
						last = list.get(list.size() - 1);
					System.out.println(" last " + last);
					Weight += Integer.parseInt(last);
					Count++;

				}

			}

		}
		System.out.println("Æò±Õ Å°: "+Weight / Count);

	}

}