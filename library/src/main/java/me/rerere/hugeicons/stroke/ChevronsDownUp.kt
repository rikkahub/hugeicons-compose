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

val HugeIcons.ChevronsDownUp: ImageVector
    get() {
        if (_chevronsDownUp != null) {
            return _chevronsDownUp!!
        }
        _chevronsDownUp = ImageVector.Builder(
            name = "ChevronsDownUp",
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
            moveTo(7f, 19f)
            curveTo(7f, 19f, 10.6824f, 14f, 12f, 14f)
            curveTo(13.3176f, 14f, 17f, 19f, 17f, 19f)
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
            moveTo(7f, 5.00004f)
            curveTo(7f, 5.00004f, 10.6824f, 9.99999f, 12f, 10f)
            curveTo(13.3176f, 10f, 17f, 5f, 17f, 5f)
        }
        }.build()

        return _chevronsDownUp!!
    }

private var _chevronsDownUp: ImageVector? = null
