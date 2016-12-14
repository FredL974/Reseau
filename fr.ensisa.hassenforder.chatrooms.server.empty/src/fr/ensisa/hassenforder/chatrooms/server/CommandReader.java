package fr.ensisa.hassenforder.chatrooms.server;


import java.io.InputStream;

import fr.ensisa.hassenforder.network.BasicAbstractReader;
import fr.ensisa.hassenforder.network.Protocol;

public class CommandReader extends BasicAbstractReader {
	
	private String userName, roomName, moderatorName, message;
	private int mode, length, valid;
	private Room [] rooms;
	
	public CommandReader(InputStream inputStream) {
		super (inputStream);
	}

	public void receive() {
		type = readInt ();
		switch (type) {
		case Protocol.RQ_CONNECT :
			this.userName = readString();
			//appeler méthode
			break;
		case Protocol.RQ_CREATEROOM :
			this.roomName = readString();
			this.mode = readInt();
			this.moderatorName = readString();
			//appeler méthode
			break;
		case Protocol.RQ_LOADROOMS :
			//appeler méthode
			break;
		case Protocol.RQ_VALIDMODERATOR :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readInt();
			//appeler méthode
			break;
		case Protocol.RQ_INVALIDMODERATOR :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readInt();
			//appeler méthode
			break;
		case Protocol.RQ_POSTMESSAGE :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readInt();
			//appeler méthode
			break;
		case Protocol.RP_CREATEROOMOK :
			//appeler méthode
			break;
		case Protocol.RP_LOADROOMSOK :
			this.length = readInt();
			this.room = readRooms();
			//appeler méthode
			break;
		}
		case Protocol.RQ_VALIDATIONMODERATOR :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readInt();
			//appeler méthode
			break;
		}
		case Protocol.RP_VALIDMODERATOROK :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readint();
			//appeler méthode
			break;
		}
		case Protocol.RP_INVALIDMODERATOROK :
			this.roomName = readString();
			this.userName = readString();
			this.message = readString();
			this.valid = readint();
			//appeler méthode
			break;
		}
		case Protocol.RP_POSTMESSAGEOK :
			//appeler méthode
			break;
		}
		case Protocol.RP_ERROR_USERNAMEALREADYEXIST :
			//appeler méthode
			break;
		}
		case Protocol.RP_ERROR_STRINGFORBIDDEN :
			//appeler méthode
			break;
		}
		case Protocol.RP_ERROR_MEMORYSPACE :
			//appeler méthode
			break;
		}
		case Protocol.RP_ERROR_CONNECTION :
			//appeler méthode
			break;
		}
	}

}
