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

val HugeIcons.ChevronsLeftRight: ImageVector
    get() {
        if (_chevronsLeftRight != null) {
            return _chevronsLeftRight!!
        }
        _chevronsLeftRight = ImageVector.Builder(
            name = "ChevronsLeftRight",
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
            moveTo(8.99996f, 17f)
            curveTo(8.99996f, 17f, 4.00001f, 13.3176f, 4f, 12f)
            curveTo(3.99999f, 10.6824f, 9f, 7f, 9f, 7f)
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
            moveTo(15f, 17f)
            curveTo(15f, 17f, 20f, 13.3176f, 20f, 12f)
            curveTo(20f, 10.6824f, 15f, 7f, 15f, 7f)
        }
        }.build()

        return _chevronsLeftRight!!
    }

private var _chevronsLeftRight: ImageVector? = null
