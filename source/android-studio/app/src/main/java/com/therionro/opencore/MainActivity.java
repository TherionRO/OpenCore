package com.therionro.opencore;

import affan.ahmad.otp.*;
import android.Manifest;
import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.*;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Build;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.CodeView.OnHighlightListener;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;
import com.airbnb.lottie.*;
import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.*;
import com.andrognito.patternlockview.utils.*;
import com.facebook.ads.*;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.button.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import com.google.android.material.textfield.*;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.OSSubscriptionObserver;
import com.onesignal.OneSignal;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sayuti.lib.WaveSideBar;
import com.sayuti.lib.WaveSideBar.OnLetterSelectedListener;
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.*;
import org.json.*;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_CAMERAUTILS = 101;
	public final int REQ_CD_FILECOMP = 102;
	public final int REQ_CD_GOOGLELOGINFB = 103;
	
	private Timer _timer = new Timer();
	private String _ad_unit_id;
	private String _reward_ad_unit_id;
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private ImageView imageview2;
	private TextView textview3;
	private LinearLayout linear3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview27;
	private TextView textview13;
	private TextView textview14;
	private TextView textview17;
	private TextView textview16;
	private EditText edittext1;
	private EditText edittext3;
	private EditText edittext4;
	private EditText edittext5;
	private EditText edittext8;
	private EditText edittext2;
	private EditText edittext6;
	private AutoCompleteTextView autocomplete1;
	private AutoCompleteTextView autocomplete2;
	private AutoCompleteTextView autocomplete3;
	private AutoCompleteTextView autocomplete4;
	private MultiAutoCompleteTextView multiautocomplete1;
	private MultiAutoCompleteTextView multiautocomplete2;
	private MultiAutoCompleteTextView multiautocomplete3;
	private MultiAutoCompleteTextView multiautocomplete4;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button9;
	private Button button5;
	private Button button6;
	private Button button7;
	private MaterialButton materialbutton1;
	private MaterialButton materialbutton2;
	private MaterialButton materialbutton3;
	private MaterialButton materialbutton4;
	private MaterialButton materialbutton5;
	private CheckBox checkbox1;
	private CheckBox checkbox2;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	private Switch switch1;
	private Switch switch2;
	private SeekBar seekbar1;
	private SeekBar seekbar3;
	private SeekBar seekbar2;
	private ProgressBar progressbar1;
	private ProgressBar progressbar2;
	private RatingBar ratingbar1;
	private SearchView searchview1;
	private EditText edittext7;
	private TextView textview18;
	private ListView listview1;
	private GridView gridview1;
	private RecyclerView recyclerview1;
	private Spinner spinner1;
	private ViewPager viewpager1;
	private TextView textview19;
	private ImageView imageview3;
	private ImageView imageview4;
	private CircleImageView circleimageview1;
	private CircleImageView circleimageview2;
	private VideoView videoview2;
	private TextView textview20;
	private CodeView codeview1;
	private LottieAnimationView lottie1;
	private PatternLockView patternlockview1;
	private OTPView otpview1;
	private BadgeView badgeview1;
	private WaveSideBar wavesidebar1;
	private TextView textview21;
	private SignInButton signinbutton1;
	private YouTubePlayerView youtube1;
	private MapView mapview1;
	private GoogleMapController _mapview1_controller;
	private TextView textview22;
	private AdView adview1;
	private AdView adview2;
	private AdView adview3;
	private AdView adview4;
	private Button button8;
	private TextView textview23;
	private WebView webview1;
	private TextView textview24;
	private RadioGroup radiogroup1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ScrollView vscroll2;
	private HorizontalScrollView hscroll1;
	private TextView textview25;
	private CardView cardview1;
	private TextInputLayout textinputlayout1;
	private SwipeRefreshLayout swiperefreshlayout1;
	private CollapsingToolbarLayout collapsingtoolbar1;
	private TabLayout tablayout1;
	private BottomNavigationView bottomnavigation1;
	private TextView textview26;
	private AnalogClock analogclock1;
	private TimePicker timepicker1;
	private DigitalClock digitalclock1;
	private DigitalClock digitalclock2;
	private DigitalClock digitalclock3;
	private DigitalClock digitalclock4;
	private CalendarView calendarview1;
	private DatePicker datepicker1;
	
	private Intent intentcomp = new Intent();
	private SharedPreferences sharedpreferencescomp;
	private Calendar calendarcomp = Calendar.getInstance();
	private Vibrator vibratorcomp;
	private TimerTask timercomp;
	private AlertDialog.Builder dialogcomp;
	private MediaPlayer mediacomp;
	private SoundPool soundpoolcomp;
	private ObjectAnimator objectanimatorcomp = new ObjectAnimator();
	private Intent camerautils = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_camerautils;
	private Intent filecomp = new Intent(Intent.ACTION_GET_CONTENT);
	private SensorManager gyroscopecomp;
	private SensorEventListener _gyroscopecomp_sensor_listener;
	private InterstitialAd interstitialads;
	private InterstitialAdLoadCallback _interstitialads_interstitial_ad_load_callback;
	private FullScreenContentCallback _interstitialads_full_screen_content_callback;
	private TextToSpeech texttospeech;
	private SpeechRecognizer speechtotext;
	private RequestNetwork requestnetworkcomp;
	private RequestNetwork.RequestListener _requestnetworkcomp_request_listener;
	private BluetoothConnect bluetoothutils;
	private BluetoothConnect.BluetoothConnectionListener _bluetoothutils_bluetooth_connection_listener;
	private LocationManager gpsmanager;
	private LocationListener _gpsmanager_location_listener;
	private RewardedAd rewardedvideoad;
	private OnUserEarnedRewardListener _rewardedvideoad_on_user_earned_reward_listener;
	private RewardedAdLoadCallback _rewardedvideoad_rewarded_ad_load_callback;
	private FullScreenContentCallback _rewardedvideoad_full_screen_content_callback;
	private ProgressDialog progressdialog;
	private DatePickerDialog datepickerdialog;
	private TimePickerDialog timepickerdialog;
	private TimePickerDialog.OnTimeSetListener timepickerdialog_listener;
	private Notification notificationutils;
	private FragmentadapterFragmentAdapter fragmentadapter;
	private PhoneAuthProvider.OnVerificationStateChangedCallbacks phoneauthfb;private PhoneAuthProvider.ForceResendingToken phoneauthfb_resendToken;
	
	private OnCompleteListener cloudmessagesfb_onCompleteListener;
	private GoogleSignInClient googleloginfb;
	private OSSubscriptionObserver onesignalfb;
	private com.facebook.ads.AdView facebookadsbanner;
	private AdListener facebookadsbanner_AdListener;
	private com.facebook.ads.InterstitialAd facebookads;
	private InterstitialAdListener facebookads_InterstitialAdListener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		
		MobileAds.initialize(this);
		_ad_unit_id = "AdmobInterestitialId";_reward_ad_unit_id = "AdmobRewardAdId";
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO, Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = findViewById(R.id._fab);
		
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		imageview2 = findViewById(R.id.imageview2);
		textview3 = findViewById(R.id.textview3);
		linear3 = findViewById(R.id.linear3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview27 = findViewById(R.id.textview27);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		edittext1 = findViewById(R.id.edittext1);
		edittext3 = findViewById(R.id.edittext3);
		edittext4 = findViewById(R.id.edittext4);
		edittext5 = findViewById(R.id.edittext5);
		edittext8 = findViewById(R.id.edittext8);
		edittext2 = findViewById(R.id.edittext2);
		edittext6 = findViewById(R.id.edittext6);
		autocomplete1 = findViewById(R.id.autocomplete1);
		autocomplete2 = findViewById(R.id.autocomplete2);
		autocomplete3 = findViewById(R.id.autocomplete3);
		autocomplete4 = findViewById(R.id.autocomplete4);
		multiautocomplete1 = findViewById(R.id.multiautocomplete1);
		multiautocomplete2 = findViewById(R.id.multiautocomplete2);
		multiautocomplete3 = findViewById(R.id.multiautocomplete3);
		multiautocomplete4 = findViewById(R.id.multiautocomplete4);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button9 = findViewById(R.id.button9);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		materialbutton1 = findViewById(R.id.materialbutton1);
		materialbutton2 = findViewById(R.id.materialbutton2);
		materialbutton3 = findViewById(R.id.materialbutton3);
		materialbutton4 = findViewById(R.id.materialbutton4);
		materialbutton5 = findViewById(R.id.materialbutton5);
		checkbox1 = findViewById(R.id.checkbox1);
		checkbox2 = findViewById(R.id.checkbox2);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		switch1 = findViewById(R.id.switch1);
		switch2 = findViewById(R.id.switch2);
		seekbar1 = findViewById(R.id.seekbar1);
		seekbar3 = findViewById(R.id.seekbar3);
		seekbar2 = findViewById(R.id.seekbar2);
		progressbar1 = findViewById(R.id.progressbar1);
		progressbar2 = findViewById(R.id.progressbar2);
		ratingbar1 = findViewById(R.id.ratingbar1);
		searchview1 = findViewById(R.id.searchview1);
		edittext7 = findViewById(R.id.edittext7);
		textview18 = findViewById(R.id.textview18);
		listview1 = findViewById(R.id.listview1);
		gridview1 = findViewById(R.id.gridview1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		spinner1 = findViewById(R.id.spinner1);
		viewpager1 = findViewById(R.id.viewpager1);
		textview19 = findViewById(R.id.textview19);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		circleimageview1 = findViewById(R.id.circleimageview1);
		circleimageview2 = findViewById(R.id.circleimageview2);
		videoview2 = findViewById(R.id.videoview2);
		MediaController videoview2_controller = new MediaController(this);
		videoview2.setMediaController(videoview2_controller);
		textview20 = findViewById(R.id.textview20);
		codeview1 = findViewById(R.id.codeview1);
		lottie1 = findViewById(R.id.lottie1);
		patternlockview1 = findViewById(R.id.patternlockview1);
		otpview1 = findViewById(R.id.otpview1);
		badgeview1 = findViewById(R.id.badgeview1);
		wavesidebar1 = findViewById(R.id.wavesidebar1);
		textview21 = findViewById(R.id.textview21);
		signinbutton1 = findViewById(R.id.signinbutton1);
		youtube1 = findViewById(R.id.youtube1);
		mapview1 = findViewById(R.id.mapview1);
		mapview1.onCreate(_savedInstanceState);
		
		textview22 = findViewById(R.id.textview22);
		adview1 = findViewById(R.id.adview1);
		adview2 = findViewById(R.id.adview2);
		adview3 = findViewById(R.id.adview3);
		adview4 = findViewById(R.id.adview4);
		button8 = findViewById(R.id.button8);
		textview23 = findViewById(R.id.textview23);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview24 = findViewById(R.id.textview24);
		radiogroup1 = findViewById(R.id.radiogroup1);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		vscroll2 = findViewById(R.id.vscroll2);
		hscroll1 = findViewById(R.id.hscroll1);
		textview25 = findViewById(R.id.textview25);
		cardview1 = findViewById(R.id.cardview1);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		swiperefreshlayout1 = findViewById(R.id.swiperefreshlayout1);
		collapsingtoolbar1 = findViewById(R.id.collapsingtoolbar1);
		tablayout1 = findViewById(R.id.tablayout1);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		textview26 = findViewById(R.id.textview26);
		analogclock1 = findViewById(R.id.analogclock1);
		timepicker1 = findViewById(R.id.timepicker1);
		digitalclock1 = findViewById(R.id.digitalclock1);
		digitalclock2 = findViewById(R.id.digitalclock2);
		digitalclock3 = findViewById(R.id.digitalclock3);
		digitalclock4 = findViewById(R.id.digitalclock4);
		calendarview1 = findViewById(R.id.calendarview1);
		datepicker1 = findViewById(R.id.datepicker1);
		sharedpreferencescomp = getSharedPreferences("SPfilename", Activity.MODE_PRIVATE);
		vibratorcomp = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		dialogcomp = new AlertDialog.Builder(this);
		_file_camerautils = FileUtil.createNewPictureFile(getApplicationContext());
		Uri _uri_camerautils;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_camerautils = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", _file_camerautils);
		} else {
			_uri_camerautils = Uri.fromFile(_file_camerautils);
		}
		camerautils.putExtra(MediaStore.EXTRA_OUTPUT, _uri_camerautils);
		camerautils.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		filecomp.setType("*/*");
		filecomp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		gyroscopecomp = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		if (gyroscopecomp.getDefaultSensor(Sensor.TYPE_GYROSCOPE) == null) {
			SketchwareUtil.showMessage(getApplicationContext(), "Gyroscope is not supported on this device");
		}
		texttospeech = new TextToSpeech(getApplicationContext(), null);
		speechtotext = SpeechRecognizer.createSpeechRecognizer(this);
		requestnetworkcomp = new RequestNetwork(this);
		bluetoothutils = new BluetoothConnect(this);
		gpsmanager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		datepickerdialog = new DatePickerDialog(this);
		timepickerdialog = new TimePickerDialog(this, timepickerdialog_listener, Calendar.HOUR_OF_DAY, Calendar.MINUTE, false);
		fragmentadapter = new FragmentadapterFragmentAdapter(getApplicationContext(), getSupportFragmentManager());
		
		textview17.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Long Tap.");
				return true;
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Normal tap.");
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button5.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Long tap.");
				return true;
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Normal tap.");
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				{
					AdRequest adRequest = new AdRequest.Builder().build();
					InterstitialAd.load(MainActivity.this, _ad_unit_id, adRequest, _interstitialads_interstitial_ad_load_callback);
				}
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_gyroscopecomp_sensor_listener = new SensorEventListener() {
			@Override
			public void onSensorChanged(SensorEvent _param1) {
				float[] _rotationMatrix = new float[16];
				SensorManager.getRotationMatrixFromVector(_rotationMatrix, _param1.values);
				float[] _remappedRotationMatrix = new float[16];
				SensorManager.remapCoordinateSystem(_rotationMatrix, SensorManager.AXIS_X, SensorManager.AXIS_Z, _remappedRotationMatrix);
				float[] _orientations = new float[3];
				SensorManager.getOrientation(_remappedRotationMatrix, _orientations);
				for (int _i = 0; _i < 3; _i++) {
					_orientations[_i] = (float)(Math.toDegrees(_orientations[_i]));
				}
				final double _x = _orientations[0];
				final double _y = _orientations[1];
				final double _z = _orientations[2];
				
			}
			
			@Override
			public void onAccuracyChanged(Sensor _param1, int _param2) {
				
			}
		};
		gyroscopecomp.registerListener(_gyroscopecomp_sensor_listener, gyroscopecomp.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR), SensorManager.SENSOR_DELAY_NORMAL);
		
		_requestnetworkcomp_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_bluetoothutils_bluetooth_connection_listener = new BluetoothConnect.BluetoothConnectionListener() {
			@Override
			public void onConnected(String _param1, HashMap<String, Object> _param2) {
				final String _tag = _param1;
				final HashMap<String, Object> _deviceData = _param2;
				
			}
			
			@Override
			public void onDataReceived(String _param1, byte[] _param2, int _param3) {
				final String _tag = _param1;
				final String _data = new String(_param2, 0, _param3);
				
			}
			
			@Override
			public void onDataSent(String _param1, byte[] _param2) {
				final String _tag = _param1;
				final String _data = new String(_param2);
				
			}
			
			@Override
			public void onConnectionError(String _param1, String _param2, String _param3) {
				final String _tag = _param1;
				final String _connectionState = _param2;
				final String _errorMessage = _param3;
				
			}
			
			@Override
			public void onConnectionStopped(String _param1) {
				final String _tag = _param1;
				
			}
		};
		
		_interstitialads_interstitial_ad_load_callback = new InterstitialAdLoadCallback() {
			@Override
			public void onAdLoaded(InterstitialAd _param1) {
				interstitialads = _param1;
				if (interstitialads != null) {
					interstitialads.show(MainActivity.this);
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "Error: InterstitialAd interstitialads hasn't been loaded yet!");
				}
			}
			
			@Override
			public void onAdFailedToLoad(LoadAdError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				SketchwareUtil.showMessage(getApplicationContext(), "Interstitial Ad failed to load and show! You may have adblock enabled or didnt set it up correctly.Make sure you dont have an adblocking dns active.");
			}
		};
		
		_interstitialads_full_screen_content_callback = new FullScreenContentCallback() {
			@Override
			public void onAdDismissedFullScreenContent() {
				
			}
			
			@Override
			public void onAdFailedToShowFullScreenContent(AdError _adError) {
				final int _errorCode = _adError.getCode();
				final String _errorMessage = _adError.getMessage();
				
			}
			
			@Override
			public void onAdShowedFullScreenContent() {
				
			}
		};
	}
	
	private void initializeLogic() {
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview1.loadAd(adRequest);
		}
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview2.loadAd(adRequest);
		}
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview3.loadAd(adRequest);
		}
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview4.loadAd(adRequest);
		}
		webview1.loadUrl("WebviewUrl");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mapview1.onDestroy();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		mapview1.onStart();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		mapview1.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		mapview1.onResume();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		mapview1.onStop();
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}