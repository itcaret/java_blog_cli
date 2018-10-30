import java.util.regex.Pattern;

public class Validator {

	public static boolean check(String[] command) {
		if (command.length == 0) {
			return false;
		}

		if (command[0].equals("list")) {
			if (command.length != 1) {
				return false;
			}
			return true;
		}

		if (command[0].equals("show")) {
			if (command.length != 2) {
				return false;
			}
			String id = command[1];
			if (!checkId(id)) {
				return false;
			}
			return true;
		}

		if (command[0].equals("create")) {
			if (command.length != 3) {
				return false;
			}
			String title = command[1];
			if (!checkTitle(title)) {
				return false;
			}
			String body = command[2];
			if (!checkBody(body)) {
				return false;
			}
			return true;
		}

		if (command[0].equals("update")) {
			if (command.length != 4) {
				return false;
			}
			String id = command[1];
			if (!checkId(id)) {
				return false;
			}
			String title = command[2];
			if (!checkTitle(title)) {
				return false;
			}
			String body = command[3];
			if (!checkBody(body)) {
				return false;
			}
			return true;
		}

		if (command[0].equals("delete")) {
			if (command.length != 2) {
				return false;
			}
			String id = command[1];
			if (!checkId(id)) {
				return false;
			}
			return true;
		}
		
		if (command[0].equals("quit")) {
			if (command.length != 1) {
				return false;
			}
			return true;
		}

		return false;
	}

	private static boolean checkBody(String body) {
		if (body.isEmpty()) {
			return false;
		}
		if (body.length() > 140) {
			return false;
		}
		return true;
	}

	private static boolean checkTitle(String title) {
		if (title.isEmpty()) {
			return false;
		}
		if (title.length() > 40) {
			return false;
		}
		return true;
	}

	private static boolean checkId(String id) {
		if (id.isEmpty()) {
			return false;
		}
		if (isNumber(id) == false) {
			return false;
		}
		if (id.length() > 8) {
			return false;
		}
		return true;
	}

	private static boolean isNumber(String str) {
		return Pattern.compile("\\d+").matcher(str).matches();
	}
}
