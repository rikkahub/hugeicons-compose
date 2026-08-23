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

val HugeIcons.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = ImageVector.Builder(
            name = "Smile",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(8f, 15f)
            curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
            curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
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
            moveTo(15.625f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(8.375f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(8.75f, 8.75f)
            curveTo(8.75f, 8.33579f, 8.58211f, 8f, 8.375f, 8f)
            curveTo(8.16789f, 8f, 8f, 8.33579f, 8f, 8.75f)
            curveTo(8f, 9.16421f, 8.16789f, 9.5f, 8.375f, 9.5f)
            curveTo(8.58211f, 9.5f, 8.75f, 9.16421f, 8.75f, 8.75f)
            close()
            moveTo(16f, 8.75f)
            curveTo(16f, 8.33579f, 15.8321f, 8f, 15.625f, 8f)
            curveTo(15.4179f, 8f, 15.25f, 8.33579f, 15.25f, 8.75f)
            curveTo(15.25f, 9.16421f, 15.4179f, 9.5f, 15.625f, 9.5f)
            curveTo(15.8321f, 9.5f, 16f, 9.16421f, 16f, 8.75f)
            close()
        }
        }.build()

        return _smile!!
    }

private var _smile: ImageVector? = null
