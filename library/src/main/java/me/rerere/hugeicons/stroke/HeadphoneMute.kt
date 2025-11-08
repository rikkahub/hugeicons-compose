package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HeadphoneMute: ImageVector
    get() {
        if (_headphoneMute != null) {
            return _headphoneMute!!
        }
        _headphoneMute = ImageVector.Builder(
            name = "HeadphoneMute",
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
        moveTo(8.97651f, 19.6043f)
        lineTo(7.23857f, 14.6127f)
        curveTo(7.05341f, 14.1466f, 6.4617f, 13.9131f, 5.97493f, 14.0297f)
        curveTo(4.46441f, 14.5333f, 3.6462f, 16.1718f, 4.14742f, 17.6895f)
        lineTo(4.58543f, 19.0158f)
        curveTo(5.08664f, 20.5334f, 6.71747f, 21.3555f, 8.22799f, 20.8519f)
        curveTo(8.68896f, 20.6556f, 9.10449f, 20.0897f, 8.97651f, 19.6043f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2065f, 16.207f)
        lineTo(15.0235f, 19.6048f)
        curveTo(14.8955f, 20.0902f, 15.311f, 20.6561f, 15.772f, 20.8524f)
        curveTo(17.1843f, 21.3232f, 18.7018f, 20.6352f, 19.3028f, 19.3033f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.91512f, 17f)
        curveTo(3.41512f, 15.5f, 3f, 13.4368f, 3f, 12f)
        curveTo(3f, 9.51472f, 4.00736f, 7.26472f, 5.63604f, 5.63604f)
        moveTo(7.95702f, 3.95702f)
        curveTo(9.17263f, 3.34477f, 10.546f, 3f, 12f, 3f)
        curveTo(16.9706f, 3f, 21f, 7.02944f, 21f, 12f)
        curveTo(21f, 13.224f, 20.6987f, 14.9026f, 20.3004f, 16.3004f)
        }
        }.build()

        return _headphoneMute!!
    }

private var _headphoneMute: ImageVector? = null
