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

val HugeIcons.Monocle: ImageVector
    get() {
        if (_monocle != null) {
            return _monocle!!
        }
        _monocle = ImageVector.Builder(
            name = "Monocle",
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
            moveTo(14f, 8f)
            arcTo(6f, 6f, 0f, true, false, 2f, 8f)
            arcTo(6f, 6f, 0f, true, false, 14f, 8f)
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
            moveTo(18f, 8f)
            arcTo(2f, 2f, 0f, true, false, 14f, 8f)
            arcTo(2f, 2f, 0f, true, false, 18f, 8f)
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
            moveTo(22f, 17f)
            verticalLineTo(19f)
            curveTo(22f, 19.3506f, 21.9398f, 19.6872f, 21.8293f, 20f)
            moveTo(20f, 21.8293f)
            curveTo(19.6872f, 21.9398f, 19.3506f, 22f, 19f, 22f)
            curveTo(18.6494f, 22f, 18.3128f, 21.9398f, 18f, 21.8293f)
            moveTo(16f, 17f)
            verticalLineTo(19f)
            curveTo(16f, 19.3506f, 16.0602f, 19.6872f, 16.1707f, 20f)
            moveTo(22f, 8f)
            verticalLineTo(5f)
            moveTo(22f, 14f)
            verticalLineTo(11f)
            moveTo(16f, 14f)
            verticalLineTo(10f)
        }
        }.build()

        return _monocle!!
    }

private var _monocle: ImageVector? = null
