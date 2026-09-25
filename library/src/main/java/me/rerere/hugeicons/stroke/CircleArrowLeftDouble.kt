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

val HugeIcons.CircleArrowLeftDouble: ImageVector
    get() {
        if (_circleArrowLeftDouble != null) {
            return _circleArrowLeftDouble!!
        }
        _circleArrowLeftDouble = ImageVector.Builder(
            name = "CircleArrowLeftDouble",
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
            moveTo(11.0846f, 15f)
            curveTo(11.0846f, 15f, 8.50001f, 12.7905f, 8.5f, 12f)
            curveTo(8.49999f, 11.2094f, 11.0846f, 9f, 11.0846f, 9f)
            moveTo(15.5f, 15f)
            curveTo(15.5f, 15f, 12.9154f, 12.7905f, 12.9154f, 12f)
            curveTo(12.9154f, 11.2094f, 15.5f, 9f, 15.5f, 9f)
        }
        }.build()

        return _circleArrowLeftDouble!!
    }

private var _circleArrowLeftDouble: ImageVector? = null
