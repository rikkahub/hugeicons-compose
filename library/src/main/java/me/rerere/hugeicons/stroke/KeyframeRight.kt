package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeRight: ImageVector
    get() {
        if (_keyframeRight != null) {
            return _keyframeRight!!
        }
        _keyframeRight = ImageVector.Builder(
            name = "KeyframeRight",
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
        moveTo(5.00253f, 13.3091f)
        curveTo(4.33418f, 12.7049f, 4f, 12.4029f, 4f, 12f)
        curveTo(4f, 11.5971f, 4.33418f, 11.2951f, 5.00253f, 10.6909f)
        lineTo(6.64627f, 9.20515f)
        curveTo(7.53512f, 8.40172f, 7.97954f, 8f, 8.5f, 8f)
        curveTo(9.02046f, 8f, 9.46488f, 8.40172f, 10.3537f, 9.20515f)
        lineTo(11.9975f, 10.6909f)
        curveTo(12.6658f, 11.2951f, 13f, 11.5971f, 13f, 12f)
        curveTo(13f, 12.4029f, 12.6658f, 12.7049f, 11.9975f, 13.3091f)
        lineTo(10.3537f, 14.7948f)
        curveTo(9.46488f, 15.5983f, 9.02046f, 16f, 8.5f, 16f)
        curveTo(7.97954f, 16f, 7.53512f, 15.5983f, 6.64627f, 14.7948f)
        lineTo(5.00253f, 13.3091f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        horizontalLineTo(20f)
        moveTo(20f, 21f)
        lineTo(20f, 3f)
        }
        }.build()

        return _keyframeRight!!
    }

private var _keyframeRight: ImageVector? = null
