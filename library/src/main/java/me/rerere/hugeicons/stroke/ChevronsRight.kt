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

val HugeIcons.ChevronsRight: ImageVector
    get() {
        if (_chevronsRight != null) {
            return _chevronsRight!!
        }
        _chevronsRight = ImageVector.Builder(
            name = "ChevronsRight",
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
            moveTo(6.00004f, 17f)
            curveTo(6.00004f, 17f, 11f, 13.3176f, 11f, 12f)
            curveTo(11f, 10.6824f, 6f, 7f, 6f, 7f)
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
            moveTo(13f, 17f)
            curveTo(13f, 17f, 18f, 13.3176f, 18f, 12f)
            curveTo(18f, 10.6824f, 13f, 7f, 13f, 7f)
        }
        }.build()

        return _chevronsRight!!
    }

private var _chevronsRight: ImageVector? = null
