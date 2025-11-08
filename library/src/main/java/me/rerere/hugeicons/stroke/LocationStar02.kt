package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationStar02: ImageVector
    get() {
        if (_locationStar02 != null) {
            return _locationStar02!!
        }
        _locationStar02 = ImageVector.Builder(
            name = "LocationStar02",
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
        moveTo(12f, 2f)
        curveTo(16.8706f, 2f, 21f, 6.03298f, 21f, 10.9258f)
        curveTo(21f, 15.8965f, 16.8033f, 19.3847f, 12.927f, 21.7567f)
        curveTo(12.6445f, 21.9162f, 12.325f, 22f, 12f, 22f)
        curveTo(11.675f, 22f, 11.3555f, 21.9162f, 11.073f, 21.7567f)
        curveTo(7.2039f, 19.3616f, 3f, 15.9137f, 3f, 10.9258f)
        curveTo(3f, 6.03298f, 7.12944f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6911f, 7.57767f)
        lineTo(13.395f, 8.99715f)
        curveTo(13.491f, 9.19475f, 13.7469f, 9.38428f, 13.9629f, 9.42057f)
        lineTo(15.2388f, 9.6343f)
        curveTo(16.0547f, 9.77141f, 16.2467f, 10.3682f, 15.6587f, 10.957f)
        lineTo(14.6668f, 11.9571f)
        curveTo(14.4989f, 12.1265f, 14.4069f, 12.4531f, 14.4589f, 12.687f)
        lineTo(14.7428f, 13.925f)
        curveTo(14.9668f, 14.9049f, 14.4509f, 15.284f, 13.591f, 14.7718f)
        lineTo(12.3951f, 14.0581f)
        curveTo(12.1791f, 13.929f, 11.8232f, 13.929f, 11.6032f, 14.0581f)
        lineTo(10.4073f, 14.7718f)
        curveTo(9.5514f, 15.284f, 9.03146f, 14.9009f, 9.25543f, 13.925f)
        lineTo(9.5394f, 12.687f)
        curveTo(9.5914f, 12.4531f, 9.49941f, 12.1265f, 9.33143f, 11.9571f)
        lineTo(8.33954f, 10.957f)
        curveTo(7.7556f, 10.3682f, 7.94358f, 9.77141f, 8.75949f, 9.6343f)
        lineTo(10.0353f, 9.42057f)
        curveTo(10.2473f, 9.38428f, 10.5033f, 9.19475f, 10.5993f, 8.99715f)
        lineTo(11.3032f, 7.57767f)
        curveTo(11.6872f, 6.80744f, 12.3111f, 6.80744f, 12.6911f, 7.57767f)
        }
        }.build()

        return _locationStar02!!
    }

private var _locationStar02: ImageVector? = null
