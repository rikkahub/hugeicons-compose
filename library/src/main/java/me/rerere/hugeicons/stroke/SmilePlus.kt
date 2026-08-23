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

val HugeIcons.SmilePlus: ImageVector
    get() {
        if (_smilePlus != null) {
            return _smilePlus!!
        }
        _smilePlus = ImageVector.Builder(
            name = "SmilePlus",
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
            moveTo(21.3f, 10.5f)
            curveTo(21.4311f, 11.1462f, 21.5f, 11.8151f, 21.5f, 12.5f)
            curveTo(21.5f, 18.0228f, 17.0228f, 22.5f, 11.5f, 22.5f)
            curveTo(5.97715f, 22.5f, 1.5f, 18.0228f, 1.5f, 12.5f)
            curveTo(1.5f, 6.97715f, 5.97715f, 2.5f, 11.5f, 2.5f)
            curveTo(12.1849f, 2.5f, 12.8538f, 2.56886f, 13.5f, 2.70004f)
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
            moveTo(19.494f, 1.5f)
            verticalLineTo(7.5f)
            moveTo(22.5f, 4.494f)
            lineTo(16.5f, 4.494f)
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
            moveTo(7.5f, 15.5f)
            curveTo(8.41212f, 16.7144f, 9.86433f, 17.5f, 11.5f, 17.5f)
            curveTo(13.1357f, 17.5f, 14.5879f, 16.7144f, 15.5f, 15.5f)
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
            moveTo(15.125f, 8.887f)
            verticalLineTo(9.41649f)
            moveTo(7.875f, 8.887f)
            verticalLineTo(9.41649f)
            moveTo(8.25f, 9.25f)
            curveTo(8.25f, 8.83579f, 8.08211f, 8.5f, 7.875f, 8.5f)
            curveTo(7.66789f, 8.5f, 7.5f, 8.83579f, 7.5f, 9.25f)
            curveTo(7.5f, 9.66421f, 7.66789f, 10f, 7.875f, 10f)
            curveTo(8.08211f, 10f, 8.25f, 9.66421f, 8.25f, 9.25f)
            close()
            moveTo(15.5f, 9.25f)
            curveTo(15.5f, 8.83579f, 15.3321f, 8.5f, 15.125f, 8.5f)
            curveTo(14.9179f, 8.5f, 14.75f, 8.83579f, 14.75f, 9.25f)
            curveTo(14.75f, 9.66421f, 14.9179f, 10f, 15.125f, 10f)
            curveTo(15.3321f, 10f, 15.5f, 9.66421f, 15.5f, 9.25f)
            close()
        }
        }.build()

        return _smilePlus!!
    }

private var _smilePlus: ImageVector? = null
