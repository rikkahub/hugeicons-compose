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

val HugeIcons.Squirrel: ImageVector
    get() {
        if (_squirrel != null) {
            return _squirrel!!
        }
        _squirrel = ImageVector.Builder(
            name = "Squirrel",
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
            moveTo(15.9922f, 18.5f)
            lineTo(17.1132f, 17.9395f)
            curveTo(17.8627f, 17.5648f, 18.2374f, 17.3774f, 18.496f, 17.0825f)
            curveTo(18.6425f, 16.9154f, 18.7601f, 16.7251f, 18.8441f, 16.5193f)
            curveTo(18.9922f, 16.1561f, 18.9922f, 15.7371f, 18.9922f, 14.8992f)
            verticalLineTo(13.5f)
            curveTo(18.9922f, 12.3954f, 19.8876f, 11.5f, 20.9922f, 11.5f)
            curveTo(21.5445f, 11.5f, 21.9922f, 11.0523f, 21.9922f, 10.5f)
            verticalLineTo(10f)
            curveTo(21.9922f, 7.79086f, 20.2013f, 6f, 17.9922f, 6f)
            verticalLineTo(5f)
            curveTo(17.9922f, 4.44772f, 17.5445f, 4f, 16.9922f, 4f)
            curveTo(15.8876f, 4f, 14.9922f, 4.89543f, 14.9922f, 6f)
            verticalLineTo(7f)
            lineTo(13.9922f, 10f)
            curveTo(10.9546f, 10f, 8.49219f, 12.4624f, 8.49219f, 15.5f)
            curveTo(8.49219f, 18.5376f, 10.9546f, 21f, 13.9922f, 21f)
            horizontalLineTo(15.9922f)
            verticalLineTo(18.5f)
            close()
            moveTo(15.9922f, 18.5f)
            verticalLineTo(17f)
            curveTo(15.9922f, 15.3431f, 14.649f, 14f, 12.9922f, 14f)
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
            moveTo(9.99219f, 11.5f)
            verticalLineTo(7f)
            curveTo(9.99219f, 4.79086f, 8.20133f, 3f, 5.99219f, 3f)
            curveTo(3.78305f, 3f, 1.99219f, 4.79086f, 1.99219f, 7f)
            verticalLineTo(8f)
            curveTo(1.99219f, 9.38071f, 3.11148f, 10.5f, 4.49219f, 10.5f)
            curveTo(5.8729f, 10.5f, 6.99219f, 9.38071f, 6.99219f, 8f)
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
            moveTo(4.99219f, 10.5f)
            verticalLineTo(12f)
            curveTo(4.99219f, 14.7956f, 4.99219f, 16.1935f, 5.44891f, 17.2961f)
            curveTo(6.05787f, 18.7663f, 7.22592f, 19.9343f, 8.69609f, 20.5433f)
            curveTo(9.79871f, 21f, 11.1965f, 21f, 13.9922f, 21f)
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9922f, 21.75f)
            curveTo(18.4064f, 21.75f, 18.7422f, 21.4142f, 18.7422f, 21f)
            curveTo(18.7422f, 20.5858f, 18.4064f, 20.25f, 17.9922f, 20.25f)
            verticalLineTo(21f)
            verticalLineTo(21.75f)
            close()
            moveTo(10.9922f, 21f)
            verticalLineTo(21.75f)
            horizontalLineTo(17.9922f)
            verticalLineTo(21f)
            verticalLineTo(20.25f)
            horizontalLineTo(10.9922f)
            verticalLineTo(21f)
            close()
        }
        }.build()

        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
