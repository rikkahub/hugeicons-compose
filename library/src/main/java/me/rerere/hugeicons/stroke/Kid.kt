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

val HugeIcons.Kid: ImageVector
    get() {
        if (_kid != null) {
            return _kid!!
        }
        _kid = ImageVector.Builder(
            name = "Kid",
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
            moveTo(12f, 2f)
            curveTo(14f, 2f, 15.5f, 3.26953f, 15.5f, 4.71181f)
            curveTo(15.5f, 5.64505f, 15.0282f, 7f, 13.5f, 7f)
            curveTo(12.6809f, 7f, 12.1578f, 6.39447f, 12f, 6f)
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
            moveTo(15.625f, 10.387f)
            verticalLineTo(10.9165f)
            moveTo(8.375f, 10.387f)
            verticalLineTo(10.9165f)
            moveTo(8.75f, 10.75f)
            curveTo(8.75f, 10.3358f, 8.58211f, 10f, 8.375f, 10f)
            curveTo(8.16789f, 10f, 8f, 10.3358f, 8f, 10.75f)
            curveTo(8f, 11.1642f, 8.16789f, 11.5f, 8.375f, 11.5f)
            curveTo(8.58211f, 11.5f, 8.75f, 11.1642f, 8.75f, 10.75f)
            close()
            moveTo(16f, 10.75f)
            curveTo(16f, 10.3358f, 15.8321f, 10f, 15.625f, 10f)
            curveTo(15.4179f, 10f, 15.25f, 10.3358f, 15.25f, 10.75f)
            curveTo(15.25f, 11.1642f, 15.4179f, 11.5f, 15.625f, 11.5f)
            curveTo(15.8321f, 11.5f, 16f, 11.1642f, 16f, 10.75f)
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
            moveTo(8f, 16f)
            curveTo(8.91212f, 17.2144f, 10.3643f, 18f, 12f, 18f)
            curveTo(13.6357f, 18f, 15.0879f, 17.2144f, 16f, 16f)
        }
        }.build()

        return _kid!!
    }

private var _kid: ImageVector? = null
