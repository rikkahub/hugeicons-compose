package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) {
            return _lessThanOrEqual!!
        }
        _lessThanOrEqual = ImageVector.Builder(
            name = "LessThanOrEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19f, 4.5f)
            lineTo(8.85391f, 7.58595f)
            curveTo(6.28464f, 8.3674f, 5f, 8.75812f, 5f, 9.5f)
            curveTo(5f, 10.2419f, 6.28464f, 10.6326f, 8.85391f, 11.414f)
            lineTo(19f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 15f)
            lineTo(19f, 19.5f)
        }
        }.build()

        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
