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

val HugeIcons.ChevronsLeft: ImageVector
    get() {
        if (_chevronsLeft != null) {
            return _chevronsLeft!!
        }
        _chevronsLeft = ImageVector.Builder(
            name = "ChevronsLeft",
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
            moveTo(18f, 17f)
            curveTo(18f, 17f, 13f, 13.3176f, 13f, 12f)
            curveTo(13f, 10.6824f, 18f, 7f, 18f, 7f)
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
            moveTo(11f, 17f)
            curveTo(11f, 17f, 6.00001f, 13.3176f, 6f, 12f)
            curveTo(5.99999f, 10.6824f, 11f, 7f, 11f, 7f)
        }
        }.build()

        return _chevronsLeft!!
    }

private var _chevronsLeft: ImageVector? = null
