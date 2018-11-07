import java.math.BigDecimal;

public class TradeParser {
	public static Trade parse(String line) throws Exception {
		Trade trade = new Trade();
		int index = 0;
		boolean foundIsin = false;
		boolean foundp = false;
		boolean foundt = false;
		for(;index < line.length();) {
			switch(line.charAt(index)) {
			case 'i':
				if (foundIsin)throw new RuntimeException("Got already");
				index++;
				StringBuffer sb = new StringBuffer();
				for(int i=0;index < line.length() && i < 12; i++, index++) {
					if (line.charAt(index)>='A' &&
							line.charAt(index)<='Z'||
							line.charAt(index)>='a'&&
							line.charAt(index)<='z'||
							line.charAt(index)>='0'&&
							line.charAt(index)<='9') {
						sb.append(line.charAt(index));
					} else {
						throw new RuntimeException("Bad character");
					}
				}
				trade.setIsin(sb.toString());
				foundIsin = true;
				break;
			case 'p':
				if (foundp)throw new RuntimeException("Got already");
				index++;
				sb = new StringBuffer();
				for(int i=0;index < line.length() && i < 12&& line.charAt(index) !=';'; i++, index++) {
					if (line.charAt(index)>='0' &&
							line.charAt(index)<='9'||
							line.charAt(index)>='.') {
						sb.append(line.charAt(index));
					} else {
						throw new RuntimeException("Bad character");
					}
				}
				trade.setPrice(new BigDecimal(sb.toString()));
				foundp = true;
				break;
			case 't':
				if (foundt)throw new RuntimeException("Got already");
				index++;
				sb = new StringBuffer();
				for(int i=0;index < line.length() && i < 12&& line.charAt(index) !=';'; i++, index++) {
					if (line.charAt(index)>='0' &&
							line.charAt(index)<='9') {
						sb.append(line.charAt(index));
					} else {
						throw new RuntimeException("Bad character");
					}
				}
				trade.setType(Integer.parseInt(sb.toString()));
				foundt = true;
				break;
			default:
				break;		
			}
			for(;index < line.length() && line.charAt(index) !=';';index++);
			index++;
		}
		if (!(foundIsin && foundp && foundt))
			throw new RuntimeException("Less than all three");
		return trade;
	}
}
