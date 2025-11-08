package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TrafficIncident: ImageVector
    get() {
        if (_trafficIncident != null) {
            return _trafficIncident!!
        }
        _trafficIncident = ImageVector.Builder(
            name = "TrafficIncident",
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
        moveTo(3f, 1.99774f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.7065f, 21.4604f)
        lineTo(10.7642f, 20.3555f)
        moveTo(10.7642f, 20.3555f)
        curveTo(11.0614f, 20.4324f, 11.5801f, 20.5692f, 11.8475f, 20.7111f)
        curveTo(14.1849f, 21.9509f, 14.724f, 22.3959f, 15.6596f, 21.6114f)
        lineTo(19.6081f, 17.7113f)
        curveTo(20.4039f, 16.7857f, 19.9641f, 16.2425f, 18.7478f, 13.8954f)
        curveTo(18.6087f, 13.6268f, 18.4423f, 13.142f, 18.3685f, 12.8444f)
        moveTo(10.7642f, 20.3555f)
        curveTo(9.6351f, 20.0633f, 8.61165f, 20.1531f, 7.91851f, 19.6217f)
        curveTo(7.80514f, 19.5348f, 6.70763f, 18.3994f, 5.90132f, 17.5855f)
        curveTo(5.29549f, 16.974f, 5.90619f, 16.4078f, 6.43603f, 15.7903f)
        curveTo(6.77273f, 15.3979f, 7.07438f, 14.969f, 7.43859f, 14.6019f)
        curveTo(9.4572f, 12.5671f, 10.8034f, 11.2332f, 12.8421f, 9.26272f)
        curveTo(13.2363f, 8.88166f, 13.7016f, 8.56633f, 14.1228f, 8.21523f)
        curveTo(14.5986f, 7.8187f, 15.1062f, 7.41457f, 15.6824f, 7.92444f)
        curveTo(16.5414f, 8.68456f, 17.6138f, 9.84647f, 17.6996f, 9.9606f)
        curveTo(18.2242f, 10.6584f, 18.0881f, 11.7139f, 18.3685f, 12.8444f)
        moveTo(10.7642f, 20.3555f)
        lineTo(18.3685f, 12.8444f)
        moveTo(18.3685f, 12.8444f)
        lineTo(19.4853f, 12.7076f)
        moveTo(8.02515f, 19.697f)
        lineTo(8.98808f, 18.466f)
        moveTo(10.9943f, 14.5029f)
        lineTo(12.7186f, 12.8895f)
        moveTo(16.506f, 10.9665f)
        lineTo(17.9194f, 10.3567f)
        moveTo(12.6945f, 9.36458f)
        lineTo(11.8555f, 8.48576f)
        curveTo(11.4739f, 8.08602f, 11.4897f, 7.4529f, 11.8908f, 7.07267f)
        lineTo(12.6923f, 6.31294f)
        curveTo(13.0846f, 5.94099f, 13.7021f, 5.94809f, 14.0858f, 6.32896f)
        lineTo(15.529f, 7.76154f)
        moveTo(7.40395f, 14.7194f)
        lineTo(6.53456f, 13.8706f)
        curveTo(6.13911f, 13.4845f, 5.50489f, 13.4922f, 5.11903f, 13.8879f)
        lineTo(4.34804f, 14.6784f)
        curveTo(3.97057f, 15.0654f, 3.96983f, 15.682f, 4.34637f, 16.0699f)
        lineTo(5.76263f, 17.5291f)
        }
        }.build()

        return _trafficIncident!!
    }

private var _trafficIncident: ImageVector? = null
