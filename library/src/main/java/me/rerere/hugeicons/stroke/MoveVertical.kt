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

val HugeIcons.MoveVertical: ImageVector
    get() {
        if (_moveVertical != null) {
            return _moveVertical!!
        }
        _moveVertical = ImageVector.Builder(
            name = "MoveVertical",
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
            moveTo(11.2419f, 20.5f)
            curveTo(11.2419f, 20.9142f, 11.5777f, 21.25f, 11.9919f, 21.25f)
            curveTo(12.4061f, 21.25f, 12.7419f, 20.9142f, 12.7419f, 20.5f)
            horizontalLineTo(11.9919f)
            horizontalLineTo(11.2419f)
            close()
            moveTo(12.7419f, 3.5f)
            curveTo(12.7419f, 3.08579f, 12.4061f, 2.75f, 11.9919f, 2.75f)
            curveTo(11.5777f, 2.75f, 11.2419f, 3.08579f, 11.2419f, 3.5f)
            lineTo(11.9919f, 3.5f)
            lineTo(12.7419f, 3.5f)
            close()
            moveTo(11.9919f, 20.5f)
            horizontalLineTo(12.7419f)
            lineTo(12.7419f, 3.5f)
            lineTo(11.9919f, 3.5f)
            lineTo(11.2419f, 3.5f)
            lineTo(11.2419f, 20.5f)
            horizontalLineTo(11.9919f)
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
            moveTo(7.9925f, 7f)
            curveTo(8.77893f, 6.19089f, 10.8722f, 2.99997f, 11.9925f, 3f)
            curveTo(13.1128f, 3.00002f, 15.2061f, 6.19087f, 15.9925f, 6.99999f)
            moveTo(7.99188f, 17f)
            curveTo(8.77832f, 17.8091f, 10.8715f, 21f, 11.9919f, 21f)
            curveTo(13.1122f, 21f, 15.2054f, 17.8091f, 15.9919f, 17f)
        }
        }.build()

        return _moveVertical!!
    }

private var _moveVertical: ImageVector? = null
