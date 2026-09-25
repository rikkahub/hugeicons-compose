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

val HugeIcons.CircleArrowRightDouble: ImageVector
    get() {
        if (_circleArrowRightDouble != null) {
            return _circleArrowRightDouble!!
        }
        _circleArrowRightDouble = ImageVector.Builder(
            name = "CircleArrowRightDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(12.9154f, 15f)
            curveTo(12.9154f, 15f, 15.5f, 12.7905f, 15.5f, 12f)
            curveTo(15.5f, 11.2094f, 12.9154f, 9f, 12.9154f, 9f)
            moveTo(8.50002f, 15f)
            curveTo(8.50002f, 15f, 11.0846f, 12.7905f, 11.0846f, 12f)
            curveTo(11.0846f, 11.2094f, 8.5f, 9f, 8.5f, 9f)
        }
        }.build()

        return _circleArrowRightDouble!!
    }

private var _circleArrowRightDouble: ImageVector? = null
