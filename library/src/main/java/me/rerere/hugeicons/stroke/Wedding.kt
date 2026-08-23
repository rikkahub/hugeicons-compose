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

val HugeIcons.Wedding: ImageVector
    get() {
        if (_wedding != null) {
            return _wedding!!
        }
        _wedding = ImageVector.Builder(
            name = "Wedding",
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
            moveTo(14f, 16.5f)
            arcTo(5.5f, 5.5f, 0f, true, false, 3f, 16.5f)
            arcTo(5.5f, 5.5f, 0f, true, false, 14f, 16.5f)
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
            moveTo(21f, 16.5f)
            arcTo(5.5f, 5.5f, 0f, true, false, 10f, 16.5f)
            arcTo(5.5f, 5.5f, 0f, true, false, 21f, 16.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 9f)
            curveTo(12f, 9f, 16f, 7.14706f, 16f, 4.13889f)
            curveTo(16f, 2.95761f, 15.1579f, 2f, 14f, 2f)
            curveTo(13.0526f, 2f, 12.4211f, 2.41176f, 12f, 3.23529f)
            curveTo(11.5789f, 2.41176f, 10.9474f, 2f, 10f, 2f)
            curveTo(8.84211f, 2f, 8f, 2.95761f, 8f, 4.13889f)
            curveTo(8f, 7.14706f, 12f, 9f, 12f, 9f)
            close()
        }
        }.build()

        return _wedding!!
    }

private var _wedding: ImageVector? = null
