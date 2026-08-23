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

val HugeIcons.BubbleChat: ImageVector
    get() {
        if (_bubbleChat != null) {
            return _bubbleChat!!
        }
        _bubbleChat = ImageVector.Builder(
            name = "BubbleChat",
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
            moveTo(21.5f, 12f)
            curveTo(21.5f, 17.2467f, 17.2467f, 21.5f, 12f, 21.5f)
            curveTo(10.3719f, 21.5f, 8.8394f, 21.0904f, 7.5f, 20.3687f)
            curveTo(5.63177f, 19.362f, 4.37462f, 20.2979f, 3.26592f, 20.4658f)
            curveTo(3.09774f, 20.4913f, 2.93024f, 20.4302f, 2.80997f, 20.31f)
            curveTo(2.62741f, 20.1274f, 2.59266f, 19.8451f, 2.6935f, 19.6074f)
            curveTo(3.12865f, 18.5818f, 3.5282f, 16.6382f, 2.98341f, 15f)
            curveTo(2.6698f, 14.057f, 2.5f, 13.0483f, 2.5f, 12f)
            curveTo(2.5f, 6.75329f, 6.75329f, 2.5f, 12f, 2.5f)
            curveTo(17.2467f, 2.5f, 21.5f, 6.75329f, 21.5f, 12f)
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
            moveTo(12.1257f, 12f)
            horizontalLineTo(12.0007f)
            moveTo(8.125f, 12f)
            horizontalLineTo(8f)
            moveTo(16.125f, 12f)
            horizontalLineTo(16f)
            moveTo(12.2507f, 12f)
            curveTo(12.2507f, 12.1381f, 12.1388f, 12.25f, 12.0007f, 12.25f)
            curveTo(11.8627f, 12.25f, 11.7507f, 12.1381f, 11.7507f, 12f)
            curveTo(11.7507f, 11.8619f, 11.8627f, 11.75f, 12.0007f, 11.75f)
            curveTo(12.1388f, 11.75f, 12.2507f, 11.8619f, 12.2507f, 12f)
            close()
            moveTo(8.25f, 12f)
            curveTo(8.25f, 12.1381f, 8.13807f, 12.25f, 8f, 12.25f)
            curveTo(7.86193f, 12.25f, 7.75f, 12.1381f, 7.75f, 12f)
            curveTo(7.75f, 11.8619f, 7.86193f, 11.75f, 8f, 11.75f)
            curveTo(8.13807f, 11.75f, 8.25f, 11.8619f, 8.25f, 12f)
            close()
            moveTo(16.25f, 12f)
            curveTo(16.25f, 12.1381f, 16.1381f, 12.25f, 16f, 12.25f)
            curveTo(15.8619f, 12.25f, 15.75f, 12.1381f, 15.75f, 12f)
            curveTo(15.75f, 11.8619f, 15.8619f, 11.75f, 16f, 11.75f)
            curveTo(16.1381f, 11.75f, 16.25f, 11.8619f, 16.25f, 12f)
            close()
        }
        }.build()

        return _bubbleChat!!
    }

private var _bubbleChat: ImageVector? = null
