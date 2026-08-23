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

val HugeIcons.MoveDown: ImageVector
    get() {
        if (_moveDown != null) {
            return _moveDown!!
        }
        _moveDown = ImageVector.Builder(
            name = "MoveDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            moveTo(12.7422f, 4f)
            curveTo(12.7422f, 3.58579f, 12.4064f, 3.25f, 11.9922f, 3.25f)
            curveTo(11.578f, 3.25f, 11.2422f, 3.58579f, 11.2422f, 4f)
            horizontalLineTo(11.9922f)
            horizontalLineTo(12.7422f)
            close()
            moveTo(11.2422f, 19.5f)
            curveTo(11.2422f, 19.9142f, 11.578f, 20.25f, 11.9922f, 20.25f)
            curveTo(12.4064f, 20.25f, 12.7422f, 19.9142f, 12.7422f, 19.5f)
            horizontalLineTo(11.9922f)
            horizontalLineTo(11.2422f)
            close()
            moveTo(11.9922f, 4f)
            horizontalLineTo(11.2422f)
            verticalLineTo(19.5f)
            horizontalLineTo(11.9922f)
            horizontalLineTo(12.7422f)
            verticalLineTo(4f)
            horizontalLineTo(11.9922f)
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
            moveTo(6.99219f, 15f)
            curveTo(7.97523f, 16.0114f, 10.5918f, 20f, 11.9922f, 20f)
            curveTo(13.3926f, 20f, 16.0091f, 16.0114f, 16.9922f, 15f)
        }
        }.build()

        return _moveDown!!
    }

private var _moveDown: ImageVector? = null
