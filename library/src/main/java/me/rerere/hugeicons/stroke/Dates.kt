package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dates: ImageVector
    get() {
        if (_dates != null) {
            return _dates!!
        }
        _dates = ImageVector.Builder(
            name = "Dates",
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
        moveTo(10.9634f, 5.99557f)
        curveTo(11.3365f, 7.83872f, 10.127f, 10.4978f, 6.95583f, 9.91143f)
        moveTo(7.83332f, 7.06718f)
        curveTo(8.72631f, 6.01842f, 10.8938f, 5.58672f, 13.4666f, 6.46785f)
        curveTo(14.5794f, 6.77285f, 16.9811f, 7.96207f, 18.0835f, 8.84055f)
        curveTo(19.4289f, 9.73549f, 21.3449f, 11.6344f, 21.845f, 13.6086f)
        curveTo(22.3911f, 15.4268f, 21.5448f, 18.1685f, 18.8879f, 19.9665f)
        curveTo(16.347f, 21.6859f, 12.787f, 21.7306f, 9.33138f, 16.37f)
        curveTo(9.20417f, 16.37f, 5.22995f, 9.90451f, 7.83332f, 7.06718f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99951f, 14.0814f)
        curveTo(4.0584f, 13.6671f, 6.39963f, 14.9254f, 5.99795f, 17.9958f)
        moveTo(16.9374f, 7.80658f)
        curveTo(16.9374f, 7.61715f, 16.5264f, 6.65927f, 16.1206f, 6.15985f)
        curveTo(14.2926f, 3.52828f, 11.5813f, 2.581f, 9.67688f, 3.16951f)
        curveTo(7.7013f, 3.664f, 5.81042f, 5.50484f, 4.91167f, 6.84773f)
        curveTo(3.8491f, 8.13919f, 2.79227f, 10.354f, 2.48411f, 11.4659f)
        curveTo(1.59567f, 14.0363f, 2.01008f, 16.2589f, 3.05626f, 17.1549f)
        curveTo(3.74123f, 17.7931f, 5.92049f, 18.6866f, 9.15774f, 17.1549f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0018f, 13.0212f)
        curveTo(11.0018f, 13.0212f, 11.0011f, 14.2451f, 12.2191f, 14.2446f)
        curveTo(13.4372f, 14.2441f, 13.4366f, 15.4678f, 13.4366f, 15.4678f)
        moveTo(14.0116f, 9.99738f)
        curveTo(14.0116f, 9.99738f, 14.0109f, 11.2213f, 15.2289f, 11.2208f)
        curveTo(16.447f, 11.2203f, 16.4464f, 12.4439f, 16.4464f, 12.4439f)
        moveTo(15.567f, 14.5509f)
        curveTo(15.567f, 14.5509f, 15.5663f, 15.7747f, 16.7843f, 15.7742f)
        curveTo(18.0024f, 15.7737f, 18.0018f, 16.9974f, 18.0018f, 16.9974f)
        }
        }.build()

        return _dates!!
    }

private var _dates: ImageVector? = null
