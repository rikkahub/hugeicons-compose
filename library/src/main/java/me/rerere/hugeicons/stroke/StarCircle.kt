package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StarCircle: ImageVector
    get() {
        if (_starCircle != null) {
            return _starCircle!!
        }
        _starCircle = ImageVector.Builder(
            name = "StarCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.8638f, 7.72209f)
        lineTo(13.7437f, 9.49644f)
        curveTo(13.8637f, 9.74344f, 14.1837f, 9.98035f, 14.4536f, 10.0257f)
        lineTo(16.0485f, 10.2929f)
        curveTo(17.0684f, 10.4643f, 17.3083f, 11.2103f, 16.5734f, 11.9462f)
        lineTo(15.3335f, 13.1964f)
        curveTo(15.1236f, 13.4081f, 15.0086f, 13.8164f, 15.0736f, 14.1087f)
        lineTo(15.4285f, 15.6562f)
        curveTo(15.7085f, 16.8812f, 15.0636f, 17.355f, 13.9887f, 16.7148f)
        lineTo(12.4939f, 15.8226f)
        curveTo(12.2239f, 15.6613f, 11.7789f, 15.6613f, 11.504f, 15.8226f)
        lineTo(10.0091f, 16.7148f)
        curveTo(8.93925f, 17.355f, 8.28932f, 16.8761f, 8.56929f, 15.6562f)
        lineTo(8.92425f, 14.1087f)
        curveTo(8.98925f, 13.8164f, 8.87426f, 13.4081f, 8.66428f, 13.1964f)
        lineTo(7.42442f, 11.9462f)
        curveTo(6.6945f, 11.2103f, 6.92947f, 10.4643f, 7.94936f, 10.2929f)
        lineTo(9.54419f, 10.0257f)
        curveTo(9.80916f, 9.98035f, 10.1291f, 9.74344f, 10.2491f, 9.49644f)
        lineTo(11.129f, 7.72209f)
        curveTo(11.609f, 6.7593f, 12.3889f, 6.7593f, 12.8638f, 7.72209f)
        }
        }.build()

        return _starCircle!!
    }

private var _starCircle: ImageVector? = null
