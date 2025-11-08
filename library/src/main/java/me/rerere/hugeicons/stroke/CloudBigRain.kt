package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudBigRain: ImageVector
    get() {
        if (_cloudBigRain != null) {
            return _cloudBigRain!!
        }
        _cloudBigRain = ImageVector.Builder(
            name = "CloudBigRain",
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
        moveTo(17.4776f, 9.00915f)
        curveTo(17.485f, 9.00911f, 17.4925f, 9.00909f, 17.5f, 9.00909f)
        curveTo(19.9853f, 9.00909f, 22f, 11.0269f, 22f, 13.5159f)
        curveTo(22f, 15.8512f, 20.2265f, 17.7716f, 17.9548f, 18f)
        moveTo(17.4776f, 9.00915f)
        curveTo(17.4924f, 8.8442f, 17.5f, 8.67716f, 17.5f, 8.50834f)
        curveTo(17.5f, 5.46617f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.21197f, 6.52042f, 8.03032f)
        moveTo(17.4776f, 9.00915f)
        curveTo(17.3753f, 10.1453f, 16.9286f, 11.182f, 16.2428f, 12.0136f)
        moveTo(6.52042f, 8.03032f)
        curveTo(3.98398f, 8.27205f, 2f, 10.4116f, 2f, 13.0152f)
        curveTo(2f, 15.4378f, 3.71776f, 17.536f, 6f, 18f)
        moveTo(6.52042f, 8.03032f)
        curveTo(6.67826f, 8.01527f, 6.83823f, 8.00758f, 7f, 8.00758f)
        curveTo(8.12582f, 8.00758f, 9.16474f, 8.38023f, 10.0005f, 9.00909f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 18.5034f)
        curveTo(9.5f, 17.2482f, 10.5532f, 16.0077f, 11.2924f, 15.2917f)
        curveTo(11.6939f, 14.9028f, 12.3061f, 14.9028f, 12.7076f, 15.2917f)
        curveTo(13.4468f, 16.0077f, 14.5f, 17.2482f, 14.5f, 18.5034f)
        curveTo(14.5f, 19.7341f, 13.5533f, 21f, 12f, 21f)
        curveTo(10.4467f, 21f, 9.5f, 19.7341f, 9.5f, 18.5034f)
        }
        }.build()

        return _cloudBigRain!!
    }

private var _cloudBigRain: ImageVector? = null
