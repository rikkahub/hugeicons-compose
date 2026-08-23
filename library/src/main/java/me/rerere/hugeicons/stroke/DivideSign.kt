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

val HugeIcons.DivideSign: ImageVector
    get() {
        if (_divideSign != null) {
            return _divideSign!!
        }
        _divideSign = ImageVector.Builder(
            name = "DivideSign",
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
            moveTo(3f, 12f)
            horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 5.5f)
            curveTo(14.5f, 6.88071f, 13.3807f, 8f, 12f, 8f)
            curveTo(10.6193f, 8f, 9.5f, 6.88071f, 9.5f, 5.5f)
            curveTo(9.5f, 4.11929f, 10.6193f, 3f, 12f, 3f)
            curveTo(13.3807f, 3f, 14.5f, 4.11929f, 14.5f, 5.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 18.5f)
            curveTo(14.5f, 19.8807f, 13.3807f, 21f, 12f, 21f)
            curveTo(10.6193f, 21f, 9.5f, 19.8807f, 9.5f, 18.5f)
            curveTo(9.5f, 17.1193f, 10.6193f, 16f, 12f, 16f)
            curveTo(13.3807f, 16f, 14.5f, 17.1193f, 14.5f, 18.5f)
            close()
        }
        }.build()

        return _divideSign!!
    }

private var _divideSign: ImageVector? = null
