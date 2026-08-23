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

val HugeIcons.Surprise: ImageVector
    get() {
        if (_surprise != null) {
            return _surprise!!
        }
        _surprise = ImageVector.Builder(
            name = "Surprise",
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
            moveTo(14f, 15.5f)
            arcTo(2f, 2.5f, 0f, true, false, 10f, 15.5f)
            arcTo(2f, 2.5f, 0f, true, false, 14f, 15.5f)
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
            moveTo(16.125f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(7.875f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(8.25f, 8.75f)
            curveTo(8.25f, 8.33579f, 8.08211f, 8f, 7.875f, 8f)
            curveTo(7.66789f, 8f, 7.5f, 8.33579f, 7.5f, 8.75f)
            curveTo(7.5f, 9.16421f, 7.66789f, 9.5f, 7.875f, 9.5f)
            curveTo(8.08211f, 9.5f, 8.25f, 9.16421f, 8.25f, 8.75f)
            close()
            moveTo(16.5f, 8.75f)
            curveTo(16.5f, 8.33579f, 16.3321f, 8f, 16.125f, 8f)
            curveTo(15.9179f, 8f, 15.75f, 8.33579f, 15.75f, 8.75f)
            curveTo(15.75f, 9.16421f, 15.9179f, 9.5f, 16.125f, 9.5f)
            curveTo(16.3321f, 9.5f, 16.5f, 9.16421f, 16.5f, 8.75f)
            close()
        }
        }.build()

        return _surprise!!
    }

private var _surprise: ImageVector? = null
