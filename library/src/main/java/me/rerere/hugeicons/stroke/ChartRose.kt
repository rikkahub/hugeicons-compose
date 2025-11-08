package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartRose: ImageVector
    get() {
        if (_chartRose != null) {
            return _chartRose!!
        }
        _chartRose = ImageVector.Builder(
            name = "ChartRose",
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
        moveTo(9.713f, 7.97461f)
        curveTo(6.60492f, 7.97461f, 4.08533f, 10.2303f, 4.08533f, 13.0129f)
        horizontalLineTo(9.713f)
        verticalLineTo(7.97461f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.53453f, 15.926f)
        curveTo(3.77319f, 18.368f, 6.52105f, 20.0662f, 9.71196f, 20.0662f)
        lineTo(9.71196f, 13.0127f)
        horizontalLineTo(4.87217f)
        curveTo(3.40834f, 13.0127f, 2.67643f, 13.0127f, 2.23141f, 13.7319f)
        curveTo(1.78639f, 14.4511f, 2.03577f, 14.9427f, 2.53453f, 15.926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.7145f, 21.6766f)
        curveTo(16.8431f, 20.5311f, 19.8419f, 17.0854f, 19.8419f, 13.0127f)
        horizontalLineTo(9.7121f)
        verticalLineTo(19.0586f)
        curveTo(9.7121f, 20.5322f, 9.7121f, 21.269f, 10.3127f, 21.7226f)
        curveTo(10.9134f, 22.1763f, 11.5137f, 22.0097f, 12.7145f, 21.6766f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.6409f, 10.0343f)
        curveTo(20.4534f, 6.21439f, 17.0381f, 3.22528f, 12.7271f, 2.25958f)
        curveTo(11.4776f, 1.97968f, 10.8528f, 1.83973f, 10.2825f, 2.29354f)
        curveTo(9.7121f, 2.74735f, 9.7121f, 3.48208f, 9.7121f, 4.95155f)
        verticalLineTo(13.0127f)
        horizontalLineTo(19.054f)
        curveTo(20.5339f, 13.0127f, 21.2738f, 13.0127f, 21.7293f, 12.3984f)
        curveTo(22.1848f, 11.784f, 22.0035f, 11.2008f, 21.6409f, 10.0343f)
        }
        }.build()

        return _chartRose!!
    }

private var _chartRose: ImageVector? = null
