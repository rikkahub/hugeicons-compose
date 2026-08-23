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

val HugeIcons.RotateCwSquare: ImageVector
    get() {
        if (_rotateCwSquare != null) {
            return _rotateCwSquare!!
        }
        _rotateCwSquare = ImageVector.Builder(
            name = "RotateCwSquare",
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
            moveTo(12.5f, 5f)
            horizontalLineTo(7.5f)
            curveTo(6.57003f, 5f, 6.10504f, 5f, 5.72354f, 5.10222f)
            curveTo(4.68827f, 5.37962f, 3.87962f, 6.18827f, 3.60222f, 7.22354f)
            curveTo(3.5f, 7.60504f, 3.5f, 8.07003f, 3.5f, 9f)
            moveTo(3.5f, 13f)
            verticalLineTo(16f)
            curveTo(3.5f, 18.8284f, 3.5f, 20.2426f, 4.37868f, 21.1213f)
            curveTo(5.25736f, 22f, 6.67157f, 22f, 9.5f, 22f)
            horizontalLineTo(14.5f)
            curveTo(17.3284f, 22f, 18.7426f, 22f, 19.6213f, 21.1213f)
            curveTo(20.5f, 20.2426f, 20.5f, 18.8284f, 20.5f, 16f)
            verticalLineTo(9f)
            curveTo(20.5f, 8.07003f, 20.5f, 7.60504f, 20.3978f, 7.22354f)
            curveTo(20.1204f, 6.18827f, 19.3117f, 5.37962f, 18.2765f, 5.10222f)
            curveTo(17.895f, 5f, 17.43f, 5f, 16.5f, 5f)
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
            moveTo(9.50002f, 2f)
            curveTo(9.50002f, 2f, 12.5f, 4.20947f, 12.5f, 5.00002f)
            curveTo(12.5f, 5.79058f, 9.5f, 8f, 9.5f, 8f)
        }
        }.build()

        return _rotateCwSquare!!
    }

private var _rotateCwSquare: ImageVector? = null
