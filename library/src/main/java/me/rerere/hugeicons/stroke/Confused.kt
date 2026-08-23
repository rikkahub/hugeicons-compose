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

val HugeIcons.Confused: ImageVector
    get() {
        if (_confused != null) {
            return _confused!!
        }
        _confused = ImageVector.Builder(
            name = "Confused",
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
            moveTo(10f, 17f)
            lineTo(15f, 15f)
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
            moveTo(15.625f, 9.387f)
            verticalLineTo(9.91649f)
            moveTo(8.375f, 9.387f)
            verticalLineTo(9.91649f)
            moveTo(8.75f, 9.75f)
            curveTo(8.75f, 9.33579f, 8.58211f, 9f, 8.375f, 9f)
            curveTo(8.16789f, 9f, 8f, 9.33579f, 8f, 9.75f)
            curveTo(8f, 10.1642f, 8.16789f, 10.5f, 8.375f, 10.5f)
            curveTo(8.58211f, 10.5f, 8.75f, 10.1642f, 8.75f, 9.75f)
            close()
            moveTo(16f, 9.75f)
            curveTo(16f, 9.33579f, 15.8321f, 9f, 15.625f, 9f)
            curveTo(15.4179f, 9f, 15.25f, 9.33579f, 15.25f, 9.75f)
            curveTo(15.25f, 10.1642f, 15.4179f, 10.5f, 15.625f, 10.5f)
            curveTo(15.8321f, 10.5f, 16f, 10.1642f, 16f, 9.75f)
            close()
        }
        }.build()

        return _confused!!
    }

private var _confused: ImageVector? = null
