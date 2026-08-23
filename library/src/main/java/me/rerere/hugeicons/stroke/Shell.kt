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

val HugeIcons.Shell: ImageVector
    get() {
        if (_shell != null) {
            return _shell!!
        }
        _shell = ImageVector.Builder(
            name = "Shell",
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
            moveTo(11.5f, 12f)
            curveTo(11.0439f, 11.3928f, 10.3179f, 11f, 9.49995f, 11f)
            curveTo(8.11924f, 11f, 6.99995f, 12.1193f, 6.99995f, 13.5f)
            curveTo(6.99995f, 14.8807f, 8f, 17f, 10.5f, 17f)
            curveTo(13.5f, 17f, 15f, 14.5f, 15f, 12.5f)
            curveTo(15f, 9.5f, 12.9999f, 7f, 9.49995f, 7f)
            curveTo(6f, 7f, 3f, 9.5f, 3f, 14f)
            curveTo(3f, 17.3137f, 5.5f, 22f, 12f, 22f)
            curveTo(16.9706f, 22f, 21f, 16.9706f, 21f, 12f)
            curveTo(21f, 7.02944f, 17f, 2f, 13f, 2f)
            curveTo(11.8955f, 2f, 11f, 2.89543f, 11f, 4f)
            verticalLineTo(7f)
        }
        }.build()

        return _shell!!
    }

private var _shell: ImageVector? = null
