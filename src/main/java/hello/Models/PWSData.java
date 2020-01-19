package hello.Models;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PWSData {

    private String PASSKEY;
    private String stationtype;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private ZonedDateTime dateutc;
    private float tempinf;
    private float humidityin;
    private float baromrelin;
    private float baromabsin;
    private float tempf;
    private float humidity;
    private float winddir;
    private float windspeedmph;
    private float windgustmph;
    private float maxdailygust;
    private float solarradiation;
    private float uv;
    private float rainratein;
    private float eventrainin;
    private float hourlyrainin;
    private float dailyrainin;
    private float weeklyrainin;
    private float monthlyrainin;
    private float yearlyrainin;
    private float totalrainin;
    private float wh65batt;
    private String freq;
    private String model;

    public String getPASSKEY() {
        return PASSKEY;
    }

    public void setPASSKEY(String PASSKEY) {
        this.PASSKEY = PASSKEY;
    }

    public String getStationtype() {
        return stationtype;
    }

    public void setStationtype(String stationtype) {
        this.stationtype = stationtype;
    }

    public ZonedDateTime getDateutc() {
        return dateutc;
    }

    public void setDateutc(String dateutc) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateFormat sdf = new SimpleDateFormat(pattern);
        try {
            Date date = sdf.parse(dateutc);
            ZonedDateTime zdt = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC"));
            System.out.println(zdt.format(DateTimeFormatter.ofPattern(pattern)));
            this.dateutc=zdt;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //this.dateutc = dateutc;
    }

    public float getTempinf() {
        return tempinf;
    }

    public void setTempinf(float tempinf) {
        this.tempinf = tempinf;
    }

    public float getHumidityin() {
        return humidityin;
    }

    public void setHumidityin(float humidityin) {
        this.humidityin = humidityin;
    }

    public float getBaromrelin() {
        return baromrelin;
    }

    public void setBaromrelin(float baromrelin) {
        this.baromrelin = baromrelin;
    }

    public float getBaromabsin() {
        return baromabsin;
    }

    public void setBaromabsin(float baromabsin) {
        this.baromabsin = baromabsin;
    }

    public float getTempf() {
        return tempf;
    }

    public void setTempf(float tempf) {
        this.tempf = tempf;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getWinddir() {
        return winddir;
    }

    public void setWinddir(float winddir) {
        this.winddir = winddir;
    }

    public float getWindspeedmph() {
        return windspeedmph;
    }

    public void setWindspeedmph(float windspeedmph) {
        this.windspeedmph = windspeedmph;
    }

    public float getWindgustmph() {
        return windgustmph;
    }

    public void setWindgustmph(float windgustmph) {
        this.windgustmph = windgustmph;
    }

    public float getMaxdailygust() {
        return maxdailygust;
    }

    public void setMaxdailygust(float maxdailygust) {
        this.maxdailygust = maxdailygust;
    }

    public float getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(float solarradiation) {
        this.solarradiation = solarradiation;
    }

    public float getUv() {
        return uv;
    }

    public void setUv(float uv) {
        this.uv = uv;
    }

    public float getRainratein() {
        return rainratein;
    }

    public void setRainratein(float rainratein) {
        this.rainratein = rainratein;
    }

    public float getEventrainin() {
        return eventrainin;
    }

    public void setEventrainin(float eventrainin) {
        this.eventrainin = eventrainin;
    }

    public float getHourlyrainin() {
        return hourlyrainin;
    }

    public void setHourlyrainin(float hourlyrainin) {
        this.hourlyrainin = hourlyrainin;
    }

    public float getDailyrainin() {
        return dailyrainin;
    }

    public void setDailyrainin(float dailyrainin) {
        this.dailyrainin = dailyrainin;
    }

    public float getWeeklyrainin() {
        return weeklyrainin;
    }

    public void setWeeklyrainin(float weeklyrainin) {
        this.weeklyrainin = weeklyrainin;
    }

    public float getMonthlyrainin() {
        return monthlyrainin;
    }

    public void setMonthlyrainin(float monthlyrainin) {
        this.monthlyrainin = monthlyrainin;
    }

    public float getYearlyrainin() {
        return yearlyrainin;
    }

    public void setYearlyrainin(float yearlyrainin) {
        this.yearlyrainin = yearlyrainin;
    }

    public float getTotalrainin() {
        return totalrainin;
    }

    public void setTotalrainin(float totalrainin) {
        this.totalrainin = totalrainin;
    }

    public float getWh65batt() {
        return wh65batt;
    }

    public void setWh65batt(float wh65batt) {
        this.wh65batt = wh65batt;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PWSData{" +
                "dateutc=" + dateutc +
                ", tempinf=" + tempinf +
                ", humidityin=" + humidityin +
                ", baromrelin=" + baromrelin +
                ", baromabsin=" + baromabsin +
                ", tempf=" + tempf +
                ", humidity=" + humidity +
                ", winddir=" + winddir +
                ", windspeedmph=" + windspeedmph +
                ", windgustmph=" + windgustmph +
                ", maxdailygust=" + maxdailygust +
                ", solarradiation=" + solarradiation +
                ", uv=" + uv +
                ", rainratein=" + rainratein +
                ", eventrainin=" + eventrainin +
                ", hourlyrainin=" + hourlyrainin +
                ", dailyrainin=" + dailyrainin +
                ", weeklyrainin=" + weeklyrainin +
                ", monthlyrainin=" + monthlyrainin +
                ", yearlyrainin=" + yearlyrainin +
                ", totalrainin=" + totalrainin +
                ", wh65batt=" + wh65batt +
                ", freq='" + freq + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
