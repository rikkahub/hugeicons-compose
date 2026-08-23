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

val HugeIcons.RectangleCircle: ImageVector
    get() {
        if (_rectangleCircle != null) {
            return _rectangleCircle!!
        }
        _rectangleCircle = ImageVector.Builder(
            name = "RectangleCircle",
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
            moveTo(22f, 12f)
            arcTo(8f, 8f, 0f, true, false, 6f, 12f)
            arcTo(8f, 8f, 0f, true, false, 22f, 12f)
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
            moveTo(2f, 14f)
            verticalLineTo(10f)
            curveTo(2f, 7.17157f, 2f, 5.75736f, 2.87868f, 4.87868f)
            curveTo(3.75736f, 4f, 5.17157f, 4f, 8f, 4f)
            horizontalLineTo(14f)
            verticalLineTo(20f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 20f, 3.75736f, 20f, 2.87868f, 19.1213f)
            curveTo(2f, 18.2426f, 2f, 16.8284f, 2f, 14f)
            close()
        }
        }.build()

        return _rectangleCircle!!
    }

private var _rectangleCircle: ImageVector? = null
