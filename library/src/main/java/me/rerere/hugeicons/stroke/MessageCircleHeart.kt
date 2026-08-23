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

val HugeIcons.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) {
            return _messageCircleHeart!!
        }
        _messageCircleHeart = ImageVector.Builder(
            name = "MessageCircleHeart",
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
            moveTo(21.4974f, 12f)
            curveTo(21.4974f, 17.2467f, 17.2441f, 21.5f, 11.9974f, 21.5f)
            curveTo(10.3693f, 21.5f, 8.83683f, 21.0904f, 7.49744f, 20.3687f)
            curveTo(5.62921f, 19.362f, 4.37205f, 20.2979f, 3.26336f, 20.4658f)
            curveTo(3.09517f, 20.4913f, 2.92768f, 20.4302f, 2.8074f, 20.31f)
            curveTo(2.62484f, 20.1274f, 2.5901f, 19.8451f, 2.69094f, 19.6074f)
            curveTo(3.12609f, 18.5818f, 3.52564f, 16.6382f, 2.98084f, 15f)
            curveTo(2.66724f, 14.057f, 2.49744f, 13.0483f, 2.49744f, 12f)
            curveTo(2.49744f, 6.75329f, 6.75073f, 2.5f, 11.9974f, 2.5f)
            curveTo(17.2441f, 2.5f, 21.4974f, 6.75329f, 21.4974f, 12f)
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
            moveTo(11.9974f, 15.9995f)
            curveTo(11.9974f, 15.9995f, 7.99744f, 13.5289f, 7.99744f, 11.1384f)
            curveTo(7.99744f, 9.95712f, 8.83954f, 8.99951f, 9.99744f, 8.99951f)
            curveTo(10.5974f, 8.99951f, 11.1974f, 9.20539f, 11.9974f, 10.0289f)
            curveTo(12.7974f, 9.20539f, 13.3974f, 8.99951f, 13.9974f, 8.99951f)
            curveTo(15.1553f, 8.99951f, 15.9974f, 9.95712f, 15.9974f, 11.1384f)
            curveTo(15.9974f, 13.5289f, 11.9974f, 15.9995f, 11.9974f, 15.9995f)
            close()
        }
        }.build()

        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
