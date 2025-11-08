package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeBottom: ImageVector
    get() {
        if (_keyframeBottom != null) {
            return _keyframeBottom!!
        }
        _keyframeBottom = ImageVector.Builder(
            name = "KeyframeBottom",
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
        moveTo(10.6909f, 5.00254f)
        curveTo(11.2951f, 4.33418f, 11.5971f, 4f, 12f, 4f)
        curveTo(12.4029f, 4f, 12.7049f, 4.33418f, 13.3091f, 5.00253f)
        lineTo(14.7948f, 6.64627f)
        curveTo(15.5983f, 7.53512f, 16f, 7.97954f, 16f, 8.5f)
        curveTo(16f, 9.02046f, 15.5983f, 9.46488f, 14.7948f, 10.3537f)
        lineTo(13.3091f, 11.9975f)
        curveTo(12.7049f, 12.6658f, 12.4029f, 13f, 12f, 13f)
        curveTo(11.5971f, 13f, 11.2951f, 12.6658f, 10.6909f, 11.9975f)
        lineTo(9.20516f, 10.3537f)
        curveTo(8.40172f, 9.46488f, 8f, 9.02046f, 8f, 8.5f)
        curveTo(8f, 7.97954f, 8.40172f, 7.53512f, 9.20515f, 6.64627f)
        lineTo(10.6909f, 5.00254f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(20f)
        moveTo(3f, 20f)
        horizontalLineTo(21f)
        }
        }.build()

        return _keyframeBottom!!
    }

private var _keyframeBottom: ImageVector? = null
