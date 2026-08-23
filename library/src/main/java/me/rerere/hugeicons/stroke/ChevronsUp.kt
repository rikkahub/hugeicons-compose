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

val HugeIcons.ChevronsUp: ImageVector
    get() {
        if (_chevronsUp != null) {
            return _chevronsUp!!
        }
        _chevronsUp = ImageVector.Builder(
            name = "ChevronsUp",
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
            moveTo(7f, 18f)
            curveTo(7f, 18f, 10.6824f, 13f, 12f, 13f)
            curveTo(13.3176f, 13f, 17f, 18f, 17f, 18f)
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
            moveTo(7f, 11f)
            curveTo(7f, 11f, 10.6824f, 6.00001f, 12f, 6f)
            curveTo(13.3176f, 5.99999f, 17f, 11f, 17f, 11f)
        }
        }.build()

        return _chevronsUp!!
    }

private var _chevronsUp: ImageVector? = null
