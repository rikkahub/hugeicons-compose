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

val HugeIcons.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) {
            return _dollarSign!!
        }
        _dollarSign = ImageVector.Builder(
            name = "DollarSign",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.5f, 8.62963f)
            curveTo(17.5f, 6.62504f, 15.0376f, 5f, 12f, 5f)
            curveTo(8.96243f, 5f, 6.5f, 6.62504f, 6.5f, 8.62963f)
            curveTo(6.5f, 10.6342f, 8f, 11.7407f, 12f, 11.7407f)
            curveTo(16f, 11.7407f, 18f, 12.7778f, 18f, 15.3704f)
            curveTo(18f, 17.963f, 15.5f, 19f, 12f, 19f)
            curveTo(8.5f, 19f, 6f, 17.5f, 6f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 3f)
            verticalLineTo(21f)
        }
        }.build()

        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
