package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Teamviewer: ImageVector
    get() {
        if (_teamviewer != null) {
            return _teamviewer!!
        }
        _teamviewer = ImageVector.Builder(
            name = "Teamviewer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9973f, 12.0838f)
        curveTo(18.9627f, 12.6123f, 18.4918f, 13.0126f, 17.55f, 13.8133f)
        curveTo(16.0773f, 15.0654f, 15.3409f, 15.6914f, 14.7351f, 15.4483f)
        curveTo(14.6734f, 15.4236f, 14.6138f, 15.3931f, 14.5571f, 15.3574f)
        curveTo(14.1246f, 15.085f, 14.0279f, 14.42f, 14.0062f, 13.1982f)
        horizontalLineTo(9.99377f)
        curveTo(9.97214f, 14.42f, 9.87543f, 15.085f, 9.44294f, 15.3574f)
        curveTo(9.38619f, 15.3931f, 9.32661f, 15.4236f, 9.26489f, 15.4483f)
        curveTo(8.65908f, 15.6914f, 7.92271f, 15.0654f, 6.44997f, 13.8133f)
        curveTo(5.50821f, 13.0126f, 5.03733f, 12.6123f, 5.00274f, 12.0838f)
        curveTo(4.99909f, 12.028f, 4.99909f, 11.972f, 5.00274f, 11.9162f)
        curveTo(5.03733f, 11.3877f, 5.50821f, 10.9874f, 6.44997f, 10.1867f)
        curveTo(7.92271f, 8.93464f, 8.65908f, 8.3086f, 9.26489f, 8.55167f)
        curveTo(9.32661f, 8.57644f, 9.38619f, 8.60687f, 9.44294f, 8.64262f)
        curveTo(9.86305f, 8.90724f, 9.96633f, 9.54228f, 9.99172f, 10.6982f)
        horizontalLineTo(14.0083f)
        curveTo(14.0337f, 9.54228f, 14.1369f, 8.90724f, 14.5571f, 8.64262f)
        curveTo(14.6138f, 8.60687f, 14.6734f, 8.57644f, 14.7351f, 8.55167f)
        curveTo(15.3409f, 8.3086f, 16.0773f, 8.93464f, 17.55f, 10.1867f)
        curveTo(18.4918f, 10.9874f, 18.9627f, 11.3877f, 18.9973f, 11.9162f)
        curveTo(19.0009f, 11.972f, 19.0009f, 12.028f, 18.9973f, 12.0838f)
        }
        }.build()

        return _teamviewer!!
    }

private var _teamviewer: ImageVector? = null
