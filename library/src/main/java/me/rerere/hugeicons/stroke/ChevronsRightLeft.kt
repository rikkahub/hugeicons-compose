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

val HugeIcons.ChevronsRightLeft: ImageVector
    get() {
        if (_chevronsRightLeft != null) {
            return _chevronsRightLeft!!
        }
        _chevronsRightLeft = ImageVector.Builder(
            name = "ChevronsRightLeft",
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
            moveTo(20f, 17f)
            curveTo(20f, 17f, 15f, 13.3176f, 15f, 12f)
            curveTo(15f, 10.6824f, 20f, 7f, 20f, 7f)
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
            moveTo(4.00004f, 17f)
            curveTo(4.00004f, 17f, 8.99999f, 13.3176f, 9f, 12f)
            curveTo(9.00001f, 10.6824f, 4f, 7f, 4f, 7f)
        }
        }.build()

        return _chevronsRightLeft!!
    }

private var _chevronsRightLeft: ImageVector? = null
