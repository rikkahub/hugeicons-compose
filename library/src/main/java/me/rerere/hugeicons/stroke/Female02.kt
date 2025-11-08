package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Female02: ImageVector
    get() {
        if (_female02 != null) {
            return _female02!!
        }
        _female02 = ImageVector.Builder(
            name = "Female02",
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
        moveTo(14.5f, 16.5f)
        lineTo(18.216f, 17.6177f)
        curveTo(19.6034f, 18.0423f, 20.6341f, 19.1553f, 20.9763f, 20.5099f)
        curveTo(21.1115f, 21.0456f, 20.6489f, 21.5f, 20.0936f, 21.5f)
        horizontalLineTo(3.90639f)
        curveTo(3.35107f, 21.5f, 2.88845f, 21.0456f, 3.02375f, 20.5099f)
        curveTo(3.36593f, 19.1553f, 4.39659f, 18.0423f, 5.78401f, 17.6177f)
        lineTo(9.5f, 16.5f)
        verticalLineTo(14.345f)
        curveTo(8.21522f, 14.1822f, 7.03039f, 13.897f, 6f, 13.5161f)
        curveTo(6.5f, 12.5322f, 7f, 11.0563f, 7f, 7.61264f)
        curveTo(7f, 1.70919f, 12.5f, 1.70912f, 14f, 3.67672f)
        curveTo(17f, 3.18499f, 17f, 5.64483f, 17f, 8.59655f)
        curveTo(17f, 10.9579f, 17.6667f, 12.8602f, 18f, 13.5161f)
        curveTo(16.9696f, 13.897f, 15.7848f, 14.1822f, 14.5f, 14.345f)
        verticalLineTo(16.5f)
        }
        }.build()

        return _female02!!
    }

private var _female02: ImageVector? = null
