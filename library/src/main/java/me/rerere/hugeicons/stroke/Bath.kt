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

val HugeIcons.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = ImageVector.Builder(
            name = "Bath",
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
            moveTo(19f, 10f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 10f, 3f, 10.8954f, 3f, 12f)
            curveTo(3f, 15.3137f, 5.68629f, 18f, 9f, 18f)
            horizontalLineTo(15f)
            curveTo(18.3137f, 18f, 21f, 15.3137f, 21f, 12f)
            curveTo(21f, 10.8954f, 20.1046f, 10f, 19f, 10f)
            close()
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
            moveTo(5f, 10f)
            verticalLineTo(6.5f)
            curveTo(5f, 5.67157f, 5.67157f, 5f, 6.5f, 5f)
            curveTo(7.32843f, 5f, 8f, 5.67157f, 8f, 6.5f)
            verticalLineTo(7f)
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
            moveTo(7f, 18f)
            lineTo(6f, 19f)
            moveTo(17f, 18f)
            lineTo(18f, 19f)
        }
        }.build()

        return _bath!!
    }

private var _bath: ImageVector? = null
