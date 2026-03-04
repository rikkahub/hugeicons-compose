package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InputShortText: ImageVector
    get() {
        if (_inputShortText != null) {
            return _inputShortText!!
        }
        _inputShortText = ImageVector.Builder(
            name = "InputShortText",
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
        moveTo(15f, 5f)
        verticalLineTo(19f)
        moveTo(15f, 5f)
        curveTo(15f, 3.89543f, 15.8954f, 3f, 17f, 3f)
        moveTo(15f, 5f)
        curveTo(15f, 3.89543f, 14.1046f, 3f, 13f, 3f)
        moveTo(15f, 19f)
        curveTo(15f, 20.1046f, 15.8954f, 21f, 17f, 21f)
        moveTo(15f, 19f)
        curveTo(15f, 20.1046f, 14.1046f, 21f, 13f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        lineTo(6.49694f, 9.38649f)
        curveTo(6.55771f, 9.15858f, 6.76412f, 9f, 7f, 9f)
        curveTo(7.23588f, 9f, 7.44229f, 9.15858f, 7.50307f, 9.38649f)
        lineTo(9f, 15f)
        moveTo(6f, 13f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
        horizontalLineTo(12f)
        moveTo(18f, 6.01732f)
        curveTo(19.5534f, 6.06413f, 20.48f, 6.23738f, 21.1213f, 6.87868f)
        curveTo(22f, 7.75736f, 22f, 9.17157f, 22f, 12f)
        curveTo(22f, 14.8284f, 22f, 16.2426f, 21.1213f, 17.1213f)
        curveTo(20.48f, 17.7626f, 19.5534f, 17.9359f, 18f, 17.9827f)
        }
        }.build()

        return _inputShortText!!
    }

private var _inputShortText: ImageVector? = null
