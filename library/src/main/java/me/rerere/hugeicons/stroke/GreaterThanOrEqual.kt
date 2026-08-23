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

val HugeIcons.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) {
            return _greaterThanOrEqual!!
        }
        _greaterThanOrEqual = ImageVector.Builder(
            name = "GreaterThanOrEqual",
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
            moveTo(19f, 15f)
            lineTo(5f, 19.5f)
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
            moveTo(5f, 4.5f)
            lineTo(15.1461f, 7.58595f)
            curveTo(17.7154f, 8.3674f, 19f, 8.75812f, 19f, 9.5f)
            curveTo(19f, 10.2419f, 17.7154f, 10.6326f, 15.1461f, 11.414f)
            lineTo(5f, 14.5f)
        }
        }.build()

        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
