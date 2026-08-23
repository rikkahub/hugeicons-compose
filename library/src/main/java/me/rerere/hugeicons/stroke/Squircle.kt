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

val HugeIcons.Squircle: ImageVector
    get() {
        if (_squircle != null) {
            return _squircle!!
        }
        _squircle = ImageVector.Builder(
            name = "Squircle",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 4.02f, 4.01219f, 2.5f, 11.9922f, 2.5f)
            curveTo(19.9722f, 2.5f, 21.4922f, 4.02f, 21.4922f, 12f)
            curveTo(21.4922f, 19.98f, 19.9722f, 21.5f, 11.9922f, 21.5f)
            curveTo(4.01219f, 21.5f, 2.49219f, 19.98f, 2.49219f, 12f)
            close()
        }
        }.build()

        return _squircle!!
    }

private var _squircle: ImageVector? = null
