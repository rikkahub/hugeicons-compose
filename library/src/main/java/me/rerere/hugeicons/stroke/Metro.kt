package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Metro: ImageVector
    get() {
        if (_metro != null) {
            return _metro!!
        }
        _metro = ImageVector.Builder(
            name = "Metro",
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
        moveTo(6f, 19f)
        lineTo(4f, 21f)
        moveTo(18f, 19f)
        lineTo(20f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15f)
        horizontalLineTo(9.00896f)
        moveTo(14.991f, 15f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        curveTo(9f, 13f, 15.5f, 13f, 19f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.27322f, 7.89427f)
        curveTo(6.09442f, 3.71577f, 7.23046f, 3f, 11.4545f, 3f)
        horizontalLineTo(12.5455f)
        curveTo(16.7695f, 3f, 17.9056f, 3.71577f, 18.7268f, 7.89427f)
        lineTo(19.2802f, 10.71f)
        curveTo(20.0349f, 14.5503f, 20.4123f, 16.4705f, 19.312f, 17.7352f)
        curveTo(18.2118f, 19f, 16.1412f, 19f, 12f, 19f)
        curveTo(7.85879f, 19f, 5.78819f, 19f, 4.68796f, 17.7352f)
        curveTo(3.58773f, 16.4705f, 3.9651f, 14.5503f, 4.71984f, 10.71f)
        lineTo(5.27322f, 7.89427f)
        }
        }.build()

        return _metro!!
    }

private var _metro: ImageVector? = null
