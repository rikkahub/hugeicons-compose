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

val HugeIcons.Copyleft: ImageVector
    get() {
        if (_copyleft != null) {
            return _copyleft!!
        }
        _copyleft = ImageVector.Builder(
            name = "Copyleft",
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
            moveTo(1.99997f, 12f)
            curveTo(1.99997f, 17.5228f, 6.47712f, 22f, 12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47712f, 2f, 1.99997f, 6.47715f, 1.99997f, 12f)
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
            moveTo(9.00003f, 9.35418f)
            curveTo(9.73297f, 8.52375f, 10.8053f, 8f, 12f, 8f)
            curveTo(14.2092f, 8f, 16f, 9.79086f, 16f, 12f)
            curveTo(16f, 14.2091f, 14.2092f, 16f, 12f, 16f)
            curveTo(10.8053f, 16f, 9.73297f, 15.4762f, 9.00003f, 14.6458f)
        }
        }.build()

        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
