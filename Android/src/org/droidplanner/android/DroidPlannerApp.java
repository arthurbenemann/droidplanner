package org.droidplanner.android;

import org.droidplanner.core.MAVLink.MAVLinkStreams;
import org.droidplanner.core.MAVLink.MavLinkMsgHandler;
import org.droidplanner.core.drone.Drone;
import org.droidplanner.core.drone.DroneInterfaces.Clock;
import org.droidplanner.core.drone.DroneInterfaces.DroneEventsType;
import org.droidplanner.core.drone.DroneInterfaces.Handler;
import org.droidplanner.core.drone.Preferences;
import org.droidplanner.android.helpers.DpPreferences;
import org.droidplanner.android.helpers.TTS;
import org.droidplanner.android.service.MAVLinkClient;

import android.os.SystemClock;

import com.MAVLink.Messages.MAVLinkMessage;

public class DroidPlannerApp extends ErrorReportApp implements
		MAVLinkStreams.MavlinkInputStream {
	public Drone drone;
	private MavLinkMsgHandler mavLinkMsgHandler;
	public TTS tts;

	@Override
	public void onCreate() {
		super.onCreate();

		tts = new TTS(this);
		MAVLinkClient MAVClient = new MAVLinkClient(this,this);		
		Clock clock = new Clock() {
			@Override
			public long elapsedRealtime() {
				return SystemClock.elapsedRealtime();
			}
		};
		Handler handler = new Handler() {
			android.os.Handler handler = new android.os.Handler();
			
			@Override
			public void removeCallbacks(Runnable thread) {
				handler.removeCallbacks(thread);				
			}
			
			@Override
			public void postDelayed(Runnable thread, long timeout) {
				handler.postDelayed(thread, timeout);				
			}
		};
		Preferences pref = new DpPreferences(getApplicationContext());
		drone = new Drone(MAVClient,clock,handler,pref);
		drone.events.addDroneListener(tts);
		mavLinkMsgHandler = new org.droidplanner.core.MAVLink.MavLinkMsgHandler(
				drone);
	}

	@Override
	public void notifyReceivedData(MAVLinkMessage msg) {
		mavLinkMsgHandler.receiveData(msg);
	}

	@Override
	public void notifyConnected() {
		drone.events.notifyDroneEvent(DroneEventsType.CONNECTED);
	}

	@Override
	public void notifyDisconnected() {
		drone.events.notifyDroneEvent(DroneEventsType.DISCONNECTED);
	}
}
