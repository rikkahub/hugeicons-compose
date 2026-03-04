package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Reminder: ImageVector
    get() {
        if (_reminder != null) {
            return _reminder!!
        }
        _reminder = ImageVector.Builder(
            name = "Reminder",
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
        moveTo(12.9474f, 19f)
        curveTo(12.8695f, 20.0216f, 12.6757f, 20.6899f, 12.1945f, 21.1799f)
        curveTo(11.3891f, 22f, 10.0927f, 22f, 7.5f, 22f)
        curveTo(4.90728f, 22f, 3.61091f, 22f, 2.80546f, 21.1799f)
        curveTo(2f, 20.3598f, 2f, 19.0398f, 2f, 16.4f)
        verticalLineTo(11.6f)
        curveTo(2f, 8.96011f, 2f, 7.64018f, 2.80546f, 6.82007f)
        curveTo(3.29517f, 6.32146f, 3.96634f, 6.126f, 5f, 6.04938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49199f, 19.0005f)
        horizontalLineTo(7.50098f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0785f, 2.00055f)
        horizontalLineTo(13.9215f)
        curveTo(11.0208f, 2.00055f, 9.57048f, 2.00055f, 8.70959f, 2.9038f)
        curveTo(7.8487f, 3.80705f, 7.93917f, 5.23383f, 8.12011f, 8.08738f)
        lineTo(8.24595f, 10.0721f)
        curveTo(8.28754f, 10.7279f, 8.30833f, 11.0558f, 8.38194f, 11.3293f)
        curveTo(8.66622f, 12.3855f, 9.53533f, 13.1903f, 10.6225f, 13.4041f)
        curveTo(10.904f, 13.4594f, 11.2373f, 13.4594f, 11.904f, 13.4594f)
        curveTo(12.8328f, 13.4594f, 12.8202f, 14.2266f, 12.8202f, 14.9859f)
        curveTo(12.8202f, 15.575f, 12.8202f, 15.8695f, 13.0121f, 15.9708f)
        curveTo(13.204f, 16.072f, 13.4526f, 15.9086f, 13.9499f, 15.5818f)
        lineTo(16.9093f, 13.6372f)
        curveTo(17.1029f, 13.5099f, 17.2769f, 13.4594f, 17.5048f, 13.4594f)
        curveTo(18.727f, 13.4594f, 19.3381f, 13.4594f, 19.8333f, 13.2756f)
        curveTo(21.5492f, 12.6385f, 21.6918f, 11.0531f, 21.7909f, 9.4905f)
        lineTo(21.8799f, 8.08738f)
        curveTo(22.0608f, 5.23383f, 22.1513f, 3.80705f, 21.2904f, 2.9038f)
        curveTo(20.4295f, 2.00055f, 18.9792f, 2.00055f, 16.0785f, 2.00055f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.8342f, 8.42912f)
        curveTo(11.4258f, 6.71484f, 14.9993f, 5.00055f, 14.9993f, 5.00055f)
        curveTo(14.9993f, 5.00055f, 18.5746f, 6.71484f, 16.1663f, 8.42912f)
        moveTo(13.8342f, 8.42912f)
        horizontalLineTo(16.1663f)
        moveTo(13.8342f, 8.42912f)
        lineTo(13.2507f, 11.0005f)
        moveTo(16.1663f, 8.42912f)
        lineTo(16.9821f, 11.0005f)
        }
        }.build()

        return _reminder!!
    }

private var _reminder: ImageVector? = null
