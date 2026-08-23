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

val HugeIcons.ImageUp: ImageVector
    get() {
        if (_imageUp != null) {
            return _imageUp!!
        }
        _imageUp = ImageVector.Builder(
            name = "ImageUp",
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
            moveTo(18.75f, 15.5f)
            lineTo(18.75f, 21.5f)
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
            moveTo(8.75f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 5.75f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 8.75f, 7.5f)
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
            moveTo(21.2494f, 11f)
            curveTo(21.2417f, 7.18021f, 21.1423f, 5.17483f, 19.8588f, 3.89124f)
            curveTo(18.4675f, 2.5f, 16.2283f, 2.5f, 11.75f, 2.5f)
            curveTo(7.27166f, 2.5f, 5.03249f, 2.5f, 3.64124f, 3.89124f)
            curveTo(2.25f, 5.28249f, 2.25f, 7.52166f, 2.25f, 12f)
            curveTo(2.25f, 16.4783f, 2.25f, 18.7175f, 3.64124f, 20.1088f)
            curveTo(5.03249f, 21.5f, 7.27166f, 21.5f, 11.75f, 21.5f)
            curveTo(12.4731f, 21.5f, 13.1378f, 21.5f, 13.75f, 21.4941f)
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
            moveTo(14.7518f, 12.2394f)
            curveTo(11.0125f, 13.2304f, 7.97174f, 17.1177f, 5.16797f, 20.5f)
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
            moveTo(15.75f, 17.5f)
            curveTo(15.75f, 17.5f, 17.9595f, 14.5f, 18.75f, 14.5f)
            curveTo(19.5406f, 14.5f, 21.75f, 17.5f, 21.75f, 17.5f)
        }
        }.build()

        return _imageUp!!
    }

private var _imageUp: ImageVector? = null
