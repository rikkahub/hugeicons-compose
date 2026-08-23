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

val HugeIcons.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = ImageVector.Builder(
            name = "Egg",
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
            moveTo(12f, 22f)
            curveTo(16.4183f, 22f, 20f, 19f, 20f, 14f)
            curveTo(20f, 9f, 16.4183f, 2f, 12f, 2f)
            curveTo(7.58172f, 2f, 4f, 9f, 4f, 14f)
            curveTo(4f, 19f, 7.58172f, 22f, 12f, 22f)
            close()
        }
        }.build()

        return _egg!!
    }

private var _egg: ImageVector? = null
