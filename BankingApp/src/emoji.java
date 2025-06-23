import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class emoji {
	public static void main(String[] args) {
	    String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(timeStamp);
	}
}
/*

 Symbol	Meaning
✅	Success / Confirmed
❌	Error / Failed
⚠️	Warning
⛔	Access Denied
🔒	Locked
🔓	Unlocked
🔄	Processing
🕒	Pending / Waiting
🔔	Notification
📢	Announcement

🔹 Navigation / Menu Icons
Symbol	Meaning
🏠	Home
🧾	Statement / Report
💰	Finance / Balance
🧍	User / Profile
🧮	Calculator / Total
🔙	Back
➕	Add / Create
➖	Remove / Subtract
✏️	Edit
🗑️	Delete
🔍	Search

🔹 Banking-Specific Emojis
Symbol	Meaning
🏦	Bank
💳	Card / ATM
🏧	ATM Available
📈	Growth / Income
📉	Loss / Expense
💵	Cash
💸	Money Sent / Gone
💲	Dollar / Money
 */