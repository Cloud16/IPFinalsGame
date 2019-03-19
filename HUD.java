import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

struct My_HealthBar
{
float current_health;
float max_health;
float percentage;
};
My_HealthBar HealthBar = new My_HealthBar;

void inits(void)
{
HealthBar.current_health= 40; //Setting some health
HealthBar.max_health=40; //Setting the maximum health
Healthbar.percentage = (HealthBar.current_health/HealthBar.max_health)*100;
}
init_bar();