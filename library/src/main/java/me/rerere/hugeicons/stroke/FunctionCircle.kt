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

val HugeIcons.FunctionCircle: ImageVector
    get() {
        if (_functionCircle != null) {
            return _functionCircle!!
        }
        _functionCircle = ImageVector.Builder(
            name = "FunctionCircle",
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
            moveTo(8.5f, 15.5f)
            curveTo(8.63206f, 15.9782f, 8.89835f, 16.5f, 9.59365f, 16.5f)
            curveTo(10.7968f, 16.5f, 11.0976f, 15.5f, 12f, 12f)
            curveTo(12.9024f, 8.5f, 13.2032f, 7.5f, 14.4064f, 7.5f)
            curveTo(15.1016f, 7.5f, 15.3679f, 8.02179f, 15.5f, 8.5f)
            moveTo(10.5417f, 10.75f)
            horizontalLineTo(14.4064f)
        }

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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }
        }.build()

        return _functionCircle!!
    }

private var _functionCircle: ImageVector? = null
